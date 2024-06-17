package com.fengdetian.action.controller;

import com.fengdetian.action.bean.Emp;
import com.fengdetian.action.bean.User;
import com.fengdetian.action.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

//    @Autowired
//    private HelloService helloService;
//
//    @Autowired
//    private User user;

    //代表此方法的访问路径为/hello.action
    @RequestMapping("/hello.action")
    public ModelAndView hello(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("msg","安莉洁");
        mav.setViewName("/hello.jsp");
        return mav;
    }

    @RequestMapping("/hello2.action")
    public String hello2(){
        return "/hello.jsp";           //直接返回字符串
    }

    @RequestMapping("/hello3.action")      //返回void(一般用于ajax)
    public void hello3(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf8");
        response.getWriter().write("测试");
    }

    @RequestMapping("/hello4.action")
    public String hello4(Model model)  {          //转发
        System.out.println("执行啦！");
        model.addAttribute("msg","转发测试");
        return "forward:/hello.jsp";
    }

    @RequestMapping("/hello5.action")
    public String hello5(HttpSession session,Model model)  {          //重定向
//        session.setAttribute("msg","重定向");//可以赋值
        System.out.println("执行啦！");
        model.addAttribute("msg","重定向");//无法赋值
        return "redirect:/hello.jsp";
    }

    /*
   代表此方法的访问路径为/hello6.action,如果携带userId参数那么参数必须不能等于1
   并且提交方式一定要为POST
*/
    @RequestMapping(value = "/hello6.action",params = "userId!=1",method = RequestMethod.POST)
    public ModelAndView hello6(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("msg","小丽");
        mav.setViewName("/hello.jsp");
        return mav;
    }

//    @RequestMapping(value = "findUserById.action", params = "userId", method =RequestMethod.POST)
//    public ModelAndView findUserById(int userId){
//        ModelAndView mav=new ModelAndView();
////        User user =helloService.findUserById(userId);
//        User user =new User();
//        user.setUid(33);
//        user.setUname("尹森");
//        user.setSex("男");
//        user.setAge(188);
//        mav.addObject("user",user);
//        mav.setViewName("/hello.jsp");
//        return mav;
//    }

    @RequestMapping(value = "queryEmp.action", params = "userId", method =RequestMethod.POST)
    public String findUserById(Model model){
        List<Emp> emps = new ArrayList<Emp>();
        emps.add(new Emp(1,"尹森","考试高手"));
        emps.add(new Emp(2,"ShioiriKukuri","k"));
        emps.add(new Emp(3,"周谢新","v"));
        model.addAttribute("emps",emps);
        return "/index.jsp";
    }
}

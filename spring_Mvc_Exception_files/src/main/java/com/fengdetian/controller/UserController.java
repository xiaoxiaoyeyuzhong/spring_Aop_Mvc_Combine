package com.fengdetian.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
@Controller
public class UserController {
    @RequestMapping("/upload")
    public String upload(HttpServletRequest request, MultipartFile file) throws IOException {          //变量名一定要和前端提交的name一致

        String fileName = file.getOriginalFilename();
        String realPath = request.getRealPath("upload"); //获取服务器端某个文件夹的绝对路径
        System.out.println(realPath);
        String newFileName= UUID.randomUUID().toString() + fileName;
        file.transferTo(new File(realPath +"/"+newFileName));
        request.setAttribute("imgFile", "upload/"+newFileName);
        return "/index.jsp";
    }

    @RequestMapping("/uploads")
    public String uploads(HttpServletRequest request, MultipartFile[] files) throws IOException {          //变量名一定要和前端提交的name一致
        //获取服务器端某个文件夹的绝对路径
        String realPath = request.getRealPath("upload");

        for (MultipartFile file : files) {
            String fileName = file.getOriginalFilename();
            file.transferTo(new File(realPath + "/" + UUID.randomUUID().toString() + fileName));
        }
        return "/index.jsp";
    }

}
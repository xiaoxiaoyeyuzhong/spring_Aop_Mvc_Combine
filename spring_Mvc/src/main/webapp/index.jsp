<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>员工列表</title>
</head>
<body>
<h2>员工列表</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>职业</th>
    </tr>
    <c:forEach var="emp" items="${emps}">
        <tr>
            <td>${emp.empNo}</td>
            <td>${emp.eName}</td>
            <td>${emp.job}</td>
        </tr>
    </c:forEach>
</table>


<h3>测试ServletAPI绑定</h3>
<p><a href="demo1.action">测试ServletAPI绑定</a></p>
<h3>测试参数类型绑定</h3>
<p><a href="demo2.action?username=zhangsan">属性参数绑定</a></p>

<h3>测试对象参数绑定</h3>
<form action="demo3.action" method="post">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="text" name="address">

    <input type="submit" value="对象参数绑定">

</form>

<h3>测试数组类型绑定</h3>
<form action="demo4.action" method="post">
    <input type="checkbox" value="1" name="ids">
    <input type="checkbox" value="2" name="ids">
    <input type="checkbox" value="3" name="ids">

    <input type="submit" value="数组类型绑定">
</form>

<h3>测试Pojo对象数据绑定</h3>
<hr>
<form action="demo5.action" method="post">

    <h3>Pojo封装数组</h3>
    <input type="checkbox" value="1" name="ids">
    <input type="checkbox" value="2" name="ids">
    <input type="checkbox" value="3" name="ids">

    <br>

    <h3>Pojo封装user</h3>
    用户名：<input type="text" name="user.username">
    密码：<input type="text" name="user.password">
    地址：<input type="text" name="user.address">
    <br>

    <h3>Pojo封装list</h3>
    用户名：<input type="text" name="userList[1].username">
    密码：<input type="text" name="userList[1].password">
    <input type="text" name="userList[1].address">
    用户名：<input type="text" name="userList[0].username">
    密码：<input type="text" name="userList[0].password">
    地址：<input type="text" name="userList[0].address">

    <br>

    <h3>Pojo封装map</h3>
    姓名：<input type="text" name="map['username']"><br>
    密码：<input type="text" name="map['password']"><br>
    年龄：<input type="text" name="map['age']"><br>
    地址：<input type="text" name="map['address']"><br>
    <input type="submit" value="Pojo对象参数绑定"><br>

</form>

<a href="demo9.action">测试@CookieValue注解</a>
<a href="demo10.action">测试@RequestHeader注解</a><br>
<a href="demo11.action">测试@SessionAttribute注解</a>
</body>
</html>

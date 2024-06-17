<%--
  Created by IntelliJ IDEA.
  User: 冯德田
  Date: 2024/6/17
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--
    文件上传enctype类型必须是multipart/form-data
    提交方式必须是post
--%>
<form action="upload.action" enctype="multipart/form-data" method="post">
    <input type="file" name="file">
    <input type="submit">
</form>

<h3>多文件上传</h3>
<form action="uploads.action" enctype="multipart/form-data" method="post">
    <input type="file" name="files">
    <input type="file" name="files">
    <input type="file" name="files">
    <input type="file" name="files">
    <input type="submit">
</form>

</body>
</html>

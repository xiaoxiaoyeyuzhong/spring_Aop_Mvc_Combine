<%--
  Created by IntelliJ IDEA.
  User: 冯德田
  Date: 2024/6/17
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <script>
        $(document).ready(function(){
            $("#btn").click(function(){
                $.ajax({
                    type:"post",
                    url:"json2.action",
                    contentType:"application/json",     //告知ajax引擎传递的是json类型
                    data: "{\"username\": \"xiaodong\", \"address\": \"guangzhou\", \"birthday\": \"2000-10-10\"}",
                    success:function(data){
                        alert(data);
                    }
                });
            });
        });
    </script>
</head>
<body>
<input type="button" id="btn" value="查找">
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 冯德田
  Date: 2024/6/17
  Time: 9:24
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
                    url: "json3.action",
                    dataType: "json", // 确保 jQuery 将响应解析为 JSON 对象
                    success: function(data){
                        // 浏览器控制台直接打印 JavaScript 对象（自动调用 toString()，一般不适用于对象）
                        console.log(data); // 使用 console.log 更适合打印对象

                        // 直接打印对象的属性
                        if (data && typeof data === 'object') {
                            // 假设返回的对象有一个属性名为 "message"
                            alert(data.username);
                        } else {
                            alert("Received data is not an object");
                        }
                    },
                    error: function(xhr, status, error) {
                        console.error("Error:", error);
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

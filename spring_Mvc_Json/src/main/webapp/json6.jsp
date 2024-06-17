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
                    url:"json6.action",
                    contentType: "application/json;charset=utf8",       //告知ajax引擎传递的是json类型
                    data: "{\"username\": \"xiaodong\", \"address\": \"guangzhou\", \"birthday\": \"2000-10-10\"}",
                    success:function(data){
                        alert(JSON.stringify(data));
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
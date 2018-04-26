<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = request.getContextPath(); //获取项目名和基础路径
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <title>1234</title>
    <script type="text/javascript">
        //rtsp登录用户名
        var path = '<%=path%>';
        //rtsp登录密码
        var basePath = '<%=basePath%>';
        console.log(path);
        console.log(basePath);
        window.onload =function(){                             //如果不加window.onload,因为dom树为加在完成,此方法为的就是加载玩dom树后绑定元素,保证能保定上
            var button1 = document.getElementById("button1");
            console.log(button1);
        }


    </script>
</head>
<body>
    <div>
        <input id ="input1" ></input>
        <button id="button1" onclick="bu1cilik()">确定</button> <%--第一种绑定方式,dom中绑定事件--%>
    </div>
</body>
</html>

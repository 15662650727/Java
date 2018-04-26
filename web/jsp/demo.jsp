<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = request.getContextPath();
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
    </script>
</head>
<body>
1234
</body>
</html>

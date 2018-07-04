<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../common/js.jsp" %>
<html>
<head>
    <title>JS</title>
    <meta charset="utf-8">
    <meta http-equiv="Content-type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="../../common/webuploader/webuploader.css">
    <script type="text/javascript" src="../../common/webuploader/webuploader.js"></script>
    <script type="text/javascript">
        //rtsp登录用户名
        var path = '<%=path%>';
        //rtsp登录密码
        var basePath = '<%=basePath%>';
    </script>
    <script type="text/javascript" src="demo.js"></script>
</head>
<body>
<div>
    <input id="input1"></input>
    <button id="button1" onclick="bu1cilik()">确定</button>
    <h1>sessionID:<%=session.getId()%></h1>
    <%--第一种绑定方式,dom中绑定事件--%>

    <form action="../../a/pic/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file" />
        <input type="submit" value="提交"/>
    </form>


    <div id="uploader-demo">
        <!--用来存放item-->
        <div id="fileList" class="uploader-list"></div>
        <div id="filePicker">选择图片</div>
    </div>

</div>
</body>
</html>


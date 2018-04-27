<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../common/js.jsp" %>
<html>
<head>
    <title>1234</title>
    <script type="text/javascript">
        //rtsp登录用户名
        var path = '<%=path%>';
        //rtsp登录密码
        var basePath = '<%=basePath%>';

    </script>
</head>
<body>
<div>
    <input id="input1"></input>
    <button id="button1" onclick="bu1cilik()">确定</button>
    <h1>sessionID:<%=session.getId()%></h1>
    <%--第一种绑定方式,dom中绑定事件--%>
</div>
</body>
</html>
<%--浏览器加载页面的顺序：

1、 解析HTML结构

2、 加载外部脚本和样式表文件

3、 解析并执行脚本代码

4、 构造HTML DOM模型==ready()

5、 加载图片等组件

6、 页面加载完毕==onload()

ready事件是在DOM模型构造完毕时触发

load事件是在页面加载完毕后触发--%>

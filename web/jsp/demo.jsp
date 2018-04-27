<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String path = request.getContextPath(); //获取项目名和基础路径
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
    <title>1234</title>
    <script type="text/javascript" src="demo.js"></script>
    <script type="text/javascript" src="demo.js"></script>
    <script type="text/javascript">
        //rtsp登录用户名
        var path = '<%=path%>';
        //rtsp登录密码
        var basePath = '<%=basePath%>';
        console.log(path);
        console.log(basePath);
        window.onload = function () {                             //如果不加window.onload,因为dom树为加在完成,此方法为的就是加载玩dom树后绑定元素,保证能保定上
            var button1 = document.getElementById("button1");     //一般采用juery的 ready函数.因其不用等到整个页面资源加在完成,解析玩dom树后即可
            console.log(document);
            console.log(button1);
        }
    </script>
</head>
<body>
<div>
    <input id="input1"></input>
    <button id="button1" onclick="bu1cilik()">确定</button>
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

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<script>
    var path = '<%=path%>';
    var basePath = '<%=basePath%>';
</script>
<link href="<%=basePath%>/common/bootstrap-3.3.7/dist/css/bootstrap.css" rel="stylesheet">

<script type="text/javascript" src="<%=basePath%>/common/jQuery/jquery-3.3.1.min.js"></script>
<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
<!--[if lt IE 9]>
<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<script type="text/javascript" src="<%=basePath%>/common/bootstrap-3.3.7/dist/js/bootstrap.js"></script>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<script>
    var path = '<%=path%>';
    var basePath = '<%=basePath%>';
</script>
<script type="text/javascript" src="<%=basePath%>/common/jQuery/jquery-3.3.1.min.js"></script>
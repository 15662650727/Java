<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/js.jsp" %>
<html>
  <head>
    <title>欢迎主页</title>
    <script src="index.js"></script>
  </head>
  <body>

  <body>
    <div>
      <h1 style="color:red">登录</h1>
      <form id="indexform" name="indexForm" method="get">
          <table border="0">
              <tr>
                  <td>账号：</td>
                  <td><input type="text" id="user" name="user"></td>
              </tr>
              <tr>
                  <td>密码：</td>
                  <td><input type="user" id="pwd" name="user">
                  </td>
              </tr>
          </table>
          <br>
          <input type="button" value="登录" onclick="login()" style="color:#BC8F8F">
      </form>
      <form action="zhuce.jsp">
          <input type="submit" value="注册" style="color:#BC8F8F">
      </form>
    </div>

  </body>
</html>

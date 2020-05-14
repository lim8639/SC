<%@ page import="java.net.InetAddress" %><%--
  Created by IntelliJ IDEA.
  User: 86397
  Date: 2020/5/11
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="com.julien.text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://lib.sinaapp.com/js/jquery/2.0.2/jquery-2.0.2.min.js"></script>
    <script>
        $(function () {
           $("#btn").click(function () {
                alert("<%InetAddress addr = InetAddress.getLocalHost();
            out.println("主机地址："+addr.getHostAddress());%>");
            });
        });
    </script>
</head>
<body>
    <button id="btn">
        hello
    </button>
</body>
</html>

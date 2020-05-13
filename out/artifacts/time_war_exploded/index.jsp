<%--
  Created by IntelliJ IDEA.
  User: 86397
  Date: 2020/5/11
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="zh-CN">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <title>电子商务时创项目</title>

  <!-- Bootstrap -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

  <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
  <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
  <!--[if lt IE 9]>
  <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
  <![endif]-->
  <link rel="stylesheet" href="style.css">
  <link rel="shortcut icon" href="pic/20200229113138326_easyicon_net_64.ico" type="image/x-icon">
  <script src="http://lib.sinaapp.com/js/jquery/2.0.2/jquery-2.0.2.min.js"></script>
  <script>
    $(function () {
      $("#down").click(function () {
        alert("开始下载");

      });
    });
  </script>
</head>

<body>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
<nav>
  <div class="container">
    <div class="row">
      <ul>
        <li class=""><a href="http://<%request.getServerName();%>:8080/time/indexServlet?action=toIndex">TimeManeger</a></li>
        <li class="hidden-xs"><a href="#">时创项目</a></li>
        <li class="hidden-xs"><a href="#">时创项目</a></li>
        <li class="hidden-xs hidden-sm"><a href="#">时创项目</a></li>
        <li class="hidden-xs hidden-sm"><a href="#">时创项目</a></li>
        <li class="hidden-xs hidden-sm"><a href="#">时创项目</a></li>

        <li class="hidden-xs hidden-sm"><a href="http://localhost:8080/time/main/mainServlet?action=show">个人中心</a></li>
        <li class="visible-xs visible-sm">
          <a class="glyphicon glyphicon-th-list" href="http://<%request.getServerName(); %>:8080/time/main/mainServlet?action=show"></a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<div class="container-fuild">
  <div class="row">
    <div class="logo">
      <div>
        <B>Time</B>
      </div>
      <div class="box">每个人都有时间，但不是每个人都能管理好自己的时间。让时间转化为效率更好的生产力，是我们本项目的初衷。</div>
      <div style="font-size: 30px" id="down"><a id="dw" style="color: white;" href="http://localhost:8080/time/download?action=time">立即下载</a></div>
      <div></div>
    </div>
  </div>
</div>
<div class="middle">
  <div class="container">
    <div class="row">
      <h2>何谓时创</h2>
      <div class="box">
        <p>“时创”APP主打时间管理，是一款旨在根据人们计划帮助人们完成既定计划并把人们对时间的利用情况数据化从而使人们更了解自己时间分配的APP。</p>
      </div>
      <hr class="half-rule">
    </div>
  </div>
</div>
<div class="container">
  <div class="row">
    <div class="tips col-md-4 col-sm-6 col-xs-12"><img src="pic/devices1.png" alt="">
      <h3>高能时间表</h3>
      <p class="box">一张歌单，能给你提供沁人心脾的音乐。而一张时间表，可以帮助您合理安排一天的时间，做自己时间的管理者，我们为你提供帮助</p>
    </div>
    <div class="tips col-md-4 col-sm-6 col-xs-12"><img src="pic/devices.png" alt="">
      <h3>多平台同步</h3>
      <p class="box">高能时间表将实现全平台同步，无论您身处何地，亦或是工作学习时间别被打断，高能时间表将在全部时间同步，PC电脑，手机等平台随时继续您的高效生活</p>
    </div>
    <div class="tips col-md-4 col-sm-12 col-xs-12"><img src="pic/devices2.png" alt="">
      <h3>多级权限执行</h3>
      <p class="box">对于不同的人群，提供不同的时间设置权限，满足不同客户群体的需求。如果您自制力差，请允许强制执行，那将提高您的工作效率</p>
    </div>
  </div>
</div>
<div class="middle ">
  <div class="container">
    <div class="row">
      <hr class="half-rule">
      <h2>时创中心</h2>
      <div class="box">
        <p>时创平台，是一个帮助您管理时间，提高时间效率的强大工具，高效生活，即将从这里开始!</p>
      </div>

      <a href="http://<%request.getServerName();%>:8080/time/main/mainServlet?action=show"><div class="link">
        前往个人中心>>
      </div></a>
    </div>
  </div>
</div>
<div class="bottom">
  <div class="container">
    <div class="row">
      <ul class="box">
        <li><a href="#">时创</a></li>
        <li><a href="#">时创</a></li>
        <li><a href="#">时创</a></li>
        <li><a href="#">时创</a></li>
      </ul>
      <p class="box">燕山大学电子商务三创赛！</p>
      <p class="box">时创项目，让高效时间实现美好生活！</p>
    </div>
  </div>
</div>
</body>
</html>
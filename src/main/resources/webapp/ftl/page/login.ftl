<#if !online??><#include "/localDevelopment/data/dataModel.ftl"><#else><#include "/localDevelopment/data/onlineModel.ftl"></#if>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta name="renderer" content="webkit" />    

    <script src="/cdnStaticSource20170224/public/js/jquery-2.2.2.js?${versionId}"></script>
    <script src="/cdnStaticSource20170224/public/js/sea.js?${versionId}"></script>
    <script>	
    if(self!=top){top.window.location.href=self.window.location.href};
    window.VERSIOND_ID = ${versionId};
	</script>    
    <script src="/cdnStaticSource20170224/project/js/seajs-config.js?${versionId}"></script>

<link rel="stylesheet" href="/cdnStaticSource20170224/project/css/assets/css/supersized.css">
<link rel="stylesheet" href="/cdnStaticSource20170224/project/css/assets/css/style.css">
<title>光合开放平台系统</title>
</head><body>
<div class="page-container">
  <h1>光合开放平台系统登录</h1>
  <form action="" method="post">
    <input type="text" name="password" class="password" placeholder="用户名">
    <input type="password" name="password" class="password" placeholder="密码">
    <button type="submit">登&nbsp;&nbsp;录</button>
  
  </form>
  <div class="connect">
   <a href="#">注册</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="#">忘记密码</a>
  </div>
</div>
<div align="center"></div>

<script src="/cdnStaticSource20170224/project/css/assets/js/jquery-1.8.2.min.js"></script> 
<script src="/cdnStaticSource20170224/project/css/assets/js/supersized.3.2.7.min.js"></script> 
<script src="/cdnStaticSource20170224/project/css/assets/js/supersized-init.js"></script> 
<script src="/cdnStaticSource20170224/project/css/assets/js/scripts.js"></script>
</body>
</html>
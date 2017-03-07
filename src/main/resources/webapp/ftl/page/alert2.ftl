<#if !online??><#include "/localDevelopment/data/dataModel.ftl"><#else><#include "/localDevelopment/data/onlineModel.ftl"></#if>
<#include "${rootURL.ftl}/include/pubHtml.ftl">
<title>光合开放平台系统</title>
</head><body>
<#include "/include/top.ftl">
<#include "/include/left.ftl">
<div class="right">
  <div class="page-title">系统提示</div>
  <ul class="ui-breadcrumb">
    <li> <a href="index.html">系统首页</a></li>
  </ul>
  <div class="page-alert alert-2"><i class="icon-time alert-icon"></i>企业资质审核中，请耐心等待 </div>
</div>
<#include "/include/bottom.ftl"> 
</body>
</html>
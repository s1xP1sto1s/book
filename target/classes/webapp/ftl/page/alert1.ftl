<#if !online??><#include "/localDevelopment/data/dataModel.ftl"><#else><#include "/localDevelopment/data/onlineModel.ftl"></#if>
<#include "${rootURL.ftl}/include/pubHtml.ftl">
<title>首页</title>
</head>
<body>
<#include "/include/top.ftl">

<#include "/include/left.ftl">
<div class="right">
  <div class="page-title">系统提示</div>
  <ul class="ui-breadcrumb">
    <li> <a href="index.html">Home</a> > </li>  
  </ul>
    <div class="page-alert alert-4"><i class="icon-exclamation-sign alert-icon"></i>请先登录后再进行操作</div>
 <div class="page-alert alert-1"><i class="icon-warning-sign alert-icon"></i>您还没有入驻，请填写基本信息后完成流程。 </div>
  <div class="page-alert alert-2"><i class="icon-time alert-icon"></i>企业资质审核中，请耐心等待 </div>
  <div class="page-alert alert-3"><i class="icon-remove-sign alert-icon"></i>错误信息</div>
 
  
</div>

<#include "/include/bottom.ftl">

<script>
seajs.use(['/cdnStaticSource20170224/project/js/page/index.js']);
</script>
</body>
</html>
<#if !online??><#include "/localDevelopment/data/dataModel.ftl"><#else><#include "/localDevelopment/data/onlineModel.ftl"></#if>
<#include "${rootURL.ftl}/include/pubHtml.ftl">
<title>首页</title>
</head><body>
<#include "/include/top.ftl">

<#include "/include/left.ftl">
<div class="right">
  <div class="page-title">信用贷</div>
  <ul class="ui-breadcrumb">
    <li> <a href="index.html">Home</a> > </li>
    <li> <a href="index.html">产品管理</a> > </li>
    <li> 信用贷 </li>
  </ul>
  <div>
  <ul class="ui-tab">  	
    <li><a href="#portlet_tab3" data-toggle="tab">开发者信息</a></li>
    <li><a href="#portlet_tab3" data-toggle="tab">账务信息</a></li>
    <li><a href="#portlet_tab2" data-toggle="tab">数据报表</a></li>
    <li class="active"><a href="#portlet_tab1" data-toggle="tab">产品概览</a></li>
  </ul>
  </div>
  <div class="tab-content"> 我的产品2我的产品2我的产品2我的产品2我的产品2 </div>
</div>
<#include "/include/bottom.ftl"> 
<script>
$('#menu2 a').addClass('ui-list-active');
seajs.use(['/cdnStaticSource20170224/project/js/page/account.js']);
</script>
</body>
</html>
<#if !online??><#include "/localDevelopment/data/dataModel.ftl"><#else><#include "/localDevelopment/data/onlineModel.ftl"></#if>
<#include "/include/pubHtml.ftl">
<title>首页</title>
</head><body>
<#include "/include/top.ftl">
<#include "/include/left.ftl">
<div class="right">
  <div class="page-title">我的产品</div>
  <ul class="ui-breadcrumb">
    <li><a href="/">系统首页</a>&gt;</li>
    <li><a href="i/product/manager">产品管理</a></li>
  </ul>
  <#if product?? && product?size gt 0>
  <!--产品列表 开始-->  
    <div style="text-align:right">
      <a class="ui-btn-1" href="/product/addProduct"><i class="icon-plus"></i> 添加产品</a>
    </div>
    
    <table class="ui-table">
      <thead>
        <tr>
          <th style="width:40%">产品名称</th>
          <th style="width:15%">类型</th>
          <th style="width:15%">状态</th>
          <th style="width:30%">编辑</th>
        </tr>
      </thead>
      <tbody>
      <#list product as p>
        <tr class="bk">
          <td><a href="/page/myProduct.ftl?id=${p.id}">${p.name}</a></td>
          <td>${p.productType}</td>
          <td>${p.status}</td>
          <td><div class="table-tip-box"> <a class="tip tip2" href="#"><i class="icon-cloud-upload"></i>申请上线</a> <a class="tip tip3" href="#"><i class="icon-thumbs-up"></i>确认上线</a> <a class="tip tip1" href="#"><i class="icon-edit"></i>修改产品</a> <a class="tip tip4" href="#"><i class="icon-remove"></i>删除产品</a> </div></td>
        </tr>
      </#list>
      </tbody>
    </table>
    <div class="ui-pagination" style="display:none">
      <ul>
        <li><a href="#">&lt;</a></li>
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">&gt;</a></li>
      </ul>
    </div>
  <!--产品列表 开始-->
  <#else>
  <div class="page-alert alert-4"><i class="icon-laptop alert-icon"></i>您还没有添加任何产品， <strong><a href="/product/addProduct">马上添加产品</a></strong></div>
  </#if>
</div>
<#include "/include/bottom.ftl"> 
<script>
$('#menu2 a').addClass('ui-list-active');

</script>
</body>
</html>
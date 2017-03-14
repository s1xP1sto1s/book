<#if !online??><#include "/localDevelopment/data/dataModel.ftl"><#else><#include "/localDevelopment/data/onlineModel.ftl"></#if>
<#include "/include/pubHtml.ftl">
<title>首页</title>
</head><body>
<#include "/include/top.ftl">
<#include "/include/left.ftl">
<div class="right">
  <div class="page-title">创建产品</div>
  <ul class="ui-breadcrumb">
    <li> <a href="/">系统首页</a>&gt;</li>
    <li><a href="/product/manager">产品管理</a></li>
  </ul>

  <div class="ui-alert alert-4"> <i class="icon-exclamation-sign"></i> 您还没有入驻，请 <strong><a href="/page/account.ftl">填写完基本信息</a></strong> 并通过认证后才能添加产品 </div>

    <div class="ui-alert alert-4"> <i class="icon-exclamation-sign"></i> 您还未完成企业认证，暂不能添加产品 </div>

  <form action="#" class="ui-form">
    <div class="control-title"><i class="icon-cog"></i> 添加产品</div>
    <div class="control-group">
      <label class="control-label">产品应用名</label>
      <div class="controls">
        <input id="name" type="text" placeholder="请输入" />
        <span class="err-inline" id="name_err"></span>        
      </div>
    </div>
    <div class="control-group">
      <label class="control-label">产品类型</label>
      <div class="controls">
        <select class="m-wrap" tabindex="1" id="productType">         
          <option value="Category 1">白领贷</option>
          <option value="Category 2">公积金贷</option>
          <option value="Category 3">消费金融</option>
        </select>
        </div>
    </div>
    <div class="form-actions">
      <button type="button" class="ui-btn-1" id="btn">下一步</button>
     </div>
  </form>
</div>
<#include "/include/bottom.ftl"> 
<script>
$('#menu2 a').addClass('ui-list-active');
var interfaceUrlMap = {
	addProduct:'${interfaceUrlMap.addProduct}'	
};
seajs.use(['/cdnStaticSource20170224/project/js/page/addProduct.js']);
</script>
</body>
</html>
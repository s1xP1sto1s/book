<#if !online??><#include "/localDevelopment/data/dataModel.ftl"><#else><#include "/localDevelopment/data/onlineModel.ftl"></#if>
<#include "${rootURL.ftl}/include/pubHtml.ftl">
<title>首页</title>
</head><body>
<#include "/include/top.ftl">

<#include "/include/left.ftl">
<div class="right">
  <div class="page-title">填写基本信息</div>
  <ul class="ui-breadcrumb">
    <li> <a href="index.html">系统首页</a>&gt</li>
    <li>账户管理</li>
  </ul>
  <div style="border:1px solid #eee;display:none">
    <ul class="ui-step">
      <li><span class="ui-step-number">1</span>
        <div class="ui-step-text">填写基本信息</div>
      </li>
      <li><span class="ui-step-number" style="background-color:#ccc">2</span>
        <div class="ui-step-text">企业实名认证提交</div>
      </li>
      <li><span class="ui-step-number" style="background-color:#ccc">3</span>
        <div class="ui-step-text">企业资质审核</div>
      </li>
      <li><span class="ui-step-number" style="background-color:#ccc">4</span>
        <div class="ui-step-text">入驻成功</div>
      </li>
    </ul>
    <div class="progress progress-striped active">
      <div style="width: 25%;" class="bar"></div>
    </div>
  </div>
  <div class="b-mt-20"></div>
  <form action="http://localhost:8090/guanghe/merchant/process" class="ui-form">
    <div class="control-title"><i class="icon-cog"></i> 基本信息</div>
    <div class="control-group">
      <label class="control-label">账户号</label>
      <div class="controls" style="padding-top:5px;">lalasxc@126.com </div>
    </div>
    <div class="control-group">
      <label class="control-label">商户名称</label>
      <div class="controls">
        <input id="accountName" type="text" placeholder="请输入" class="m-wrap">
        <span class="err-inline" id="accountName_err"></span>
        <div><span class="help-inline">商家名称一旦输入，无法修改</span> </div>
      </div>
    </div>
    <div class="control-title"><i class="icon-user"></i> 联系人信息</div>
    <div class="control-group">
      <label class="control-label">联系人</label>
      <div class="controls">
        <input id="contact" type="text" placeholder="请输入" class="m-wrap">
        <span class="err-inline" id="contact_err"></span> </div>
    </div>
    <div class="control-group">
      <label class="control-label">手机</label>
      <div class="controls">
        <input id="mobile" type="text" placeholder="请输入" class="m-wrap">
        <span class="err-inline" id="mobile_err"></span> </div>
    </div>
    <div class="control-group">
      <label class="control-label">邮箱</label>
      <div class="controls">
        <input id="email" type="text" placeholder="请输入" class="m-wrap">
        <span class="err-inline" id="email_err"></span> </div>
    </div>
    <div class="form-actions">
      <button type="button" class="ui-btn-1" id="btn">下一步</button>
      <span id="submit_err" class="err-inline"></span> </div>
  </form>
</div>
<#include "/include/bottom.ftl"> 
<script>
$('#menu1 a').addClass('ui-list-active');
//接口定义
var interfaceUrlMap = {
	addAccount:'${interfaceUrlMap.addAccount}'	
};
seajs.use(['/cdnStaticSource20170224/project/js/page/account.js']);
</script>
</body>
</html>
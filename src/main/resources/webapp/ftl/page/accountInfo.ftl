<#if !online??><#include "/localDevelopment/data/dataModel.ftl"><#else><#include "/localDevelopment/data/onlineModel.ftl"></#if>
<#include "${rootURL.ftl}/include/pubHtml.ftl">
<title>光合开放平台系统</title>
</head><body>
<#include "/include/top.ftl">
<#include "/include/left.ftl">
<div class="right">
  <div class="page-title">基本资料</div>
  <ul class="ui-breadcrumb">
    <li><a href="index.html">系统首页</a>&gt;</li>
    <li><a href="index.html">账户管理</a></li>
  </ul>
  <#if !account.regist>
  <div class="page-alert alert-4"><i class="icon-laptop alert-icon"></i>您还没有完成基本信息填写， <strong><a href="/page/account.ftl">马上添加基本信息</a></strong></div>
  <#else>
  <!--基本资料 开始-->
  <form action="#" class="ui-form ui-form-info">
    <div class="control-title"><i class="icon-cog"></i> 基本信息</div>
    <div class="control-group">
      <label class="control-label">账户名：</label>
      <div class="controls">lalasxc@126.com </div>
    </div>
    <div class="control-group">
      <label class="control-label">登录密码：</label>
      <div class="controls">登录商家后台时使用的密码 &nbsp;<a href="#">重置</a></div>
    </div>
    <div class="control-group">
      <label class="control-label">账户状态：</label>
      <div class="controls">未实名 </div>
    </div>
    <div class="control-group">
      <label class="control-label">商家名称：</label>
      <div class="controls">上海小贷有限公司</div>
    </div>
    <div class="control-title"><i class="icon-user"></i> 联系人信息<span style="float:right"><i class="icon-edit"></i>&nbsp;<a id="editPop" href="javascript:;">修改联系人信息</a></span></div>
    <div class="control-group">
      <label class="control-label">联系人：</label>
      <div class="controls">王小华 </div>
    </div>
    <div class="control-group">
      <label class="control-label">手机：</label>
      <div class="controls">18667653211 </div>
    </div>
    <div class="control-group">
      <label class="control-label">邮箱：</label>
      <div class="controls">lalasxc@126.com </div>
    </div>
  </form>
  <!--基本资料 结束-->
  
  <!--修改联系人 开始-->
  <form action="#" class="ui-form ui-pop-form" id="f1" style="width:500px;display:none">   
    <div class="control-group">
      <label class="control-label">联系人</label>
      <div class="controls">
        <input id="contact" type="text" placeholder="请输入" class="m-wrap">
        <div class="ui-form-err" id="contact_err"></div> </div>
    </div>
    <div class="control-group">
      <label class="control-label">手机</label>
      <div class="controls">
        <input id="mobile" type="text" placeholder="请输入" class="m-wrap">
        <div class="ui-form-err" id="mobile_err"></div>
        </div>
    </div>
    <div class="control-group">
      <label class="control-label">邮箱</label>
      <div class="controls">
        <input id="email" type="text" placeholder="请输入" class="m-wrap">
        <div class="ui-form-err" id="email_err"></div>
      </div>
    </div>
    <div class="form-actions">
      <button type="button" class="ui-btn-1" id="btn">修改</button>&nbsp;&nbsp;<button type="button" class="ui-btn-2" key="close">放弃</button>
      <div id="submit_err" class="ui-form-err"></div> </div>
  </form>
  <!--修改联系人 结束-->
  
  </#if>
</div>
<#include "/include/bottom.ftl">
<script>
$('#menu1 a').addClass('ui-list-active');
//接口定义
var interfaceUrlMap = {
	addAccount:'${interfaceUrlMap.addAccount}'	
};
seajs.use(['/cdnStaticSource20170224/project/js/page/accountInfo.js']);
</script>
</body>
</html>
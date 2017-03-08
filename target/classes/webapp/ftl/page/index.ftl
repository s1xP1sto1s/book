<#if !online??><#include "/localDevelopment/data/dataModel.ftl"><#else><#include "/localDevelopment/data/onlineModel.ftl"></#if>
<#include "${rootURL.ftl}/include/pubHtml.ftl">
<title>首页</title>
</head><body>
<#include "/include/top.ftl">

<#include "/include/left.ftl">
<div class="right">
  <div class="page-title">系统首页</div>

   <div class="ui-alert alert-4"> <i class="icon-exclamation-sign"></i> 您还没有入驻，请 <strong><a href="/guanghe/merchant/register">填写基本信息</a></strong> 后完成流程。 </div>  

  <!--系统简介 开始-->
  <div class="ui-box b-mt-20" style="display:none">
    <div class="ui-box-title"><span class="ui-box-tools"><i class="icon-desktop"></i>&nbsp;系统简介</span></div>
    <div class="ui-box-body">
      <div class="about"> 网易金融主要方向：致力于成为金融机构向数字化、移动化、智能化成功转型的最佳金融科技合作伙伴。基于项目制谈判的开发方式效率低下，重复开发造成严重资源浪费。大数据风控部门致力于打造开放平台，全面向B端商家输出金融科技与服务。助力传统金融机构科技转型，实现普惠金融的企业愿景。 </div>
    </div>
  </div>
  <!--系统简介 结束-->
  
  <!--入驻流程 开始-->
  <div class="ui-box b-mt-20">
    <div class="ui-box-title"><span class="ui-box-tools"><i class="icon-share"></i>&nbsp;入驻流程</span></div>
    <div class="ui-box-body">
      <ul class="ui-step">
        <li><span class="ui-step-number">1</span>
          <div class="ui-step-text">填写基本信息</div>
        </li>
        <li><span class="ui-step-number">2</span>
          <div class="ui-step-text">企业实名认证提交</div>
        </li>
        <li><span class="ui-step-number">3</span>
          <div class="ui-step-text">企业资质审核</div>
        </li>
        <li><span class="ui-step-number">4</span>
          <div class="ui-step-text">入驻成功</div>
        </li>
      </ul>
    </div>
  </div>
  <!--入驻流程 结束-->
  
  <!--产品推荐 开始-->
  <div class="ui-box b-mt-20">
    <div class="ui-box-title"><span class="ui-box-tools"><i class="icon-thumbs-up"></i>&nbsp;产品推荐</span></div>
    <div class="ui-box-body">
      <ul class="product-list">
        <li>
          <div class="content"><a href="#"><img src="/cdnStaticSource20170224/project/images/photo1.jpg?${versionId}" /></a>
            <div class="pro-text">
              <div class="pro-title"><a href="#">公积金类产品</a></div>
              <a href="#">首页内容包含开放平台产品介绍、入驻流程介绍等内容，具体展示细节以交互稿为流程包含以下环节...</a> 
              
              <div class="button-box"><a href="#"><button class="ui-btn-1">添加产品</button></a></div>
              </div>
          </div>
        </li>
        <li>
          <div class="content"><a href="#"><img src="/cdnStaticSource20170224/project/images/photo2.jpg?${versionId}" /></a>
            <div class="pro-text">
              <div class="pro-title"><a href="#">公积金类产品</a></div>
              <a href="#">首页内容包含开放平台产品介绍、入驻流程介绍等内容，具体展示细节以交互稿为流程包含以下环节...</a> 
              
              <div class="button-box"><a href="#"><button class="ui-btn-1">添加产品</button></a></div>
              </div>
          </div>
        </li>
         <li>
          <div class="content"><a href="#"><img src="/cdnStaticSource20170224/project/images/photo1.jpg?${versionId}" /></a>
            <div class="pro-text">
              <div class="pro-title"><a href="#">公积金类产品</a></div>
              <a href="#">首页内容包含开放平台产品介绍、入驻流程介绍等内容，具体展示细节以交互稿为流程包含以下环节...</a> 
              
              <div class="button-box"><a href="#"><button class="ui-btn-1">添加产品</button></a></div>
              </div>
          </div>
        </li>
         <li>
          <div class="content"><a href="#"><img src="/cdnStaticSource20170224/project/images/photo2.jpg?${versionId}" /></a>
            <div class="pro-text">
              <div class="pro-title"><a href="#">公积金类产品</a></div>
              <a href="#">首页内容包含开放平台产品介绍、入驻流程介绍等内容，具体展示细节以交互稿为流程包含以下环节...</a> 
              
              <div class="button-box"><a href="#"><button class="ui-btn-1">添加产品</button></a></div>
              </div>
          </div>
        </li>
      </ul>
    </div>
  </div>
  <!--产品推荐 结束-->
  
</div>
<#include "/include/bottom.ftl"> 
<script>
$('#menu0 a').addClass('ui-list-active');
seajs.use(['/cdnStaticSource20170224/project/js/page/index.js']);
</script>
</body>
</html>
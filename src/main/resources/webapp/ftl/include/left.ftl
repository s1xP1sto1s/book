<div class="left">
  <div class="ui-list-1">
    <div class="ui-list-li" id="menu0"> <a href="/" class="ui-list-a ui-list-a-icon"><i class="icon-home ui-list-icon"></i>系统首页</a> </div>
    <div class="ui-list-li" id="menu1"> <a href="/merchant/show" class="ui-list-a ui-list-a-icon"><i class="icon-edit ui-list-icon"></i>账户管理</a> </div>
    <div class="ui-list-1 ui-list-clild" style="display:">
      <div class="ui-list-li"> <a href="/merchant/show" class="ui-list-a">基本资料</a> </div>      
    </div>
    <div class="ui-list-li" id="menu2"> <a href="/product/manager" class="ui-list-a ui-list-a-icon"><i class="icon-cog ui-list-icon"></i>产品管理<i class="icon-angle-down ui-list-icon" style="display:none"></i></a> </div>
    <div class="ui-list-1 ui-list-clild" style="display:">
      <div class="ui-list-li"> <a href="/product/addProduct" class="ui-list-a">创建产品</a> </div>
      <div class="ui-list-li"> <a href="/product/manager" class="ui-list-a">我的产品</a> </div>
    </div>
    <div class="ui-list-li" id="menu3"> <a href="#" class="ui-list-a ui-list-a-icon"><i class="icon-comments ui-list-icon"></i>联系我们</a> </div>
  </div>
</div>
<script>
for(var i = 0; i < 4;  i++){
	$('#menu' + i +' a').removeClass('ui-list-active');	
}

</script>
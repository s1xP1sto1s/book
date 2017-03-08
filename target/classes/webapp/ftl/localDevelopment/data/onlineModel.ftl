<#--各种路径url-->
<#assign rootURL={
	"ftl":"/"
}>

<#--接口url
coupon //红包
balance //余额
ajaxValidCardNo // 得到银行卡bin
checkForm //后端表单校验
checkRisk //风控表单校验
quickpayAuthCode //快捷支付发验证码
quickSignAuthCode //快捷签约发验证码
ajaxPayGate //取可用网关
quickpaySign // 快捷签约
getMBK //取密保卡坐标
smsCode //密保手机发验证码
setShortPayPassword //设置短密码
sendAuthCodeToFindPassword //找回密码发送验证码
sendAuthCodeToFindPassword //找回密码发送验证码
-->
<#assign interfaceUrlMap={
   "addAccount":"/guanghe/merchant/process",
   "addProduct":"/localDevelopment/interface/addProduct.html"
}> 

<#--各种路径url-->
<#assign rootURL={
	"ftl":"/20160216-wap"
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
   "coupon":"/cashier/m/ajaxCoupons",
   "balance":"/cashier/m/ajaxTextBalance",
   "getBankByBankCard":"/cashier/m/gate/ajaxValidCardNo",
   "checkForm":"/cashier/m/ajaxPay",
   "checkRisk":"/cashier/m/security/verify",
   "quickpayAuthCode":"/cashier/m/quickpay/payAuthCode",
   "quickSignAuthCode":"/cashier/m/quickpay/signAuthCode",
   "ajaxPayGate":"/cashier/m/gate/ajaxQueryPayGate",
   "quickpaySign":"/cashier/m/quickpay/sign",
   "getMBK":"/cashier/m/security/queryCoordinates",
   "smsCode":"/cashier/m/security/sendAuthCode",
   "setShortPayPassword":"/cashier/m/security/setShortPayPassword",
   "sendAuthCodeToFindPassword":"/cashier/m/security/sendAuthCodeToFindPassword",
   "checkAuthCodeToFindShortPayPassword":"/cashier/m/security/checkAuthCodeToFindShortPayPassword"
}> 

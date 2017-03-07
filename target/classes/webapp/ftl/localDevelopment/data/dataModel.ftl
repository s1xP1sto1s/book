
<#--时间戳-->
<#assign versionId="20160198313">

<#--各种路径url-->
<#assign rootURL={
    "ftl": ""
}>


<#assign account={
	"regist":false,
	"identification":false

}>


<#--接口url

-->
<#assign interfaceUrlMap={   	
    "addAccount":"/localDevelopment/interface/addAccount.html",
    "addProduct":"/localDevelopment/interface/addProduct.html"
     
}>


<#assign platformId = "0988237273727322">
<#assign token = "0988237273727322">
<#assign ta = "ed1">

<#--账户信息-->

<#assign user = {
 "accountName":"李小华",
 "accountType":'URS'
}>

<#assign payAmount = 100.98>

<#assign accountDto = {
    "accountId":"009888776112323",
    "accountName":"李小华",    
    "identified":false,
    "mobile":"*********19",
    "accountIdentity":"3****************7",
    "identityVerified":false,
    "haveEkey":false,
    "havePassProtectCard":false,
    "havePayPassword":true,
    "haveShortPayPassword":false
}>

<#--单个订单信息-->
<#assign orderDto = {
    "orderId":"00002312343232",
    "platformOrderId":"0982342121109988",
    "amount":123.10,
    "orderName":"龙猫天竺龙猫天竺仓鼠荷兰猪兔龙猫天竺仓鼠荷兰猪兔龙猫天竺仓鼠荷兰猪兔仓鼠荷兰猪兔",
    "payeeName":"网易电商"
}>

<#--合并订单信息-->
<#assign batchOrderDto = {
    "orderId": "00002312343232",
    "amount": 410.12,
    "orderName": "龙猫合并付款",
    "payeeName": "网易电商网易电商网易电商网易电商",   
    "orderList": [
      {
        "orderId": "001",
        "platformOrderId": "001",
        "amount":0.12,
        "orderName": "龙猫天竺龙猫天竺仓鼠荷兰猪兔龙猫天竺仓鼠荷兰猪兔龙猫天竺仓鼠荷兰猪兔仓鼠荷兰猪兔1",
        "payeeName": "网易电商网易电商网易电商网易电商网易电商网易电商网易电商网易电商"
      },
      {
        "orderId": "002",
        "platformOrderId": "002",
        "amount":0.14,
        "orderName": "龙猫2",
        "payeeName": "网易电商"
      }
    ]
}>

<#--支付方式信息string型-->
<#assign payModeDtoJson = '{"coupon":{"enable":true,"disableReasonDesc":"彩票不能使用红包支付"},"balance":{"enable":true,"disableReasonCode":"060008","disableReasonDesc":"彩票不能使用余额支付"},"quickPay":{"enable":true}}'>

<#--默认风控信息string型-->
<#assign defaultPayValidPolicy='{"BALANCE":["SHORT_PAY_PASSWORD","SHORT_PAY_PASSWORD"],"QUICK_PAY":["QUICK_PAY_SMS"],"COUPON":[]}'>

<#--用户已绑定的快捷列表-->
<#assign bankCardList = [
    {
        "quickPayId": "00000001",
        "enable":true,
        "disableReason":"这张卡已被银行冻结",
        "cardType":"credit",
        "cardNoTail":"2344",
        "bankId":"0001",
        "bankStyleId":"0001",
        "quotaPerOrder": "150000",
        "quotaPerDay":"100000",
        "maskMobile":"*********19",
        "cardAccountName":'*宝',
        "bankName":"工商银行"
    },
    {
        "quickPayId": "00000002",
        "enable":true,
        "disableReason":"这张卡已被银行冻结",
        "bankType":'company',
        "cardType":"debit",
        "cardNoTail":"8899",
        "bankId":"0003",
        "bankStyleId":"0002",
        "quotaPerOrder": "15000",
        "quotaPerDay":"1000",
         "cardAccountName":'*宝',
        "maskMobile":"*********18",
        "bankName":"农业银行"
    },
    {
       "quickPayId": "00000003",
        "enable":false,
        "disableReason":"这张卡已被银行冻结",
        "bankType":'company',
         "cardAccountName":'*宝',
        "cardType":"debit",
        "cardNoTail":"3099",
        "bankId":"0003",
        "bankStyleId":"0003",
        "quotaPerOrder": "15000",
        "quotaPerDay":"1000",
        "maskMobile":"*********17",
        "bankName":"招商银行"
    }
]>

<#--成功、错误页面-->
<#assign errorMsg="">
<#assign seller="考拉海购">
<#assign payAmount="20.00">
<#assign notifyType="game">
<#assign html="<form action='https://epay.163.com/servlet/controller?operation=orderSuccess&pId=2' method='POST'><input type='hidden' name='notifyType' value='onlinemobile'></form>">
<#assign errorMsg="支付错误，请重试！">



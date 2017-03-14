
<#--时间戳-->
<#assign versionId="20160198313">

<#--各种路径url-->
<#assign rootURL={
    "ftl": ""
}>



<#assign merchant={    
    "id": "0",
    "ursName": "urs@126.com",
    "name": "商户A",
    "concat": "张三",
    "mobile": "13212128888",
    "email": "35066546@163.com",
    "status": "authing",
    "enabled": "y"    
}>

<#assign accountStatus={
	"regist":false,
	"identification":false
}>


<#assign product=[
	{"id":'00001',"name": "商品名称","productType": "商品类型","status": "商品状态"},
    {"id":'00002',"name": "商品名称","productType": "商品类型","status": "商品状态"}
]>


<#--接口url

-->
<#assign interfaceUrlMap={   	
    "addAccount":"/localDevelopment/interface/addAccount.html",
    "addProduct":"/localDevelopment/interface/addProduct.html",
    "concatModify":"/localDevelopment/interface/concatModify.html"
     
}>


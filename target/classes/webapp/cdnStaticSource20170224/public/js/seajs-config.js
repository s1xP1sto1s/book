
var versionId = typeof VERSIOND_ID !== 'undefined'? VERSIOND_ID: (new Date()).getTime();
seajs.config({
	base: "/cdnStaticSource20170224/public/js/",
	paths: {
		module: "/cdnStaticSource20151123/wap/20160216/js/module/"
	},

	alias: {
		template:"public/template-debug",
		jquery:"public/jquery-2.2.2",
		epay:"module/epay",
		md5:"module/md5",
		Router:"module/Router",
		router1:"page/router1",		
		Toast:"module/MobileToast",
		Dialog:"module/MobileDialog",
		Dialog:"module/MobileDialog",
		Dai:"module/Dai.js",	
		ValidateForm:"module/MobileValidateForm",
		numberPassword:"module/numberPassword"
		
	},

	map: [
		['.js', '.js?' + versionId]
	]
})


var versionId = typeof VERSIOND_ID !== 'undefined'? VERSIOND_ID: (new Date()).getTime();
seajs.config({
	base: "/cdnStaticSource20170224/public/js/",
	paths: {
		module: "/cdnStaticSource20170224/public/js/module/"
	},

	alias: {
		template:"public/template-debug",		
		epay:"module/epay",
		validate:"module/validate",
		dialog:"module/dialog",
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

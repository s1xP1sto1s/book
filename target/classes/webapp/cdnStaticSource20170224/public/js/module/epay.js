define(function(require, exports, module){
	var Epay = {};
	
	Epay.$ = function(id){return document.getElementById(id)};
	
	//cookie相关
	Epay.cookieUtil = {
		get: function (name){
			var cookieName = encodeURIComponent(name) + "=",
				cookieStart = document.cookie.indexOf(cookieName),
				cookieValue = null,
				cookieEnd;				
			if (cookieStart > -1){
				cookieEnd = document.cookie.indexOf(";", cookieStart);
				if (cookieEnd == -1){
					cookieEnd = document.cookie.length;
				}
				cookieValue = decodeURIComponent(document.cookie.substring(cookieStart + cookieName.length, cookieEnd));
			} 	
			return cookieValue;
		},
		
		set: function (name, value, expires, path, domain, secure) {
			var cookieText = encodeURIComponent(name) + "=" + encodeURIComponent(value);		
			if (expires instanceof Date) {
				cookieText += "; expires=" + expires.toGMTString();
			}		
			if (path) {
				cookieText += "; path=" + path;
			}		
			if (domain) {
				cookieText += "; domain=" + domain;
			}		
			if (secure) {
				cookieText += "; secure";
			}		
			document.cookie = cookieText;
		},
		
		unset: function (name, path, domain, secure){
			this.set(name, "", new Date(0), path, domain, secure);
		}

	};
	
	
	//常用验证正则
	Epay.checkReg = {		
		email : /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/,
		mDate:/^((?:19|20)\d\d)(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])$/,
		phone : /^((\(\d{3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,7}$/,
		mobile : /^(13|14|15|17|18)\d{9}$/,
		name:/^[a-zA-Z0-9_\u4e00-\u9fa5]+$/,
		bankCard : /^[\d ]{13,23}$/,
		amount : /^(0|[1-9]\d*)(\.\d{1,2})?$/,//金额正则
		trueName : /^([\u0391-\uFFE5]|[A-Za-z]|[\u00B7])([\u0391-\uFFE5A-Za-z\u00B7\\*\\?\\)\\(]){0,39}$/,	
		code : /^([\u0391-\uFFE5]|[A-Za-z]|\d|[\u00B7]){2,40}$/,
		number : /^\d+$/,
		zip : /^[0-9]\d{5}$/,
		qq : /^[1-9]\d{4,8}$/,	
		english : /^[A-Za-z]+$/,
		money : /^(?![0\.]+$)(?:(?:[1-9]\d*?(?:\.\d{1,2})?)|(?:0\.\d{1,2}))$/,
		chinese :  /^[\u0391-\uFFE5]+$/,
		validDate: /^\d{2}\/\d{2}$/,
		isIDno:function(num){
			num = typeof(num) == "object" ? num.value : num;
			var aCity = "11,12,13,14,15,21,22,23,31,32,33,34,35,36,37,41,42,43,44,45,46,50,51,52,53,54,61,62,63,64,65,71,81,82,91";
			var iSum = 0;
			var info = "";
			var idCardLength = num.length;
			if(!/^\d{17}(\d|x)$/i.test(num)&&!/^\d{15}$/i.test(num)&&!/^\d{8}$/i.test(num)) {     
				return false;
			}
	
			//在后面的运算中x相当于数字10,所以转换成a
			var objvalue = num.replace(/x$/i,"a");
	
			var curCity = objvalue.substr(0,2);
	
			if(!(aCity.indexOf(curCity) >= 0) ) {      
				return false;
			}
	
			if (idCardLength==18) {
				sBirthday=objvalue.substr(6,4)+"-"+Number(objvalue.substr(10,2))+"-"+Number(objvalue.substr(12,2));
				var d = new Date(sBirthday.replace(/-/g,"/"))
				if(sBirthday!=(d.getFullYear()+"-"+ (d.getMonth()+1) + "-" + d.getDate())) {       
					return false;
				}
				for(var i = 17;i>=0;i --)
					iSum += (Math.pow(2,i) % 11) * parseInt(objvalue.charAt(17 - i),11);
	
				if(iSum%11!=1) {        
					return false;
				}	
			}
			else if (idCardLength==15) {
				sBirthday = "19" + objvalue.substr(6,2) + "-" + Number(objvalue.substr(8,2)) + "-" + Number(objvalue.substr(10,2));
				var d = new Date(sBirthday.replace(/-/g,"/"))
				var dd = d.getFullYear().toString() + "-" + (d.getMonth()+1) + "-" + d.getDate();
	
				if(sBirthday != dd) {       
					return false;
				}
			}
			else if (idCardLength==8) {
			}
			return true;
		}
	};
	
	
	//js浮点数精确计算函数(加，减，乘，除)//浮点数加法运算  
	 Epay.floatAdd = function(arg1,arg2){  
	   var r1,r2,m;
       try{
           r1 = arg1.toString().split('.')[1].length;
       }catch(e){
           r1 = 0;
       }
       try{
           r2=arg2.toString().split(".")[1].length;
       }catch(e){
           r2=0;
       }
       m=Math.pow(10,Math.max(r1,r2));   
       return Math.round(arg1*m+arg2*m)/m;
	  };
	  
	 //浮点数减法运算  
	 Epay.floatSub = function(arg1,arg2){  
		 var r1,r2,m,n;  
		 try{r1=arg1.toString().split(".")[1].length}catch(e){r1=0}  
		 try{r2=arg2.toString().split(".")[1].length}catch(e){r2=0}  
		 m=Math.pow(10,Math.max(r1,r2));  
		 //动态控制精度长度  
		 n=(r1>=r2)?r1:r2;  
		 //添加了结果为整数时精度长度不准确的问题
		 var r = ((arg1*m-arg2*m)/m).toFixed(n);
		 if(r.split(".")[1]){
			 if( Number(r.split(".")[1]) == 0){return Number(r.split(".")[0])};
		 };	
		 return Number(((arg1*m-arg2*m)/m).toFixed(n));  
	 } ;  
	   
	 //浮点数乘法运算  
	 Epay.floatMul = function(arg1,arg2) {   
		  var m=0,s1=arg1.toString(),s2=arg2.toString();   
		  try{m+=s1.split(".")[1].length}catch(e){}   
		  try{m+=s2.split(".")[1].length}catch(e){}   
		  return Number(s1.replace(".",""))*Number(s2.replace(".",""))/Math.pow(10,m)   
	  }  ; 
	  
	  
	//浮点数除法运算  
	Epay.floatDiv = function(arg1,arg2){   
		var t1=0,t2=0,r1,r2;   
		try{t1=arg1.toString().split(".")[1].length}catch(e){}   
		try{t2=arg2.toString().split(".")[1].length}catch(e){}   
		with(Math){   
			r1=Number(arg1.toString().replace(".","")) ;  
			r2=Number(arg2.toString().replace(".",""));   
			return Number((r1/r2)*pow(10,t2-t1));   
		}   
	} ;  
	
	
	//数据类型检测
	Epay.getDataType = function(d){
		if(d === undefined){return};
		if($.isArray(d)){return 'array'};
		if($.isPlainObject(d)){return 'plainObject'}; //非原生对象
		if(typeof(d) === 'number'){return 'number'};
		if(typeof(d) === 'string'){return 'string'};
		if(typeof(d) === 'function'){return 'function'};
		if(typeof(d) === 'boolean'){return 'boolean'};		
	};
	
	//ajax验证码时间戳
	Epay.versionTime = function(){
		return '?v=' + new Date().getTime();	
	};

	Epay.fillErrForAjax = function(err){		
		for(var p in err){
			if(document.getElementById(p)){
				document.getElementById(p + '_err').innerHTML = err[p];
			}	
			
		};		
	};	
		
	
	return Epay;
	
});

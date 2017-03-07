
function Validata(data){
	if(data){this.data = data}
	else{
		this.data = {};
	}		
}

Validata.prototype = {
	
	//绑定要onblur验证的元素
	bindBlur:function(eles){		
		var that = this;		
		for(var i = 0 ; i < eles.length ; i ++){			
			var ele = eles[i]; //要验证的元素
			$(ele).on('blur',function(){
				that.checkEle(this);				
			});
			$(ele).on('focus',function(){
				that.rightMode(this);				
			});
		};
	},	
	
	//批量验证
	check:function(eles){		
		var that = this;
		var pass = true;		
		for(var i = 0 ; i < eles.length ; i ++){
			that.checkEle(eles[i]);
			if(pass && !eles[i].pass){pass = false}
		};
		return pass;		
	},	
	
	//验证单个元素
	checkEle:function(ele){
		var that = this;
		var checkData = ele.checkData; //要验证的数据			
		var err = checkData.err; //验证报错容器
		var check = checkData.check; //验证规则
		var v = ele.value; //要验证的元素的值
		ele.pass = true; //是否通过校验
		var checkReturn = check(v);	
		
		//验证不通过		
		if(checkReturn != undefined){			
			ele.pass = false;	
			if(checkData.errMode){			
				checkData.errMode(err,checkReturn);				
			}else if(that.data.errMode){
				that.data.errMode(err,checkReturn);
			}else{
				err.innerHTML = checkReturn;
			}
		}
		//验证通过	
		if(ele.pass){
			that.rightMode(ele)
		};
		
	},
	
	//正确模式
	rightMode:function(ele){
		var that = this;
		var checkData = ele.checkData;
		var err = checkData.err;
		if(checkData.RightMode){			
			checkData.RightMode(err);				
		}else if(that.data.RightMode){
			that.data.RightMode(err);
		}else{
			err.innerHTML = '';
		}
	}
	
}

module.exports = Validata;
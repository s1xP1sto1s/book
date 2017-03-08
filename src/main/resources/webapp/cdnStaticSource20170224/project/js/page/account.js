define(
	function(require) {	

	//表单验证
	var validate = require('validate');
	var epay = require('epay');

	function gid(id){	
		return document.getElementById(id);	
	}

	$('#accountName').get(0).checkData = {	
		err:$('#accountName_err').get(0),
		check:function(v){
			if(v === ''){return '商户名称不能为空'}			
		}
	}

	$('#contact').get(0).checkData = {	
		err:$('#contact_err').get(0),
		check:function(v){
			if(v === ''){return '联系人不能为空'}
			if(!epay.checkReg.trueName.test(v)){return '联系人格式不正确'}
		}
	}

	$('#mobile').get(0).checkData = {	
		err:$('#mobile_err').get(0),
		check:function(v){
			if(v === ''){return '手机号不能为空'}
			if(!epay.checkReg.mobile.test(v)){return '手机号格式不正确'}
		}
	}

	$('#email').get(0).checkData = {	
		err:$('#email_err').get(0),
		check:function(v){
			if(v === ''){return '邮箱不能为空'}
			if(!epay.checkReg.email.test(v)){return '邮箱格式不正确'}
		}
	}


	//var eles = [gid('accountName'),gid('contact'),gid('mobile'),gid('email')];
	var eles = [];
	var v = new validate();
	
	v.bindBlur(eles)
	
	$('#btn').click(function(){	
		var pass = v.check(eles);
		if(pass){
			$('#loading .ui-loading-text').html('系统提交请稍候');
			$('#loading').show();
			submitForm();
			
		}
			
	});
	
	
	var ajaxTime = 10000;//调用接口上限时间		
	//ajax验证码时间戳
	function versionTime(){
		return '?v=' + new Date().getTime();	
	};



	function fillErrForAjax(err){		
		for(var p in err){
			if(gid(p)){
				gid(p + '_err').innerHTML = err[p];
			}	
			
		};		
	}
	

	
	var datas = {ursName:'laldad@126.com',name:'sxc',concat:'afad',mobile:'1879908877',email:'aaa@126.com'}
	function submitForm(){	
		
		$('#submit_err').html('');
		$.ajax({				
			url:interfaceUrlMap.addAccount + versionTime(),
			type:"POST",			
			timeout:ajaxTime,	
			data:datas,
			error:function(){$('#loading').hide();	$('#submit_err').html('系统错误请重试222');},					
			success:function(msg){
				location.href = '/guanghe/merchant/show'	
			}
		});		
		
	}


	




	}
);
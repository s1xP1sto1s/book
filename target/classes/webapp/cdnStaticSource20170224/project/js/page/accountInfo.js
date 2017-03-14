define(
	function(require) {
	
	
	var epay = require('epay');			
	var ajaxTime = 10000;//调用接口上限时间	
	
	var dialog = require('dialog');	
	var dialog  = new dialog();
	
	$('#editPop').on('click',function(){
		dialog.show({title:'修改联系人',content:$('#f1').get(0)})
	});	
	

	//表单验证
	var validate = require('validate');
	var epay = require('epay');

	function gid(id){	
		return document.getElementById(id);	
	};
	
	$('#concat').get(0).checkData = {	
		err:$('#concat_err').get(0),
		check:function(v){
			if(v === ''){return '联系人不能为空'}
			if(!epay.checkReg.trueName.test(v)){return '联系人格式不正确'}
		}
	};

	$('#mobile').get(0).checkData = {	
		err:$('#mobile_err').get(0),
		check:function(v){
			if(v === ''){return '手机号不能为空'}
			if(!epay.checkReg.mobile.test(v)){return '手机号格式不正确'}
		}
	};

	$('#email').get(0).checkData = {	
		err:$('#email_err').get(0),
		check:function(v){
			if(v === ''){return '邮箱不能为空'}
			if(!epay.checkReg.email.test(v)){return '邮箱格式不正确'}
		}
	};


	var eles = [gid('concat'),gid('mobile'),gid('email')];
	//var eles = [];
	var v = new validate();
	
	v.bindBlur(eles);
	
	$('#btn').click(function(){	
		var pass = v.check(eles);
		if(pass){
			$('#loading .ui-loading-text').html('系统提交请稍候');
			$('#loading').show();
			submitForm();
		}
	});

	function submitForm(){		
		$('#submit_err').html('');
		var datas = {
			concat:$('#concat').val(),
			mobile:$('#mobile').val(),
			email:$('#email').val()
		};		
		
		$.ajax({				
			url:interfaceUrlMap.addAccount + epay.versionTime(),
			type:"POST",		
			data:datas,				
			timeout:ajaxTime,	
			error:function(){$('#loading').hide();	$('#submit_err').html('系统错误请重试');},					
			success:function(msg){
				$('#loading').hide();		
				try{	
					var e = typeof(msg) === "object" ? msg : eval("("+msg+")");	
					var result = e["result"];												
					if(result === "success"){	
						dialog.close();
						$('#concat-2').html(datas.concat);
						$('#mobile-2').html(datas.mobile);
						$('#email-2').html(datas.email);						
					}
					else if(result === "fail"){
						epay.fillErrForAjax(e.errorMap);
					}
					else if(result === "error"){
						$('#submit_err').html(e.errorMsg);
					}
					else{
						$('#submit_err').html('系统错误请重试')
					}						
				}catch(e){						
					$('#loading').hide();
					$('#submit_err').html('系统错误请重试');				
				};					
			}
		});			
	}
	
	
 });
 
 

 
 
 
 

/*创建产品*/

define(
	function(require) {
		
	var ajaxTime = 10000;//调用接口上限时间			
	var epay = require('epay');		
	var validate = require('validate');


	//表单验证	
	$('#productName').get(0).checkData = {	
		err:$('#productName_err').get(0),
		check:function(v){
			if(v === ''){return '产品应用名不能为空'}
			if(!epay.checkReg.trueName.test(v)){return '联系人格式不正确'}
		}
	};
	
	//var eles = [gid('contact'),gid('mobile'),gid('email')];
	var eles = [epay.$('productName')];
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
		$.ajax({				
			url:interfaceUrlMap.addProduct + epay.versionTime(),
			type:"POST",			
			timeout:ajaxTime,	
			error:function(){$('#loading').hide();	$('#submit_err').html('系统错误请重试');},					
			success:function(msg){
				$('#loading').hide();		
				try{	
					var e = typeof(msg) === "object" ? msg : eval("("+msg+")");	
					var result = e["result"];												
					if(result === "success"){	
						location.href = '/page/product.ftl';
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

 
 
 
 

/*创建产品*/

define(
	function(require) {
		
	var ajaxTime = 10000;//调用接口上限时间			
	var epay = require('epay');		
	var validate = require('validate');


	//表单验证	
	$('#name').get(0).checkData = {	
		err:$('#name_err').get(0),
		check:function(v){
			if(v === ''){return '产品应用名不能为空'}			
		}
	};

	var eles = [epay.$('name')];
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
			name:$('#name').val(),
			productType:$('#productType').val()
		};	
		$.ajax({				
			url:interfaceUrlMap.addProduct + epay.versionTime(),
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
						location.href = '/product/manager';
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

 
 
 
 
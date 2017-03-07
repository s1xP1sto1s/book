define(
	function(require) {	

	var validate = require('validate');
	var dialog = require('dialog');

	var p = new dialog()


	var obj = {
		title:'弹窗功能演示'
	}

	$('#open1').on('click',function(){
		obj.content = '内容为字符串';
		p.show(obj)	
	})
	$('#open2').on('click',function(){
		obj.content = $('#bb1');
		p.show(obj)	
	})
	$('#open3').on('click',function(){
		obj.content = $('#bb2');
		p.show(obj)	
	})
	

	function gid(id){	
	return document.getElementById(id);	
}

	$('#t1').get(0).checkData = {	
		err:$('#t1_err').get(0),
		check:function(v){
			if(v === ''){return '姓名不能为空'}
			if(v.length < 5){return '长度不能小于5'}
		}
	}



	$('#t2').get(0).checkData = {	
		err:$('#t2_err').get(0),
		check:function(v){
			if(v === ''){return '年龄不能为空'}
			if(v.length < 5){return '长度不能小于5'}
		}
	}


	var eles = [$('#t1').get(0),$('#t2').get(0)];

	var v = new validate();
	v.bindBlur(eles)
	$('#btn').click(function(){	
		var pass = v.check(eles);
		//alert(pass)
		//alert($('#t1').get(0).pass)	
	})



	




	}
);
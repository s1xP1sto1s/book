
define(function(require, exports, module){

	var dialogMask;

	function Dialog(data){
		if(data){this.data = data}
		else{
			this.data = {};
		}	
		
		this.createMask();
		this.createBox();	
	};

	Dialog.prototype = {
		
		//创建遮罩层
		createMask:function(){		
			if(!dialogMask){
				dialogMask = document.createElement('div');		
				document.body.appendChild(dialogMask);
				dialogMask.className = 'm-dialog-mask';		
			};
		},
		
		//设置遮罩层
		setMask:function(){		
			var h = $(document.body).height();		
			dialogMask.style.height = h + "px";	
			$(dialogMask).show();
			$(dialogMask).animate({opacity: 0.25},100);
		},
		
		//创建弹窗容器
		createBox:function(){	
			var that = this;	
			if(!this.dialogBox){
				this.dialogBox = document.createElement('div');		
				document.body.appendChild(this.dialogBox);
				this.dialogBox.className = 'm-dialog-box';		
			};	
			var str = '<div class="m-dialog-body" key="dialog"><span class="m-dialog-title" key="title"></span><span class="m-dialog-close" key="close" title="close"><i class="icon-remove-sign"></i></span><div class="m-dialog-content" key="content"></div></div>'	;
			$(this.dialogBox).html(str);
			this.contentDiv = $(this.dialogBox).find('[key="content"]');//弹窗内容显示区
			this.dialog = $(this.dialogBox).find('[key="dialog"]');	//弹窗内层容器
			this.titleDiv = $(this.dialogBox).find('[key="title"]');//弹窗标题容器		
			
			//关闭弹窗			
			$(this.dialogBox).on('click','[key="close"]',function(e){				
				that.closeDialog()	
			});
			
			//页面滚动和改变大小时重定位弹窗位置
			$(window).resize(function(){that.setPopStyle()});		
		},
		
		//设置弹窗数据
		setDialog:function(o){
		
			var that = this;
			
			//弹窗标题设置
			if(o.title){
				$(this.titleDiv).html(o.title)
			};	
			
			//弹窗内容设置
			if(o.content){			
				var contentDiv = this.contentDiv; //内容容器
				var type = typeof(o.content); //内容类型			
				
				//替换回原代理页面
				if(this.agentPop){
					var bodyAgent = document.createElement("div");		
					document.body.appendChild(bodyAgent);
					document.body.replaceChild(this.agentPop,bodyAgent);
					this.agentPop.style.display = "none";
					this.agentPop = null;				
				};	
					
				if(type === 'string'){contentDiv.html(o.content);};//html内容		
				if(type === 'object'){//页面上的一个元素内容
					contentDiv.html('');
					//创建代理容器并加到弹窗容器中	
					var agent = document.createElement('div');
					contentDiv.get(0).appendChild(agent);				
					var content = o.content.get ? o.content.get(0) : o.content;
					contentDiv.get(0).replaceChild(content,agent);
					content.style.display = "";
					this.agentPop = content;
				};			
			};
					
			$(this.dialogBox).show();			
			this.setPopStyle();	
		},
		
		//弹窗样式设置
		setPopStyle:function(){	
			var dialogBox = this.dialogBox;
			dialogBox.style.marginTop = -($(dialogBox).height() / 2) + "px";		
			dialogBox.style.marginLeft = -($(dialogBox).width() / 2) + "px";
		},
		
		show:function(o){	
			o = o || {};	
			this.setMask();
			this.setDialog(o)
			$("body").eq(0).css("overflow","hidden");
		},
		
		closeDialog:function(){
			if(this.closeCall){
				this.closeCall();
			}
			else{
				this.close();	
			}
		},
		
		close:function(){
			$(this.dialogBox).hide();
			$(dialogMask).animate({opacity: 0},100,function(){$(dialogMask).hide();})		
			$("body").eq(0).css("overflow","auto");
		}
		
	}

	return Dialog;
});
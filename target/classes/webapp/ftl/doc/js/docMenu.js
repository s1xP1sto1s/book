(function leftMenuHandle(){
		var leftMenuData = docData;
		var linkUrl = '/doc/doc.html?docid=';
		
		var e = $('<div class="doc-left-menu"></div>').appendTo($('.doc-left'));	
		var s = '';
		for(var i = 0 ; i < leftMenuData.length; i ++){				
			
			if(leftMenuData[i].items){//有二级
				var menuClick = 'menu_' + [i].join('');
				s += '<div class="doc-lm-menu1 doc-lm-havechild" menuClick="'+menuClick+'">'+leftMenuData[i].name + '<span class="menu-icon">&gt;</span></div>';
				s += '<div class="doc-menu-hide" id="'+menuClick+'">'						
				for(var m = 0 ; m < leftMenuData[i].items.length; m ++){					
					if(leftMenuData[i].items[m].items){ //有三级	
						var menu2 = leftMenuData[i].items[m];
						if(menu2.items){
							var menuClick = 'menu_' + [i,m].join('');
							s += '<div class="doc-lm-menu2 doc-lm-havechild" menuClick="'+menuClick+'">'+menu2.name + '<span class="menu-icon">&gt;</span></div>';
							s += '<div class="doc-menu-hide" id="'+menuClick+'">'						
							for(var n = 0 ; n < menu2.items.length; n ++){
								//三级
								var menu3 = menu2.items[n].name;
								var type = menu2.items[n].type;							
								
								if(type && type === 'product'){									
									s += '<a class="doc-lm-menu3" target="_blank" href="/doc/product.html?docid=' + [i,m,n].join('-')+'">'+menu3 + '</a>';
								}else{								
									s += '<a class="doc-lm-menu3" href="' + linkUrl + [i,m,n].join('-')+'">'+menu3 + '</a>';
								};
							}
							s += '</div>';
						}
					}else{						
						s += '<div class="doc-lm-menu2"><a href="' + linkUrl + [i,m].join('-')+'">'+leftMenuData[i].items[m].name + '</a></div>';							
					}
				}
				s += '</div>';
			}else{
				s += '<div class="doc-lm-menu1"><a href="' + linkUrl + [i].join('-')+'">'+leftMenuData[i].name + '</a></div>';		
				
			}
		};	
		
		e.html(s);
		
		e.find('[menuClick]').each(function(i,ele){	
			$(ele).on('click',function(){
				var id = ($(this).attr('menuClick'));
				if($('#'+id).css('display') === 'none'){
					$('#'+id).css('display','block');	
				}else{
					$('#'+id).css('display','none');	
				}
			})
		
		});
		
		
		//菜单选中
		var reg = /\?docid=([^#&]+)/;
		if(location.href.match(reg)){
			var key = location.href.match(reg)[1].split('-');
		
			e.find('[menuClick="menu_'+key[0]+'"]').click();
			
			if(key[1]){
				e.find('[menuClick="menu_'+key[0]+key[1]+'"]').click();
			}
			if(key[2]){		
				$('#menu_'+key[0]+key[1]).children().eq(key[2]).addClass('doc-lm-active')
			}	
		}
	})()
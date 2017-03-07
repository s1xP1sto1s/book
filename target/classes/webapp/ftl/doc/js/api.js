

var ApiData = [
	{
		name:'公积金贷',
		items:[
			{
				name:'商品API',
				intro:'XXXXX',
				api:[
						{name:'suning.custom.category.query',intro:'XXXXX'},
						{name:'suning.custom.category.query',intro:'XXXXX'}
					]
			},
			{
				name:'价格API',
				intro:'XXXXX',
				api:[
						{name:'suning.custom.category.query',intro:'XXXXX'},
						{name:'suning.custom.category.query',intro:'XXXXX'}
					]
			}
		]
	},
	
	{
		name:'装修贷',
		items:[
			{
				name:'商品API',
				intro:'XXXXX',
				api:[
						{name:'suning.custom.category.query',intro:'XXXXX'},
						{name:'suning.custom.category.query',intro:'XXXXX'}
					]
			},
			{
				name:'价格API',
				intro:'XXXXX',
				api:[
						
						{name:'suning.custom.category.query',intro:'XXXXX'}
					]
			}
		]
	}

]


var reg = /\?api=([^#&]+)/;

var id = location.href.match(reg)[1].split('-');

var s = '';


var data = ApiData[id[0]]; 

//左侧菜单
for(var i = 0 ; i < data.items.length; i ++){		
	s += '<li><a href="/doc/apiList.html?api='+[id[0],i].join('-')+'">' + data.items[i].name + '</a></li>';	
}

$('.api-list-menu').html(s);

var data2 = data.items[id[1]];

$('.api-list-title').html(data.name + '/' + data2.name);

var s = '<table class="doc-table"><tr><th>api</th><th>api说明</th><tr>';
for(var i = 0 ; i < data2.api.length; i ++){
	var d = data2.api[i];
	s += '<tr><td><a href="/doc/apiDetail.html?apiid='+[id[0],id[1],i].join('-')+'">' + d.name + '</a></td><td>'+d.intro+'</td></tr>';	
}
s+='</table>';

$('#content').append(s);







/**
 * @author: 심재훈
 * @date:2018-10-19
 * @filename:domain.js
 */
$(document).ready(function(){
	/**
	 * @author: 심재훈 
	 * @date:2018-10-18
	 * @param: domain_name
	 * @function: 도메인이름 생성시 비동기식으로 받아옴,
	 * @version:0.0.1
	 **/
	$("#domain_name").keyup(function(){
		var domain_name= $(this).val();
		$.ajax({
			url:"/main/start/domain_name",
			type:"post",
			headers:{
				'Content-Type':'application/json'
			},
			data:JSON.stringify({
				domain_name:domain_name
			}),
			success:function(data){
				var a="";
				$.each(data,function(value){
					a+='<div class="d-flex flex-column">';
					a+='<div class="d-flex flex-row">'
					a+='<div class="d-flex justify-content-between domain_address">';
					a+=		'<span id="domain_n">'+this.domain_name+'</span>';
					a+=		'<div class="domain_price">';
					a+=			'<span id="domain_price">'+this.domain_price+'</span>';
					a+=		'</div>';
					a+=		'<button type="submit" class="btn btn-info">Select</button>';
					a+=	'</div>';
					a+='</div>';
					a+=	'</div>';	
				});
				$(".domain_detail").html(a);
			}
		});
	});
});
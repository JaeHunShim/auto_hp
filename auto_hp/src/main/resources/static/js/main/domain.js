/**
 * @author: 심재훈
 * @date:2018-10-19
 * @filename:domain.js
 */
$(document).ready(function(){
	/**
	 * @author: 심재훈 
	 * @date:2018-10-18
	 * @function: 도메인이름 생성을 비동기식으로 생성
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
				$("#domain_n").text(data.domain_name);
			}
		});
	});
});
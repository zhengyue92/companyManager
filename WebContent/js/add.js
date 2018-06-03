
/**
 * 添加至库存
 * @returns
 */
function save() {
	$.ajax({
		type:"get",
		url:"/add",
		data:{
			color:$("#color").val(),
			size:$("#size").val(),
			price:$("#price").val()
		},
		dataType:"json",
		success:function(data) {
			if(data.code == 200) {
				alert("保存成功！");
				window.location.href="/index.html";
			} else {
				alert(data.message);
			}
		},
		error:function() {
			alert("网络异常！");
		}
	});
}

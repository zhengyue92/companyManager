$.ajax({
	type:"post",
	url:"/list",
	dataType:"json",
	success:function(data) {
		if(data.code == 200) {
			setValue(data.data.list);
		} else {
			alert(data.message);
		}
	},
	error:function() {
		alert("网络异常！");
	}
});

/**
 * 往列表中存放值
 * @returns
 */
function setValue(list) {
	$("#list").html("");
	for (var i = 0; i < list.length; i++) {
		$("#list").append('<tr>' +
				'<td>' + list[i].id + '</td>' +
				'<td>' + list[i].color + '</td>' +
				'<td>' + list[i].size + '</td>' +
				'<td>' + list[i].price + '</td>' +
				'<td>' + list[i].useOffice + '</td>' +
				'<td>' + list[i].status + '</td>' +
				getOperation(list[i].id, list[i].useOffice, list[i].status) +
				'</tr>');
	}
}
/**
 * 获取操作按钮
 * @param useOffice
 * @param status
 * @returns
 */
function getOperation(id, useOffice, status) {
	var html = '';
	if(useOffice == "未使用" && status == "未使用") {
		html = '<td><input type="button" value="分配" onclick="allot(this)" data-id=' + id + ' ></td>';
	} else if(status == "使用中") {
		html = '<td><input type="button" value="报修" onclick="repairs(this)" data-id=' + id + ' ></td>';
	} else if(status == "维修中") {
		html = '<td><input type="button" value="维修" onclick="maintain(this)" data-id=' + id + ' ></td>';
	}
	return html;
}
/**
 * 分配电脑桌
 * @returns
 */
function allot(obj) {
	location.href="allot.html?id=" + $(obj).data("id");
}
/**
 * 报修
 * @returns
 */
function repairs(obj) {
	$.ajax({
		type:"get",
		url:"/repairs",
		dataType:"json",
		data:{
			id:$(obj).data("id")
		},
		success:function(data) {
			if(data.code == 200) {
				location.reload();
			} else {
				alert(data.message);
			}
		},
		error:function() {
			alert("网络异常！");
		}
	});
}
/**
 * 维修
 * @returns
 */
function maintain(obj) {
	$.ajax({
		type:"get",
		url:"/maintain",
		dataType:"json",
		data:{
			id:$(obj).data("id")
		},
		success:function(data) {
			if(data.code == 200) {
				location.reload();
			} else {
				alert(data.message);
			}
		},
		error:function() {
			alert("网络异常！");
		}
	});
}

/**
 * 去添加页面
 * @returns
 */
function toAdd() {
	window.location.href="/tianjia.html";
}

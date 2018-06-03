
/**
 * 添加至库存
 * @returns
 */
function save() {
	$.ajax({
		type:"get",
		url:"/allotCtro",
		data:{
			id:getParameter().array[0],
			useOffice:$("#useOffice").val()
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

/**
 * 两个页面传参数 获取参数
 * @returns
 */
function getParameter() {
    var par = decodeURI(location.search);//获取参数并进行解码 得到?id=1&name=2
    var pArray = [];//定义数组返回
    var pObject = {};//定义对象返回
    if(par) {//判断若无参数 则返回空
        par = par.substr(1,par.length);//去掉获取到的?
        var every;//截取到的每一个 参数
        var array = par.split('&');
        for (var i=0; i < array.length; i++) {
            every = array[i].split('=');
            eval("(" + "pObject." + every[0] + "='" + every[1] + "')");//添加到对象中
            pArray.push(every[1]);//添加到数组总
        }
    }
    var parameter = {//将数组和 对象两种形式放入 参数中返回
            array : pArray,
            object : pObject
    };//定义返回体
    return parameter;
}

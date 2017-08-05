/**
    * Created by ljl on 2017/8/3.
    * descript:分类管理js
    */

$(document).ready(function(){
    $.ajax({
        type: "GET",
        url: "../../getCategoryByUserID.do",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data) {
            var result = JSON.parse(data);
            console.log(result);
        },
        error: function (msg) {
            swal({
                title: "服务器错误，请联系管理员",
                text: "5秒后自动消失",
                timer: 5000,
                type:"error",
                showConfirmButton: true
            });
        }
    });
});

/**
 * Created by Administrator on 2017/4/25.
 */
$(function () {
    //判断用户是否记住账号密码
    if(localStorage.getItem("isRemember") == "true"){
        $('#account').val(localStorage.getItem("account"));
        $('#password').val(localStorage.getItem("password"));
        $("[name = remember]:checkbox").prop("checked", true);
    }
});

function login() {
    var isRemember = $('#remember').prop('checked');
    var account = $('#account').val();
    var password = $('#password').val();
    if(account == ''){
        swal("Prompt","Account Is Null...","error");
        return false;
    }
    if(password == ''){
        swal("Prompt","Password Is Null...","error");
        return false;
    }
    /**
     * 用户登录请求
     */
    $.ajax({
        url: serverUrl+'dnf/user/login',
        type:'POST',
        data:{
            account: account,
            password: password
        },
        timeout:5000,    //超时时间
        dataType:'json',    //返回的数据格式：json/xml/html/script/jsonp/text
        success:function(data){
            console.log(data);
            if(data.success == true){
                if(isRemember){
                    localStorage.setItem("isRemember", isRemember);
                    localStorage.setItem("account", account);
                    localStorage.setItem("password", password);
                }else{
                    localStorage.setItem("isRemember", isRemember);
                    localStorage.removeItem("account");
                    localStorage.removeItem("password");
                }
                sessionStorage.setItem("userAccount", data.data.accountname);
                sessionStorage.setItem("UID",data.data.UID);
                if(data.data.VIP == 1){
                    sessionStorage.setItem("VIP","true");
                }else{
                    sessionStorage.setItem("VIP","false");
                }
                window.parent.location = "../../loading.html";
            }else{
                swal("Prompt", "登录失败", "error");
            }
        },
        error:function(xhr,textStatus){
            swal("Prompt", "连接服务器失败", "error");
        }
    });
}
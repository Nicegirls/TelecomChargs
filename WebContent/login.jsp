<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>电信管理登陆页面</title>
	<link type="text/css" rel="stylesheet" media="all" href="styles/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="styles/global_color.css" /> 
    <script type="text/javascript">
    	function checkAccount(id) {
    		var acc = id.value;
    		var message = document.getElementById("accountMess")
    		var accoun = /^\w\d{30}$/
			if(""==acc){
				message.innerHTML = "账户不能为空";
				message.style.color = "red";
			}else{
				message.innerHTML = "";
			}
		}
    	function checkPwd(id) {
			var psw = id.value;
			var pswMes = document.getElementById("pswMess");
			if(""==psw){
				pswMes.innerHTML = "密码不能为空";
				pswMes.style.color = "red";
			}else{
				pswMes.innerHTML = "";				
			}
		}
    </script>
</head>
    <body class="index">
        <div class="login_box">
        <form name="login" action="Login" method="post">
            <table>
                <tr>
                    <td class="login_info">账号：</td>
                    <td colspan="2"><input id="account"  onfocus="checkAccount(this)" onblur="checkAccount(this)" name="username" type="text" class="width150" /></td>
                    <td class="login_error_info"><div id="accountMess" class="required"></div></td>
                </tr>
                <tr>
                    <td class="login_info">密码：</td>
                    <td colspan="2"><input id="pwd" onfocus="checkPwd(this)" onblur="checKPwd(this)" name="userpwd" type="password" class="width150" /></td>
                    <td><div id="pswMess" class="required"></div></td>
                </tr>
                <tr>
                    <td class="login_info">验证码：</td>
                    <td class="width70"><input id="psw" name="checkNum" type="text" class="width70" /></td>
                    <td><img src="images/valicode.jpg" alt="验证码" title="点击更换" /></td>  
                    <td><div  class="required"></div></td>              
                </tr>            
                <tr>
                    <td></td>
                    <td class="login_button"colspan="2">
						<img src="images/login_btn.png" style="cursor: hand" onclick="login.submit()">
                    </td>    
                    <td><span class="required"></span></td>                
                </tr>
            </table>
            </form>
        </div>
    </body>
</html>
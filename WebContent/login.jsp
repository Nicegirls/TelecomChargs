<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>电信管理登陆页面</title>
	<link type="text/css" rel="stylesheet" media="all" href="styles/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="styles/global_color.css" /> 
</head>
    <body class="index">
        <div class="login_box">
        <form action="index.jsp" method="post">
        <input type="hidden" name="order" value="login">
            <table>
                <tr>
                    <td class="login_info">账号：</td>
                    <td colspan="2"><input name="username" type="text" class="width150" /></td>
                    <td class="login_error_info"><span class="required"></span></td>
                </tr>
                <tr>
                    <td class="login_info">密码：</td>
                    <td colspan="2"><input name="userpwd" type="password" class="width150" /></td>
                    <td><span class="required"></span></td>
                </tr>
                <tr>
                    <td class="login_info">验证码：</td>
                    <td class="width70"><input name="checkNum" type="text" class="width70" /></td>
                    <td><img src="images/valicode.jpg" alt="验证码" title="点击更换" /></td>  
                    <td><span class="required"></span></td>              
                </tr>            
                <tr>
                    <td></td>
                    <td class="login_button"colspan="2">
                    <!--  
                       input type="image" src="images/login_btn.png" name="img"/>
                    -->
                    <a href="javascript:doSubmit()"><img src="images/login_btn.png" style="cursor: hand"></a>
                    </td>    
                    <td><span class="required"></span></td>                
                </tr>
            </table>
            </form>
        </div>
    </body>
</html>
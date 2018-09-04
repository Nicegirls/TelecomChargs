<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改密码</title>
        <link type="text/css" rel="stylesheet" media="all" href="../styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="../styles/global_color.css" />
        <script  type="text/javascript">
        	function cancel() {
				windows.location.href="userpwd.jsp";
			}
        	function checkPwd() {
				var newPwd = document.getElementsByName("newpwd");
				var againPwd = document.getElementsByName("againpwd");
				if(newPwd===againPwd){
					return true;
				}
				else{
					return false;
				}
			}
        </script>        
</head>
<body>
    <!--Logo区域开始-->
    <div id="header">
        <img src="../images/logo.png" alt="logo" class="left"/>
        ${user.user_name }<a href="../login.jsp">[退出]</a>            
    </div>
    <!--Logo区域结束-->
    <!--导航区域开始-->
    <div id="navi">
        <ul id="menu">
            <li><a href="../index.jsp" class="index_off"></a></li>
            <li><a href="../role/role_list.html" class="role_off"></a></li>
            <li><a href="../admin/admin_list.html" class="admin_off"></a></li>
            <li><a href="../fee/fee_list.html" class="fee_off"></a></li>
            <li><a href="../account/account_list.html" class="account_off"></a></li>
            <li><a href="../service/service_list.html" class="service_off"></a></li>
            <li><a href="../bill/bill_list.html" class="bill_off"></a></li>
            <li><a href="../report/report_list.html" class="report_off"></a></li>
            <li><a href="../user/userInfo.jsp" class="information_off"></a></li>
            <li><a href="../user/userpwd.jsp" class="password_on"></a></li>
        </ul>
    </div>
    <!--导航区域结束-->
    <div id="main">      
        <!--保存操作后的提示信息：成功或者失败-->      
        <div id="save_result_info" class="save_success">保存成功！</div><!--保存失败，旧密码错误！-->
        <form name="userpwd" action="../UserServlet" method="post" class="main_form">
            <div class="text_info clearfix"><span>旧密码：</span></div>
            <div class="input_info">
                <input name="oldpwd" type="password" class="width200"  /><span class="required">*</span>
                <div class="validate_msg_medium">30长度以内的字母、数字和下划线的组合</div>
            </div>
            <div class="text_info clearfix"><span>新密码：</span></div>
            <div class="input_info">
                <input type="password" name="newpwd" class="width200" /><span class="required">*</span>
                <div class="validate_msg_medium">30长度以内的字母、数字和下划线的组合</div>
            </div>
            <div class="text_info clearfix"><span>重复新密码：</span></div>
            <div class="input_info">
                <input type="password" name="againpwd" class="width200"  /><span class="required">*</span>
                <div class="validate_msg_medium" style="display: none">两次新密码必须相同</div>
            </div>
            <div class="button_info clearfix">
                <input type="submit" value="保存" class="btn_save" onclick="checkPwd()"/>
                <input type="button" value="取消" class="btn_save" onclick="cancel()"/>
            </div>
            <input type="hidden" name="userInfo" value="changePwd">
        </form>  
    </div>
    <!--主要区域结束-->
    <div id="footer">
       
    </div>
</body>
</html>
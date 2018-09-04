<%@page import="cn.gaopengtao.entiy.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理界面</title>
    <link type="text/css" rel="stylesheet" media="all" href="styles/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="styles/global_color.css" />
    <script src="js/jquery-1.10.2.min.js"></script> 
 	<script>
 		$(function(){
			$("#password").click(function () {
				var name = "${user.user_name}";
				if(name=='高鹏涛'){
					window.location.href="nopower.jsp";
				}else{
					window.location.href="user/userpwd.jsp";
				}
			})
		});
 	</script>

</head>
<body class="index">
       <!--导航区域开始-->
      <div id="index_navi">
          <ul id="menu">
              <li><a href="index.jsp" class="index_on" onclick="checkPower()"></a></li>
              <li><a href="role/role_list.jsp" class="role_off"></a></li>
              <li><a href="admin/admin_list.jsp" class="admin_off"></a></li>
              <li><a href="fee/fee_list.jsp" class="fee_off"></a></li>
              <li><a href="account/account_list.jsp" class="account_off"></a></li>
              <li><a href="service/service_list.jsp" class="service_off"></a></li>
              <li><a href="bill/bill_list.jsp" class="bill_off"></a></li>
              <li><a href="report/report_list.jsp" class="report_off"></a></li>
              <li><a href="user/userInfo.jsp" class="information_off"></a></li>
              <li><a href="javascript:check" class="password_off" id="password"></a></li>
          </ul>
      </div>
  </body>
</html>
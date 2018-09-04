package cn.gaopengtao.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.gaopengtao.entiy.User;
import cn.gaopengtao.service.UserInfoService;
import cn.gaopengtao.service.impl.UserInfoServiceImpl;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String value = request.getParameter("userInfo");
		switch(value){
			case "changeInfo":
				changeInfo(request,response);
				break;
			case "changePwd":
				changePwd(request,response);
				break;
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	/**
	 * 修改用户信息
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void changeInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 获取表单中的数据
		 */
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		/**
		 * 取出登陆时装入session中的user对象
		 */
		User user = (User)request.getSession().getAttribute("user");
		//移除session中的user对象
		request.getSession().removeAttribute("user");
		/**
		 * 对取得的数据进行封装，传入后台
		 */
		user.setUser_name(name);
		user.setUser_tel(tel);
		user.setUser_email(email);		
		UserInfoService userInfoService = new UserInfoServiceImpl();
		boolean flag = userInfoService.updateInfo(user);
		if(flag) {
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("falg", flag);
			System.out.println(user.toString());
			response.sendRedirect("user/userInfo.jsp");
		}
	}
	
	/**
	 * 修改密码
	 * @throws IOException 
	 */
	private void changePwd(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("进入修改密码方法");
		String newpwd = request.getParameter("newpwd");
		User user = (User)request.getSession().getAttribute("user");
		request.getSession().removeAttribute("user");
		user.setUser_psw(newpwd);
		System.out.println(user.getUser_psw());
		UserInfoService userInfoService = new UserInfoServiceImpl();
		boolean update = userInfoService.updatepwd(user);
		if(update) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect("login.jsp");
		}
	}
}

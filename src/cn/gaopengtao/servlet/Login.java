package cn.gaopengtao.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.gaopengtao.entiy.User;
import cn.gaopengtao.service.LoginService;
import cn.gaopengtao.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class Login
 */

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置请求编码格式
		request.setCharacterEncoding("UTF-8");
		//设置响应编码格式
		response.setContentType("text/html;charset=utf-8");
		//登陆方法处理
		User user = (User)request.getSession().getAttribute("user");
		checkLogin(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	//处理登陆
	private void checkLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String account = request.getParameter("username");
		String psw = request.getParameter("userpwd");
		LoginService loginService = new LoginServiceImpl();
		User user = loginService.CheckUserLoginService(account,psw);
		try {
			System.out.println(user.toString());
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(user!=null) {
			request.getSession().setAttribute("user", user);
//			request.setAttribute("user", user);
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			response.sendRedirect("login.jsp");
		}
	}
	/**
	 * 修改用户信息
	 */

}

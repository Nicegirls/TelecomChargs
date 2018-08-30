package cn.gaopengtao.entiy;

public class User {
	private String user_account;
	private String user_psw;
	
	public User(String user_account, String user_psw) {
		super();
		this.user_account = user_account;
		this.user_psw = user_psw;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getUser_psw() {
		return user_psw;
	}
	public void setUser_psw(String user_psw) {
		this.user_psw = user_psw;
	}
	

	
}

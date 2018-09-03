package cn.gaopengtao.entiy;

import java.sql.Date;

public class User {
	private int user_id;
	private String user_name;
	private String user_account;
	private String user_tel;
	private String user_email;
	private String user_psw;
	private Date user_date;
	public User() {}
	public User(String user_account, String user_psw) {
		super();
		this.user_account = user_account;
		this.user_psw = user_psw;
	}
	
	public User(int user_id, String user_name, String user_tel, String user_email) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_tel = user_tel;
		this.user_email = user_email;
	}
	public User( int user_id,String user_name, String user_account, String user_tel, String user_email) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_account = user_account;
		this.user_tel = user_tel;
		this.user_email = user_email;
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
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_tel() {
		return user_tel;
	}
	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public Date getUser_date() {
		return user_date;
	}
	public void setUser_date(Date user_date) {
		this.user_date = user_date;
	}
	@Override
	public String toString() {
		return "User ["+"user_id="+user_id + ",user_name=" + user_name + ", user_account=" + user_account
				+ ", user_tel=" + user_tel + ", user_email=" + user_email + ", user_date="
				+ user_date + "]";
	}
	

	
}

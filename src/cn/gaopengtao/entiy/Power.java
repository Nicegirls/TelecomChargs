package cn.gaopengtao.entiy;

public class Power {
	private int power_id;
	private String power_name;
	public Power() {}
	public int getPower_id() {
		return power_id;
	}
	public void setPower_id(int power_id) {
		this.power_id = power_id;
	}
	public String getPower_name() {
		return power_name;
	}
	public void setPower_name(String power_name) {
		this.power_name = power_name;
	}
	public Power(String power_name) {
		super();
		this.power_name = power_name;
	}
}

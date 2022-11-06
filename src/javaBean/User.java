package javaBean;

public class User {
	private String name;
	private String tel;
	private String psw;
	private String id;
	public User(String name, String tel, String psw) {
		super();
		this.name = name;
		this.tel = tel;
		this.psw = psw;
	}
	
	public User(String name, String psw) {
		super();
		this.name = name;
		this.psw = psw;
	}

	public User(String id) {
		super();
		this.id = id;
	}

	public User(String id,String name, String tel, String psw) {
		super();
		this.name = name;
		this.tel = tel;
		this.psw = psw;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
}

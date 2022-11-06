package javaBean;

public class Buy {
	private String address;
	private String shouHuoMan;
	private String SumPrice;
	private String orderDate;
	private String id;
	
	
	
	
	public Buy() {
		super();
	}



	public Buy(String address, String shouHuoMan, String sumPrice, String orderDate, String id) {
		super();
		this.address = address;
		this.shouHuoMan = shouHuoMan;
		this.SumPrice = sumPrice;
		this.orderDate = orderDate;
		this.id = id;
	}



	public Buy(String address, String shouHuoMan, String sumPrice, String orderDate) {
		super();
		this.address = address;
		this.shouHuoMan = shouHuoMan;
		this.SumPrice = sumPrice;
		this.orderDate = orderDate;
	}
	
	
	
	public Buy(String address, String shouHuoMan) {
		super();
		this.address = address;
		this.shouHuoMan = shouHuoMan;
	}
 

	public Buy(String id) {
		super();
		this.id = id;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getShouHuoMan() {
		return shouHuoMan;
	}
	public void setShouHuoMan(String shouHuoMan) {
		this.shouHuoMan = shouHuoMan;
	}
	public String getSumPrice() {
		return SumPrice;
	}
	public void setSumPrice(String sumPrice) {
		this.SumPrice = sumPrice;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
}

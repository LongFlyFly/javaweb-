package javaBean;

public class Goods {
	private String id;
	private String name;
	private String price;
	private String discount;
	private String discrabe;
	private String picture;
	private String address;
	public Goods(String id, String name, String discrabe,String price, String discount, String address) {
		super();
		this.id = id;
		this.name = name;
		this.discrabe = discrabe;
		this.price = price;
		this.discount = discount;
		this.address = address;
	}


	public Goods(String name, String discrabe,String price, String discount,  String address) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.discrabe = discrabe;
		this.address = address;
	}


	public Goods() {
		super();
	}



	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Goods(String id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	public Goods(String name, String price) {
		this.name=name;
		this.price=price;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getDiscrabe() {
		return discrabe;
	}
	public void setDiscrabe(String discrabe) {
		this.discrabe = discrabe;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
}

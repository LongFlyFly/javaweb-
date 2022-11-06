package javaBean;

public class Orders {
	private String goods_price;
	private String geShu;
	public Orders(String goods_price, String geShu) {
		super();
		this.goods_price = goods_price;
		this.geShu = geShu;
	}
	public String getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(String goods_price) {
		this.goods_price = goods_price;
	}
	public String getGeShu() {
		return geShu;
	}
	public void setGeShu(String geShu) {
		this.geShu = geShu;
	}
	
}

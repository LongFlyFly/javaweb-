package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import comment.DBUtil;
import javaBean.Goods;


public class ShopMngDao {
DBUtil dbUtil=new DBUtil(); 
	
	//商品发布
	public boolean addShop(Goods goods){
		boolean result = false;
//		DBUtil dbUtil = new DBUtil();
		String sql="insert into goods(name,price,discount,discrabe,address) "
				+ "values('"+goods.getName()+"','"
				+goods.getPrice()+"','"+goods.getDiscount()+"','"+goods.getDiscrabe()+"','"+goods.getAddress()+"')";
		System.out.println("sql:"+sql);
		int ret = dbUtil.executeUpdate(sql);
		if (ret>0) {
			result = true;
		}
		return result;
	}
	//商品修改
		public boolean updateGoods(Goods goods){
			boolean result = false;
			String sql="update goods set name='"+goods.getName()+"',discrabe='"+goods.getDiscrabe()+"',price='"
					+goods.getPrice()+"',discount='"+goods.getDiscount()+"',address='"+goods.getAddress()+"'"
					+"where Id='"+goods.getId()+"'";
			System.out.println("sql:"+sql);
			int ret = dbUtil.executeUpdate(sql);
			if (ret>0) {
				result = true;
			}
			return result;
		}
	//商品删除
		public boolean GoodsDelete(String goodsId){
			Goods goods = new Goods(goodsId);
			boolean del=false;
//			String sql ="DELETE FROM user where userName='"
//					+news.getUserName()+"'"
//					+"where Id="+news.getNewsId();
			String sql = "delete from goods where id='"+goodsId+"'";
			System.out.println("sql："+sql);
			int rSet = dbUtil.executeUpdate(sql);
			return del;
		}
	//商品查询
	public ArrayList<Goods> queryAllGoods(){
		ArrayList<Goods> goodslist = new ArrayList<>();
		//查询数据库得到结果集
		String sql = "select * from goods";
		ResultSet rSet = dbUtil.executeQuery(sql);
		//处理结果集
		try {
			while(rSet.next()){
				String id = rSet.getString("id");
				String name = rSet.getString("name");
				String price = rSet.getString("price");
				String discount = rSet.getString("discount");
				String discrabe = rSet.getString("discrabe");
				String address = rSet.getString("address");
				Goods goods = new Goods(id, name,discrabe,price, discount,address);
				goodslist.add(goods);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return goodslist;
	}
	
	
	//根据条件查询
	public  ArrayList<Goods> queryGoodsByConditon(Goods goods){
		ArrayList<Goods> goodslist = new ArrayList<>();
		String name = goods.getName();
		String price = goods.getPrice();
		String sql = "select * from goods where 1=1 ";
		
		if (!name.equals("") && price!=null) {
			sql+= " and name LIKE '%"+name+"%'";
		}
		if (!price.equals("") && price!=null) {
			sql+= " and price LIKE '%"+price+"%'";
		}
		System.out.println("sql:"+sql);
		try {
			ResultSet resultSet= dbUtil.executeQuery(sql);
			while(resultSet.next()){
				String id = resultSet.getString("id");
//				String name1 = resultSet.getString("name");
//				String price1 = resultSet.getString("price");
				String discount = resultSet.getString("discount");
				String discrabe = resultSet.getString("discrabe");
				String address = resultSet.getString("address");
				Goods n = new Goods(id, name,discrabe, price, discount,address);
				goodslist.add(n);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return goodslist;
	}
	
//	根据id查询
	public Goods queryGoodsById(String goodsId){
		Goods goods = new Goods(goodsId);
		Goods goods2 = null;
		ArrayList<Goods> goodslist = new ArrayList<>();
		String sql = "select * from goods where id='"+goodsId+"'";
		System.out.println(sql);
		ResultSet rSet = dbUtil.executeQuery(sql);
		//System.out.println(rSet);
		try {
			if (rSet.next()) {
				String id = rSet.getString("id");
				String name = rSet.getString("name");
				String price = rSet.getString("price");
				String discount = rSet.getString("discount");
				String discrabe = rSet.getString("discrabe");
				String address = rSet.getString("address");
				goods2 = new Goods(id,name,discrabe,price, discount,address);
				goodslist.add(goods2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return goods2;
	}
}

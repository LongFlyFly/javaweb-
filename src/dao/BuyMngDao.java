package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import comment.DBUtil;
import javaBean.Buy;
import javaBean.Goods;

public class BuyMngDao {
DBUtil dbUtil=new DBUtil(); 

//购买
	public boolean addBuy(Buy buy){
		boolean result = false;
//		DBUtil dbUtil = new DBUtil();
		String sql="insert into orders(address,shouHuoMan,SumPrice,orderDate)"
				+ "values('"+buy.getAddress()+"','"+buy.getShouHuoMan()+"','"
				+buy.getSumPrice()+"','"+buy.getOrderDate()+"')";
		System.out.println("sql:"+sql);
		int ret = dbUtil.executeUpdate(sql);
		if (ret>0) {
			result = true;
		}
		return result;
	}
	
	//修改
		public boolean updateBuy(Buy buy){
			boolean result = false;
			String sql="update orders set address='"+buy.getAddress()+"',shouHuoMan='"
					+buy.getShouHuoMan()+"'"
					+"where Id="+buy.getId();
			System.out.println("sql:"+sql);
			int ret = dbUtil.executeUpdate(sql);
			if (ret>0) {
				result = true;
			}
			return result;
		}
	//删除
		public boolean BuyDelete(String buyId){
			Buy buy = new Buy(buyId);
			boolean del=false;
//			String sql ="DELETE FROM user where userName='"
//					+news.getUserName()+"'"
//					+"where Id="+news.getNewsId();
			String sql = "delete from orders where id='"+buyId+"'";
			System.out.println("sql："+sql);
			int rSet = dbUtil.executeUpdate(sql);
			return del;
		}
	//查询
	public ArrayList<Buy> queryAllBuy(){
		ArrayList<Buy> buylist = new ArrayList<>();
		//查询数据库得到结果集
		String sql = "select * from orders";
		ResultSet rSet = dbUtil.executeQuery(sql);
		//处理结果集
		try {
			while(rSet.next()){
				String address = rSet.getString("address");
				String shouHuoMan = rSet.getString("shouHuoMan");
				String SumPrice = rSet.getString("SumPrice");
				String orderDate = rSet.getString("orderDate");
				String id = rSet.getString("id");
				System.out.println("id:"+id);
//				System.out.println(id);
				Buy buy = new Buy(address, shouHuoMan, SumPrice, orderDate,id);
				buylist.add(buy);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return buylist;
	}
	
	
	//根据条件查询
	public  ArrayList<Buy> queryBuyByConditon(Buy buy){
		ArrayList<Buy> buylist = new ArrayList<>();
		String shouHuoMan = buy.getShouHuoMan();
		String SumPrice= buy.getSumPrice();
		System.out.println();
		String sql = "select * from orders where 1=1 ";
		
		if (!("".equals(shouHuoMan) || shouHuoMan==null)){
			sql+= " and shouHuoMan LIKE '%"+shouHuoMan+"%'";
		}
//		if (!SumPrice.equals("") && SumPrice!=null) {
//			sql+= " and SumPrice LIKE '%"+shouHuoMan+"%'";
//		}
		System.out.println("sql:"+sql);
		try {
			ResultSet resultSet= dbUtil.executeQuery(sql);
			while(resultSet.next()){
				String id = resultSet.getString("id");
				String name1 = resultSet.getString("shouHuoMan");
				String price1 = resultSet.getString("SumPrice");
				String address = resultSet.getString("address");
				String orderDate1 = resultSet.getString("orderDate");
				Buy n = new Buy(address, name1, price1,orderDate1,id);
				buylist.add(n);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return buylist;
	}
	
//	根据id查询
	public Buy queryBuyById(String buyId){
		Buy buy = new Buy(buyId);
		ArrayList<Buy> buylist = new ArrayList<>();
		System.out.println(buyId);
		String sql = "select * from orders where id='"+buyId+"'";
		System.out.println(sql);
		ResultSet rSet = dbUtil.executeQuery(sql);
//		System.out.println(rSet);
		try {
			if (rSet.next()) {
				String id = rSet.getString("id");
				String address = rSet.getString("address");
				String shouHuoMan = rSet.getString("shouHuoMan");
				String SumPrice = rSet.getString("SumPrice");
				String orderDate = rSet.getString("orderDate");
				buy= new Buy(address, shouHuoMan, SumPrice,orderDate,id);
				buylist.add(buy);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return buy;
	}
}

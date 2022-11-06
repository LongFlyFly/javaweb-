package dao;

import comment.DBUtil;
import javaBean.Buy;
import javaBean.Orders;

public class OrderMngDao {
	DBUtil dbUtil=new DBUtil(); 

	//购买
		public boolean otherInsert(Orders orders){
			boolean result = false;

			String sql="insert into order_detail(goods_price,geShu)"
					+ "values('"+orders.getGoods_price()+"','"+orders.getGeShu()+"')";
			System.out.println("sql:"+sql);
			int ret = dbUtil.executeUpdate(sql);
			if (ret>0) {
				result = true;
			}
			return result;
		}
}

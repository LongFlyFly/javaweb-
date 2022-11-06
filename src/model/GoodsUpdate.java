package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.ShopMngDao;
import javaBean.Goods;

public class GoodsUpdate {
public boolean queryGoodsById(HttpServletRequest request){
		String id =  request.getParameter("goodsId");
		String discount = request.getParameter("discount");
		String price = request.getParameter("price");
		String name = request.getParameter("name");
		String discrabe = request.getParameter("discrabe");
		String address = request.getParameter("address");
		
		
		System.out.println("----"+id);
		Goods goods = new Goods(id,name, discrabe,price,discount,address);
		ShopMngDao shopMngDao = new ShopMngDao();
		boolean res = shopMngDao.updateGoods(goods);
		return res;
	}
}

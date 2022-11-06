package model;

import javax.servlet.http.HttpServletRequest;

import dao.ShopMngDao;
import javaBean.Goods;


public class GoodsRead {
	public Goods queryGoodsById(HttpServletRequest request){
//		String name = (String)request.getParameter("name");
//		String price = request.getParameter("price");
//		String discrabe = request.getParameter("discrabe");
//		String discount = request.getParameter("discount");
//		String picture = request.getParameter("address");
		String id = request.getParameter("goodsId");
		
		Goods goods = new Goods();
		ShopMngDao nMngDao = new ShopMngDao();
		goods = nMngDao.queryGoodsById(id);
		return goods;
	}
}

package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.ShopMngDao;
import javaBean.Goods;

public class GoodsDelete {
public boolean GoodsDelete(HttpServletRequest request, HttpSession session) {
		
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String discrabe = request.getParameter("discrabe");
		String discount = request.getParameter("discount");
		String picture = request.getParameter("picture");
		String id = request.getParameter("goodsId");
		Goods goods = new Goods(name, price,discrabe,discount,picture);
		ShopMngDao nMngDao = new ShopMngDao();
		boolean res = nMngDao.GoodsDelete(id);
		return res;
	}
}

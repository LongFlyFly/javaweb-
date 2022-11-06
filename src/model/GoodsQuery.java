package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import dao.ShopMngDao;
import javaBean.Goods;

public class GoodsQuery {
	public ArrayList<Goods> queryGoods(HttpServletRequest request){
		//用于装载商品
		ArrayList<Goods> rSet = new ArrayList<>();
		//查询页面顶部的查询条件 
//		String user = (String)request.getSession().getAttribute("uname");
//		
//		SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		Date date = new Date();
//		String timeNow = adf.format(date);
		
		String name = request.getParameter("search");
		String price = request.getParameter("price1");
		System.out.println("商品名称："+name);
		System.out.println("商品价格："+price);
		Goods goods = new Goods(name, price);
		//调用dao层操作数据库
		ShopMngDao mngDao= new ShopMngDao();
		//去数据库里面装载newslist
		if (name==null && price==null ) {
//			查询全部商品
			rSet =mngDao.queryAllGoods();
		}else {
//			根据条件查询部分商品
			rSet = mngDao.queryGoodsByConditon(goods);
		}
		return rSet;
	}	
}

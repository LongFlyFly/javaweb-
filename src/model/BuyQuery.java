package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import comment.buyQuerySvlt;
import dao.BuyMngDao;
import dao.ShopMngDao;
import javaBean.Buy;
import javaBean.Goods;

public class BuyQuery {
	public ArrayList<Buy> queryBuy(HttpServletRequest request){
		//用于装载商品
		ArrayList<Buy> rSet = new ArrayList<>();
		//查询页面顶部的查询条件 
		String user = (String)request.getSession().getAttribute("uname");
		String orderDate=(String)request.getSession().getAttribute("date");
		
		String address = (String)request.getSession().getAttribute("address");
		String SumPrice = (String)request.getSession().getAttribute("price");
		
		String id =request.getParameter("id");
		
		System.out.println(id);
	
		Buy buy = new Buy(id,address, user,SumPrice,orderDate);
		
		
		//调用dao层操作数据库
		BuyMngDao dngDao= new BuyMngDao();
		//去数据库里面装载newslist
		if (user==null && SumPrice==null ) {
//			查询全部商品
			rSet =dngDao.queryAllBuy();
		}else {
//			根据条件查询部分商品
			rSet = dngDao.queryBuyByConditon(buy);
		}
		return rSet;
	}	
}

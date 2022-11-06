package model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.BuyMngDao;
import dao.ShopMngDao;
import javaBean.Buy;
import javaBean.Goods;

public class buyUpate {
public boolean queryBuyById(HttpServletRequest request,HttpSession Session){
		
		String address= request.getParameter("address");
		String SumPrice = request.getParameter("SumPrice");
		String shouHuoMan = request.getParameter("name");
		SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		String timeNow = adf.format(date);
		String orderDate = request.getParameter("date");
		String id = request.getParameter("buyId");
		
		System.out.println("id:"+id);
		System.out.println("-----------------");
		Buy buy= new Buy(address,shouHuoMan,SumPrice,timeNow,id);
		BuyMngDao buyMngDao = new BuyMngDao();
		boolean res = buyMngDao.updateBuy(buy);
		return res;
	}
}

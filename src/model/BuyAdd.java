package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import dao.BuyMngDao;
import dao.ShopMngDao;
import javaBean.Buy;
import javaBean.Goods;

public class BuyAdd {
	 //查询数据库里面存的新闻
	public ArrayList<Buy> queryBuy(HttpServletRequest request){
		//用于装载新闻
		ArrayList<Buy> ret = new ArrayList<>();
		//查询页面顶部的查询条件 
		//String user = (String)request.getSession().getAttribute("uname");
		String prices = (String)request.getSession().getAttribute("price");
		//把date类型转化为String类型
		SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		String timeNow = adf.format(date);
		//System.out.println(timeNow);
		Buy buy = new Buy(request.getParameter("address"),request.getParameter("shouHuoMan"),prices,timeNow );
		request.getSession().setAttribute("shouHuoMan", request.getParameter("shouHuoMan"));
		request.getSession().setAttribute("address", request.getParameter("picture"));
		//调用dao层操作数据库
		//System.out.println(request.getParameter("address"));
		BuyMngDao mngDao= new BuyMngDao();
		mngDao.addBuy(buy);
		return ret;
	}	
}

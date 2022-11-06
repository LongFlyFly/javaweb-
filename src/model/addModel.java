package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import dao.ShopMngDao;
import javaBean.Goods;

public class addModel {
	 //查询数据库里面存的新闻
		public ArrayList<Goods> queryGoods(HttpServletRequest request){
			//用于装载新闻
			ArrayList<Goods> ret = new ArrayList<>();
			//查询页面顶部的查询条件 
			//String user = (String)request.getSession().getAttribute("uname");
			//把date类型转化为String类型
//			SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//			Date date = new Date();
//			String timeNow = adf.format(date);
			//System.out.println(timeNow);
			Goods goods = new Goods(request.getParameter("Ids"),request.getParameter("name"),request.getParameter("price"), request.getParameter("discount"),request.getParameter("discrabe"),request.getParameter("address") );
			request.getSession().setAttribute("Ids", request.getParameter("Ids"));
			request.getSession().setAttribute("name", request.getParameter("name"));
			request.getSession().setAttribute("price", request.getParameter("price"));
			request.getSession().setAttribute("discount", request.getParameter("discount"));
			request.getSession().setAttribute("discrabe", request.getParameter("discrabe"));
			request.getSession().setAttribute("address", request.getParameter("address"));
			//调用dao层操作数据库
			System.out.println(request.getParameter("address"));
			ShopMngDao mngDao= new ShopMngDao();
			mngDao.addShop(goods);
			return ret;
		}	
}

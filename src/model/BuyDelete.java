package model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.BuyMngDao;

import javaBean.Buy;


public class BuyDelete {
public boolean BuyDelete(HttpServletRequest request, HttpSession session) {
	String address= request.getParameter("address");
	String SumPrice = request.getParameter("SumPrice");
	String shouHuoMan = (String) request.getSession().getAttribute("name");
	String orderDate = request.getParameter("date");
	String id = request.getParameter("buyId");
	
	Buy buy= new Buy(address,shouHuoMan,SumPrice,orderDate,id);
	BuyMngDao nMngDao = new BuyMngDao();
	boolean res = nMngDao.BuyDelete(id);
	return res;
	}
}

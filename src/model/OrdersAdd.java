package model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import dao.OrderMngDao;
import dao.Userdao;
import javaBean.Orders;
import javaBean.User;

public class OrdersAdd {
	public boolean queryorder(HttpServletRequest request){
		boolean result=true; 
		
		Orders orders = new Orders(request.getParameter("SumPrice"),request.getParameter("number"));
		System.out.println(request.getParameter("SumPrice"));
		request.getSession().setAttribute("orderPrice", request.getParameter("SumPrice"));
		request.getSession().setAttribute("orderNumber", request.getParameter("number"));
		OrderMngDao Dao = new OrderMngDao();
		boolean ret = Dao.otherInsert(orders);
		return ret;
	}
}

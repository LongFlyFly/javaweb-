package model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import dao.BuyMngDao;
import javaBean.Buy;

public class BuyRead {
	public Buy queryBuyById(HttpServletRequest request){
		

		String id = request.getParameter("buyId");
		
		Buy buy= new Buy();
		BuyMngDao nMngDao = new BuyMngDao();
		buy = nMngDao.queryBuyById(id);
		return buy;
	}
}

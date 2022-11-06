package model;

import javax.servlet.http.HttpServletRequest;

import dao.ShopMngDao;
import dao.Userdao;
import javaBean.Goods;
import javaBean.User;

public class userDelete {
	public boolean isExistUser(HttpServletRequest request){
//		String name = request.getParameter("name");
//		String tel = request.getParameter("tel");
//		String psw = request.getParameter("psw");
//		System.out.println("------"+name);
		String id = request.getParameter("userId");
		System.out.println("------"+id);
		User user = new User(id);
		Userdao nMngDao = new Userdao();
		boolean res = nMngDao.UserDelete(id);
		return res;
	}
}

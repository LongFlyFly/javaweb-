package model;

import javax.servlet.http.HttpServletRequest;

import dao.Userdao;
import javaBean.User;

public class amendModel {
	public boolean isExistUser(HttpServletRequest request){
		boolean gai=true; 
		//Integer.parseInt() ����ת��
		User user = new User(request.getParameter("uname"),request.getParameter("tel"),request.getParameter("psw"));
		System.out.println(request.getParameter("uname"));
		request.getSession().setAttribute("userTel", request.getParameter("tel"));
		request.getSession().setAttribute("userName", request.getParameter("uname"));
		request.getSession().setAttribute("userPsw", request.getParameter("psw"));
		Userdao Dao = new Userdao();
		gai = Dao.userUpdata(user);
		return gai;
	}
}

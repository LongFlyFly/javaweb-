package model;

import javax.servlet.http.HttpServletRequest;

import dao.Userdao;
import javaBean.User;

public class LoginModel {
//属性
//构造方法
//成员方法
	//判断用户是否存在
	public boolean isExistUser(HttpServletRequest request){
		boolean flag=false; 
		//Integer.parseInt() 类型转换
		User user = new User(request.getParameter("uname"),request.getParameter("tel"),request.getParameter("psw"));
		String name = request.getParameter("uname");
		System.out.println(request.getParameter("uname"));
		Userdao Dao = new Userdao();
		flag = Dao.isSelectUser(user);
		request.getSession().setAttribute("uname",request.getParameter("uname"));
		return flag;
	}
}

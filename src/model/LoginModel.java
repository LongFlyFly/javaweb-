package model;

import javax.servlet.http.HttpServletRequest;

import dao.Userdao;
import javaBean.User;

public class LoginModel {
//����
//���췽��
//��Ա����
	//�ж��û��Ƿ����
	public boolean isExistUser(HttpServletRequest request){
		boolean flag=false; 
		//Integer.parseInt() ����ת��
		User user = new User(request.getParameter("uname"),request.getParameter("tel"),request.getParameter("psw"));
		String name = request.getParameter("uname");
		System.out.println(request.getParameter("uname"));
		Userdao Dao = new Userdao();
		flag = Dao.isSelectUser(user);
		request.getSession().setAttribute("uname",request.getParameter("uname"));
		return flag;
	}
}

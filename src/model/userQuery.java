package model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;


import dao.Userdao;

import javaBean.User;

public class userQuery {
	public ArrayList<User> queryUser(HttpServletRequest request){
		//用于装载商品
		ArrayList<User> rSet = new ArrayList<>();
		//查询页面顶部的查询条件 
		String id =request.getParameter("userId");
	
		String name =  (String)request.getSession().getAttribute("name");
		
		String tel =  (String)request.getSession().getAttribute("tel");
	
		String psw =  (String)request.getSession().getAttribute("psw");
	
		
		User user = new User(id,name,tel,psw);
		
		//调用dao层操作数据库
		Userdao dngDao= new Userdao();
		//去数据库里面装载newslist
		if (name==null && tel==null ) {
//			查询全部商品
			rSet =dngDao.queryAllUser();
		}
		return rSet;
	}	
}

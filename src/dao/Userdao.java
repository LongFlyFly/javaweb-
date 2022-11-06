package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.org.apache.xpath.internal.operations.And;

import comment.DBUtil;
import javaBean.Goods;
import javaBean.User;

public class Userdao {
	
	DBUtil dbUtil = new DBUtil();
	
	public boolean isSelectUser(User user){
		boolean flag=false;
		String sql ="SELECT * from user WHERE name='"+user.getName()+"' and tel='"+user.getTel()+"' and psw='"+user.getPsw()+"'";
		System.out.println("sql："+sql);
		ResultSet rSet = dbUtil.executeQuery(sql);
		try {
			flag = rSet.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	//�����û�
	public boolean userInsert(User user){
		boolean result=false;
		String sql ="insert into user(name,tel,psw) value('"+user.getName()+"','"+user.getPsw()+"','"+user.getTel()+"')";
		System.out.println("sql："+sql);
		int rSet = dbUtil.executeUpdate(sql);
		return result;
	}
	
	//�޸��û�
	public boolean userUpdata(User user){
		boolean gai=false;
		String sql ="UPDATE user SET name='"+user.getName()+"',tel='"+user.getTel()+"',psw='"+user.getPsw()+"' WHERE id=1";
		System.out.println("sql："+sql);
		int rSet = dbUtil.executeUpdate(sql);
		return gai;
	}
	//ɾ���û�
	public boolean UserDelete(String userId){
		User user= new User(userId);
		boolean del=false;

		String sql = "delete from user where id='"+userId+"'";
		System.out.println("sql："+sql);
		int rSet = dbUtil.executeUpdate(sql);
		return del;
	}
	
	public ArrayList<User> queryAllUser(){
		ArrayList<User> userlist = new ArrayList<>();
		//查询数据库得到结果集
		
		String sql = "select * from user";
		ResultSet rSet = dbUtil.executeQuery(sql);
		
		//处理结果集
		try {
			while(rSet.next()){
				String id = rSet.getString("Id");
				String name = rSet.getString("name");
				String tel = rSet.getString("tel");
				String psw = rSet.getString("psw");
				User user = new User(id,name,tel,psw);
				userlist.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userlist ;
	}
	
	
	public  ArrayList<User> queryUserByConditon(User user){
		ArrayList<User> userlist = new ArrayList<>();
		String uname =user.getName();
		String tel = user.getTel();
		String sql = "select * from user where 1=1 ";
		
		if (!uname.equals("") && tel!=null) {
			sql+= " and name LIKE '%"+uname+"%'";
		}
		if (!tel.equals("") && tel!=null) {
			sql+= " and price LIKE '%"+tel+"%'";
		}
		System.out.println("sql:"+sql);
		try {
			ResultSet resultSet= dbUtil.executeQuery(sql);
			while(resultSet.next()){
				String id = resultSet.getString("id");
//				String name1 = resultSet.getString("name");
//				String price1 = resultSet.getString("price");
				String psw = resultSet.getString("pws");
//				String discrabe = resultSet.getString("discrabe");
//				String address = resultSet.getString("address");
				User n = new User(id,uname,tel,psw);
				userlist.add(n);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userlist;
	}
	
//	根据id查询
	public User queryUserById(String userId){
		//User user = new User(userId);
		User user2 = null;
		ArrayList<User> goodslist = new ArrayList<>();
		String sql = "select * from user where id='"+userId+"'";
		System.out.println(sql);
		ResultSet rSet = dbUtil.executeQuery(sql);
		//System.out.println(rSet);
		try {
			if (rSet.next()) {
				String id = rSet.getString("id");
				String name = rSet.getString("uname");
				String tel = rSet.getString("tel");
				String psw = rSet.getString("psw");
				user2 = new User(id,name,tel,psw);
				goodslist.add(user2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user2;
	}

	
}

package comment;

import java.sql.*;
import java.util.List;

public class DBUtil{
	private static final String URL = "jdbc:mysql://localhost:3306/shop"+"?characterEncoding=utf-8";//数据库连接的地址
	private static final String LOGIN = "root";//登录数据库的用户名
	private static final String PASSWORD = "123456";//登录数据库的密码
	//成员变量三个
	Connection conn=null;//连接对象
	Statement st=null;//执行sql语句的对象
	ResultSet rs=null;//结果集，存放查询的结果
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	///主要的成员方法4个
	void getConnection(){//1.数据库连接
		try {
			//第一步，加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//第二步，连接数据库
			conn=DriverManager.getConnection(URL,LOGIN,PASSWORD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接出错，请检查驱动程序是否存在，驱动名是否正确");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接出错，请检查登录的用户名密码是否正确，数据库服务器是否启动");
		}
		
	}
	//2.数据库的查询
	public ResultSet executeQuery(String sql){
		try {
			//第三步，创建用于执行sql语句的对象
			if(st==null){
				getConnection();//包含了第一步和第二步
				st=conn.createStatement();
			}
			//第四步：执行sql语句
			rs=st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库查询执行出错，请检查sql："+sql);
		}
		return rs;
	}
	//3.数据库的增删改
	public int executeUpdate(String sql){
		int ret=0;
		try {
			//第三步，创建用于执行sql语句的对象
			if(st==null){
				getConnection();//包含了第一步和第二步
				st=conn.createStatement();
			}
			//第四步：执行sql语句
			ret=st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret=-1;//失败的时候设定为-1
			System.out.println("数据库增删改执行出错，请检查sql："+sql);
		}
		return ret;
	}
	//4.数据库的关闭
	public void close(){
		try {
			if (rs!=null) {
			 rs.close();
			}
			if (st!=null) {
				st.close();
			} 
			if (conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
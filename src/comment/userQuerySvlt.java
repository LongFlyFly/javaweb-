package comment;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaBean.Goods;
import javaBean.User;
import model.GoodsQuery;
import model.userQuery;

/**
 * Servlet implementation class userQuerySvlt
 */
@WebServlet("/userQuerySvlt")
public class userQuerySvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userQuerySvlt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("进入数据库");
		//调用model做事
		userQuery UQ = new userQuery();
		//得到model做事的结果
		ArrayList<User> rSet =UQ.queryUser(request);
		
		//根据结果做出决策
		if (rSet.size()>0) {
			request.setAttribute("rSet", rSet);
			request.getRequestDispatcher("shopMng/userQuery.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

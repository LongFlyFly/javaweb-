package comment;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaBean.Goods;

import model.GoodsQuery;


/**
 * Servlet implementation class shopQuerySvlt
 */
@WebServlet("/shopQuerySvlt")
public class shopQuerySvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shopQuerySvlt() {
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
		GoodsQuery goodsQuery = new GoodsQuery();
		//得到model做事的结果
		ArrayList<Goods> rSet = goodsQuery.queryGoods(request);
		
		//根据结果做出决策
		if (rSet.size()>0) {
			request.setAttribute("rSet", rSet);
			request.getRequestDispatcher("shopMng/shopQuery.jsp").forward(request, response);
		
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

package comment;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaBean.Buy;
import javaBean.Goods;
import model.BuyAdd;
import model.addModel;

/**
 * Servlet implementation class buyAddSvlt
 */
@WebServlet("/buyAddSvlt")
public class buyAddSvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buyAddSvlt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进入数据库！");
		BuyAdd buyadd = new BuyAdd();
		ArrayList<Buy> ret = buyadd.queryBuy(request);
		//根据结果做出决策
		if (ret.size()>0) {
			request.setAttribute("rSet", ret);
			request.getRequestDispatcher("shopMng/buyQuery.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("shopMng/zhiFu.jsp").forward(request, response);
		};
	}
}

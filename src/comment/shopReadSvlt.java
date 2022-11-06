package comment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaBean.Goods;

import model.GoodsRead;


/**
 * Servlet implementation class shopReadSvlt
 */
@WebServlet("/shopReadSvlt")
public class shopReadSvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shopReadSvlt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GoodsRead goodsRead = new GoodsRead();
		//得到model做事的结果
		Goods goods = goodsRead.queryGoodsById(request);
		int flag = Integer.parseInt(request.getParameter("flag"));
		
		//根据结果做出决策
		if (goods!=null) {
			request.setAttribute("goods",goods);
			if (flag==1) {
				request.getRequestDispatcher("shopMng/shopRead.jsp").forward(request, response);
			}else if(flag==2){
				//response.sendRedirect("newsMng/newsUpdate.jsp");
				request.getRequestDispatcher("shopMng/shopUpdate.jsp").forward(request, response);
			}
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

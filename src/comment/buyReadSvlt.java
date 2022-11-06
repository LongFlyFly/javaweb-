package comment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaBean.Buy;
import javaBean.Goods;
import model.BuyRead;
import model.GoodsRead;

/**
 * Servlet implementation class buyReadSvlt
 */
@WebServlet("/buyReadSvlt")
public class buyReadSvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buyReadSvlt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进入数据库");
		BuyRead buyRead = new BuyRead();
		//得到model做事的结果
		Buy buy = buyRead.queryBuyById(request);
		
		int flag = Integer.parseInt(request.getParameter("flag"));
		
		//根据结果做出决策
		if (buy!=null) {
			request.setAttribute("buy",buy);
			if (flag==1) {
				request.getRequestDispatcher("shopMng/buyRead.jsp").forward(request, response);
			}else if(flag==2){
				
				request.getRequestDispatcher("shopMng/buyUpdate.jsp").forward(request, response);
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

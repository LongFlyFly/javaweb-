package comment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GoodsUpdate;
import model.buyUpate;

/**
 * Servlet implementation class buyUpateSvlt
 */
@WebServlet("/buyUpateSvlt")
public class buyUpateSvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buyUpateSvlt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		buyUpate buyUpdate = new buyUpate();
		boolean ret = buyUpdate.queryBuyById(request,request.getSession());
		if(ret){
			request.getRequestDispatcher("shopMng/buyQuery.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("shopMng/buyUpdate.jsp").forward(request, response);
		};
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

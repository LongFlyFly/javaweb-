package comment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GoodsDelete;


/**
 * Servlet implementation class shopDeleteSvlt
 */
@WebServlet("/shopDeleteSvlt")
public class shopDeleteSvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shopDeleteSvlt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GoodsDelete goodsDelete = new GoodsDelete();
		boolean ret = goodsDelete.GoodsDelete(request,request.getSession());
		//System.out.println(ret);
		//boolean ret = true;
		if(ret){
			request.getRequestDispatcher("shopMng/shopAdd.jsp").forward(request, response);
		}else {
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

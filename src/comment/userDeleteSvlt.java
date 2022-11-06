package comment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.userDelete;

/**
 * Servlet implementation class userDeleteSvlt
 */
@WebServlet("/userDeleteSvlt")
public class userDeleteSvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userDeleteSvlt() {
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
		// TODO Auto-generated method stub
		System.out.println("进入数据库！");
		userDelete userdelete = new userDelete();
		boolean shan = userdelete.isExistUser(request);
		if(shan){
			//重定向
			//response.sendRedirect("regesitSuccess.jsp");
		    request.getRequestDispatcher("./shopMng/userQuery.jsp").forward(request, response);

		}else{
			//传递参数
			request.setAttribute("errMsg", "错误！");
			//转发
		    request.getRequestDispatcher("./shopMng/userQuery.jsp").forward(request, response);
		}
	}
}

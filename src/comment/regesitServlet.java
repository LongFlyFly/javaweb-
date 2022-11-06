package comment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginModel;
import model.regesitModel;

/**
 * Servlet implementation class regesitServlet
 */
@WebServlet("/regesitServlet")
public class regesitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regesitServlet() {
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
		request.setCharacterEncoding("UTF-8");
		System.out.println("进入数据库");
		regesitModel rgModel = new regesitModel();
		boolean result = rgModel.isExistUser(request);
		if(result){
			//�ض���
			//response.sendRedirect("regesitSuccess.jsp");
		    request.getRequestDispatcher("regesit.jsp").forward(request, response);
		}else{
			//���ݲ���
			request.setAttribute("errMsg", "错误！");
			//ת��
		    request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}

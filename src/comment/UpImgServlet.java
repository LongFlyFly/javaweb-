 package comment;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



/**
 * Servlet implementation class Index
 */
@WebServlet("/upimg")
public class UpImgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private File user;
	 
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpImgServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//图片存放路径
		String relpath="jsp/upimgs";
		String path=request.getRealPath(relpath);
		String fn=null;
        
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload sfu=new ServletFileUpload(factory);
        sfu.setHeaderEncoding("UTF-8");  //处理中文问题
        sfu.setSizeMax(1024*1024);   //限制文件大小
        
        try {
            List<FileItem> fileItems= sfu.parseRequest(request);  //解码请求 得到所有表单元素
            for (FileItem fi : fileItems) {
                //有可能是 文件，也可能是普通文字 
                if (fi.isFormField()) { //这个选项是 文字 
                    System.out.println("表单值为："+fi.getString());
                }else{
                    // 是文件
                	//获取图片后缀名
                    String format=fi.getName().substring(fi.getName().indexOf("."), fi.getName().length());
                    //图片命名
                    fn=UUID.randomUUID().toString().replaceAll("-", "")+format;
                    System.out.println("文件名是："+fn);  //文件名 
                    // fn 是可能是这样的 c:\abc\de\tt\fish.jpg
                    fi.write(new File(path,fn));
                     
                }                
            }    
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String imgpath="upimgs/"+fn;
        
        //保存数据库的是相对路径
        DBUtil jdbcUtils = new  DBUtil ();  
		jdbcUtils.getConnection();
		
		String sql="insert into  img (src)" + " values('"+user.getName()+"')";
		List<Object> param=new ArrayList<Object>();
		param.add(imgpath);
		
		int r=-1;
		r = jdbcUtils.executeUpdate(sql); 
		
        //去显示上传的文件
        
        request.getRequestDispatcher("toimgs").forward(request, response);
        

	}

}



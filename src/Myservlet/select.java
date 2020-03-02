package Myservlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import crud.crud;
import crud.crudImp;

/**
 * Servlet implementation class servlet1
 */
@WebServlet(description = "test", urlPatterns = { "/servlet1" })
public class select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public select() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setCharacterEncoding("gbk");
		System.out.println(111);
		response.setContentType("text/html;charset=utf-8");
		String a=response.getCharacterEncoding();
		crud s=new crudImp();
		List<Student> list=s.select();
		System.out.println(list);
		StringBuilder sb=new StringBuilder();
		for(Student stu:list) {
			sb.append("<tr>\r\n" + 
					"		<td>"+stu.getSId()+"</td>\r\n" + 
					"		<td>"+stu.getSname()+"</td>\r\n" + 
					"		<td>"+stu.getSage()+"</td>\r\n" + 
					"		<td>"+stu.getSsex()+"</td>\r\n" +
					"		<td><a href='delete?SId="+stu.getSId()+"'>删除<a></td>\r\n" + 
					"		<td><a "
					+ "='update.html?SId="+stu.getSId()+"&name="+stu.getSname()+"&age="+stu.getSage()+"&sex="+stu.getSsex()+"'>修改<a></td>\r\n" + 
					"	</tr>");
			
		}
		String ss=new String(sb);
		response.getWriter().append("<table border=\"1\">\r\n" + 
				"	<tr>\r\n" + 
				"		<th>学号</th>\r\n" + 
				"		<th>姓名</th>\r\n" + 
				"		<th>出生日期</th>\r\n" + 
				"		<th>性别</th>\r\n" + 
				"	</tr>\r\n" + 
				ss+
				"\r\n" + 
				"</table>");
	}

	/**
	 * @see HttpServlet#doPo
	 * 
	 * st(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

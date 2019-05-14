package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pinfo_result
 */
@WebServlet("/pinfo_result")
public class pinfo_result extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public pinfo_result() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name = request.getParameter("NAME"); 
		String id = request.getParameter("ID"); 
		String password = request.getParameter("PASSWORD"); 
		
		String gender = request.getParameter("GENDER"); 
		if (gender.equals("MALE")) gender = "남"; else gender = "여";
		
		String iNotice = request.getParameter("INOTICE"); 
		String clNotice = request.getParameter("CNOTICE"); 
		String dNotice = request.getParameter("DNOTICE"); 
		
		String job = request.getParameter("JOB"); 
		
		response.setContentType("text/html;charset=euc-kr"); 
		
		PrintWriter out = response.getWriter(); out.println( "<HTML>");
		out.println("<HEAD><TITLE>개인 정보입력 - 결과화면</TITLE></HEAD>"); 
		out.println( "<BODY>"); 
		out.println( "<H2>개인 정보입력</H2>"); 
		out.printf( "이름: %s <BR>", name); 
		out.printf( "아이디: %s <BR>", id); 
		out.printf( "암호: %s <BR>", password); 
		out.printf( "성별: %s <BR>", gender); 
		out.printf( "공지 메일: %s <BR>", noticeToHangul(iNotice)); 
		out.printf( "광고 메일: %s <BR>", noticeToHangul(clNotice)); 
		out.printf( "배송 확인메일: %s <BR>", noticeToHangul(dNotice)); 
		out.printf( "직업: %s <BR>", job); 
		out.println( "</BODY>"); 
		out.println( "</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private String noticeToHangul(String notice) {
		if(notice ==null) return "받지 않음";
		else if(notice.equals("on")) return "받음";
		else return notice;
	}

}

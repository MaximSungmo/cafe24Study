package com.test.chap5;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/brain/adder")
public class AdderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String str1 = req.getParameter("num1");
		String str2 = req.getParameter("num2");
		
		resp.setContentType("text/html;charset=euc-kr");
		PrintWriter out = resp.getWriter();
		
		try {
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			
			int sum = num1 + num2;
			
			req.setCharacterEncoding("euc-kr");
			resp.setContentType("text/html;charset=euc-kr");
			out.println("<html>");
			out.println("<head><title>덧셈 프로그램 - 결과 화면</title></head>");
			out.println("<body>");
			out.printf("%d + %d = %d ",num1,num2,sum);
			
			out.println("</body>");
			out.println("</html>");
		} 
		catch (NumberFormatException e) {
			out.println("<html>");
			out.println("<head><title>덧셈프로그램- 에러화면</title></head>");
			out.println("<body>");
			out.println("잘못된 데이터가 입력되었습니다");
			out.println("</body>");
			out.println("</html>");
		}

	}

}

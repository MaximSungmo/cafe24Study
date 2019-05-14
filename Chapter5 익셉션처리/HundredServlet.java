package com.test.chap5;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HundredServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		int total = 0;
		for(int cnt=0;cnt<101;cnt++) {
			total += cnt;
		}
		PrintWriter out  = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>Hundred Servlet</title></head>");
		out.println("<body>");
		out.printf("1+2+3+...+100=%d",total);
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}

package com.test.chap6;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fibonacci.do")
public class FibobacciServlet extends HttpServlet {

	private BigInteger arr[];
	
	
	public void init(){
		arr = new BigInteger[100];
		arr[0] = new BigInteger("1");
		arr[1] = new BigInteger("1");
		
		for(int cnt =2;cnt < arr.length; cnt++) {
			arr[cnt] = arr[cnt-2].add(arr[cnt-1]);
		}
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String str = req.getParameter("num");
		int num = Integer.parseInt(str);
		if(num>100)
			num =100;
		
		resp.setContentType("text/html; charset=euc-kr");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>피보나치 수열</title></head>");
		out.println("<body>");
		for(int cnt = 0; cnt < num; cnt++)
			out.println(arr[cnt]+" ");
		out.println("</body>");
		out.println("</html>");
		

	}

}

package com.test.chap6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serverInfo.do")
public class ServerInfoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		ServletContext context = getServletContext();
        String serverInfo = context.getServerInfo();
        int majorVersion = context.getMajorVersion();
        int minorVersion = context.getMinorVersion();
        resp.setContentType( "text/html;charset=euc-kr" );
        PrintWriter out = resp.getWriter();
        out.println( "<HTML>" );
        out.println( "<HEAD><TITLE>웹 서버의 정보</TITLE></HEAD>" );
        out.println( "<BODY>" );
        out.printf( "웹 서버의 종류: %s <BR>" , serverInfo);
        out.printf( "지원하는 서블릿 버전: %d.%d <BR>" , majorVersion, minorVersion);
        out.println( "</BODY>" );
        out.println( "</HTML>" );
        
        
        System.out.println(req.getRealPath("/files"));

	}

}

<%@page contentType="text/html; charset=euc-kr"%>
<%@page import="java.io.*, java.util.Date"%>
<%
    request.setCharacterEncoding("euc-kr"); 
    String name = request.getParameter("NAME");
    String title = request.getParameter("TITLE");
    String content = request.getParameter("CONTENT");
    Date date = new Date();
    Long time = date.getTime();
    String filename = time + ".txt";
    String result;
    PrintWriter writer = null;
    try {
        String filePath = application.getRealPath("/WEB-INF/bbs/" + filename);
        writer = new PrintWriter(filePath);
        writer.printf("����: %s %n", title);
        writer.printf("�۾���: %s %n", name);
        writer.println(content);
        result = "SUCCESS";
    }
    catch (IOException ioe) {
        result = "FAIL";
    }
    finally {
        try {
            writer.close();
        } 
        catch (Exception e) {
        }
    } 
    response.sendRedirect("BBSPostResult.jsp?RESULT=" + result); 
%>

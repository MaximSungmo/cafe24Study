<%@page contentType="text/html; charset=euc-kr"%>
<%@page import="java.io.*, java.util.Date"%>
<HTML>
    <HEAD><TITLE>�Խ��� �۾��� ? ��� ȭ��</TITLE></HEAD>
    <BODY>
        <H2>�۾���</H2>
        <% 
             request.setCharacterEncoding("euc-kr"); 
             String name = request.getParameter("NAME");
             String title = request.getParameter("TITLE");
             String content = request.getParameter("CONTENT");
             Date date = new Date();
             Long time = date.getTime();
             String filename = time + ".txt";
             PrintWriter writer = null;
             try {
                 String filePath = application.getRealPath("/WEB-INF/bbs/�� + filename);
                 writer = new PrintWriter(filePath);
                 writer.printf("����: %s %n", title);
                 writer.printf("�۾���: %s %n", name);
                 writer.println(content);
                 out.println("����Ǿ����ϴ�.");
             }
             catch (IOException ioe) {
                 out.println("���Ͽ� �����͸� �� �� �����ϴ�.");
             }
             finally {
                 try {
                     writer.close();
                 } 
                 catch (Exception e) {
                 }
             } 
        %>
    </BODY>
</HTML>

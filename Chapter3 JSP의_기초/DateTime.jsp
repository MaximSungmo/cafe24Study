<%@page contentType="text/html; charset=euc-kr"%>
<%@page import="java.util.GregorianCalendar"%>
<HTML>
    <HEAD><TITLE>��¥�� �ð�</TITLE></HEAD>
    <BODY>
        <%
            GregorianCalendar now = new GregorianCalendar();
            String date = String.format("%TF", now); 
            String time = String.format("%TT", now); 
        %>
        ������ ��¥: <%= date %> <BR>
        ������ �ð�: <%= time %> <BR>
    </BODY>
</HTML>

<%@page contentType="text/html; charset=euc-kr"%>
<%@page import="java.util.GregorianCalendar"%>
<HTML>
    <HEAD><TITLE>날짜와 시각</TITLE></HEAD>
    <BODY>
        <%
            GregorianCalendar now = new GregorianCalendar();
            String date = String.format("%TF", now); 
            String time = String.format("%TT", now); 
        %>
        오늘의 날짜: <%= date %> <BR>
        현재의 시각: <%= time %> <BR>
    </BODY>
</HTML>

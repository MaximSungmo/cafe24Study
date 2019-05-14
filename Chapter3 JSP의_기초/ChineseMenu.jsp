<%@page contentType="text/html; charset=euc-kr"%>
<HTML>
    <HEAD><TITLE>¿À´ÃÀÇ ¸Þ´º</TITLE></HEAD>
    <BODY>
        <H3>¿À´ÃÀÇ ¸Þ´º</H3>
        - Â¥Àå¸é <BR>
        - ººÀ½¹ä <BR>
        - Â«»Í <BR><BR>
        <%
            out.flush();
            RequestDispatcher dispatcher = request.getRequestDispatcher("Now.jsp");
            dispatcher.include(request, response); 
        %>
    </BODY>
</HTML>

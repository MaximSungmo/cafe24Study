<%@page contentType="text/html; charset=euc-kr"%>
<HTML>
    <HEAD><TITLE>������ �޴�</TITLE></HEAD>
    <BODY>
        <H3>������ �޴�</H3>
        - ¥��� <BR>
        - ������ <BR>
        - «�� <BR><BR>
        <%
            out.flush();
            RequestDispatcher dispatcher = request.getRequestDispatcher("Now.jsp");
            dispatcher.include(request, response); 
        %>
    </BODY>
</HTML>

<%@page contentType="text/html; charset=euc-kr"%>
<HTML>
    <HEAD><TITLE>�Խ��� �۾��� - ��� ȭ��</TITLE></HEAD>
    <BODY>
        <H2>�۾���</H2>
        <% 
            String str = request.getParameter("RESULT"); 
            if (str.equals("SUCCESS"))
                out.println("����Ǿ����ϴ�.");
            else
                out.println("���Ͽ� �����͸� �� �� �����ϴ�.");
        %>
    </BODY>
</HTML>

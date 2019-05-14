<%@page contentType="text/html; charset=euc-kr"%>
<HTML>
    <HEAD><TITLE>게시판 글쓰기 - 결과 화면</TITLE></HEAD>
    <BODY>
        <H2>글쓰기</H2>
        <% 
            String str = request.getParameter("RESULT"); 
            if (str.equals("SUCCESS"))
                out.println("저장되었습니다.");
            else
                out.println("파일에 데이터를 쓸 수 없습니다.");
        %>
    </BODY>
</HTML>

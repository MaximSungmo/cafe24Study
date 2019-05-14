<%@page contentType="text/html; charset=euc-kr"%>
<%@page buffer="4kb"%>
<HTML>
    <HEAD><TITLE>출력 버퍼의 크기 지정</TITLE></HEAD>
    <BODY>
        출력 버퍼의 크기 : <%= out.getBufferSize() %>바이트
    </BODY>
</HTML>

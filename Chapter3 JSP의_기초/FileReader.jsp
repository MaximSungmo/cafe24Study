<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="java.io.*" %>
<HTML>
    <HEAD><TITLE> 파일 읽기</TITLE></HEAD>
    <BODY>
        <%
            BufferedReader reader = null;
            try {
                String filePath = application.getRealPath("/WEB-INF/input.txt");
                reader = new BufferedReader(new FileReader(filePath));
                while (true) {
                    String str = reader.readLine();
                    if (str == null)
                        break;
                    out.println(str + "<BR>");
                }
            }
            catch (FileNotFoundException fnfe) {
                out.println("파일이 존재하지 않습니다.");
            }
            catch (IOException ioe) {
                out.println("파일을 읽을 수 없습니다.");
            }
            finally {
                try {
                    reader.close();
                }          
                catch (Exception e) {
                }
            }
        %>
    </BODY>
</HTML>

<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="java.io.*" %>
<HTML>
    <HEAD><TITLE> ���� �б�</TITLE></HEAD>
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
                out.println("������ �������� �ʽ��ϴ�.");
            }
            catch (IOException ioe) {
                out.println("������ ���� �� �����ϴ�.");
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

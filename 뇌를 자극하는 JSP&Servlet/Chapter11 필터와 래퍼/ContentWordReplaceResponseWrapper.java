package myfilter;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ContentWordReplaceResponseWrapper extends HttpServletResponseWrapper {
    HttpServletResponse response;
    PrintWriter newWriter;
    StringWriter strWriter;
    public ContentWordReplaceResponseWrapper(HttpServletResponse response) {
        super(response);
        this.response = response;
    }
    public PrintWriter getWriter() throws IOException {
        if (newWriter == null) {
            strWriter = new StringWriter();
            newWriter = new PrintWriter(strWriter);
        }
        return newWriter;
    }
    public void modifyAndSend() throws IOException {
        String content = strWriter.toString();
        String newContent = content.replaceAll("∞≠æ∆¡ˆ", "∏€∏€¿Ã");
        PrintWriter writer = response.getWriter();
        writer.print(newContent);
    }
}

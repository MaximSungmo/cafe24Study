package myfilter;
import javax.servlet.*;
import java.io.*;
public class LogMessageFilter implements Filter {
    PrintWriter writer;
    public void init(FilterConfig config) throws ServletException {
        String filename = config.getInitParameter("FILE_NAME") ;
        if (filename == null)
            throw new ServletException("�α� ������ �̸��� ã�� �� �����ϴ�.");
        try {
            writer = new PrintWriter(new FileWriter(filename, true), true);
        }
        catch (IOException e) {
            throw new ServletException("�α� ������ �� �� �����ϴ�.");
        }
    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
                                                          throws IOException, ServletException {
        writer.println("�� ������Ʈ�� ���۵� ���Դϴ�.");
        writer.flush();
        chain.doFilter(request, response);
        writer.println("�� ������Ʈ�� �Ϸ�Ǿ����ϴ�.");
        writer.flush();
    }        
    public void destroy() {
        writer.close();
    }
}

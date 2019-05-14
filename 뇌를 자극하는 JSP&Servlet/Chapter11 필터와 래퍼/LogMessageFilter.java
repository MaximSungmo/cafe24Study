package myfilter;
import javax.servlet.*;
import java.io.*;
public class LogMessageFilter implements Filter {
    PrintWriter writer;
    public void init(FilterConfig config) throws ServletException {
        String filename = config.getInitParameter("FILE_NAME") ;
        if (filename == null)
            throw new ServletException("로그 파일의 이름을 찾을 수 없습니다.");
        try {
            writer = new PrintWriter(new FileWriter(filename, true), true);
        }
        catch (IOException e) {
            throw new ServletException("로그 파일을 열 수 없습니다.");
        }
    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
                                                          throws IOException, ServletException {
        writer.println("웹 컴포넌트가 시작될 것입니다.");
        writer.flush();
        chain.doFilter(request, response);
        writer.println("웹 컴포넌트가 완료되었습니다.");
        writer.flush();
    }        
    public void destroy() {
        writer.close();
    }
}

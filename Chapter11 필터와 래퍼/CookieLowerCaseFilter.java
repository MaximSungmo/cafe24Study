package myfilter;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class CookieLowerCaseFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
                             throws IOException, ServletException {
        CookieLowerCaseResponseWrapper responseWrapper 
                            = new CookieLowerCaseResponseWrapper((HttpServletResponse) response);
        chain.doFilter(request, responseWrapper);
    }        
    public void destroy() {
    }
}

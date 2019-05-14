package myfilter;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class LoginCheckFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
                             throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession();
        if (session == null) {
              httpResponse.sendRedirect("http://localhost:8080/brain11/LoginForm.html");
        }
        String id = (String) session.getAttribute("ID");
        if (id == null) {
              httpResponse.sendRedirect("http://localhost:8080/brain11/LoginForm.html");
        } 
        chain.doFilter(request, response);
    }        
    public void destroy() {
    }
}

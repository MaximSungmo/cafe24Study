package myfilter;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class CookieLowerCaseResponseWrapper extends HttpServletResponseWrapper {
    private HttpServletResponse response;
    public CookieLowerCaseResponseWrapper(HttpServletResponse response) {
        super(response);
        this.response = response;
    }
    public void addCookie(Cookie cookie) {
        String value = cookie.getValue();
        String newValue = value.toLowerCase();
        cookie.setValue(newValue);
        response.addCookie(cookie);
    }
}

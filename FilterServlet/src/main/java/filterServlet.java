import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

import static java.lang.System.out;
@WebFilter(urlPatterns = "/Studentform")
public class filterServlet implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        out.println("This is filter servlet");
            HttpServletRequest req=(HttpServletRequest) servletRequest;
            long phone=Long.parseLong(req.getParameter("ph"));

        if(phone<1000000000L || phone>9999999999L){
            servletResponse.setContentType("text/html");
            java.io.PrintWriter out = servletResponse.getWriter();
            out.println("<html><body>");
            out.println("<h1>Invalid Phone Number</h1>");
            out.println("</body></html>");
            return;
        }else {
            out.println("Valid Phone Number");

            filterChain.doFilter(servletRequest, servletResponse);

        }
    }
}

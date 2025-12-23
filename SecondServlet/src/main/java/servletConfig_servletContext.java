import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/Text")
public class servletConfig_servletContext extends HttpServlet {
    public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        ServletContext context = getServletContext();
        context.getInitParameter("name");
        ServletConfig config = getServletConfig();

        out.println("The name from servlet context is: " + context.getInitParameter("name"));
        out.println("The name from servlet context is: " + config.getInitParameter("name"));
    }
}

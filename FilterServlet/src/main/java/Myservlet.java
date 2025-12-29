import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/Studentform")
public class Myservlet extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String name=req.getParameter("name");
        String gender=req.getParameter("gen");
        String email=req.getParameter("em");
        long phone=Long.parseLong(req.getParameter("ph"));
        res.setContentType("text/html");
        java.io.PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1>Welcome to Student Form</h1>");
        out.println("Hello"+name+"<br>");
    }
}

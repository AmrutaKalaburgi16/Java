import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/application-form")
public class ApplicationFormServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
     String name=  req.getParameter("name");
        String country=  req.getParameter("country");
        res.setContentType("text/html");
        res.getWriter().println("<h1>Welcome "+name+" from "+country+"</h1>");
//        req.setAttribute("applicantName",name);
//        req.setAttribute("applicantCountry",country);
//        RequestDispatcher rq= req.getRequestDispatcher("form");
//
//        rq.forward(req,res);

//        URL REWRINTING
//        res.sendRedirect("form?applicantName="+name+"&applicantCountry="+country);

//        SessionManagement using  HttpSession

//        HttpSession session = req.getSession();
//        session.setAttribute("applicantName",name);
//        session.setAttribute("applicantCountry",country);

//        Cookie
    Cookie cookie1 = new Cookie("applicantName", name);
        Cookie cookie2 = new Cookie("applicantCountry", country);
        res.addCookie(cookie1);
        res.sendRedirect("form");
    }
}

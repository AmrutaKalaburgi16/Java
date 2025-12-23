import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/home")
public class Home extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("This is home servlet");

//      String name=req.getAttribute("applicantName").toString();
//      String country=req.getAttribute("applicantCountry").toString();

//        SendRedirect-->URLRewriting

//        String name=  req.getParameter("applicantName");
//        String country=  req.getParameter("applicantCountry");

//        SendRedirect-->Session management
//        String name=  req.getSession().getAttribute("applicantName").toString();
//        String country=  req.getSession().getAttribute("applicantCountry").toString();

//        sendRedirect-->Cookies
                Cookie[] cookies = req.getCookies();
                String name = "";
                String country = "";
                for(Cookie cookie : cookies){
                    if(cookie.getName().equals("applicantName")){
                       name = cookie.getValue();
                    }
                    if(cookie.getName().equals("applicantCountry")){
                         country = cookie.getValue();
                    }
                }

            res.setContentType("text/html");
            res.getWriter().println("<h1>Welcome "+name+" from "+country+"</h1>"+
                    " <br/><a href='application-form'>Go Back</a>");
        res.sendRedirect("Text");


    }

}

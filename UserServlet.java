package AirlineApp;
 
import java.io.IOException;
import java.io.PrintWriter;
 import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        String source = request.getParameter("source");
        String destination = request.getParameter("destinaton");
		Date departure = request.getParameter("dep");
		Date arrival = request.getParameter("arrival");
         
        System.out.println("username: " + username);
        System.out.println("password: " + password);
 
         
        PrintWriter writer = response.getWriter();
         
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + username + "<br/>";      
        htmlRespone += "Your password is: " + password + "</h2>";    
        htmlRespone += "</html>";
         
        writer.println(htmlRespone);
         
    }
 
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package murach.user;
import murach.bussiness.User;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Duy Thanh
 */
@WebServlet(name = "SurveyServlet", urlPatterns = {"/SurveyServlet"})
public class SurveyServlet extends HttpServlet {

@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String url = "/index.html";
    // get current action
    String action = request.getParameter("action");
        if (action == null) {
            action = "join"; // default action
        }
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html"; // the "join" page
        }
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateOfBirth = request.getParameter("dateOfBirth");
            String hearAbout = request.getParameter("source");
            String param1 = request.getParameter("Yes");
            String param2 = request.getParameter("Yes, pls");
            String receive = (param1 != null ? param1 : "") + (param2 != null ? param2 : "");
            String contact = request.getParameter("contact");
            
            //store data in User object and save User object in db
            User user = new User(firstName, lastName, email, dateOfBirth, hearAbout, receive, contact);
          //  UserDB.insert(user);
            
            // set User object in request object and set URL
            request.setAttribute("user", user);
            url = "/Submitted.jsp"; // the "submitted" page
        }
        
        //forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
   
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}

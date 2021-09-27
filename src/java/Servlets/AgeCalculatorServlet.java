package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        //will have servlet call upon jsp to be loaded by clients browser
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // captures parameters coming from form post
        String userage = request.getParameter("user_age");
        
        //vailidates user inputs.
        if (userage == null || userage.equals("")) {
            request.setAttribute("message", "You must give your current age.");
            //display form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            //after reload stop rest of execution
            return;
        }else if(!userage.matches("[0-9]+")) {
            request.setAttribute("message", "You must enter a number.");
            //display form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            //after reload stop rest of execution
            return;
        } else {
        int newAge = Integer.parseInt(userage);      
                
        request.setAttribute("message", "Your age next birthday will be " + (newAge + 1));

        //The request object is passed through jsp by forward method.
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        }

    }

}
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        //will have servlet call upon jsp to be loaded by clients 
        request.setAttribute("message", "Results: ---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String calcType = request.getParameter("calc");
        String numOne = (request.getParameter("first_num"));
        String numTwo = request.getParameter("last_num");  
        
        request.setAttribute("first_num", numOne);
        request.setAttribute("last_num", numTwo);
        
           //vailidates user inputs.
        if (numOne == null || numOne.equals("") || numTwo == null || numTwo.equals("")) {
            request.setAttribute("message", " Results: Invaild");
            //display form again
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            //after reload stop rest of execution
            return;
        }
      
        
        int firstNum = Integer.parseInt(numOne);
        int secondNum = Integer.parseInt(numTwo);       
        

        switch (calcType) {
            case "+":
                request.setAttribute("message", "Results: " + (firstNum + secondNum));
                break;
            case "-":
                request.setAttribute("message", "Results: " + (firstNum - secondNum));
                break;
            case "*":
                request.setAttribute("message", "Results: " + (firstNum * secondNum));
                break;
            case "%":
                request.setAttribute("message", "Results: " + (firstNum % secondNum));
                break;
            default:
                request.setAttribute("message", "Results: ---");
                break;
        }


        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

}

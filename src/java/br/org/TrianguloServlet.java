package br.org;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.org.Triangulo;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Adriano
 */
@WebServlet(urlPatterns = {"/TrianguloServlet"})
public class TrianguloServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        Triangulo tri = new Triangulo();
        int lado1 = Integer.parseInt(request.getParameter("lado1"));
        int lado2 = Integer.parseInt(request.getParameter("lado2"));
        int lado3 = Integer.parseInt(request.getParameter("lado3"));

        String result = tri.tipo(lado1, lado2, lado3);
        RequestDispatcher rd = null;

        request.setAttribute(result, "result");
        response.sendRedirect("index.jsp?result=" + result);
        //rd = request.getRequestDispatcher("/index.jsp");
        //rd.forward(request, response);

    }
}

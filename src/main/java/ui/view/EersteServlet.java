package ui.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

@WebServlet("/DynamischePagina")
public class EersteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head><body>\n");
        out.println("<h1>Omg so dynamic *blown away*</h1>");
        out.println("<a href=\"index.html\" id=\"home\">Go back to home? :O</a>");
        out.println("<p id=dynamisch>");
        out.println(Math.random());
        out.println("</p>");
        out.println("</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

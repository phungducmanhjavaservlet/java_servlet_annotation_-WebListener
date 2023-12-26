package com.example.ServletAnnotation.WebListenerAnnotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = { "/add-servlet-context-attribute", "/remove-servlet-context-attribute",
        "/replace-servlet-context-attribute" })
public class ServletContextAttribute extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("BEIN Servlet context attribute DO GET");
        String path = req.getServletPath();
        switch (path) {
            case "/add-servlet-context-attribute": {
                getServletContext().setAttribute("myAttribute", "Servlet context attribute added");
                break;
            }
            case "/remove-servlet-context-attribute": {
                getServletContext().removeAttribute("myAttribute");
                break;
            }
            case "/replace-servlet-context-attribute": {
                getServletContext().setAttribute("myAttribute", "Servlet context attribute replace");
                break;
            }
            default:
                break;
        }

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + getServletContext().getAttribute("myAttribute") + "</h1>");
        writer.flush();
        writer.close();
        System.out.println("END Servlet context attribute DO GET");
    }
}

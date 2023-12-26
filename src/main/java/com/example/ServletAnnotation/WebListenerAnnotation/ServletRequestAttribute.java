package com.example.ServletAnnotation.WebListenerAnnotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = {"/add-request-attribute", "/remove-request-attribute", "/replaced-request-attribute"})
public class ServletRequestAttribute extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("BEIN ServletRequest class DO GET");
        String path = req.getServletPath();
        switch (path) {
            case "/add-request-attribute": {
                req.setAttribute("myAttribute", "Request added attribute");
                break;
            }
            case "/remove-request-attribute": {
                req.removeAttribute("myAttribute");
                break;
            }
            case "/replaced-request-attribute": {
                req.setAttribute("myAttribute", "Request replace attribute");
                break;
            }
            default:
                break;
        }

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + req.getAttribute("myAttribute") + "</h1>");
        writer.flush();
        writer.close();
        System.out.println("END ServletRequest class DO GET");
    }
}

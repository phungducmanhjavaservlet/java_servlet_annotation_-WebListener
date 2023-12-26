package com.example.ServletAnnotation.WebListenerAnnotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = {"/add-http-session-attribute", "/remove-http-session-attribute",
        "/replace-http-session-attribute" })
public class ServletSession extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("\nBEIN ServletSession class DO GET");
        HttpSession session = req.getSession();

        String path = req.getServletPath();
        switch (path) {
            case "/add-http-session-attribute": {
                session.setAttribute("myAttr", "Session added attribute");
                break;
            }
            case "/remove-http-session-attribute": {
                session.removeAttribute("myAttr");
                break;
            }
            case "/replace-http-session-attribute": {
                session.setAttribute("myAttr", "Session replace attribute");
                break;
            }
            default:
                break;
        }

        session.setMaxInactiveInterval(5);
        System.out.println("\tSession 5s time life with ID: " + session.getId());
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + session.getAttribute("myAttr") + "</h1>");
        writer.flush();
        writer.close();
        System.out.println("END ServletSession class DO GET\n");

    }

}

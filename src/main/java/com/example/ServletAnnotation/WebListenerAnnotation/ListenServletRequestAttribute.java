package com.example.ServletAnnotation.WebListenerAnnotation;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class ListenServletRequestAttribute implements ServletRequestAttributeListener {

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        ServletRequest servletRequest = srae.getServletRequest();
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String attributeName = srae.getName();
        Object value = srae.getValue();

        System.out.println("Listen servlet request added attribute");
        System.out.println("\tServlet path: " + httpServletRequest.getServletPath());
        System.out.println("\tAttribute name: " + attributeName);
        System.out.println("\tAttribute value: " + value.toString());
        System.out.println("End Listen servlet request added attribute");

    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        ServletRequest servletRequest = srae.getServletRequest();
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String attributeName = srae.getName();
        Object value = srae.getValue();

        System.out.println("Listen servlet request removed attribute");
        System.out.println("\tServlet path: " + httpServletRequest.getServletPath());
        System.out.println("\tAttribute name: " + attributeName);
        System.out.println("\tAttribute value: " + value.toString());
        System.out.println("End Listen servlet request removed attribute");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        ServletRequest servletRequest = srae.getServletRequest();
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String attributeName = srae.getName();
        Object value = srae.getValue();

        System.out.println("Listen servlet request replaced attribute");
        System.out.println("\tServlet path: " + httpServletRequest.getServletPath());
        System.out.println("\tAttribute name: " + attributeName);
        System.out.println("\tAttribute value: " + value.toString());
        System.out.println("End Listen servlet request replaced attribute");
    }

}

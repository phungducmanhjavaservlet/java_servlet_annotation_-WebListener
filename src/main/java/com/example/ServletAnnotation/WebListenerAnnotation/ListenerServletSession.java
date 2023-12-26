package com.example.ServletAnnotation.WebListenerAnnotation;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ListenerServletSession implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession source = se.getSession();
        System.out.println("\nBegin listen session created");
        System.out.println("\tSession ID: " + source.getId());
        System.out.println("End listen session created\n");

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession source = se.getSession();
        System.out.println("\nBegin listen session destroyed");
        System.out.println("\tSession ID: " + source.getId());
        System.out.println("End listen session destroyed\n");
    }

}

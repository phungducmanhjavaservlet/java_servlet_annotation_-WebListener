package com.example.ServletAnnotation.WebListenerAnnotation;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class ListenServletRequest implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
        System.out.println("One Servlet Request init: " + request.getServletPath());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
         HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();
        System.out.println("One Servlet Request destroy: " + request.getServletPath());
    }

}

package com.example.ServletAnnotation.WebListenerAnnotation;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class ListenerServletSessionAttribute implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        HttpSession source = event.getSession();
        String attributeName = event.getName();
        Object value = event.getValue();

        System.out.println("\nListen servlet sesion added attribute");
        System.out.println("\tSession ID: " + source.getId());
        System.out.println("\tAttribute name: " + attributeName);
        System.out.println("\tAttribute value: " + value.toString());
        System.out.println("End Listen servlet sesion added attribute\n");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        HttpSession source = event.getSession();
        String attributeName = event.getName();
        Object value = event.getValue();

        System.out.println("\nListen servlet sesion removed attribute");
        System.out.println("\tSession ID: " + source.getId());
        System.out.println("\tAttribute name: " + attributeName);
        System.out.println("\tAttribute value: " + value.toString());
        System.out.println("End Listen servlet sesion removed attribute\n");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        HttpSession source = event.getSession();
        String attributeName = event.getName();
        Object value = event.getValue();

        System.out.println("\nListen servlet sesion replaced attribute");
        System.out.println("\tSession ID: " + source.getId());
        System.out.println("\tAttribute name: " + attributeName);
        System.out.println("\tAttribute value: " + value.toString());
        System.out.println("End Listen servlet sesion replaced attribute\n");
    }

}

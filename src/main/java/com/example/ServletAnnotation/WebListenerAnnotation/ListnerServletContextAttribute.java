package com.example.ServletAnnotation.WebListenerAnnotation;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListnerServletContextAttribute implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        String attrName = event.getName();
        Object attrValue = event.getValue();

        System.out.println("Listen servlet context added attribute");
        System.out.println("\tAttribute name: " + attrName);
        System.out.println("\tAttribute value: " + attrValue.toString());
        System.out.println("End Listen servlet context added attribute");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        String attrName = event.getName();
        Object attrValue = event.getValue();

        System.out.println("Listen servlet context removed attribute");
        System.out.println("\tAttribute name: " + attrName);
        System.out.println("\tAttribute value: " + attrValue.toString());
        System.out.println("End Listen servlet context removed attribute");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        String attrName = event.getName();
        Object attrValue = event.getValue();

        System.out.println("Listen servlet context replaced attribute");
        System.out.println("\tAttribute name: " + attrName);
        System.out.println("\tAttribute value: " + attrValue.toString());
        System.out.println("End Listen servlet context replaced attribute");
    }
}

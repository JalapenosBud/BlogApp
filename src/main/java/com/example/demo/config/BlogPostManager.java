package com.example.demo.config;

import com.example.demo.model.BlogPost;
import org.hibernate.Session;

import java.util.*;


public class BlogPostManager {

    public static void main(String[] args) {
        BlogPostManager mgr = new BlogPostManager();

        if (args[0].equals("store")) {
            mgr.createAndStoreBlogPost("My BlogPost", new Date());
        }

        HibernateUtil.getSessionFactory().close();
    }

    private void createAndStoreBlogPost(String title, Date theDate) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        BlogPost theEvent = new BlogPost();
        theEvent.setTitle(title);
        theEvent.setCreation_date(theDate);
        session.save(theEvent);

        session.getTransaction().commit();
    }

}
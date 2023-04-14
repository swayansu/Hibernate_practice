package com.incure.hibernateassignment.util;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class ComapnyUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
     if(sessionFactory == null){
         try{
             Configuration config = new Configuration();
             config.configure("hibernate.cfg.xml");
             sessionFactory = config.buildSessionFactory();
         }catch (Exception e){
             e.printStackTrace();
         }
     }

     return sessionFactory;
    }
}

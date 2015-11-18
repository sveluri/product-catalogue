package com.dal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * TODO :
 */
public class TestSample {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("database-beans.xml");

        ProductDao productDao = (ProductDao) context.getBean("productDao");

        System.out.println(productDao);

        //Date date = new Date();
        Calendar date = new GregorianCalendar(2015, Calendar.NOVEMBER, 18, 22, 59);
        System.out.println(date.getTime());

        productDao.delete(date.getTime());

        System.out.println(productDao.getAllProducts());

    }

}

package org.example;

import org.example.model.Passport;
import org.example.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("containerConfig.xml");

        User meder = context.getBean("meder", User.class);

        System.out.println(meder);

        Passport passport = new Passport(1, "passport", 223344);

        User user = new User("Meder", 22, passport);

    }
}

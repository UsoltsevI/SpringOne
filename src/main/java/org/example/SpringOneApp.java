package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringOneApp {

    public static void main(String[] args) {
        System.out.println("Mark in SpringOneApp:main()");

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
            Alien alien = (Alien) context.getBean("alien");
            System.out.println("Alien id: " + alien.getId() + ", Alien name: " + alien.getName());
        }
    }
}

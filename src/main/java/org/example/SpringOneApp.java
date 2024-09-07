package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringOneApp {
    public static void main(String[] args) {
        System.out.println("Spring one app main()!\n");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
            // Alien alien = (Alien) context.getBean("alien");
        //     System.out.println("Alien id: " + alien.getId() + ", Alien name: " + alien.getName());
        // }

        System.out.println("after trying");
    }
}

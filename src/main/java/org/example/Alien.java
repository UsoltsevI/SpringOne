package org.example;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Alien {
    private int id;
    private String name;

    public Alien(int id, String name) {
        System.out.println("Alien constructor");
        this.id = id;
        this.name = name;
    }    
}

package main.java.com.leandrosj.curso.hashcodeEquals.application;

import main.java.com.leandrosj.curso.hashcodeEquals.entities.Client;

public class Program {

    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Bob", "bob@gmail.com");

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());

    }
}

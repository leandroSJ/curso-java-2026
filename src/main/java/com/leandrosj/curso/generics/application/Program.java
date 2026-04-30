package main.java.com.leandrosj.curso.generics.application;

import main.java.com.leandrosj.curso.generics.services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        Integer n = sc.nextInt();

        for (int i = 0; i< n; i++){
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}

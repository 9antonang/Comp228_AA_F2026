package com.aa.week1.assign1;

import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeCalculator gc = new GradeCalculator();
        System.out.print("Enter your course percentage: ");
        double percent = sc.nextDouble();
        System.out.println("Your grade is: " + gc.calculateGrade(percent));

        MilesToKm mk = new MilesToKm();
        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles = " + mk.convert(miles) + " km");

        LitersToGallons lg = new LitersToGallons();
        System.out.print("Enter liters: ");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters = " + lg.convert(liters) + " gallons");

        CadToUsd cu = new CadToUsd();
        System.out.print("Enter CAD amount: ");
        double cad = sc.nextDouble();
        System.out.println(cad + " CAD = " + cu.convert(cad) + " USD");

        sc.close();
    }
}

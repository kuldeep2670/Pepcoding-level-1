package Zc_namingConventions_Packages_JAVA.mainpackage;

import java.util.Scanner;

import Zc_namingConventions_Packages_JAVA.calculatorpackage.calculator;
import Zc_namingConventions_Packages_JAVA.calculatorpackage.sciteificCalculator;

public class Main {
    public static void main(String[] args) {
        

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two number :");
        double a = scn.nextDouble();
        double b = scn.nextDouble();

        double add = calculator.sum(a, b);
        double power = sciteificCalculator.power(a, b);

        System.out.println(add + " "+ power);

        scn.close();


    } 
}

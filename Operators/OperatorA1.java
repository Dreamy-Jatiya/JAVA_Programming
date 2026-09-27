/*
    Enter basic salary
    Add 20% HRA
    Add 10% DA
    Subtract 18% TA
    Subtract 500/- professional tax
    Calculate Gross Salary
*/

import java.util.Scanner;

public class OperatorA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra = (basic * 20) / 100;
        double da = (basic * 10) / 100;
        double ta = (basic * 18) / 100;
        double pTax = 500;

        System.out.println("Basic Salary = " + basic);
        System.out.println("HRA + DA = " + (hra + da));
        System.out.println("TA = " + ta);
        System.out.println("Professional Tax = " + pTax);
        System.out.println("Gross Salary = " + (basic + hra + da - ta - pTax));

        sc.close();
    }
}
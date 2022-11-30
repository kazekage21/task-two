package com.mycompany.leapyear;
import java.util.Scanner;

public class Leapyear {
   public static void main(String[] args) {
       int year;
       System.out.println("Enter year::");
       Scanner sc = new Scanner(System.in);
       year= sc.nextInt();
       
       if(year% 4==0)
       System.out.println("This is a leap year");
       else
       System.out.println("This is not a leap year");
    }
}

// Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.Scanner;
 public class leapyear{
     public static void main(String args []){
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter a year:");
         int year = sc.nextInt();

         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            
             System.out.println("This Year a LeapYear");
         }else {
             System.out.println("not a leap year");
         }
     }
 }
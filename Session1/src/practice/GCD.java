/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Mouayad Aloula
 */
public class GCD {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter first number");
      int first = scanner.nextInt();
      System.out.println("Enter first second");
      int second = scanner.nextInt();
      int gcd = 1;

      for(int i = 1; i <= first && i <= second; ++i) {
         if (first % i == 0 && second % i == 0) {
            gcd = i;
         }
      }

      System.out.println("GCD is: " + gcd);
   }
}
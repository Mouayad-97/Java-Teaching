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
public class Factorial {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n = scanner.nextInt();
      int result = 1;

      for(int i = 1; i <= n; ++i) {
         result *= i;
      }

      System.out.println("Factorial is: " + result);
   }
}

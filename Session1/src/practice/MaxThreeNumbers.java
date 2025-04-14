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
public class MaxThreeNumbers {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the first number");
      int first = scanner.nextInt();
      System.out.println("Enter the second number");
      int second = scanner.nextInt();
      System.out.println("Enter the third number");
      int third = scanner.nextInt();
      int max = first;
      if (second > first) {
         max = second;
      }

      if (third > max) {
         max = third;
      }

      System.out.println("Max number is " + max);
   }
}

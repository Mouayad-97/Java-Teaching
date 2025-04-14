/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solved;

import java.util.Scanner;

/**
 *
 * @author Mouayad Aloula
 */
public class SwapNumbers {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter First Number");
      float first = scanner.nextFloat();
      System.out.println("Enter Second Number");
      float second = scanner.nextFloat();
      System.out.println("--Before Swap--");
      System.out.println("First Number = " + first);
      System.out.println("Second Number = " + second);
      System.out.println("--After Swap--");
      System.out.println("First Number = " + second);
      System.out.println("Second Number = " + first);
   }
}

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
public class EvenOrOdd {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = scanner.nextInt();
      System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
   }
}

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
public class Calculations {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter First Number");
      int first = scanner.nextInt();
      System.out.println("Enter Second number");
      int second = scanner.nextInt();
      int sum = first + second;
      int sub = first - second;
      int product = first * second;
      int div = first / second;
      int reminder = first % second;
      System.out.println("The sum is: " + sum);
      System.out.println("The sub is: " + sub);
      System.out.println("The product is: " + product);
      System.out.println("The div is: " + div);
      System.out.println("The reminder is: " + reminder);
   }
}

package com.examples;

import java.util.Scanner;

public class Project2 {

  public static void main(String[] args) {
    boolean isValid = true;
    while (isValid) {
      int number;
      Scanner sc = new Scanner(System.in);
      try {
        System.out.print("Please Enter N:");
        number = Integer.parseInt(sc.next());
        int sum = 0;
        for (int i = 1; i <= number; i++) {
          sum = sum + i;
        }
        System.out.printf("\nSum of 1 .. %d is : %d", number, sum);
        isValid = false;
      } catch (NumberFormatException nfe) {
        System.out.println("N must be a number!");
      }
    }
  }
}

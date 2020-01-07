package com.examples;

import java.util.Scanner;

public class StringFormat {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Enter the Input String");
    var inputString = scanner.next();
    System.out.println("Enter the Input Number");
    var inputNumber = scanner.nextInt();
    printFormatOutPut(inputString, inputNumber);
  }

  private static void printFormatOutPut(String inputString, int inputNumber) {
    System.out.println(String.format("%-15s", inputString) + String.format("%03d", inputNumber));
  }
}

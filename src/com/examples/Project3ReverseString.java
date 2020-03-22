package com.examples;

import java.util.Scanner;

public class Project3ReverseString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input String");
    String inputString = sc.nextLine();
    char[] charArray = new char[inputString.length()];
    for (int i = inputString.length() - 1; i >= 0; i--) {
      charArray[inputString.length() - 1 - i] = inputString.charAt(i);
    }
    System.out.println(new String(charArray));
  }
}

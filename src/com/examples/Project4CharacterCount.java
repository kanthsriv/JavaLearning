package com.examples;

import java.util.Scanner;

public class Project4CharacterCount {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the input String");
    String inputString = sc.nextLine();
    char[] charArray = inputString.toCharArray();
    for(char ch : charArray){
      System.out.println(ch);
    }
  }
}

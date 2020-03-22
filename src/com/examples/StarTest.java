package com.examples;

public class StarTest {
  public static void main(String[] args) {
    for(int i =1; i <=5; i++){
      for(int j = i-1; j <= i; j++){
        System.out.print(" ");
      }
      for(int k = i+1; k <= i; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

package com.examples;

import java.util.Scanner;

public class BillDiscount {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Enter the Input Bill Amount");
    var billAmount = scanner.nextDouble();
    System.out.println("Enter the Discount Percentage ");
    var discountPercentage = scanner.nextInt();
    printBillDetails(billAmount, discountPercentage);
  }

  private static void printBillDetails(double billAmount, int discountPercentage) {
    System.out.println("Total Bill \u20B9 :" + billAmount);
    var discountAmount = billAmount * discountPercentage / 100;
    billAmount = billAmount - discountAmount;
    System.out.println("Discount Amount \u20B9 :"+ discountAmount);
    System.out.println("After Discount Bill \u20B9 :"+ billAmount);
  }
}

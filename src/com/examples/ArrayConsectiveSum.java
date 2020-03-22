package com.examples;

public class ArrayConsectiveSum {
  public static void main(String[] args) {
    System.out.println(getMaxSum(16, 12, 13, 7, 12, 14, 4, 3));
  }

  static int getMaxSum(int... inputArray) {
    int maxSum = 0;
    int tempSum;
    for (int i = 1; i < inputArray.length - 2; i++) {
      tempSum = inputArray[i - 1] + inputArray[i] + inputArray[i + 1];
      if (tempSum > maxSum) {
        maxSum = tempSum;
      }
    }
    return maxSum;
  }
}

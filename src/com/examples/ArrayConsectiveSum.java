package com.examples;

public class ArrayConsectiveSum {
  public static void main(String[] args) {
    System.out.println(getMaxSum(16, 12,1));
    System.out.println(getMaxSum(16, 12,11,6,7,12,14,3,6));
    System.out.println(getMaxSum(16, 12,11,6,7,12,14,3,69));
  }

  static int getMaxSum(int... inputArray) {
    if (inputArray.length < 3) {
      throw new IllegalArgumentException("Array size should not be less than 3");
    }
    int maxSum = 0;
    int tempSum;
    for (int i = 1; i <= inputArray.length - 2; i++) {
      tempSum = inputArray[i - 1] + inputArray[i] + inputArray[i + 1];
      if (maxSum < tempSum) {
        maxSum = tempSum;
      }
    }
    return maxSum;
  }
}

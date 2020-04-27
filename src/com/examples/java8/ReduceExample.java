package com.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @author Srikanth
 */
public class ReduceExample {
  public static void main(String[] args) {
    Stream<Integer> stream = Stream.of(1);
    BinaryOperator<Integer> sum = Integer::sum;
    Integer id = 0;
    int total = stream.reduce(id, sum);
    System.out.println(total);
    List<Integer> integerList = Arrays.asList();
    int reduce = integerList.stream().reduce(0, Integer::sum);
    System.out.println(reduce);
  }
}

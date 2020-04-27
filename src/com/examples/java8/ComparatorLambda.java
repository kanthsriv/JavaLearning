package com.examples.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** @author Srikanth */
public class ComparatorLambda {

  public static void main(String[] args) {
    Comparator<String> comparator1 = Comparator.comparingInt(String::length);
    List<String> stringList = Arrays.asList("****", "*", "**", "***");
    Collections.sort(stringList, comparator1);
    stringList.forEach(System.out::println);
  }
}

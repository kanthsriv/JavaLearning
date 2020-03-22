package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListTest {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("milk");
    list.add("bread");
    list.add("sausage");
    list = list.subList(0,2);
    Stream<String> stream = list.stream();
    list.add("eggs, don't forget egg!");
    list.forEach(System.out::println);
    System.out.println(Stream.of(-3,-2,-1,0,1,2,3).max(Math::max).get());
  }
}

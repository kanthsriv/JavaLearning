package com.examples.java8;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Srikanth
 */
public class FirstStream {
  public static void main(String[] args) {
    Predicate<String> p = Predicate.isEqual("two");
    //Predicate<String> p = Predicate.isEqual("two");
    Stream<String> stream = Stream.of("one", "two", "three");
    stream.filter(p).forEach(System.out::println);;
    //stream1.forEach(System.out::println);
   // System.out.println(stream1.);
  }
}

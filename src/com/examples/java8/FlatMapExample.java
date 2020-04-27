package com.examples.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**;
 * @author Srikanth
 */
public class FlatMapExample {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
    List<Integer> list1= Arrays.asList(2,4,6);
    List<Integer> list2 = Arrays.asList(3,5,7);
    List<List<Integer>> list3 = Arrays.asList(list,list1,list2);

    Function<List<?>, Integer> functionMap = List::size;
    Function<List<Integer>, Stream<Integer>> functionFlatMap = l -> l.stream();
    list3.stream().flatMap(functionFlatMap).forEach(System.out::println);
  }
}

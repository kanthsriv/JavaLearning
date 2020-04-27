package com.examples.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** @author Srikanth */
public class PersonStream {
  public static void main(String[] args) throws IOException {
    List<Person> persons = new ArrayList<>();
    try (BufferedReader bufferedReader =
            Files.newBufferedReader(Paths.get("Person.txt"), StandardCharsets.UTF_8);
        Stream<String> stream = bufferedReader.lines()) {
      stream
          .map(
              line -> {
                String[] inputs = line.split(" ");
                Person person = new Person(inputs[0].trim(), Integer.parseInt(inputs[1]));
                persons.add(person);
                return person;
              }).forEach(System.out::println);

      Optional<Person> optionalPerson =
          persons.stream().filter(p -> p.getAge() > 20).min(Comparator.comparing(Person::getAge));
      Optional<Person> optionalPerson1 = persons.stream().max(Comparator.comparing(Person::getAge));
      // Map<Integer, List<Person>> map =
      // persons.stream().collect(Collectors.groupingBy(Person::getAge));
      // Map<Integer, Long> map = persons.stream().collect(Collectors.groupingBy(Person::getAge,
      // Collectors.counting()));
      /* Map<Integer, List<String>> map =
      persons.stream()
          .collect(
              Collectors.groupingBy(
                  Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));*/
      /*
      Map<Integer, Set<String>> map =
                persons.stream()
                    .collect(
                        Collectors.groupingBy(
                            Person::getAge, Collectors.mapping(Person::getName, Collectors.toCollection(
                                TreeSet::new))));
      */
      Map<Integer, String> map =
          persons.stream()
              .collect(
                  Collectors.groupingBy(
                      Person::getAge,
                      Collectors.mapping(Person::getName, Collectors.joining(", "))));

      System.out.println(optionalPerson);
      System.out.println(optionalPerson1);
      System.out.println(map);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

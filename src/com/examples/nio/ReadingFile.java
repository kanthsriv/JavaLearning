package com.examples.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/** @author Srikanth */
public class ReadingFile {

  public static void main(String[] args) throws IOException {

    Path path = Paths.get("files/hello.txt");
    // URI uri  = URI.create("C:\Users\Srikanth");
    System.out.println("File Exist:" + Files.exists(path));
    // Path pat1 = Path.of();
    /** Reading File */
    try (BufferedReader bufferedReader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
      Stream<String> lines = bufferedReader.lines();
     // Function<String, Person> convertCSV = ReadingFile::convertCSV;
      lines.filter(line -> !line.startsWith("#")).flatMap(ReadingFile::convertCSV).forEach(System.out::println);
    }
  }

  private static Stream<Person> convertCSV(String line) {
    try {
      String[] inputs = line.split(",");
      Person p = new Person(inputs[0], Integer.parseInt(inputs[1]), inputs[2]);
      return Stream.of(p);
    } catch (Exception e) {
    }
    return Stream.empty();
  }
}

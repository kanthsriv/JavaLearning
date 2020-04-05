package com.examples.nio;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Srikanth
 */
public class WritingFile {

  public static void main(String[] args) {

    Path path = Paths.get("files/one.txt");
    /** Writing a File */
    try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path);BufferedWriter bufferedWriter1 = new BufferedWriter(bufferedWriter); PrintWriter printWriter = new PrintWriter(bufferedWriter);) {
        bufferedWriter.write("Hello World");
        printWriter.printf("\n i =%d", 12);
      System.out.println("Done!");
       } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

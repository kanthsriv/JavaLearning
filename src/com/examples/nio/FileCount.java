package com.examples.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/** @author Srikanth */
public class FileCount {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("src/");
    long dirCount = Files.walk(path).filter( p -> Files.isDirectory(p)).count();
    System.out.println("Dir Count:" + dirCount);
    long fileCount = Files.walk(path).filter( p -> Files.isRegularFile(p)).count();
    System.out.println("File Count:"+fileCount);
  }
}

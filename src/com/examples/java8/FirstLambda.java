package com.examples.java8;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Srikanth
 */
public class FirstLambda {

  public static void main(String[] args) {
    FileFilter fileFilter = new FileFilter() {
      @Override
      public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java");
      }
    };

    FileFilter lamdaFilter = (File file) -> file.getName().endsWith(".java");

     //String path = "C:/Users/Srikanth/Desktop/Learning/JavaLearning/src/com/examples";
    String path = "C:\\Users\\Srikanth\\Desktop\\Learning\\JavaLearning\\src\\com\\examples";
    File file = new File(path);
    File[] listFiles = file.listFiles(lamdaFilter);
    for(File fil : listFiles){
      System.out.println(fil);
    }
  }
}

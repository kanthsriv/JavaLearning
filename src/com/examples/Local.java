package com.examples;

interface Dog{
  default void bark() {
    System.out.println("Bark");
  }
}

interface Cat{
  default void meow() {
    System.out.println("Meow");
  }
}

public class Local {
  public static void main(String[] args) {

  }
}

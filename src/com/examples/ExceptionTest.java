package com.examples;

import java.io.Closeable;
import java.io.IOException;

public class ExceptionTest {
  public static void main(String[] args) {
    String soprano = null;
    CloseIt closeIt = new CloseIt();
    try (closeIt) {
      System.out.println(soprano.matches(null));
    } catch (RuntimeException re) {
      try (closeIt) {
        System.out.println("Runtime");
        throw new RuntimeException();
      } catch (Exception e) {
        System.out.println("Exception");
      }
    } catch (Error er) {
      System.out.println("Error");
    } catch (Throwable t) {
      System.out.println("Throwable");
    }
  }

  static class CloseIt implements Closeable {

    @Override
    public void close() throws IOException {
      System.out.println("Closed");
    }
  }
}

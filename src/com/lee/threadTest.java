package com.lee;

public class threadTest extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 200; i++) {
      System.out.println("xxxx");
    }
  }

  public static void main(String[] args) {
    threadTest threadTest = new threadTest();
    threadTest.start();
    for (int i = 0; i < 1000; i++) {
      System.out.println("aaa");
    }
  }
}

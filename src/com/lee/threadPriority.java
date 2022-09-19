package com.lee;

public class threadPriority {
  public static void main(String[] args) {
    System.out.println(
        Thread.currentThread().getName() + "--->" + Thread.currentThread().getPriority());
    myPriority myPriority = new myPriority();
    Thread t1 = new Thread(myPriority);
    Thread t2 = new Thread(myPriority);
    Thread t3 = new Thread(myPriority);
    // 线程优先级 1~10
    t1.start();

    t2.setPriority(10);
    t2.start();

    t3.setPriority(3);
    t3.start();
  }

  static class myPriority implements Runnable {
    @Override
    public void run() {
      System.out.println(
          Thread.currentThread().getName() + "--->" + Thread.currentThread().getPriority());
    }
  }
}

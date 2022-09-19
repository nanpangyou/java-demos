package com.demo;

public class Hello {
  public static void main(String[] args) {
    System.out.println("com.demo.Hello world");
    //    Scanner scanner = new Scanner(System.in);
    //    String a = scanner.nextLine();
    //    System.out.println("输入为：" + a);
    // 9*9 乘法表
    for (int i = 1; i < 10; i++) {
      for (int m = 1; m < i; m++) {
        System.out.print("\t" + "    ");
      }
      for (int j = i; j < 10; j++) {
        System.out.print(i + "*" + j + "=" + i * j + "\t");
      }
      System.out.print("\n");
    }
    int[] numbers = new int[8];

    System.out.println(numbers[5]);
    numbers[5] = 99;
    System.out.println(numbers[5]);
  }
}

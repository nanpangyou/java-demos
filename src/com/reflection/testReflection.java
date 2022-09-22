package com.reflection;

public class testReflection {
  public static void main(String[] args) throws ClassNotFoundException {
    //

    User user = new User();
    Class class2 = user.getClass();

    Class class3 = User.class;
    System.out.println(class3);

    // forName 可以加载类
    Class class1 = Class.forName("com.reflection.User");
    System.out.println(class1);
    System.out.println(class2);

    Class c2 = Class.forName("com.reflection.User");
    Class c3 = Class.forName("com.reflection.User");
    Class c4 = Class.forName("com.reflection.User");

    // 一个类在内存中只有一个class对象
    // 一个类被加载后，类的整个结构都会被封装在Class对象中
    System.out.println(c2 == c3);
    System.out.println(c4 == c3);
  }
}

class User {
  private String name;
  private int age;
  private int id;

  public User(String name, int age, int id) {
    this.age = age;
    this.id = id;
    this.name = name;
  }

  public User() {}

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public String toString() {
    return "User{" + "name='" + name + '\'' + ", age=" + age + ", id=" + id + '}';
  }
}

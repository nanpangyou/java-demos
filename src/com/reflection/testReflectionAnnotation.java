package com.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class testReflectionAnnotation {
  // 反射操作注解
  public static void main(String[] args) throws ClassNotFoundException {
    // 获取类的注解
    Class c2 = Class.forName("com.reflection.Student");
    Annotation[] annotations = c2.getAnnotations();
    for (Annotation annotation : annotations) {
      System.out.println(annotation);
    }
    myAnnotation x = (myAnnotation) c2.getAnnotation(myAnnotation.class);
    String value = x.value();
    System.out.println(value);

    System.out.println("============================================");

    // 获取属性的注解
    Field[] declaredFields = c2.getDeclaredFields();
    for (Field declaredField : declaredFields) {
      Annotation[] annotations1 = declaredField.getAnnotations();
      for (Annotation annotation : annotations1) {
        System.out.println(annotation);
      }
      attr annotation = declaredField.getAnnotation(attr.class);
      System.out.println(
          annotation.column_name() + "," + annotation.type() + "," + annotation.length());
    }
  }
}

@myAnnotation("db_student")
class Student {
  @attr(column_name = "id", type = "int", length = 10)
  private int id;

  @attr(column_name = "age", type = "int", length = 30)
  private int age;

  @attr(column_name = "name", type = "varchar", length = 20)
  private String name;

  public Student() {}

  public Student(int id, int age, String name) {
    this.id = id;
    this.age = age;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" + "id=" + id + ", age=" + age + ", name='" + name + '\'' + '}';
  }
}

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface myAnnotation {
  String value();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface attr {
  String column_name();

  String type();

  int length();
}

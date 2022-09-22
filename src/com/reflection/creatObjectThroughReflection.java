package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class creatObjectThroughReflection {
  // 通过反射，动态创建对象
  public static void main(String[] args)
      throws ClassNotFoundException, InstantiationException, IllegalAccessException,
          NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
    // 获得class对象
    Class c1 = Class.forName("com.reflection.User");
    User user = (User) c1.newInstance();
    System.out.println(user);

    // 通过反射调用方法
    Class c2 = Class.forName("com.reflection.User");
    User user2 = (User) c2.newInstance();
    Method setName = c2.getDeclaredMethod("setName", String.class);
    setName.invoke(user2, "xxx");
    System.out.println(user2);

    // 跨过privite检查
    Field name = c2.getDeclaredField("name");
    name.setAccessible(true);
  }
}

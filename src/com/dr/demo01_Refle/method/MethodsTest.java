package com.dr.demo01_Refle.method;

import com.dr.demo01_Refle.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodsTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Class<Person> personClass = (Class<Person>) Class.forName("com.dr.demo01_Refle.Person");


        Method[] methods = personClass.getMethods();

        for (Method m : methods) {
            System.out.print(m.getName() + ",\n");
        }

        System.out.print("--------------获取本类自己的方法------------------------\n");
        Method[] methods1 = personClass.getDeclaredMethods();

        for (Method m : methods1) {
            System.out.print(m.getName() + ",\n");
        }

        //
        System.out.print("--------------指定方法------------------------\n");

        Person person = personClass.newInstance();
        Method method = personClass.getMethod("setName", String.class);
        method.invoke(person, "张三");
        Method method1 = personClass.getMethod("getName");
        String name = (String) method1.invoke(person);
        System.out.println(name);

        System.out.print("--------------指定私有方法------------------------\n");
        Method method2 = personClass.getDeclaredMethod("priveteMethod");
        method2.setAccessible(true);
        method2.invoke(person);

        //
        Method method3 = personClass.getDeclaredMethod("toString");
        method3.invoke(person);

        int s = 1 << 30;
        System.out.println(s);


        int h = person.hashCode();
        int hash=h ^ (h >> 16);

        System.out.println(hash);


//        ClassLoader parentClassLoader=person.getClass().getClassLoader().getParent();
//        Object o=parentClassLoader.loadClass(Object.class.getName());

//        Method method=personClass.getMethod("wait",long.class,int.class);
//        method.setAccessible(true);
//        method.invoke(person,12,12);

    }
}

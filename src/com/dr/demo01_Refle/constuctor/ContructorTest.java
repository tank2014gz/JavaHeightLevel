package com.dr.demo01_Refle.constuctor;

import com.dr.demo01_Refle.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ContructorTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Person> personClass = (Class<Person>) Class.forName("com.dr.demo01_Refle.Person");

        Constructor<Person>[] constructors = (Constructor<Person>[]) personClass.getConstructors();
        for (Constructor<Person> contruct : constructors) {
            System.out.println(contruct);
        }


        //获取指;构造方法
        Constructor<Person> personConstructor = personClass.getConstructor(new Class[]{String.class, int.class});
        System.out.println(personConstructor);
        Person person = personConstructor.newInstance("Android", 10);
        System.out.println(person.toString());


        //
        Constructor<Person> personConstructor1 = personClass.getConstructor();
        Person person1 = personConstructor1.newInstance();
        System.out.println(person1);

    }
}

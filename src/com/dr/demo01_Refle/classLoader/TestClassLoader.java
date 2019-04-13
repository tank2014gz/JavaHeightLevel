package com.dr.demo01_Refle.classLoader;

public class TestClassLoader {

    public static void main(String[] args) throws ClassNotFoundException {
        //获取一个系统的类加载器,我们的class文件就是由系统加载器加载的
        ClassLoader classLoader=ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        //获取加载器的父类加载器(扩展类加载器，可以获取）
        ClassLoader parentClassLoader=classLoader.getParent();
        System.out.println(parentClassLoader);
        //获取扩展类加载器的父类，（引导类加载器，不可获取）
        ClassLoader bootLoader=parentClassLoader.getParent();
        System.out.println(bootLoader);


        classLoader=Class.forName("com.dr.demo01_Refle.classLoader.TestClassLoader").getClassLoader();
        System.out.println(classLoader);


        classLoader=Object.class.getClassLoader();
        System.out.println(classLoader);
    }
}

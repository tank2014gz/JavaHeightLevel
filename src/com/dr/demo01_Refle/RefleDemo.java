package com.dr.demo01_Refle;

public class RefleDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Servant servant = new Servant();
        servant.service("东燃");


        Class servantClass = Servant.class;
        System.out.println(servantClass);
        Class servantClass1 = servant.getClass();
        System.out.println(servantClass1);
        Class servantClass2 = Class.forName("com.dr.demo01_Refle.Servant");
        System.out.println(servantClass2);


        Class catClass = TigerCat.class;
        Cat cat = (TigerCat) catClass.newInstance();
        cat.cactchMic();

        System.out.println(Integer.class.toGenericString());
        System.out.println(int.class.toGenericString());


    }
}

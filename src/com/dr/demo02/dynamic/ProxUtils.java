package com.dr.demo02.dynamic;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProxUtils {

    public static void getneraClassFile(Class clazz,String proxyName){
        byte[] proxyClassFile= ProxyGenerator.generateProxyClass(proxyName,new Class[]{clazz});
        String path=clazz.getResource(".").getPath();
        System.out.println(path);

        FileOutputStream outputStream=null;
        try {
            outputStream=new FileOutputStream(path+proxyName+".class");
            outputStream.write(proxyClassFile);
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

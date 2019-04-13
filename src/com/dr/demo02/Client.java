package com.dr.demo02;

public class Client {

    public static void main(String[] args) {
        //静态代理
        ManToolsFactory factory = new AFactory();
        ZhangSan zhangSan = new ZhangSan(factory);
        zhangSan.saleManTools("12");

        WomenFactory factory1 = new BFactory();
        LiSi liSi = new LiSi(factory1);
        liSi.saleWomenTools("18");

        //动态代理
    }
}

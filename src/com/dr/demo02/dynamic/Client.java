package com.dr.demo02.dynamic;

import com.dr.demo02.AFactory;
import com.dr.demo02.BFactory;
import com.dr.demo02.ManToolsFactory;
import com.dr.demo02.WomenFactory;

public class Client {

    public static void main(String[] args) {
        ManToolsFactory factory = new AFactory();
        MarkCompany company = new MarkCompany(factory);
        ManToolsFactory employee = (ManToolsFactory) company.getProxyInstance();
        employee.saleManTools("30");

        WomenFactory factory1 = new BFactory();
        company = new MarkCompany(factory1);
        WomenFactory employee2 = (WomenFactory) company.getProxyInstance();
        employee2.saleWomenTools("20");


        ProxUtils.getneraClassFile(factory.getClass(),employee.getClass().getSimpleName());
        ProxUtils.getneraClassFile(factory1.getClass(),employee2.getClass().getSimpleName());
    }
}

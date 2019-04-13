package com.dr.demo02;

public class BFactory implements WomenFactory {
    @Override
    public void saleWomenTools(String length) {
        System.out.println("--------定制-" + length + "cm的boy friend---");
    }
}

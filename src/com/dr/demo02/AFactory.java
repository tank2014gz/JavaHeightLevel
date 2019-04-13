package com.dr.demo02;

public class AFactory implements ManToolsFactory {

    @Override
    public void saleManTools(String size) {
        System.out.println("-----定制 " + size + "号大小的 gileFrirend-----");
    }
}

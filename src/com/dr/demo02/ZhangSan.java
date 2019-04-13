package com.dr.demo02;

public class ZhangSan implements ManToolsFactory, WomenFactory {

    ManToolsFactory aFactory;

    WomenFactory bFactory;


    public ZhangSan(ManToolsFactory factory) {
        this.aFactory = factory;
    }

    /**
     *
     */
    private void doSthAfter() {
        System.out.println("精美包装，快递一条龙服务。。。。");
    }

    /**
     *
     */
    private void doSthBefor() {
        System.out.println("根据需求，进行市场调研和产品分析。。。。");
    }


    @Override
    public void saleManTools(String size) {

        doSthBefor();
        aFactory.saleManTools(size);
        doSthAfter();

    }

    @Override
    public void saleWomenTools(String length) {
        doSthBefor();
        bFactory.saleWomenTools(length);
        doSthAfter();
    }
}

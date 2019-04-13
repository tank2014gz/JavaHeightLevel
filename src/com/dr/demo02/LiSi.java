package com.dr.demo02;

public class LiSi implements WomenFactory {

    private WomenFactory womenFactory;

    public LiSi(WomenFactory womenFactory) {
        this.womenFactory = womenFactory;
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
    public void saleWomenTools(String length) {
        doSthBefor();
        womenFactory.saleWomenTools(length);
        doSthAfter();
    }

}

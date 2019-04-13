package com.dr.demo03;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class MainCount {


    public static void main(String[] args) {

/**
 * 虚拟机线程管理接口
 */
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] dumpAllThreads = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo info : dumpAllThreads) {
            System.out.println("[" + info.getThreadId() + "]" + info.getThreadName() + ":");
            System.out.println(info.toString());
        }
    }
}

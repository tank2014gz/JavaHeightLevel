package com.dr.demo03.end;

public class EndThread {

    static class UserThread extends Thread {
        @Override
        public void run() {
            super.run();

            while (!isInterrupted()) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println("线程发生异常------");
                    interrupt();
                    e.printStackTrace();
                }

                System.out.println("线程正在运行。。。。");


            }
        }
    }


    public static void main(String[] args) {

        UserThread thread = new UserThread();
        thread.start();
        try {
            Thread.sleep(300);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

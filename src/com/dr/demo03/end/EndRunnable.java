package com.dr.demo03.end;

public class EndRunnable {

    static class UseRunnale implements Runnable {

        @Override
        public void run() {
            Thread currentThread = Thread.currentThread();
            while (!currentThread.isInterrupted()) {
                System.out.println("正在运行runnable任务");
            }
        }
    }


    public static void main(String[] args) {
        Thread thread = new Thread(new UseRunnale());
        thread.start();
        try {
            Thread.sleep(300);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

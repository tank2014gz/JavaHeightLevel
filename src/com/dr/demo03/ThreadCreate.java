package com.dr.demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadCreate {

    /**
     * @param args
     */

    static class UseThread extends Thread {


        public UseThread() {
        }

        public UseThread(Runnable target) {
            super(target);

        }



        @Override
        public void run() {
            super.run();
            System.out.println("run UseThread extends Thread createThread");
        }
    }

    static class UseRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("run UseRunnable implements Runnable crateTask");
        }
    }


    static class UserCallable implements Callable {

        @Override
        public String call() throws Exception {

            System.out.println("run UserCallable implements Callable createThread");
            return "result is success call back";
        }
    }


    public static void main(String[] args) {
        UseThread thread = new UseThread();
        thread.start();

        /**
         *
         */
        try {
            Constructor<? extends UseThread> declaredConstructor = thread.getClass().getDeclaredConstructor(new Class[]{Runnable.class});
            UseThread thread1 = declaredConstructor.newInstance(new UseRunnable());
            thread1.start();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        UserCallable callable = new UserCallable();
        FutureTask<String> future = new FutureTask(callable);
        UseThread thread3 = new UseThread(future);
        thread3.start();
        try {
            String callBack=future.get();
            System.out.println(callBack);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

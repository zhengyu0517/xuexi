package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ThreadTest {
    public  static int users=100;//同时模拟并发访问用户数量
    public static int downTotal = 50000;
    public static int conut =0; //计算器

    public static void main(String[] args) throws InterruptedException {
        //
        ExecutorService executorService = Executors.newCachedThreadPool();
        //信号量
        final Semaphore semaphore = new Semaphore(users);
        for(int i =0;i<downTotal;i++){
            executorService.execute(()->{
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                }catch (Exception e){
                    e.printStackTrace();
                }
            });
        }
        Thread.sleep(3000);
        executorService.shutdown();
        System.out.println(conut);

    }

    private static void add() {
        conut++;
    }
}



package my;

/**
 * Created by lanouhn on 17/7/18.
 */
public class MyThread  extends Thread {
    /*
    *Thread是线程类，我们继承了它
    * MyThread就是一个线程
    * 当线程开启时，就会执行线程的run方法
    * 当线程的run方法执行结束后，线程就停止了
    * 但线程对象还存在于内存中，等待GC回收
    */

    //@Override是一个注解
    //用来检测run方法是否是从弗雷或超累中继承或实现过来的
    @Override
    public void run() {
        super.run();
        //当线程执行sleep时，会睡一秒
        //一秒后线程继续执行
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}

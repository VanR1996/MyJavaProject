package wait;

/**
 * Created by lanouhn on 17/7/19.
 */
public class WaitDemo {
    public void showWait(){
        synchronized (WaitDemo.class){
            //wait
            //wait方法是Object的方法，也就是所有继承Object子类都有这个方法
            //这也变相证明了，锁对象可以是任何一个对象
            //当锁对象waitDemo.class调用wait方法后
            //会释放锁资源，进入阻塞状态
            //只有当同一个对象（也就是WaitDemo.class)，调用唤醒方法，这个线程才会出阻塞状态
            //进入就绪状态，有序状态不是运行时而是有能力抢夺执行权了

            try {
                System.out.println("我要wait了!");
                WaitDemo.class.wait();
                System.out.println("我ok了，gogogo！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void showSleep(){
        //sleep会是当前线程进入到阻塞状态
        //一段时间后继续执行
        //需要注意的是，sleep并不会释放锁资源
        //这是它俩最大的区别
        //还有就是wait是锁对象的调用
        //而sleep是Thread的静态方法
        synchronized (WaitDemo.class){
            try {
                System.out.println("我要睡觉了！");
                Thread.sleep(3000);
                System.out.println("实在是睡不着啊，热");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //死锁是什么 一个人去面试 面试后 面试官给他打电话 我们觉得你各方面都很符合要求
    //你给我解释一下什么是死锁吧 解释完了我就给你发offer 这个人回答了一句你给我发Offer我就给你解释死锁
    //当一个锁对象被线程A持有 线程A在运行过程中 又需要另一个锁对象B
    //而锁对象B被线程B持有 线程B在运行过程中 又需要锁对象A
    //这时候 两个线程都在等待对方释放锁资源
    //这个状态就是死锁

    public void showNotify(){
        synchronized (WaitDemo.class){
            //notifyALL会唤醒上多有被WaitDemo.class这个锁对象wait了的线程
            WaitDemo.class.notifyAll();
        }
    }
}

import excep.DataThread;
import life.FirstThread;
import life.SecondThread;
import my.MyRunnable;
import my.MyThread;
import syn.SynDemo;
import wait.DeadLock;
import wait.WaitDemo;

/**
 * Created by lanouhn on 17/7/18.
 */
public class Main {
    public static void main(String[] args) {
        //Summary();
        //showThread();

        //第一步
        //new Thread()
        //showCreate();
        //showRunnable();
        //showLife();
        //showDataException();
        //showSync();
        //showDeference();

        DeadLock deadLock = new DeadLock();

        new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.p1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.p2();
            }
        }).start();

        //自定义类，实现Runnable接口
        /*
        *命名规范
        * 大驼峰：PlayGame
        * 小驼峰：playGame
        * 类名要使用大驼峰
        * 方法名和对象名要使用小驼峰
        * 不能使用数字开头，不能汉字命名
        */

    }

    private static void showDeference() {
        WaitDemo waitDemo = new WaitDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                waitDemo.showSleep();
            }
        }).start();

        try {
            //写这个代码，是为了保证上面定义的线程先执行
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                waitDemo.showWait();
            }
        }).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                waitDemo.showNotify();
            }
        }).start();
    }

    private static void showSync() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                    SynDemo.add();

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SynDemo.del();

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SynDemo.add();

            }
        }).start();
    }

    private static void showDataException() {
        DataThread dt1 = new DataThread();
        DataThread dt2 = new DataThread();
        DataThread dt3 = new DataThread();
        DataThread dt4 = new DataThread();

        dt1.start();
        dt2.start();
        dt3.start();
        dt4.start();
    }

    private static void showLife() {
        /*
        *多线程能够提高效率，比如做A事的同时，也可以去做B事，即使做A事的时间很长，也不会耽误做B事。
        *
        * 但是如果多线程涉及到了同一信息
        *
        *
         */

        FirstThread ft = new FirstThread();
        SecondThread st = new SecondThread(ft);
        ft.start();
        st.start();

        System.out.println("*******main方法执行完了*******");
    }

    private static void showCreate() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是匿名内部类");
            }
        }).start();

        new Thread() {
            @Override
            public void run() {
                super.run();
                System.out.println("我也是匿名内部类");
            }
        }.start();
    }

    private static void showRunnable() {
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }

    private static void showThread() {
        //自定义继承Thread类
        MyThread myThread = new MyThread();
        //执行start方法，才是开启这个线程
        //那么这个线程才会与主线程抢占，这才是多线程
        //如果执行run方法，只是对象使用方法而已
        //与我们刚刚写的dog.catchMouse没有什么区别
        //也不会开启多线程操作，依然是在主线程执行的
        myThread.start();
        //myThread.run();

        System.out.println(Thread.currentThread().getName());
    }

    private static void Summary() {
        System.out.println("以下是概述");
        //进程是一个独立的程序单元，比如我们玩的游戏，一个游戏就可以当做一个进程
        //线程石金成中一个更小的可执行单元，进程占据一块内存，内存中有它独立使用的数据
        //线程是运行在进程中的，多个线程之间，可以共享进程中的数据
        //线程是抢占式运行的，哪个线程抢到了执行权，那么其他线程需要等该线程释放执行权才能执行
        //在java中使用线程，可以继承类Thread，可以实现接口Runnable
    }
}

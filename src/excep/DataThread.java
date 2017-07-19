package excep;

/**
 * Created by lanouhn on 17/7/18.
 */
public class DataThread  extends  Thread{
    /*
    *原子性操作
    * int n = 1;
    * n = n -1;不是，这条语句，实际上进行了三次操作：
    * 1.在内存中去除n的值
    * 2.将取出来的值（j）与1进行减法操作
    * 3.将得到的结果赋值给n
    *
    *
    * 多线程操作的时候，你可能当前线程进行到第二步后，就被抢走了执行权
    * 其他线程取得n值 的时候取走的值还是第一步的值，
    * 这样就实际进行了两次减法操作，但是n只减掉了1
    * 这就是为什么会有见不到0的现象发生了。
    *
    *
    * 关于数据乱序
    * 线程A执行输出语句时，可能从内存中获得了当前num的值，但是在输出的那一刹那，被抢走了执行权
    * 等线程A抢回来的时候，其他的线程已经输出，所以A输出的值与顺序不同
     */

    //static是静态变量
    //num是一个变量，就是类变量
    //只要是DataThread的对像，都会共享num
    //注意！是共享！不是每个对象都有一个num为10000
    //如果有一个DataThread对象，将num改成了1000
    //那么其他DataThread对象，使用num时，就是1000了
    private static int num = 10000;

    @Override
    public void run() {
        super.run();

        for (int i = 0; i <2500 ; i++) {
            num--;
            System.out.println(getName()+"------"+num);
        }
    }
}

package syn;

import sta.Student;

/**
 * Created by lanouhn on 17/7/19.
 */
public class CodeDemo {
    /*
    *很么是同步，什么是异步？
    *
    *
    *
     */
    private static Student stu = new Student();

    private static  int count = 0;

    public  void  add(){
        //同步关键字，修饰代码块
        //同步只会影响代码块中的内容
        //(stu)是锁
        //锁只是一个抽象概念，实际上就是一个对象
        //这个对象可以使任意测也可以是固定的
        //比如这里可以不用stu
        //只要在当前类中就可以使用的对象
        //都可以写在这个括号中充当对象
        //比如：this.CodeDemo().class等
        //CodeDemo().class是类对象
        synchronized (stu) {
            count++;
        }
    }

}

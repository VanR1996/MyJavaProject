package life;

import javax.print.attribute.standard.RequestingUserName;

/**
 * Created by lanouhn on 17/7/18.
 */
public class FirstThread  extends Thread{
    @Override
    public void run() {
        super.run();
        for (int j = 0; j < 1000; j++) {
            System.out.println("FFFFFFFF-----"+getState());
        }
    }
}

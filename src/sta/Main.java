package sta;

/**
 * Created by lanouhn on 17/7/19.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("sta.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

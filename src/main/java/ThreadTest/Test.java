package ThreadTest;

/**
 * Created by daynew on 2019/5/16.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.start();
        mt.join();
        System.out.println(101);
    }
}

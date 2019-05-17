package ThreadTest;

/**
 * Created by daynew on 2019/5/16.
 */
public class MyThread extends Thread{
    public int x = 0;
    public void run(){
        for(int i = 0;i < 100;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(x++);
        }
    }
}

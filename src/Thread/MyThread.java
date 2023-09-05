package Thread;

public class MyThread extends Thread{

    @Override
    public void run() {
        int x=0;
        while (true){
            System.out.println(x);
            x++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

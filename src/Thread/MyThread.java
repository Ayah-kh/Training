package Thread;

public class MyThread extends Thread{

    @Override
    public void run() {
        display();
    }

    synchronized static void display(){
        int x=0;
        while (x<10){
            System.out.println("x = " + x);
            x++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

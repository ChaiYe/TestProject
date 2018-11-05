package fileTest.线程;

public class TestRunnerable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        for (int i = 0; i <1000 ; i++) {
            System.out.println("dddd");
        }
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("cccccccc");
        }
    }
}
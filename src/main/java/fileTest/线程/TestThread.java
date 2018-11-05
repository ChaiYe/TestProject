package fileTest.线程;

public class TestThread {

    public static void main(String[] args) {
        Mythread mythread=new Mythread();
        mythread.start();

        for (int i=0;i<=1000;i++){
            System.out.println("bb");
        }
    }


}

class Mythread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println("aaaaaaa");
        }
    }
}
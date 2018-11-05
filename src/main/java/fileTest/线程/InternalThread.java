package fileTest.线程;

/*内名内部类启用线程*/
public class InternalThread {

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                for (int i = 0; i <1000 ; i++) {
                    System.out.println("bb");
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    System.out.println("wowowowow");
                }
            }
        }).start();
    }

}

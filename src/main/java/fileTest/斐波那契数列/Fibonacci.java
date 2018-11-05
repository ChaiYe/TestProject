package fileTest.斐波那契数列;

public class Fibonacci {

    public static void main(String[] args) {
        int arr[] =new int[9];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i <arr.length ; i++) {
            arr[i]=arr[i-2]+arr[i-1];
        }
    }

    public static int fun(int num){
        if(num==1||num==2){
            return 1;
        }else{
            return fun(num-2)+fun(num-1);
        }
    }
}

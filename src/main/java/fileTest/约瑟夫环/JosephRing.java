package fileTest.约瑟夫环;

import java.util.ArrayList;

public class JosephRing {

    public static void main(String[] args) {
        System.out.println(getLuckNum(7));
    }

    public static int getLuckNum(int num){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <=num ; i++) {
            list.add(i);
        }
        int count=1;
        for (int i = 0; list.size()!=1 ; i++) {
            if(i==list.size()){
                i=0;
            }
            if(count%3==0){
                list.remove(i);
                i--;
            }
            count++;
        }
        return list.get(0);
    }

}

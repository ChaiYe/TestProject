package fileTest.操作文件夹;



import java.io.File;
import java.util.Scanner;

public class OperateFile {

    //从键盘中接收一个文件夹路径
    //创建键盘录入对象
    //将键盘录入的结果存储并封装成File对象
    //对File对象判断
    //将文件夹路径对象返回
    public static void main(String[] args) {
       File dir=getDir();
        System.out.println(getDirLength(dir));
    }

    /*获取文件夹*/
    public static File getDir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件夹");
        while (true) {
            String line=scanner.nextLine();
            //使用该构造方法即可读取本地文件夹
            File dir=new File(line);
            if(!dir.exists()){
                System.out.println("输入文件夹不存在");
            }
            else if(dir.isFile()){
                System.out.println("这不是文件夹");
            }else{
                return dir;
            }
        }

    }

    /*获取文件夹大小*/
    public static long getDirLength(File dir){
        long length=0;

        File[] subFiles=dir.listFiles();

        for (File subFile: subFiles) {
            if(subFile.isFile()){
                length=length+subFile.length();
            }
            else{
                //如果不是文件是文件夹则递归调用getDirLength
                length+=getDirLength(subFile);
            }
        }

        return length;
    }
}

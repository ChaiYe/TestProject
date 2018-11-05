package fileTest.复制文件夹;

import fileTest.操作文件夹.OperateFile;

import java.io.*;

public class CopyFile {


    /**
     * 从一个文件夹中将他所有内容拷贝到另一个文件夹中
     *分析：
     * 在目标文件夹中创建员文件夹
     * 获取源文件夹所有的文件和文件夹，存储在File数组中
     * 遍历数组
     * 如果文件就是用io流读写
     * 如果是文件就递归调用
     */
    public static void main(String[] args) throws IOException {

        File file= OperateFile.getDir();
        File dest=OperateFile.getDir();
        copyFile(file,dest);

    }

    public static void copyFile(File file,File dest) throws IOException {
        File newDir= new File(dest,file.getName());
        newDir.mkdir();
        File[] files = file.listFiles();
        for (File subfile:files) {
            if(subfile.isFile()){
                /*创建读操作流*/
                BufferedInputStream bis=new BufferedInputStream(new FileInputStream(subfile));
                /*创造写操作流*/
                BufferedOutputStream  bos=new BufferedOutputStream(new FileOutputStream(new File(newDir,subfile.getName())));

                /*操作流数据操作*/
                int b=0;
                while ((b=bis.read())!=-1){
                    bos.write(b);
                }

                /*关闭流*/
                bis.close();
                bos.close();

            }
            else{
                subfile.mkdir();
                copyFile(subfile,newDir);
            }
        }
    }
}

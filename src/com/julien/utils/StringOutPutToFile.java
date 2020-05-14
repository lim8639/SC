package com.julien.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StringOutPutToFile {
    public static String fileREAD(String path){
        try {
            FileInputStream fis=new FileInputStream(path);
            BufferedInputStream bis=new BufferedInputStream(fis);
            StringBuilder content= new StringBuilder();
            //自定义缓冲区
            byte[] buffer=new byte[10240];
            int flag=0;
            while((flag=bis.read(buffer))!=-1){
                content.append(new String(buffer, 0, flag));
            }
            return content.toString();
            //关闭的时候只需要关闭最外层的流就行了
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }

    public static void  fileWRITE(String path,String str){
        System.out.println("file input");
        try {
            FileOutputStream fos=new FileOutputStream(path);
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            bos.write(str.getBytes(),0, str.getBytes().length);
            System.out.println("file input over");
            bos.flush();
            bos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
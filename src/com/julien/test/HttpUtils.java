package com.julien.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class HttpUtils {

    private static String URL_PATH="http://4.92.216.98:8080/time/textServlet?action=saveText";
    private static HttpURLConnection httpURLConnection = null;
    public HttpUtils(){

    }

    public static String shuchu(){
        InputStream inputStream = getInputStream();
        if (inputStream==null){
            return "false";
        }
        String result;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
            result = "";
            String line = "";
            try {
                while((line = reader.readLine())!= null){
                    result = result+ line;
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("result = " + result);
            return result;
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            return "false";
        }
    }
    /**
     * 获取服务端的数据，以InputStream返回
     * @return
     */
    public static InputStream getInputStream(){
        InputStream inputStream = null;

        try {
            URL url = new URL(URL_PATH);
            System.out.println(url);
            if(url != null){
                try {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    //超时时间
                    httpURLConnection.setConnectTimeout(3000);
                    //表示设置本次http请求使用GET方式
                    httpURLConnection.setRequestMethod("GET");
                    int responsecode = httpURLConnection.getResponseCode();

                    if(responsecode == HttpURLConnection.HTTP_OK){
                        inputStream = httpURLConnection.getInputStream();
                    }else {
                        return null;
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return inputStream;
    }
    public static void main(String[] args){
        //保存文件到本地
        //saveImageToDisk();
        shuchu();
    }
}
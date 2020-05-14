package com.julien.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class HttpUtils {

    private static String URL_PATH="http://www.baidu.com";
    private static HttpURLConnection httpURLConnection = null;
    public HttpUtils(){

    }

    public static void shuchu(){
        InputStream inputStream = getInputStream();
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
            System.out.println(result);
            httpURLConnection.disconnect();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
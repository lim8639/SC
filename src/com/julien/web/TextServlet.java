package com.julien.web;

import com.google.gson.Gson;
import com.julien.pojo.MyText;
import com.julien.pojo.User;
import com.julien.utils.StringOutPutToFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TextServlet extends BaseSevlet{
    Gson gson = new Gson();
    List<MyText>list = new ArrayList<>();
    protected void getText(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String json = StringOutPutToFile.fileREAD("D://hello.txt");
        System.out.println(json);
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }

    protected void saveText(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String text = req.getParameter("text");
      String username = req.getParameter("username");
      String time = sdf.format(new Date());
      list.add(new MyText(time,text,username));
        String stringJSON =  gson.toJson(list);
        StringOutPutToFile.fileWRITE("D://hello.txt",stringJSON);
      resp.getWriter().write("successful");
    }
}

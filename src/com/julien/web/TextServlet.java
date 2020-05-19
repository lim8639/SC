package com.julien.web;

import com.google.gson.Gson;
import com.julien.dao.TextDao;
import com.julien.dao.daoimpl.TextDaoImpl;
import com.julien.pojo.MyText;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class TextServlet extends BaseSevlet{
    private final TextDao textDao = new TextDaoImpl();
    Gson gson = new Gson();
    String str = null;
    protected void getText(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        String str =gson.toJson(textDao.queryListText());
        System.out.println("str = " + str);
        resp.getWriter().write(str);
    }
    protected void showText(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       getText(req,resp);
    }
    protected void saveText(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { TextDaoImpl textDao = new TextDaoImpl();
        req.setCharacterEncoding("UTF-8");

      SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String text = req.getParameter("text");
      String username = req.getParameter("username");
      String time = sdf.format(new Date());
        System.out.println(new MyText(time,text,username).toString());
        textDao.saveText(new MyText(time,text,username));
      resp.getWriter().write("successful");

    }
}

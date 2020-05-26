package com.julien.web;

import com.google.gson.Gson;
import com.julien.dao.TextDao;
import com.julien.pojo.MyText;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TextServlet extends BaseSevlet{
private TextDao textDao = new TextDao();
    protected void getText(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String json = textDao.queryText();
        System.out.println("json = " + json);
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }

  protected void saveText(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String text = req.getParameter("text");
       String username = req.getParameter("username");
        String time = sdf.format(new Date());
        textDao.saveText(username,text,time);
       resp.getWriter().write("successful");
  }
}

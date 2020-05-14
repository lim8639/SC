package web;

import com.google.gson.Gson;
import pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TextServlet extends BaseSevlet{
    Gson gson = new Gson();
    protected void getText(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String json = gson.toJson(new User("admin","admin"));
        System.out.println("json = " + json);

        resp.getWriter().write(json);
    }

    protected void saveText(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      String text = req.getParameter("text");
      String username = req.getParameter("username");
        System.out.println("username = " + username);
        System.out.println("text = " + text);
        resp.getWriter().write("successful");
    }
}

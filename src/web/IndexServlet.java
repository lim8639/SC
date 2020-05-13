package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class IndexServlet extends BaseSevlet{

    protected void toIndex(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("全都跳回首页");


        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
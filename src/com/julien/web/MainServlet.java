package com.julien.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author julien
 * @email 863978160@qq.com
 * @date 2020/5/10 11:04
 * @introduce MainServlet
 */

public class MainServlet extends BaseSevlet {

    protected void show(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("welcome back!! monster!!");
        req.getRequestDispatcher("/main/hello.html").forward(req,resp);
    }
    protected void deletePlan(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    protected void addPlan(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}

package com.julien.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author julien
 * @email 863978160@qq.com
 * @date 2020/5/9 8:48
 * @introduce LoginServlet
 */

public class LoginServlet extends BaseSevlet{

    /**
     * http://localhost:8080/time/LoginServlet?username=admin&passsword=admin
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println( "+++++++++++++++++++++++++++++++++++ ");
        //判断登录
        if ("admin".equals(username)&&("admin".equals(password))){
            req.getSession().setAttribute("username",username);
            resp.getWriter().write("1");
            System.out.println("登录成功，过滤器已经放行");
            req.getRequestDispatcher("/main/hello.html").forward(req,resp);
        }else{
            System.out.println("登陆失败");
            resp.getWriter().write("0");
        }
    }
}

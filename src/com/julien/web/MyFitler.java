package com.julien.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author julien
 * @email 863978160@qq.com
 * @date 2020/5/9 10:02
 * @introduce MyFitler
 */

public class MyFitler implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpSession session = httpServletRequest.getSession();
        Object user = session.getAttribute("username");
        if (user==null){
            System.out.println(" now of user:" + user);
            //跳转登录
            servletRequest.getRequestDispatcher("/login/login.html").forward(servletRequest,servletResponse);
        }else {
            System.out.println("ok ,let go");
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }
    @Override
    public void destroy() {

    }
}

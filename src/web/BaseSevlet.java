package web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
/**
 * 使用说明 :
 *    需要配置tomcat 9
 *    需要 jdk  13.02
 *
 *
 *
 */
public abstract class BaseSevlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数,子类只需要重写相关的方法即可使用
        String action = req.getParameter("action");
        System.out.println(action);

        // 反射回去，动态解析    -Dfile.encoding=UTF-8
        if(action!=null){
            try {
                Method method = this.getClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
                method.invoke(this,req,resp);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
           req.getRequestDispatcher("/index.html").forward(req,resp);
        }

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
/**
 * http://baidu.com
 */

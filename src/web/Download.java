package web;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Download extends BaseSevlet{
    protected void time(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String downloadFileName = "2.jpg";
        ServletContext servletContext = getServletContext();
        resp.setContentType(servletContext.getMimeType("/file/" + downloadFileName));
        resp.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode("ysu.jpg", StandardCharsets.UTF_8));
        InputStream resourceAsStream = servletContext.getResourceAsStream("/file/" + downloadFileName);
        OutputStream outputStream = resp.getOutputStream();
        //使用复制流操作
        IOUtils.copy(resourceAsStream, outputStream);
    }
    public void mydownload(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    }
}

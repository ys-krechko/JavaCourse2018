package homework.task30_9;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestServlet", urlPatterns = {"/serv"})
public class FirstServletNew extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static int count=0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>First Servlet</title></head>");
        out.println("<body><h1>This is First Servlet</h1>");
        out.println("<h1>Количество посещений: </h1>" + count);
        out.println("</body></head>");
        count++;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        doGet(req, resp);
    }
}

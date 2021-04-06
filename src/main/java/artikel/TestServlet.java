package artikel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    processRequest(request, response);
  }

  protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {

    resp.setContentType("text/html;charset=UTF-8");
    PrintWriter out = resp.getWriter();
    try {
      out.println("<!--DOCTYPE html-->");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Hello WOrld Servlet</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Hello World!</h1>");
      out.println("</body>");
      out.println("</html>");
    } finally {
      out.close();
    }
  }
}

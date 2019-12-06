import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.*;
@WebServlet("/Servlet11b")
public class class_9b extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
HttpSession session = request.getSession(true);
String id = session.getId();
out.println("<html>");
out.println("<body>");
out.println("<br>");
out.println("Session ID = " + id);
out.println("<br>");
out.println("Session = " + session);
out.println("<br>");
Integer val = (Integer) session.getAttribute("sessiontest.counter"); if(val == null)
val = new Integer(1); else
val = new Integer(val.intValue()+1); session.setAttribute("sessiontest.counter", val); out.println("You have visited this page " + val + " times."); out.println("</body>");
out.println("</html>");
}
}

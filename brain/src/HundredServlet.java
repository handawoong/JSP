import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

@SuppressWarnings("Serial")

public class HundredServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
	int total = 0;
	for(int cnt=1;cnt<101;cnt++)
		total += cnt;
	PrintWriter out = response.getWriter();
	out.println("<HTML>");
	out.println("<HEAD><TITLE>Hundred Servlet</TITLE></HEAD>");
	out.println("<BODY>");
	out.printf("1 + 2 + 3 + ... + 100 = %d", total);
	out.println("</BODY>");
	out.println("</HTML>");
	}
}
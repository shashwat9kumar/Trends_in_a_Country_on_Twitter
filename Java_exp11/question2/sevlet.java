package methods;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		Date d = new Date();
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("The Current Date and Time is : <br>" + d.toString());
	}

}

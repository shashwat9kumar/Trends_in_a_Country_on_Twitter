package methods;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		int k = (int) req.getAttribute("k");
		
		out.println("The sum is : "  + k);
		k = k*k;
		
		out.println("The Square of sum is : "  + k);
	}

}


package methods;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServerlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		
		ServletContext scx = req.getServletContext();
		
		String nam = scx.getInitParameter("name");
		String sid = scx.getInitParameter("sapid");

		
		PrintWriter out = res.getWriter();
		out.println("Name is : "  + nam);
		out.println("Sap ID is : "  + sid);
		 
		
		
		
	}

}

package methods;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServerlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		char op = req.getParameter("op").charAt(0);
		//int k = i+j;
		int result=0;
		if(op == '+')
		{
			result=i+j;
		}
		if(op == '-')
		{
			result=i-j;
		}
		if(op == '*')
		{
			result=i*j;
		}
		if(op == '/')
		{
			result=i/j;
		}
		if(op == '%')
		{
			result=i%j;
		}
		
		res.getWriter().println("Result is : " + result); 
		
		
	}

}

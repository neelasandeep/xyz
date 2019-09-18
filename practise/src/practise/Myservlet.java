package practise;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

import java.io.IOException;

@WebServlet("/add")
public class Myservlet extends HttpServlet{
	public void doGet(HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException{
		String name=req.getParameter("uname");
		//int id=Integer.parseInt(req.getParameter("uid"));
		PrintWriter out=res.getWriter();
		out.print("hi  "+name+"  your work done");
	}
     
     
}

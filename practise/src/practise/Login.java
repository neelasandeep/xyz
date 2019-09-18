package practise;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import practise.Dao.LoginDao;
@WebServlet("/Login")
public class Login extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
	HttpSession ses=req.getSession();
	String name=req.getParameter("uname");
	String pass=req.getParameter("uid");
	PrintWriter out=res.getWriter();
	ses.setAttribute("uname", name);
	LoginDao d=new LoginDao();
	if(d.check(name, pass)) {
		res.sendRedirect("Welcome.jsp");
	}else {
		out.println(d.check(name, pass)+" "+name+" "+pass);
		out.println("Invalid Username");
	 out.println("<a href='index.html'>"+"click for login page");
	}
}
}

package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBConnection.student_db;
import Services.student_services;

@WebServlet("/delete1")
public class Delete_Student_Servlet extends HttpServlet {
	@Override
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Pinnum = req.getParameter("Pinnum");
		
		student_services ser = new student_services(student_db.getConn());
		
		HttpSession session = req.getSession();
		
		boolean f = ser.deleteStudent(Pinnum);
		
		if(f)
		{
			session.setAttribute("SuccMsg","deleted successfully ...");
			
			System.out.println("deleted successfully ...");
			
			resp.sendRedirect("List_of_Students.jsp");
		}
		
		else
		{
            session.setAttribute("ErrorMsg","Check the connection ....");
			
			System.out.println("Check the connection ....");
			
			resp.sendRedirect("error.jsp");
		}
		
	}

}

package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBConnection.student_db;
import Models.student_models;
import Services.student_services;


@WebServlet("/update")
public class UpdateServelets extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Pinnum = req.getParameter("Pinnum");
		
		String Firstname = req.getParameter("firstName");
		
		String Lastname = req.getParameter("lastName");		
		
		String Branch = req.getParameter("Branch");
		
		String Section = req.getParameter("Section");
		
		String Fathername = req.getParameter("FatherName");
		
		String Mothername = req.getParameter("MotherName");
		
		String Email = req.getParameter("email");
		
		String Password = req.getParameter("password");

		student_models student = new student_models(Pinnum,Firstname,Lastname,Branch,Section,Fathername,Mothername,Email,Password);
		
		student_services ser = new student_services(student_db.getConn());
		
		
		boolean f = ser.updateStudent(student);
		
		if(f)
		{
			
						
			System.out.println("Successfully Updated ....");
			
			resp.sendRedirect("success.jsp");
		}
		
		else
		{
//	        session.setAttribute("ErrorMsg", "check the connection ....");
			
			System.out.println("check the connection ....");
			
			resp.sendRedirect("error.jsp");
		}
	}
       
    
    
}
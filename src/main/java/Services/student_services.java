package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Models.student_models;


public class student_services {

		
		private Connection conn;

		public student_services(Connection conn) {
			super();
			this.conn = conn;
		}
		
		
		public boolean addStudent(student_models student) {
			
			boolean f = false;
			
			try {
			
				String sql = "insert into students(Pinnum,Firstname,Lastname,Branch,Section,Fathername,Mothername,Email,Password) values (?,?,?,?,?,?,?,?,?)";
				
				PreparedStatement pst = conn.prepareStatement(sql);
				
				pst.setString(1, student.getPinnum());
				pst.setString(2, student.getFirstname());
			    pst.setString(3, student.getLastname());
			    pst.setString(4, student.getBranch());
			    pst.setString(5, student.getSection());
				pst.setString(6, student.getFathername());
				pst.setString(7, student.getMothername());
				pst.setString(8, student.getEmail());
				pst.setString(9, student.getPassword());
				
				
			    
				int i = pst.executeUpdate();
				
				if(i==1)
				{
					f = true;
				}
			}
			catch (Exception e) {
		           e.printStackTrace();
			}
			
			return f;
		}
		
		
		
		public List<student_models> getAllStudents(){
			
			List<student_models> list = new ArrayList<student_models>();
			
			
			student_models s = null;
			
			
			try {
				
				String sql = "select Pinnum,Firstname,Lastname,Branch,Section,Fathername,Mothername,Email,Password from students";
				
				PreparedStatement pst = conn.prepareStatement(sql);
				
				ResultSet rs = pst.executeQuery();
				
				
				while(rs.next())
				{
					
					s = new student_models();
					
					
					s.setPinnum(rs.getString(1));
					s.setFirstname(rs.getString(2));
					s.setLastname(rs.getString(3));
					s.setSection(rs.getString(4));
					s.setBranch(rs.getString(5));
					s.setFathername(rs.getString(6));
					s.setMothername(rs.getString(7));
					s.setEmail(rs.getString(8));
					s.setPassword(rs.getString(9));
					
					
					list.add(s);
				}
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			return list;
		}
		
	       
	        
	         public boolean updateStudent(student_models s) {

	    		boolean f = false;

	    		try {

	    			String sql = "update students set Firstname=?,Lastname=?,Branch=?,Section=?,Fathername =?,Mothername =?,Email=?,Password=? where Pinnum =?";

	    			PreparedStatement pst = conn.prepareStatement(sql);
	    			
	    			
					
					pst.setString(1, s.getFirstname());
				    pst.setString(2, s.getLastname());
				    pst.setString(3, s.getBranch());
				    pst.setString(4, s.getSection());
					pst.setString(5, s.getFathername());
					pst.setString(6, s.getMothername());
					pst.setString(7, s.getEmail());
					pst.setString(8, s.getPassword());
					pst.setString(9, s.getPinnum());
				
	    			
	    			int i = pst.executeUpdate();

	    			if (i>0) {
	    				f = true;
	    			}
	    		} catch (Exception e) {
	    			e.printStackTrace();
	    		}
	    		return f;
	    	}
	         
	         
	         public student_models getbyid(String Pinnum) {
	        	 student_models s = new student_models();
	     		try {
	     			String sql = "select Pinnum,Firstname,Lastname,Branch,Section,Fathername,Mothername,Email,Password from students where Pinnum=?";
	     			
	     			PreparedStatement pmst = conn.prepareStatement(sql);
	     			
	     			pmst.setString(1, Pinnum);
	     			
	     			ResultSet rs = pmst.executeQuery();
	     			
	     			while(rs.next()) {
	     				s.setPinnum(rs.getString(1));
	     				s.setFirstname(rs.getString(2));
						s.setLastname(rs.getString(3));
						s.setSection(rs.getString(4));
						s.setBranch(rs.getString(5));
						s.setFathername(rs.getString(6));
						s.setMothername(rs.getString(7));
						s.setEmail(rs.getString(8));
						s.setPassword(rs.getString(9));
	     			}
	     		} catch (Exception e) {
	     			e.printStackTrace();
	     		}
	     		return s;
	     	}
	     
	      
	        
	        
	      public boolean deleteStudent(String Pinnum) {
	    		
	    		boolean f = false;
	    		
	    		try {
	    			
	    			String sql ="delete from students where Pinnum = ?";
	    			
	    			PreparedStatement pmst = conn.prepareStatement(sql);
	    			
	    			pmst.setString(1, Pinnum);
	    			
	    			int i =pmst.executeUpdate();
	    			
	    			if(i>0) {
	    				
	    				f = true;
	    				
	    				
	    			}
	    		}
	    		catch (Exception e) {
	    			e.printStackTrace();
	    		}
	    		
	    		return f;
	    	}
	}



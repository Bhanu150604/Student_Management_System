package Models;

public class student_models {
	
	
	
    private String Pinnum;
	
	private String Firstname;
	
    private String Lastname; 
    
    private String Section;
	
    private String Branch;
    
    private String Fathername;
	
	private String Mothername;
	
	private String Email;
	
	private String Password;
	

	public student_models(String pinnum, String firstname, String lastname, String section, String branch,
			String fathername, String mothername, String email, String password) {
		super();
		Pinnum = pinnum;
		Firstname = firstname;
		Lastname = lastname;
		Section = section;
		Branch = branch;
		Fathername = fathername;
		Mothername = mothername;
		Email = email;
		Password = password;
	
	}


	public student_models() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getSection() {
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}
	

	public String getPinnum() {
		return Pinnum;
	}

	public void setPinnum(String pinnum) {
		Pinnum = pinnum;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
	public String getBranch() {
		return Branch;
	}


	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getFathername() {
		return Fathername;
	}

	public void setFathername(String fathername) {
		Fathername = fathername;
	}

	public String getMothername() {
		return Mothername;
	}

	public void setMothername(String mothername) {
		Mothername = mothername;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
	
	
	

	

}


public class FictionBook implements Author,Book {
	private String author_name,title,email,fname,lname;
	private int publicYear;
	
	FictionBook(String title,int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
		
	}
	public void setAuthorName(String name) {
		author_name = name;
		int space = author_name.indexOf(" ");
		fname = author_name.substring(0,space);
		lname = author_name.substring(space+1);
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	@Override
	public String getFirstName() {
		return this.fname.toUpperCase();
		
	}
	public String getLastName() {
		return this.lname.toUpperCase();
		
	}
	@Override
	public boolean checkEmail() {
		if(this.email.endsWith("@hotmail.com")) 
			return true;
		return false;		
	}
	@Override
	public String getTitle() {
		return this.title.toUpperCase();
	}
	public int totalPublicYear() {
		return 2025 - this.publicYear;
	}
	public String toString() {
		return  getTitle() +
				" write by " + getLastName().substring(0,1)+
				"." + getFirstName() +
				"(" + getEmail() + ")" + 
				"\nPublished for " + totalPublicYear() + " year(s).";		
	}
}

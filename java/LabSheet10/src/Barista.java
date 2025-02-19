
public class Barista {
	private String name;
	private char gender;


	Barista(String name,char gender){
		this.name = name;
		this.gender = gender;
	}
	Barista(){
		
	}
	public String Getname() {
		return this.name;
	}
	public String getGendername() {
		if (gender =='m'||gender =='M') {
			return "Male";
		}
		else if (gender =='f'||gender =='F') {
			return "female";
		}
		else return null;
	}
	
}

package sample;

public class Students {

	private int id;
	private String name;
	private String email;
	private int age;
	
	Students(){
		
	}
	
	Students(int id, String name, String email, int age){
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public void idSetter(int id) {
		this.id = id;
	}
	
	public int idGetter() {
		return id;
	}
	
	public void nameSetter(String name) {
		this.name = name;
	}
	
	public String nameGetter() {
		return name;
	}
	
	public void emailSetter(String email) {
		this.email = email;
	}
	
	public String emailGetter() {
		return email;
	}
	
	public void ageSetter(int age) {
		this.age = age;
	}
	
	public int ageGetter() {
		return age;
	}
}

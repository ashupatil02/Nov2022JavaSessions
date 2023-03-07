package OOP_Constuctor;

public class User {
	String name;
	int age;
	String email;
	String password;
	String phone;
	
	public User(String name, int age ,String email) {
		
		this.name = name;
		this.age = age;
		this.email = email;
		//this.password = password;
		
	}
	public User(String name, int age ,String email,String password) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;

		
	}
	

	public User(String name, int age, String email, String password, String phone) {
		
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	public static void main(String[] args) {
		User u1 = new User("ashu" ,25,"ashu02@gmail.com");
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.email);
		
		//System.out.println("ashu02@gmail.com");
		//u1.name = "Ashu";
		//u1.age = 25;
		User u2 = new User("aarush" ,25,"ashu02@gmail.com","ashupa");{
			System.out.println(u2.name);
			System.out.println(u2.age);
			System.out.println(u2.email);
			System.out.println(u2.password);
		}
		User u3 = new User("aarika" ,25,"ashu02@gmail.com","ashupa","1234");{
			System.out.println(u3.name);
			System.out.println(u3.age);
			System.out.println(u3.email);
			System.out.println(u3.password);
			System.out.println(u3.phone);

			
		}

	}

}

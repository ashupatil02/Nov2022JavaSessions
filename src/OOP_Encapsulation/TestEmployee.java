package OOP_Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name ="Ashu";
		e1.age = 25;
		e1.setSalary(22.33);
		System.out.println(e1.getSalary() + " " +e1.name + " " +e1.age);
		
		Company c1 = new Company();
		c1.setName("IBM");
		c1.setEmpcount(4);
		c1.setShareprice(2);
		System.out.println(c1.getName());
		System.out.println(c1.getEmpcount());
		System.out.println(c1.getShareprice());
		
		
		RegisterPage rg = new RegisterPage("aarush" , 8,"aarush 3031305", "06/01/2014");
		System.out.println(rg.getName());
		System.out.println(rg.getAge());
		System.out.println(rg.getAddress());
		System.out.println(rg.getDob());
		
		

	}

}

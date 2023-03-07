package Selenium;

public class Employee {
	String name;
	int age;
	String city;
	double salary;
	
	

	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.name = "Ashwini";
		e1.age = 25;
		e1.city = "LA";
		e1.salary = 33.33;
		System.out.println(e1.name+" "+e1.age+" "+e1.city+" "+e1.salary);
		Employee e2= new Employee();
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.salary);
		System.out.println(e2.city);
		Employee e3 = new Employee();
		//e3=null;
		//e3.name = "ravi";
		new Employee();
		Employee e4 = new Employee();
		e4.name = "Sanjeev";
		e4.age = 45;
		e4.city = "LA";
		e4.salary = 93.33;
		
		Employee e5 = new Employee();
		e5.name = "Aarush";
		e5.age = 15;
		e5.city = "NJ";
		e5.salary = 30.33;
		
		Employee e6 = new Employee();
		e6.name = "Aarika";
		e6.age = 20;
		e6.city = "NY";
		e6.salary = 33.33;
		System.out.println(e4.name +" " +e4.age +" " +e4.city +" "+e4.salary);
		System.out.println(e5.name +" " +e5.age +" " +e5.city +" "+e5.salary );
		System.out.println(e6.name +" " +e6.age +" " +e6.city +" "+e6.salary);
		
		e4 = e5;
		System.out.println(e4.name +" " +e4.age +" " +e4.city +" "+e4.salary);
		System.out.println(e5.name +" " +e5.age +" " +e5.city +" "+e5.salary );
		System.out.println(e6.name +" " +e6.age +" " +e6.city +" "+e6.salary);
		
		e5 = e6;
		
		System.out.println(e4.name +" " +e4.age +" " +e4.city +" "+e4.salary);
		System.out.println(e5.name +" " +e5.age +" " +e5.city +" "+e5.salary );
		System.out.println(e6.name +" " +e6.age +" " +e6.city +" "+e6.salary);
		
		e6=e4;
		System.out.println(e4.name +" " +e4.age +" " +e4.city +" "+e4.salary);
		System.out.println(e5.name +" " +e5.age +" " +e5.city +" "+e5.salary );
		System.out.println(e6.name +" " +e6.age +" " +e6.city +" "+e6.salary);
		

		
		

		
		
		

	}

}

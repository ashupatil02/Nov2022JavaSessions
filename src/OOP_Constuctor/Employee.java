package OOP_Constuctor;

public class Employee {
	
	public Employee() {
		System.out.println("default constructor");
	}
	public Employee(int a) {
		System.out.println(" 1 param constructor......" +a);
	}
	public Employee(int a, int b) {
		System.out.println(" 2 param constructor......" +(a+b));
	}
//	public Employee(int a, int b) {
//		System.out.println(" 2 param constructor......" +(a+b));
		
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(10);
		Employee e3 = new Employee(10,20);

	}

}

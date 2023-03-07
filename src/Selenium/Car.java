package Selenium;

public class Car {
	String name;
	int price;
	String color;
	static  final int wheels = 4;
	public void start() {
		
	}
	public static void speedTest() {
		System.out.println("car-- speed test");
		
	}
	

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name="BMW";
		c1.price = 80;
		c1.color ="red";
	//	c1.wheels = 4;
		
		Car c2 = new Car();
		
		c2.name="AUDI";
		c2.price = 70;
		c2.color ="grey";
	//	c1.wheels = 4;
		Car c3 = new Car();
		
		
		c3.name="HONDA";
		c3.price = 60;
		c3.color ="red";
	//	c1.wheels = 4;
		System.out.println(wheels); 
		System.out.println(c1.name+" "+ c1.price+ " " +c1.color + " "+wheels);
		System.out.println(c2.name+" "+ c2.price+ " " +c2.color + " "+Car.wheels);
		System.out.println(c2.name+" "+ c2.price+ " " +c2.color + " "+Car.wheels);
		speedTest();
		c1.start();
		

	}

}

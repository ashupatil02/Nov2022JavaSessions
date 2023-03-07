package Selenium;

public class Applicatin {
	public void test() {
		System.out.println("test 0 params");
	}
	public void test(int i) {
		System.out.println("1 params:"+i);
		
	}
	
	public void test( int i, String j){
	
		System.out.println("2 params:" +i  +j);
	}
	public void test( String i, int j){
		System.out.println("2 params:" +i  +j);
	}
	public void login() {
		
		
	}
	public void login(String un,String pwd) {
		
	}
	public void login(String un,String pwd,String role) {
		
	}
	public void login(String un,String pwd,String role,int otp) {
		
	}
	public void doPayment(String upi) {
		
	}
	public void doPayment(String upi,String ccv) {
		
	}
	public void search() {
		
	}
	public void search(String prodName) {
		System.out.println(" prod iphone 13");
		
	}
	public void search(String prodName,int price) {
		
	}
	public void search(String prodName,int price,String color) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Applicatin obj = new Applicatin(); 
   obj.test();
   obj.test(50);
   obj.test(50,"ashwini");
   obj.test("ashwini", 100);
	obj.search("iphone 13");
	}

}

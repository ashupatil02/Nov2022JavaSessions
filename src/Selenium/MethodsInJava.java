package Selenium;

public class MethodsInJava {

	public void test() {
		System.out.println("test method");
		int a = 10;
		int h = 15;
		System.out.println(a+h);
	}
	
//	//2. no input and some return:
//	//return type: int
	public int getBillAmount() {
		System.out.println("get billing amount");
		int foodBills = 100;
		int drinksBills = 50;
		int totalAmount = foodBills + drinksBills;
		return totalAmount;
	}

	public String getEmployeeName() {
		System.out.println("get emp name");
		String name = "Ashwini";
		return name;
	}
	
	public String getName() {
		System.out.println("get name");
		return "selenium";
	}
	
	public int getNumber() {
		return 100;
	}
	
	public boolean isElementExist() {
		System.out.println("check element is present");
		boolean flag = true;
		return flag;
	}
	
	public int getMarks() {
		int a = 100;
		int bonus = 5;
		int negative = 10;
		int finalMarks = a + bonus-negative;
		return finalMarks;
	}
	
	//3. some input and some return:
	//WAF: 
	//two variables: a and b
	//return sum of these two numbers:
	public int getSum(int a, int b) {
		System.out.println("sum of two numbers....");
		int sum = a+b;
		return sum;
	}
	
	//WAF:
	//input params: int, double
	//return multiplication of these two numbers
	public double getMultiplication(int x, double y) {
		System.out.println("getMultiplication");
		double mul = x * y;
		return mul;
	}
	
	public String getEmpSalaryInfo(String empName, int bonusAmount) {
		System.out.println("emp salary");
		
		return empName + ":"+ bonusAmount;
	}
	public int getStudentMarks(String studentName) {
		System.out.println("getting student marks for :" + studentName);
		if(studentName.equals("Ashu")) {
			return 100;
		}
		else if(studentName.equals("Aarush")) {
			return 80;
		}
		else if(studentName.equals("Aarika")) {
			return 90;
		}

		
		else {
			System.out.println("student not found");
			return -1;
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		
		int m1 = obj.getBillAmount();
		System.out.println(m1-10);
	
	System.out.println(obj.getBillAmount());
		
		String emp = obj.getEmployeeName();
		System.out.println(emp);
		
		if(obj.isElementExist()) {
			System.out.println("click on element");
		}
		
		int s1 = obj.getSum(10, 20);//call by value
		System.out.println(s1);
		
		int s2 = obj.getSum(40, 50);
		System.out.println(s2);
	
		double mul1 = obj.getMultiplication(10, 2.2);
		System.out.println(mul1);
		
		String empInfo = obj.getEmpSalaryInfo("Aarush", 20);
		System.out.println(empInfo);
		
		String empInfo1 = obj.getEmpSalaryInfo("Aarika", 10);
		System.out.println(empInfo1);
		
		
		//Student st1 = new Student();
		int m11 = obj.getStudentMarks("Aarush");	
		
		System.out.println(m11);
		if(m11==-1) {
			System.out.println("no need to print marksheet");
		}
	}
	}



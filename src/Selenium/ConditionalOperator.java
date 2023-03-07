package Selenium;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i=100;
      int j=20;
      int total=100;
     
      if(i==j) {
    	  System.out.println("bothe are equal");
      }
      else {
    	  System.out.println("both are not equal");
      }
      if(j<=i) {
    	  System.out.println("j is less than i");
      }
      else {
    	  System.out.println("i is less than j");
        }
     
	if(total !=100) {
		System.out.println("bye");
	}
	else {
		System.out.println("hi");
		int marks=100;
		if(marks <=100) {
			System.out.println("valid marks");
			if(marks>=90) {
				System.out.println("A grade");
				if(marks>=95) {
					System.out.println("eligible for scolorship");
					if(marks ==100) {
					System.out.println(	"fee waved off");
					
					}
					
				}
			}
			else {
				if(marks<=80) {
				System.out.println("B grade");
				}
				else {
					System.out.println("nat a valid marks");
				}
			}
		}
	}
//
	String browser="edge";
	if(browser.equals("chrome")) {
		System.out.println("chrome is launched");
	}
	else if(browser.equals("fiefox")) {
		System.out.println("ff is launched");
		
	}
	else if(browser.equals("edge")) {
		System.out.println("edge is launched");
	}
}
}
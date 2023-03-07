package Selenium;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String browser="ie";
     if(browser.equals("chrome")) {
    	 System.out.println("chrome is launched");
     }
    	 else if(browser.equals("firefox")){
    		 System.out.println("fire fox launched");
    	 }
    		 else {
    			 System.out.println("invalid browser");
    		 }
    	char ch ='z';
    	switch(ch) {
    	case'a':
    	System.out.println("vowel");
    	break;
    	case 'e':
    		System.out.println("vowel");
    		break;
    	default:
    		System.out.println("not a vowel");
    		break;
    	}
    	
    	}
     }
	


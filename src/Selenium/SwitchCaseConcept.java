package Selenium;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String browser="ie";
		switch (browser) {
		case "chrome":
			System.out.println("chrome is launched");
			
			break;
		case "firefox":
			System.out.println("ff is launched");
			break;
		case "safari":
			System.out.println("safari is launched");
			break;
		case"edge":
			System.out.println("edge is launched");
			break;
			
			
			

		default:
			System.out.println("invalid browser");
			break;
		}
	

	}

}

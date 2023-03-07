package Selenium;

public class Testing {
	public int  getStudentMarks(String studentname) {
		System.out.println("getting student marks:" + studentname);
		int marks =-1;
		if(studentname.equals("ravi")) {
			marks= 100;
			
		}
		else if(studentname.equals("ashu")){
			marks= 90;
			
		}
		else if(studentname.equals("sanju")) {
			marks= 10;
		}
		else {
			System.out.println("student not found...." +studentname);
		}
		return marks;
		
	}
	public boolean launchBrowser(String browsername) {
		System.out.println("launching browser;" +browsername);
		boolean flag=true;
		switch (browsername) {
		case "chrome":
			System.out.println("chrome is launched");
			flag =true;
			break;
		case "firefox":
			System.out.println("ff is launched");
			flag =true;
			break;
		case "safari":
			System.out.println("safari is launched");
			flag =true;
			break;
		case "ie":
			System.out.println("invalid  browser");
			flag =true;
			break;
			

		default:
			System.out.println("browser is not found");
			flag=false;
			break;
		}
		
	return flag;	

	}
	public String getName() {
		return "Ashu";
		//public int getNumber() {
		//	return 100;
		//}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing obj = new Testing();
		int m1 = obj.getStudentMarks("arika");
		System.out.println(m1);
		if(obj.launchBrowser("ix")) {
			System.out.println("launch the url");
		}
		else {
			System.out.println("no need to enter url");
			
		}
  if( obj.getName().equals("Ashu")) {
	  System.out.println("Ashu");
  }
	}

}

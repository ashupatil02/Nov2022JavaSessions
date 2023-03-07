package Selenium;

public class StudentMarks {
	public  int  getStudentMarks( String  studentname) {
		System.out.println("getting student marks for :" +studentname);
		if(studentname.equals("naha")) {
			return 100;
			
		}
		else if(studentname.equals("aarush")) {
			return 90;
		}
		else {
			System.out.println("student not found...");
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarks st = new StudentMarks();
		int m1= st.getStudentMarks("ashwini");
				 System.out.println(m1);
				 if(m1==-1) {
					 System.out.println("no need to print marksheet");
				 }

	}

}

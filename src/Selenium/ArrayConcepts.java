package Selenium;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		System.out.println("------------------");
		int i[] = new int[4];
		System.out.println(i.length);
		int length = i.length;
		int hi = length -  1;
		int li = 0;
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[3]);
		System.out.println(i[2]);
	//to print all the values from array:
		for(int k=0;k<=3;k++) {
			System.out.println(i[k]);
		}
		System.out.println("---------------------------------------------");
		//to print all the values from array without loop
		System.out.println(Arrays.toString(i));
		// for each loop
		for(int e: i) {
			System.out.println(e);
			if(e==20) {
				System.out.println("bye");
				break;
			}
		}
	System.out.println(i);//will show memory address of array
		System.out.println(Arrays.toString(i));
		double d[] = new double[3];
		d[0] = 10.22;
		d[1] = 10;
		d[2] = 33.3;
		System.out.println(Arrays.toString(d));
		for(double e: d) {
			System.out.println(e);
			System.out.println(d[0]+d[1]);
		}
			
		char ch[] = new char[4];
		ch[0] = 'a';
		ch[1] = 'd';
		ch[2] = '@'	;
		ch[3] = 'k';
		System.out.println(ch.length);
		System.out.println(ch.length-1);
		System.out.println("li =" +0);
		
		for(char e: ch) {
			System.out.println(e);
		}
		String lang[] = new String[4];
		lang[0] = "java";
		lang[1] = "java script";
		lang[2] = "Python";
		lang[3] = "Dotnet";
		System.out.println(lang.length);
		for(String e: lang) {
			System.out.println(e);
			if(e.equals("java")) {
				System.out.println(" i love java");
			}
			if(e.equals("java script")) {
				System.out.println(" i hate javasctipt");
			}
		}
		
		
		Object emp[] = new Object[5];
		emp[0] = "ashwini";
		emp[1] = 25;
		emp[2] = 25.55;
		emp[3] = 'f';
		emp[4] = true;
		System.out.println(emp.length);
		
		for(Object e: emp) {
			System.out.println(e);
			if(e.equals("ashwini")) {
				System.out.println("emp is from Testing");
			}
		}
		
		Object emp1[] = new Object[5];
		emp1[0] = "Aarush";
		emp1[1] = 15;
		emp1[2] = 15.55;
		emp1[3] = 'm';
		emp1[4] = true;
		
		System.out.println(emp1.length);
		for(Object f: emp1) {
			System.out.println(f);
			if(f.equals("Aarush")) {
				System.out.println("emp is from QA");
			}
			
		}
		Object emp2[] = new Object[5];
		emp2[0] = "Aarika";
		emp2[1] = 10;
		emp2[2] = 10.55;
		emp2[3] = 'f';
		emp2[4] = true;
		for(int f=0;f<=emp2.length-1;f++) {
			System.out.println(emp2[f]);
			for(Object c: emp2) {
				System.out.println(c);
				if(emp2[f].equals("Aarika")) {
					System.out.println("emp is from dev");
				
			
		}
		
		
	}

}
		int num[] = {11,12,13,14,15,650,1,12};
		System.out.println(num.length);
	}
		}
	


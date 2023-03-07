import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "hi this is my java code and I am so happy";
		System.out.println(str.length());
		int len = str.length();
		int li = 0;
		int hi = len-1;
		System.out.println(hi);
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(15));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(40));
	//	System.out.println(str.charAt(41));  //String outer bound exception
		
		System.out.println(str.charAt(2));

		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf("java"));
		
		String m1= "welcome null";
		if(m1.indexOf("admin")==8) {
			System.out.println("admin user is present");
		}
		else
		{
			System.out.println("fail");
		}
		System.out.println(str.indexOf('i'));    //1st occurence of i
		System.out.println(str.indexOf('i')+1);
		
		System.out.println(str.indexOf("python"));
		
		String m2 = "product name is mackbook";
		if(m2.indexOf("mackbook")!= -1) {
			System.out.println("mackbook is there");
		}
		
		String test = "this is java pgm";
		System.out.println(test.toUpperCase());
		System.out.println(test.toLowerCase());
		
		//trim
		String p ="      hello world     ";
		System.out.println(p.trim());
		String p1 ="hello world";

		System.out.println(p1.replace(" ", ""));
		
		String dob = "01/01/1988";
		System.out.println(dob.replace("-", "/"));
		
		System.out.println();
		String q = "     hello world     ";
		System.out.println(q.replaceAll(" ", ""));
		
		
		
		String e1 = "hello selenium";
	String e2 = "hello Selenium  "  ;
	
	System.out.println(e1.equals(e2));	
	System.out.println(e1.equalsIgnoreCase(e2));
	System.out.println(e1.equalsIgnoreCase(e2.trim()));
	
	String tg = "welcome to naveen training";
	System.out.println(tg.contains("naveen"));
	if(tg.contains("naveen"))
	{
		System.out.println("enroll it");
	}
	else {
		System.out.println("no enroll");
	}
		String lang =  "JAVA-PHYTHON-DOTNET-RUBY";
		String l[]  = lang.split("-");
		System.out.println(l.length);
		System.out.println(Arrays.toString(l));
		
		System.out.println("-------------");
		String pop =  "xXtestingxXseleniumXxXautomationXXxXtrainingX";
		   String n[] = pop.split("xX");
		   System.out.println(n[0]);
		   System.out.println(n[1]);
		   System.out.println(n[2]);
		   System.out.println(n[3]);
		   System.out.println(n[4]);
		
		
		
		
		
		
		
	}
	
	}





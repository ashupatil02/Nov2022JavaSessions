
public class StringConcept {

	public static void main(String[] args) {
		String str = "selenium";
		String str1 = "selenium";
		String str2 =  "Selenium";
		System.out.println(str == str1);
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str1));
		
		
		
		
		String s1 = new String("testing");
		String s2 = new String("testing");
        String s3 = "testing";
        String s4 = "testing";
        System.out.println(s3==s4);//true

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        String s5 = "testing";
        s5 = null;
     //   System.out.println(s5.length());
        
        String s6 = "ashwini";
         s6 = "aarush";
         System.out.println(s6);
	}

}

package Selenium;

public class LoopConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int i=0;
  while(i<=10) {
	  System.out.println(i);
	  i=i+1;
	  
  }
   while(true) {
	   System.out.println("hi");
	   break;
   }  
   
  int p=0;
   while(p<=50) { 
	 System.out.println(p);
	  p=p+2;
   }
  System.out.println("---------------");
  int num=1;
  while(num<=100) {
	   System.out.println(num);
	  if(num%5==0) {
		   System.out.println("hiii");
		    break;
		   
	   }
		num++;  
   }
		   
	int n=1;
	while(n<=5) {
		System.out.println(n+"."+"anjali");
	++n;
	}
		
	int counter=100;
   while(counter>=100) {
	System.out.println(counter);
	
	if(counter == 200) {
		System.out.println("bye");
		break;
	}
	counter++;
   }
   int score=0;
   while(score<=100) {
	   System.out.println(score);
	   if(score==25) {
		   System.out.println("score is 25.....yay");
	   }
	   if(score==50) {
		   System.out.println("half century");
	   }
	   if(score==100) {
		   System.out.println("century");
		   
	   }
	   score++;
   }
		
	
	
   }

}


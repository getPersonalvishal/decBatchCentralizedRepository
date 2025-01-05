package JavaClasses;

public class SwappingNumbers {
   
    public static void main(String[] args) {
    	 /* int a = 10;
    	  int b = 20;
    	  a=a+b;
    	  b=a-b;
    	  a=a-b;
    	  System.out.println("value of a and b :  "+a+" "+b);*/
    	
    	int a=20;
    	int b=10;
    	if(a!=b) {
    		a=b;
    		b=a+b;
    	}
    	System.out.println("value of a and b :  "+a+" "+b);
	}
     
     
    
     
}

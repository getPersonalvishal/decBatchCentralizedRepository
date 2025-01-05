package JavaClasses;

public class ArithmaticClass1 {
       public int sum(int a, int b) {
		   int c = a+b;
		   System.out.println("result of sum " + c);
		   return c;
	   }
	   public int sub(int a, int b) {
		   int c = a-b;
		   System.out.println("result of Sub " + c);
		   return c;
	   }
	   public int multi(int a, int b) {
		   int c = a*b;
		   System.out.println("result of multi " + c);
		   return c;
	   }
	   public void div(int a, int b) {
		   int c = a/b;
		   System.out.println("Final result is " + c);
		   
	   }
	   public static void main(String[] args) {
		   ArithmaticClass obj=new ArithmaticClass();
		   int mulResult=obj.multi(10, 2);
		   int subResult=obj.sub(mulResult, 2);
		   int sumResult=obj.sum(subResult, 2);
		   int subResult1=obj.sub(sumResult, 2);
		   obj.div(subResult1, 2);
		   
	}
	   
	}




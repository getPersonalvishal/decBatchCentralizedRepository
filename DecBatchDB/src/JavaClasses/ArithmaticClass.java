package JavaClasses;

public class ArithmaticClass {
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
	   int sumResult=obj.sum(10, 2);
	   int sumResult1=obj.sum(sumResult, 2);
	   int subResult=obj.sub(sumResult1, 2);
	   int multiResult=obj.multi(subResult, 2);
	   obj.div(multiResult, 2);
	   
}
   
}

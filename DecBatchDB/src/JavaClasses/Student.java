package JavaClasses;

public class Student {
   int rollNo;
   int age;
   public void display1() {
	   System.out.println("welcome to all of you");
   }
   public void display2() {
	   System.out.println("automation is very easy");
   }
   public static void main(String[] args) {
	Student obj=new Student();
	obj.display1();
	obj.display2();
    obj.rollNo=12;
    System.out.println(obj.rollNo);
    obj.age=23;
    System.out.println(obj.age);
    }
}

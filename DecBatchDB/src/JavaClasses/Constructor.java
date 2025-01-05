package JavaClasses;

public class Constructor {
	public Constructor() {
		this(2, 4, 6);
		System.out.println("default constructor");
	}
	public Constructor(int a) {
		this();
		System.out.println("one parametrized constructor");
	}
	public Constructor(int a, int b) {
		this(1);
		System.out.println("two parametrized constructor");
	}
	public Constructor(int a, int b, int c) {
		System.out.println("three parametrized constructor");
	}
	public static void main(String[] args) {
		Constructor obj=new Constructor(2, 4);
		
	}
	
	

}

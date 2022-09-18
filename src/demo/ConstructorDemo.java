package demo;

public class ConstructorDemo {
	int age;
	String name;
	
	public ConstructorDemo() {
		this(10, "vishay");
	}

	public ConstructorDemo(int age , String name) {

		this.age=age;
		this.name=name;
		
	}

	public static void main(String[] args) {

		ConstructorDemo c = new ConstructorDemo();
	
		System.out.println(c.name);
	}

}

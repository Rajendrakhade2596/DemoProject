package polymorphism;

 class Test12{
	void m1(int c ) {
		System.out.println("int method");
	}
	void m1(float c ) {
		System.out.println("float method");
	}
	void m1(long c ) {
		System.out.println("long method");
	}
	void m1(double c ) {
		System.out.println("double method");
	}
	
	
}
class TestEx {
	public static void main(String[] args) {
		Test12 obj = new Test12();
		
		obj.m1(10.5);
	}
	
}
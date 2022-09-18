package polymorphism;

class TestExample {

	void m1(int b, float c) {
		System.out.println("int-float method");
	}

	void m1(float c, int d) {
		System.out.println("float-int method");
	}
}
class Test2 {
	public static void main(String[] args) {
		TestExample obj = new TestExample();
		obj.m1('a',10.5f);

	}
}

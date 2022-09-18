package polymorphism;

class Rajendra {

	void m1(int b, char c) {
		System.out.println("int-char method");
	}

	void m1(char c, int d) {
		System.out.println("char-int method");
	}
}
class example {
	public static void main(String[] args) {
		Rajendra obj = new Rajendra();
		obj.m1('a',10);

	}
}

package Demo1;

public class Child extends Parent{
	
	public int a = 10;

	public void show() {
		System.out.println(a);
	}
	
	public static void main(String... args) {
		Child pr = new Child();
		//pr.show1();
		Parent ch = (Parent)pr;
		ch.show();
	}
	public static void main(String args, String[] arg) {
		//Child pr = new Child();
		//pr.show1();
		Parent ch = new Parent();
		ch.show();
	}

}

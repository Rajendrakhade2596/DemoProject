package Basic;

public class ABEx {
public static void main(String[] args) {
	AB a = new AB() {
		
		@Override
		public void show() {

			System.out.println("abc");
		}
	};
	a.show();
}
}

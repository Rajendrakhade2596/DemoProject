package demo;

public class ArrayExample {

	public static void main(String[] args) {

		Student [] str = new Student[5];
		str[0]=new Student(10, "sandip");
		str[2]=new Student(20, "sanil");
		str[4]=new Student(25, "rajendra");
		
		for (Student s :str) {
			if(s instanceof Student) {
			System.out.println(s.age + "  >> " + s.name);
			}
			else {
				System.out.println(s);
			}
		}
	}

}

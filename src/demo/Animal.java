package demo;

class Animal {

	@Override
	public String toString() {
		return "Animal [getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
class Dog extends Animal{

	@Override
	public String toString() {
		return "Dog [getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
class DogKid extends Dog{

	@Override
	public String toString() {
		return "DogKid [toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}
	
	
}
class Test{
	public static void main(String[] str) {
	Animal[] aa = new Animal[3];
	aa[0]=new Animal();
	aa[1]=new Dog();
	aa[2]=new DogKid();
	for (Animal a : aa) {
		System.out.println(a.toString());
	}
	}
}

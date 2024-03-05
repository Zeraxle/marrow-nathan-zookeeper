package inheritance.models;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		this.energy -= 5;
		System.out.println("Gorilla just threw something");
	}
	
	public void eatBananas() {
		energy += 10;
		System.out.println("Gorilla is eating and happy about it");
	}
	
	public void climb() {
		energy -= 10;
		System.out.println("Gorilla just climbed a tree");
	}
}

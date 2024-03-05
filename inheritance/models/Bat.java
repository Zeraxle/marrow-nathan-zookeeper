package inheritance.models;

public class Bat extends Mammal{
	
	
	
	public Bat() {
		super();
		energy = 300;
	}
	
	public void fly() {
		energy -= 50;
		System.out.println("The Bat is flying now");
	}
	
	public void eatHumans() {
		energy += 25;
		System.out.println("Bat just ate little Timmy. It's looking at me now...");
	}
	
	public void attackTown() {
		energy -= 100;
		System.out.println("This is the legendary bat that was rumored to have started Covid. Need I say more?");
	}
	
	
}

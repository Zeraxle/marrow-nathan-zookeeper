package inheritance.models;

public class MammalTest {
	public static void main(String[] args) {
		
		Gorilla kerchak = new Gorilla();
		Bat battyKoda = new Bat();
		
		kerchak.throwSomething();
		kerchak.throwSomething();
		kerchak.throwSomething();
		kerchak.eatBananas();
		kerchak.eatBananas();
		kerchak.climb();
		kerchak.getEnergy();
		
		battyKoda.attackTown();
		battyKoda.attackTown();
		battyKoda.attackTown();
		battyKoda.eatHumans();
		battyKoda.eatHumans();
		battyKoda.fly();
		battyKoda.fly();
		battyKoda.getEnergy();
		
	}
}

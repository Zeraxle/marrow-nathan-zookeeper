package inheritance.models;

public class Mammal {
	public Integer energy;
	
public Mammal() {
	energy = 100;
}
	

public void getEnergy() {
	System.out.println(energy);
}

public void setEnergy(Integer energy) {
	this.energy = energy;
}
}



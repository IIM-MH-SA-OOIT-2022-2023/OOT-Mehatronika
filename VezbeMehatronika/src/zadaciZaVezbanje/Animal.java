package zadaciZaVezbanje;

public abstract class Animal implements Pet {

	protected String name;
	protected String breed;
	
	public Animal() {
		
	}
	
	public Animal(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public abstract void feed();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
}

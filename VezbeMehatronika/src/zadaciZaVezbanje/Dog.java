package zadaciZaVezbanje;

public class Dog extends Animal {

	private boolean hungry;
	
	public Dog(String name, String breed, boolean hungry) {
		super(name,breed);
		this.hungry = hungry;
	}
	
	@Override
	public void respond() {
		System.out.println("woof woof");
	}

	@Override
	public void namePet(String name) {
		super.setName(name);
	}

	@Override
	public void feed() {
		if(hungry) {
			hungry = false;
			System.out.println("is full and happy");
		}else {
			System.out.println("buries food for rainy days");
		}

	}

	public boolean isHungry() {
		return hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	
	

}

package zadaciZaVezbanje;

public class Test {

	public static void main(String[] args) {
		Dog d1 = new Dog("Bethoven", "St.Bernard", false);
		Dog d2 = new Dog("Boby", "Badger dog", true);
		d1.feed();
		d1.respond();
		d2.feed();
		d2.respond();
	}

}

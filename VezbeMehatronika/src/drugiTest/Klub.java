package drugiTest;

public abstract class Klub implements PravnoLice {

	private String naziv;
	private int pib;
	private int brojClanova;
	
	public abstract int naplatiClanarinu();

	public Klub(String naziv, int pib, int brojClanova) {
		this.naziv = naziv;
		this.brojClanova = brojClanova;
		if(pib > 9999 && pib <100000) {
			this.pib = pib;
		}else {
			//Po zadatku je jedino obavezno ispisati neku poruku da je doslo do greske
			System.out.println("PIB mora imati 5 cifara");
			//Ukoliko je unet los PIB, mozemo ga postaviti na 5 nula kao oznaku greske,
			//ovo nije trazeno u zadatku ali je fin dodatak logici samog zadatka
			this.pib = 00000;
		}
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getPib() {
		return pib;
	}

	public void setPib(int pib) {
		if(pib > 9999 && pib <100000) {
			this.pib = pib;
		}else {
			System.out.println("PIB mora imati 5 cifara");
		}
	}

	public int getBrojClanova() {
		return brojClanova;
	}

	public void setBrojClanova(int brojClanova) {
		this.brojClanova = brojClanova;
	}
	
	

}

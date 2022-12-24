package drugiTest;

public class FudbalskiKlub extends Klub {

	private String[] igraci;
	
	public FudbalskiKlub(String naziv, int pib, int brojClanova) {
		super(naziv,pib,brojClanova);
		//Inicijalizacija niza na neki niz od 11 elemenata
		this.igraci = new String[11];
	}
	
	public void setIgraci(String[] igraci) {
		this.igraci = igraci;
	}
	
	public String[] getIgraci() {
		return igraci;
	}
	
	@Override
	public void registrujSe(String naziv, int PIB) {
		System.out.println("Klub " +  naziv  + "sa PIB-om "  + 
					PIB + " je uspešno registrovan u APR-u>");

	}

	@Override
	public int platiPorez() {
		return super.getBrojClanova()*100;
	}

	@Override
	public int naplatiClanarinu() {
		return super.getBrojClanova()*300;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof FudbalskiKlub) {
			FudbalskiKlub temp = (FudbalskiKlub) obj;
			if(temp.getPib() == this.getPib()) {
				return true;
			}
		}
		return false;
	}

}

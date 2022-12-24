package drugiTest;

import java.util.HashMap;
import java.util.Map;

public class TestKlub {

	public static void main(String[] args) {
		FudbalskiKlub mojKlub = new FudbalskiKlub("FK Partizan",55555,1000 );
		mojKlub.getIgraci()[0] = "Bibars Natko";
		mojKlub.getIgraci()[1] = "Rikardo Gomes";
		mojKlub.getIgraci()[2] = "Aleksandar Popovic";
		mojKlub.getIgraci()[3] = "Aleksandar Filipovic";
		
		HashMap<String,String> uloge = new HashMap<String,String>();
		uloge.put("golman", mojKlub.getIgraci()[2]);
		uloge.put("bek", mojKlub.getIgraci()[3]);
		uloge.put("kapiten", mojKlub.getIgraci()[0]);
		uloge.put("centarfor", mojKlub.getIgraci()[1]);
		
		
		for(Map.Entry<String, String> ulogaIgrac: uloge.entrySet()) {
			System.out.println(ulogaIgrac);
		}

	}

}

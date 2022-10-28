package initial;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		/*int prviBroj = 24;
		int drugiBroj = 12;

		char operation = '+';

		if (operation == '+') {
			System.out.println(prviBroj + drugiBroj);
		} else if (operation == '-') {
			System.out.println(prviBroj - drugiBroj);
		} else if (operation == '*') {
			System.out.println(prviBroj * drugiBroj);
		} else if (operation == '/') {
			System.out.println(prviBroj / drugiBroj);
		}*/
		
		//Zadatak 2 - Vezbe 2
		
		
		//Kod koji omogucava kupljenje inputa sa konzole
		System.out.println("Unesite broj od 0 do 200");
		Scanner it = new Scanner(System.in);
		int korisnikovBroj = it.nextInt();
		
		if(korisnikovBroj > 200 || korisnikovBroj<0) {
			System.out.println("Broj mora biti izmedju 0 i 200");
		}
		else {
			int zbir = 0;
			for(int i = 0; i<=korisnikovBroj; i=i+2) {
				zbir = zbir + i;
			}
			System.out.println("Rezultat for petlje je: " + zbir);
			
			int brojac = 0;
			zbir = 0;
			while(brojac <= korisnikovBroj) {
				zbir = zbir + brojac;
				//brojac = brojac +2;
				brojac +=2;
			}
			System.out.println("Rezultat while petlje je: " + zbir);
			
			brojac = 0;
			zbir = 0;
			do {
				zbir = zbir + brojac;
				brojac +=2;
			}
			while(brojac > korisnikovBroj);
			System.out.println("Rezultat do-while petlje je: " + zbir);
		}

	}

}

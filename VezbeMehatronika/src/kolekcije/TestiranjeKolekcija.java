package kolekcije;

import java.util.HashMap;
import java.util.Map;

public class TestiranjeKolekcija {

	public static void main(String[] args) {
		//int broj = 50;
		//Point p1 = new Point();
		/*int[] niz = new int[5];
		System.out.println(niz[0]);
		
		niz[0] = 4;
		niz[1] = 5;
		niz[2] = 6;
		niz[3] = 7;
		niz[4] = 8;
		System.out.println(niz[0]);*/
		
		//int[] niz2 = {5,10,15,20};
		
		/*for(int i = niz.length-1; i>=0; i--) {
			System.out.print(niz[i] + " ");
		}*/
		
		int[] niz3 = {5,66,13,4,76,32,11,22,8};
		//Pronaci najveci i najmanji element niza 3
		int max = 0;
		int min = 0;
		for(int i = 0; i<niz3.length; i++) {
			if(niz3[i] > max) {
				max = niz3[i];
			}if(niz3[i] < min || min==0) {
				min = niz3[i];
			}
		}
		
		/*System.out.println("Najveci element niza 3 je: " + max + ", a najmanji element je: "
				+ min);*/

		
		HashMap<String,String> mapa = new HashMap<String,String>();
		/*
		 *  txt, notepad.exe, 
			bmp, paint.exe, 
			dib, paint.exe, 
			rtf, wordpad.exe 
		 */
		
		mapa.put("txt", "notepad.exe");
		mapa.put("bmp", "paint.exe");
		mapa.put("dib", "paint.exe");
		mapa.put("rtf", "wordpad.exe");
		
		/*System.out.println("Kljucevi hash mape:");
		for(String s: mapa.keySet()) {
			System.out.println(s);
		}
		
		System.out.println("Vrednosti hash mape:");
		for(String s: mapa.values()) {
			System.out.println(s);
		}
		
		System.out.println("Ceo par:");
		for(Map.Entry<String, String> me: mapa.entrySet()) {
			System.out.println(me);
		}*/
		
		//1
		mapa.replace("rtf", "windword.exe");
		//2
		if(!mapa.containsKey("tif")) {
			System.out.println("Kljuc tif nije pronadjen");
		}
		
		//3
		if(!mapa.containsKey("ht")) {
			mapa.put("ht", "hypertrm.exe");
			System.out.println("Vrednost dodata kljucu = ht:hypertrm.exe");
		}
		
		//4
		for(Map.Entry<String, String> me: mapa.entrySet()) {
			System.out.println(me);
		}
		
		//5
		if(!mapa.containsKey("doc")) {
			System.out.println("Kljuc doc nije pronadjen");
		}else {
			mapa.remove("doc");
		}
		
	}

}

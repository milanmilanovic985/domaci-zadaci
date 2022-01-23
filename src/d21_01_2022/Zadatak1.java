package d21_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak  
//		Kreirati klasu Sektor koja ima:
//		 naziv sektora
//		 platu koja je za taj sektor
//
//		Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//		Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//		Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u 
//		kojima rade i ispisati platu za svakog
		
		Magacioner jj = new Magacioner("Jovan", "Jovanovic");
		Menadzer mm = new Menadzer("Milan", "Milanoivic");
		
		Sektor s1 = new Sektor("Sektor1", 38000);
		Sektor s2 = new Sektor("Sektor2", 50000);
		Sektor s3 = new Sektor("Sektor3", 60000);
		
		jj.zaposliUSektor(s1);
		jj.zaposliUSektor(s2);
		mm.zaposliUSektor(s3);
		mm.zaposliUSektor(s2);
		
		mm.plataRadnika();
		jj.plataRadnika();
		
		System.out.println("Plata magacionera " + jj.ime + " " + jj.prezime + " iznosi " + jj.plataRadnika() + " din.");
		System.out.println("Plata menadzera " + mm.ime + " " + mm.prezime + " iznosi " + mm.plataRadnika() + " din.");
		


	}

}

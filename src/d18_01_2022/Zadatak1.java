package d18_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Student koja ima
//		broj indeksa
//		ime i prezime
//		tip studija (osnovne, master, doktorske)
//		niz ispita
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za indeks, ime i prezime, tip studija
//		getter za niz predmeta
//		metodu dodaj ispit u niz ispita
//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//		metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)
//
//
//		Napisati klasu Ispit koja ima
//		naziv predmeta
//		ocenu (u rasponu od 5 do 10)
//		Ime i prezime profesora koji predaje predmet
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za sve atribute
//		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//		metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)
		
		Student milan = new Student(9304, "Milan Milanovic", "Master");
		Student jovana = new Student(8405, "Jovana Nikolic", "Doktorske");
		Student luna = new Student(7456, "Luna Lu", "Osnovne");
		
		milan.dodajIspit(new Ispit("Bankarstvo", 9, "Milenko Lukic"));
		milan.dodajIspit(new Ispit("Poslovna Ekonomija", 8, "Tamara Dragcevic"));
		milan.dodajIspit(new Ispit("Monetarna Ekonomija", 5, "Radovan Jovanovic"));
		milan.dodajIspit(new Ispit("Racunovodstvo", 10, "Violeta Trajkovic"));
		
		jovana.dodajIspit(new Ispit("Analiza Podataka", 9, "Milovan Glisic"));
		jovana.dodajIspit(new Ispit("Bilansi preduzeca", 10, "Rajka Stosic"));
		jovana.dodajIspit(new Ispit("Ekonomija rada", 9, "Milisav Novkovic"));
		
		luna.dodajIspit(new Ispit("Ekonomija", 5, "Tamara Dragcevic"));
		luna.dodajIspit(new Ispit("Racunovodstvo", 6, "Violeta Trajkovic"));
		luna.dodajIspit(new Ispit("Bankarstvo", 5, "Milenko Lukic"));
		luna.dodajIspit(new Ispit("Ekonomija trgovine", 7, "Dragoslav Mitic"));
		
		milan.print();
		System.out.println();
		jovana.print();
		System.out.println();
		luna.print();


	}

}

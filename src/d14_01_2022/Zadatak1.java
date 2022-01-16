package d14_01_2022;

import javax.sound.midi.Soundbank;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.
		
		Autor ia = new Autor("Ivo", "Andric");
		Autor bn = new Autor("Branislav", "Nusic");
		
		Knjiga naDrini = new Knjiga("978-86-10-03474-5", "Na Drini cuprija", 1945, ia);
		Knjiga pAvlija = new Knjiga("978-86-505-2629-3", "Prokleta avlija", 1954, ia);
		Knjiga nPoslanik = new Knjiga("978-86-7609-388-5", "Narodni poslanik", 1883, bn);
		Knjiga sLice = new Knjiga("978-86-17-14664-9", "Sumnjivo lice", 1887, bn);
		
		naDrini.print();
		System.out.println();
		pAvlija.print();
		System.out.println();
		nPoslanik.print();
		System.out.println();
		sLice.print();


	}

}

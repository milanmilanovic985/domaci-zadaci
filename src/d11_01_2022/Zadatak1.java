package d11_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

		Proizvod milka = new Proizvod();
		milka.cena = 100;
		milka.naziv = "Milka";
		milka.tezina = 100;
		Proizvod nike = new Proizvod();
		nike.cena = 10000;
		nike.naziv = "Nike";
		nike.tezina = 300;
		milka.povecajCenu(10);
		nike.povecajCenu(500);
		milka.vratiCenuSaPopustom(10);
		nike.vratiCenuSaPopustom(10);
		milka.stampaj();
		System.out.println();
		nike.stampaj();
		System.out.println();
		System.out.println("Cena sa popustom za " + milka.naziv + " je " + milka.vratiCenuSaPopustom(10));
		System.out.println("Cena sa popustom za " + nike.naziv + " je " + nike.vratiCenuSaPopustom(10));
		
		
	}

}

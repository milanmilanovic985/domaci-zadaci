package d10_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu 
//		za stampu.
		
		Proizvod a = new Proizvod();
		a.cena = 100;
		a.naziv = "Milka";
		a.tezina = 80;
		a.stampaj();
		System.out.println();
		Proizvod b = new Proizvod();
		b.cena = 12000;
		b.naziv = "Converse";
		b.tezina = 300;
		b.stampaj();


	}

}

package d20_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		2. Zadatak
//		Kreirati klasu Karton koja ima:
//		tip kartona (crveni, zuti)
//		konstuktore za koje mislite da ce vam trebati
//		gettere i settere za karton
//			
//		Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
//
//		Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		niz kartona
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu dodaj karton, gde se dodaje karton u niz
//		metodu koja vraca broj zutih kartona
//		metodu koja vraca broj crvenih kartona
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//
//		U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
		
		Igrac2 igrac1 = new Igrac2("Milan", "Milanovic", "1610985750089", 1985, 10, "napadac", true);
		Igrac2 igrac2 = new Igrac2("Stefan", "Stosic", "1205995748036", 1995, 7, "odbrana", false);
		
		
		Karton karton1 = new Karton("zuti");
		Karton karton2 = new Karton("crveni");
		
		
		igrac1.dodajKarton(karton1);
		igrac1.dodajKarton(karton1);
		igrac1.dodajKarton(karton2);
		igrac1.stampaj();
		igrac2.dodajKarton(karton2);
		igrac2.dodajKarton(karton2);
		igrac2.dodajKarton(karton2);
		igrac2.stampaj();
		
		
		


	}

}

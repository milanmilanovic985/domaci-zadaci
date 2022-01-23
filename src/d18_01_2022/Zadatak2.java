package d18_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		2. Zadatak (Za vezbanje)
//		Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama. 
//		Znaci nije vam potrebna provera za opseg brojeva.
//
//		Za potrebe Lotto igre na srecu potrebno je 
//		Kreirati klasu Kombinacija koja ima:
//		id kombinacije (String)
//		niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//		konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//		gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//		metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
//		Zaglavlje metode je:
//		public boolean daLiJeIstaKombinacija( Kombinacija k)
//		metoda vraca true ako su svi elementi na istim pozicija isti
//		npr: this [0] == k [0], this [1] == k [1] …. 
//		metodu za stampu koja stampa podatke u formatu
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//
//			Kreirati klasu Listic koja ima: 
//		niz kombinacija - maksimalno 7 kombinacija
//		metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//		metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za 
//		proveru. Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena 
//		kombinacija. Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//		Zaglavlje metode 
//		public boolean dobitna(Kombinacija dobitnaKombinacija)
//		metodu koja stampa listic u formatu
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//		…… i tako za sve kombinacije
		
		Kombinacija jedan = new Kombinacija("112233", 13, 2, 8, 33, 4, 5, 7);
		Kombinacija dva = new Kombinacija("123654", 1, 2, 22, 12, 4, 9, 5);
		Kombinacija tri = new Kombinacija("784563", 23, 1, 15, 16, 17, 7, 12);
		Kombinacija cetiri = new Kombinacija("265147", 3, 12, 18, 31, 24, 15, 7);
		Kombinacija pet = new Kombinacija("321654", 33, 2, 18, 5, 4, 8, 30);
		Kombinacija sest = new Kombinacija("123456", 1, 8, 12, 13, 18, 3, 20);
		Kombinacija sedam = new Kombinacija("112233", 1, 3, 5, 14, 15, 21, 23);
		
		Kombinacija dobitnaKombinacija = new Kombinacija("112233", 1, 3, 5, 14, 15, 21, 23);
		
		Listic prvi = new Listic();
		prvi.dodajKombinaciju(jedan);
		prvi.dodajKombinaciju(dva);
		prvi.dodajKombinaciju(tri);
		prvi.dodajKombinaciju(cetiri);
		prvi.dodajKombinaciju(pet);
		prvi.dodajKombinaciju(sest);
		prvi.dodajKombinaciju(sedam);
		
		
		prvi.print();
		
		
		if (prvi.dobitna(dobitnaKombinacija)) {
			System.out.println("Cestitamo!!! Vi ste srecni dobitnik!!!");
		} else {
			System.out.println("Vise srece drugi put!!!");
		}
	
	}

}

package d18_01_2022;

import java.util.ArrayList;
import java.util.Collections;

public class Kombinacija {
//	Za potrebe Lotto igre na srecu potrebno je 
//	Kreirati klasu Kombinacija koja ima:
//	id kombinacije (String)
//	niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//	konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//	gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//	metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
//	Zaglavlje metode je:
//	public boolean daLiJeIstaKombinacija( Kombinacija k)
//	metoda vraca true ako su svi elementi na istim pozicija isti
//	npr: this [0] == k [0], this [1] == k [1] …. 
//	metodu za stampu koja stampa podatke u formatu
//	ID: id kombinacije
//	brojevi: 1, 3, 5, 14, 15, 21, 23
	private String idKombinacije;
	private ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

	public Kombinacija(String idKombinacije, int broj1, int broj2, int broj3, int broj4, 
			int broj5, int broj6, int broj7) {
		super();
		this.idKombinacije = idKombinacije;
		nizBrojeva.add(broj1);
		nizBrojeva.add(broj2);
		nizBrojeva.add(broj3);
		nizBrojeva.add(broj4);
		nizBrojeva.add(broj5);
		nizBrojeva.add(broj6);
		nizBrojeva.add(broj7);

	}

	public String getIdKombinacije() {
		return idKombinacije;
	}

	public int getBroj1() {
		return nizBrojeva.get(0);
	}

	public int getBroj2() {
		return nizBrojeva.get(1);
	}

	public int getBroj3() {
		return nizBrojeva.get(2);
	}

	public int getBroj4() {
		return nizBrojeva.get(3);
	}

	public int getBroj5() {
		return nizBrojeva.get(4);
	}

	public int getBroj6() {
		return nizBrojeva.get(5);
	}

	public int getBroj7() {
		return nizBrojeva.get(6);
	}

	public boolean daLiJeIstaKombinacija(Kombinacija k) {
		Collections.sort(this.nizBrojeva);
		Collections.sort(k.nizBrojeva);
		for (int i = 0; i < nizBrojeva.size(); i++) {
			if (this.nizBrojeva.get(i) != k.nizBrojeva.get(i))
				return false;
		}
		return true;
	}

	public void print() {
		System.out.println("ID kombinacije: " + this.idKombinacije);
		System.out.print("Brojevi: ");
		Collections.sort(this.nizBrojeva);
		for (int i = 0; i < nizBrojeva.size(); i++) {
			if (i < 6) {
				System.out.print(this.nizBrojeva.get(i) + ", ");
			} else {
				System.out.print(this.nizBrojeva.get(i));
			}

		}
	}

}

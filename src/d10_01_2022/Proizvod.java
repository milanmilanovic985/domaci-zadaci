package d10_01_2022;

public class Proizvod {
	String naziv;
	double cena;
	double tezina;
	public void stampaj() {
		System.out.println("Naziv proizvoda: " + this.naziv);
		System.out.println("Cena proizvoda: " + this.cena);
		System.out.println("Tezina proizvoda: " + this.tezina);
	}

}

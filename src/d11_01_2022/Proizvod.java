package d11_01_2022;

public class Proizvod {
	String naziv;
	double cena;
	double tezina;
	public void stampaj() {
		System.out.println("Naziv proizvoda: " + this.naziv + ", cena " + String.format("%.0f", this.cena) + "din. tezina " + String.format("%.0f", this.tezina) + "g.");
		System.out.println("Postarina za proizvod " + this.naziv + " " + this.racunajPostarinu() + "din.");
	}
	public void povecajCenu (double povecanje) {
		this.cena = this.cena + povecanje;
	}
	public double vratiCenuSaPopustom (double popust) {
		
		return (this.cena - (this.cena /100 * popust));
	}
	public int racunajPostarinu () {
		int cenaPostarine = 0;
		if (this.tezina <= 100) {
			cenaPostarine = 200;
		} else if (this.tezina > 100 && this.tezina <= 500) {
			cenaPostarine = 400;
		} else {
			cenaPostarine = 1000;
		} return cenaPostarine;
	}

}

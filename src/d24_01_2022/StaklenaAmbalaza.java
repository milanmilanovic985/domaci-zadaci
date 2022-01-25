package d24_01_2022;

public class StaklenaAmbalaza extends Ambalaza{
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena flasa.
	private int kaucijaZaFlasu;
	private boolean kaucija;
	private double osnovnaCena;
	public StaklenaAmbalaza() {
		super();
		
	}
	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina,
			boolean kaucija, double osnovnaCena, int kaucijaZaFlasu) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.osnovnaCena = osnovnaCena;
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}
	public int getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}
	public void setKaucijaZaFlasu(int kaucijaZaFlasu) {
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}
	public boolean isKaucija() {
		return kaucija;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setKaucija(boolean kaucija) {
		this.kaucija = kaucija;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double cenaArtikla () {
		if (this.kaucija) {
			return this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
		} else {
			return this.osnovnaCena * 1.2;
		}
	}
	@Override
	public void print () {
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Naziv artikla: " + this.nazivArtikla + " sa tezinom pakovanja od " + 
		String.format("%.0f", this.tezinaPakovanja()) + "gr koja je od stakla.");
		if (this.kaucija) {
			System.out.println("Za ovu ambalazu se placa kaucija koja iznosi " + this.kaucijaZaFlasu + "rsd.");
		} else {
			System.out.println("Za ovu ambalazu se ne placa kaucija.");
		}
		System.out.println("Njegova cena je " + String.format("%.0f", this.cenaArtikla()) + "rsd.");
	}
	
	
	


}

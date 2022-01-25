package d24_01_2022;

public class Tetrapak extends Ambalaza{
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak.
	private boolean reciklira;
	private double osnovnaCena;
	public Tetrapak() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, 
			boolean reciklira, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.reciklira = reciklira;
		this.osnovnaCena = osnovnaCena;
		
	}
	public boolean isReciklira() {
		return reciklira;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setReciklira(boolean reciklira) {
		this.reciklira = reciklira;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double cenaArtikla () {
		if (this.reciklira) {
			return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		} else {
			return this.osnovnaCena;
		}
	}
	@Override
	public void print () {
		System.out.println("Barkod: " + this.barkod);
		System.out.print("Naziv artikla: " + this.nazivArtikla + " sa tezinom pakovanja od " + 
		String.format("%.0f", this.tezinaPakovanja()) + "gr koja je izradjena od ");
		if (this.reciklira) {
			System.out.println("recikliranog materijala.");
		} else {
			System.out.println("nerecikliranog materijala.");
		}
		System.out.println("Njegova cena je " + String.format("%.0f", this.cenaArtikla()) + "rsd.");
	}
	
	


}

package d24_01_2022;

public class SuperKartica {
//	Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere 
//		metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)
	private int brojKartice;
	private String imeVlasnika;
	private String prezimeVlasnika;
	private int popust;
	public SuperKartica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuperKartica(int brojKartice, String imeVlasnika, String prezimeVlasnika, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.imeVlasnika = imeVlasnika;
		this.prezimeVlasnika = prezimeVlasnika;
		this.popust = popust;
	}
	public int getBrojKartice() {
		return brojKartice;
	}
	public String getImeVlasnika() {
		return imeVlasnika;
	}
	public String getPrezimeVlasnika() {
		return prezimeVlasnika;
	}
	public int getPopust() {
		return popust;
	}
	public void setBrojKartice(int brojKartice) {
		this.brojKartice = brojKartice;
	}
	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}
	public void setPrezimeVlasnika(String prezimeVlasnika) {
		this.prezimeVlasnika = prezimeVlasnika;
	}
	public void setPopust(int popust) {
		this.popust = popust;
	}
	public void print () {
		System.out.println("Broj kartice: " + this.brojKartice + ", vlasnik " + this.imeVlasnika + " " + this.prezimeVlasnika);
	}


}

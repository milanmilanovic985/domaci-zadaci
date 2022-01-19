package d17_01_2022;

public class Racun {
	private String brojRacuna;
	private String imeIPrezime;
	private double trenutnoStanjeRacuna;
	
	public Racun () {
		
	}

	public Racun(String brojRacuna, String imeIPrezime, double trenutnoStanjeRacuna) {
		
		this.brojRacuna = brojRacuna;
		this.imeIPrezime = imeIPrezime;
		this.trenutnoStanjeRacuna = trenutnoStanjeRacuna;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public double getTrenutnoStanjeRacuna() {
		return trenutnoStanjeRacuna;
	}
	public void promenaStanjaNaRacunu (double isplata) {
		this.trenutnoStanjeRacuna = this.trenutnoStanjeRacuna + isplata;
	
		if (this.trenutnoStanjeRacuna < 0) {
			this.trenutnoStanjeRacuna = 0;
		} 
	}
	public void print () {
		System.out.println(this.imeIPrezime + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je: " + String.format("%.0f", this.trenutnoStanjeRacuna) + " rsd.");
	}
	
}

package d14_01_2022;

public class Proizvod {
	private int sifraProizvoda;
	private String nazivProizvoda;
	private double cenaPoKg;
	
	public Proizvod (int sifraProizvoda, String nazivProizvoda, double cenaPoKg) {
		this.cenaPoKg = cenaPoKg;
		this.nazivProizvoda = nazivProizvoda;
		this.sifraProizvoda = sifraProizvoda;
	}
	
	public void setSifraProizvoda (int sifraProizvoda) {
		this.sifraProizvoda = sifraProizvoda;
	}
	public int getSifraProizvoda () {
		return this.sifraProizvoda;
	}
	public void setNazivProizvoda (String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}
	public String getNazivProizvoda () {
		return this.nazivProizvoda;
	}
	public void setCenaPoKg (double cenaPoKg) {
		this.cenaPoKg = cenaPoKg;
	}
	public double getCenaPoKg () {
		return this.cenaPoKg;
	}
	public double getCenaPoLb () {
		return this.cenaPoKg * 2.2046;
	}
	public void print () {
		System.out.println(this.sifraProizvoda + " - " + this.nazivProizvoda);
	}

}

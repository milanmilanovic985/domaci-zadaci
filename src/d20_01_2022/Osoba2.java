package d20_01_2022;

public class Osoba2 {
//	(Za vezbanje) 
//	2. Zadatak
//	Kreirati klasu Karton koja ima:
//	tip kartona (crveni, zuti)
//	konstuktore za koje mislite da ce vam trebati
//	gettere i settere za karton
//		
//	Kreirati klasu Osoba koja ima:
//	ime i prezime
//	jmbg
//	godinu rodjenja
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere 
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)

	protected String ime;
	protected String prezime;
	protected String jmbg;
	protected int godinaRodj;
	public Osoba2() {
		super();
		
	}
	public Osoba2(String ime, String prezime, String jmbg, int godinaRodj) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.godinaRodj = godinaRodj;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public int getGodinaRodj() {
		return godinaRodj;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public void setGodinaRodj(int godinaRodj) {
		this.godinaRodj = godinaRodj;
	}
	public void stampaj () {
		System.out.println(this.ime + " " + this.prezime + ", " + this.jmbg + ", " + this.godinaRodj);
	}
	

}

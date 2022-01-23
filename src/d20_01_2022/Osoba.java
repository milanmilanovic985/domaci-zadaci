package d20_01_2022;

public class Osoba {
//	1.Zadatak
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
	protected int godRodjenja;
	
	public Osoba() {
		super();
		
	}

	public Osoba(String ime, String prezime, String jmbg, int godRodjenja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.godRodjenja = godRodjenja;
	}

	public String getIme() {
		return ime;
	}
	public String getPrezime () {
		return prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public int getGodRodjenja() {
		return godRodjenja;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	public void setPrezime (String prezime) {
		this.prezime = prezime;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public void setGodRodjenja(int godRodjenja) {
		this.godRodjenja = godRodjenja;
	}
	public void stampaj () {
		System.out.println(this.ime + " " + this.prezime + ", " + this.jmbg + ", " + this.godRodjenja);
	}
	
	


}

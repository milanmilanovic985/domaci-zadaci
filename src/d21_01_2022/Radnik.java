package d21_01_2022;

import java.util.ArrayList;

public abstract class Radnik {
//	Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

	protected String ime;
	protected String prezime;
	protected ArrayList<Sektor> sektori = new ArrayList<Sektor>();
	
	public Radnik(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		
	}
	
	public String getImeIPrezime() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public abstract double plataRadnika ();
	
	public void zaposliUSektor (Sektor nazivSektora) {
		sektori.add(nazivSektora);
	}
	

}

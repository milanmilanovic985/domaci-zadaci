package d20_01_2022;

import java.util.ArrayList;

public class Igrac2 extends Osoba2{
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		niz kartona
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu dodaj karton, gde se dodaje karton u niz
//		metodu koja vraca broj zutih kartona
//		metodu koja vraca broj crvenih kartona
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
	private int brojIgraca;
	private String pozicijaIgraca;
	ArrayList<Karton> nizKartona = new ArrayList<Karton>();
	private boolean kapiten;
	
	public Igrac2() {
		super();
		
	}
	public Igrac2(String ime, String prezime, String jmbg, int godinaRodj, int brojIgraca, String pozicijaIgraca, boolean kapiten) {
		super(ime, prezime, jmbg, godinaRodj);
		this.brojIgraca = brojIgraca;
		this.pozicijaIgraca = pozicijaIgraca;
		this.kapiten = kapiten;
		
	}
	public int getBrojIgraca() {
		return brojIgraca;
	}
	public String getPozicijaIgraca() {
		return pozicijaIgraca;
	}
	public boolean isKapiten() {
		return kapiten;
	}
	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}
	public void setPozicijaIgraca(String pozicijaIgraca) {
		this.pozicijaIgraca = pozicijaIgraca;
	}
	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	public void dodajKarton (Karton karton) {
		this.nizKartona.add(karton);
	}
	public int brojZutihKatona () {
		int zuti = 0;
		for (int i = 0; i < nizKartona.size(); i++) {
			if (this.nizKartona.get(i).getTipKartona().equals("zuti")) {
				zuti++;
			}
			
		}
		return zuti;
	}
	public int brojCrvenihKatrona () {
		int crveni = 0;
		for (int i = 0; i < nizKartona.size(); i++) {
			if (this.nizKartona.get(i).getTipKartona().equals("crveni")) {
				crveni++;
			}
		}
		return crveni;
	}
	@Override
	public void stampaj () {
		System.out.println(this.ime + " " + this.prezime + ", " + this.jmbg + ", " + this.godinaRodj);
		System.out.print("Broj koji nosi na dresu je: " + this.brojIgraca + ", igra na poziciji: " + this.pozicijaIgraca);
		if (this.kapiten) {
			System.out.println(", i kapiten je.");
		} else {
			System.out.println(", nije kapiten.");
		}
		System.out.println("Zutih kartona ima " + this.brojZutihKatona());
		System.out.println("Crvenih kartona ima " + this.brojCrvenihKatrona());
	}
	
	


}

package d20_01_2022;

public class Igrac extends Osoba{
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
	
	private int broj;
	private String pozicija;
	private boolean jeKapiten;
	
	public Igrac() {
		super();
		
	}
	public Igrac(String ime, String prezime, String jmbg, int godRodjenja, int broj, String pozicija, boolean jeKapiten) {
		super(ime, prezime, jmbg, godRodjenja);
		this.broj = broj;
		this.pozicija = pozicija;
		this.jeKapiten = jeKapiten;
		
	}
	
	public int getBroj() {
		return broj;
	}
	public String getPozicija() {
		return pozicija;
	}
	public boolean isJeKapiten() {
		return jeKapiten;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public void setJeKapiten(boolean jeKapiten) {
		this.jeKapiten = jeKapiten;
	}
	@Override
	public void stampaj () {
		System.out.println(this.ime + " " + this.prezime + ", " + this.jmbg + ", " + this.godRodjenja);
		System.out.print("Broj koji nosi na dresu je: " + this.broj + ", igra na poziciji: " + this.pozicija);
		if (this.jeKapiten) {
			System.out.println(", i kapiten je.");
		} else {
			System.out.println(", nije kapiten.");
		}
	}
	
	
	


}

package d20_01_2022;

public class Trener extends Osoba{
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
	private int godIskustva;
	private String tipTrenera;
	
	public Trener() {
		super();
		
	}
	public Trener(String ime, String prezime, String jmbg, int godRodjenja, int godIskustva, String tipTrenera) {
		super(ime, prezime, jmbg, godRodjenja);
		this.godIskustva = godIskustva;
		this.tipTrenera = tipTrenera;
				
	}
	public int getGodIskustva() {
		return godIskustva;
	}
	public String getTipTrenera() {
		return tipTrenera;
	}
	public void setGodIskustva(int godIskustva) {
		this.godIskustva = godIskustva;
	}
	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}
	@Override
	public void stampaj () {
		System.out.println(this.ime + " " + this.prezime + ", " + this.jmbg + ", " + this.godRodjenja);
		System.out.println("On je " + this.tipTrenera + " trener, i ima " + this.godIskustva + " god iskustva.");
	}
	
	
	


}

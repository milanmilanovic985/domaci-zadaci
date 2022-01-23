package d21_01_2022;

public class Sektor {
//	Zadatak  
//	Kreirati klasu Sektor koja ima:
//	 naziv sektora
//	 platu koja je za taj sektor
	public String nazivSektora;
	public int plataSektora;
	public Sektor(String nazivSektora, int plataSektora) {
		super();
		this.nazivSektora = nazivSektora;
		this.plataSektora = plataSektora;
	}
	public String getNazivSektora() {
		return nazivSektora;
	}
	public int getPlataSektora() {
		return plataSektora;
	}
	public void setNazivSektora(String nazivSektora) {
		this.nazivSektora = nazivSektora;
	}
	public void setPlataSektora(int plataSektora) {
		this.plataSektora = plataSektora;
	}
	
	


}

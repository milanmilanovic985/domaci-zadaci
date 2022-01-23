package d20_01_2022;

public class Karton {
//	2. Zadatak
//	Kreirati klasu Karton koja ima:
//	tip kartona (crveni, zuti)
//	konstuktore za koje mislite da ce vam trebati
//	gettere i settere za karton
	private String tipKartona;

	public Karton() {
		super();
		
	}

	public Karton(String tipKartona) {
		super();
		this.tipKartona = tipKartona;
	}

	public String getTipKartona() {
		return tipKartona;
	}

	public void setTipKartona(String tipKartona) {
		this.tipKartona = tipKartona;
	}
	
	


}

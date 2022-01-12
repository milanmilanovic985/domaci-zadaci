package d11_01_2022;

public class SmartAirConditioning {
	String marka;
	double potrosnjaDokHladi;
	double potrosnjaDokGreje;
	int izabranaTemperatura;
	boolean mod;
	
	public void stampaj () {
		System.out.println(this.marka + " klima je ukljucena u modu da hladi (" + this.mod + ") na izabranoj temperaturi " + this.izabranaTemperatura);
		System.out.println("Potrosnja " + this.marka + " klime dok hladi iznosi " + this.potrosnjaDokHladi + " kW/h a dok greje " + this.potrosnjaDokGreje + " kW/h");
	}
	public double mesecnaPotrosnja () {
		
		if (!this.mod) {
			return 30 * 15 * this.potrosnjaDokGreje;
		} else {
			return 30 * 15 * this.potrosnjaDokHladi;
		} 
	}
	public double mesecnaPotrosnjaNovca () {
		
		if (this.mesecnaPotrosnja() < 350) {
			return this.mesecnaPotrosnja() * 6;
		} else {
			return (this.mesecnaPotrosnja() - 350) * 9; 
		}
		
	}

}

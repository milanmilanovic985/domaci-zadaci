package d11_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//			atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//			atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//			atribut za mod (hladi/greje)
//			metodu za stampu - stampa u formatu 
//			marka - mod - termperatura
//			metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//			30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//			metodu koja racuna koliko klima novca potrosi za mesec dana
//			Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//			Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//			Metoda vraca ukupnu cenu za taj mesec
//
//			U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

		SmartAirConditioning lg = new SmartAirConditioning();
		lg.izabranaTemperatura = 18;
		lg.marka = "Lg";
		lg.mod = true;
		lg.potrosnjaDokGreje = 2;
		lg.potrosnjaDokHladi = 1;
		if (lg.izabranaTemperatura < 16) {
			lg.izabranaTemperatura = 16;
		} else if (lg.izabranaTemperatura > 35) {
			lg.izabranaTemperatura = 35;
		}
		lg.stampaj();
		System.out.println("Mesecna potrosnja " + lg.marka + " klime dok hladi je " + lg.mesecnaPotrosnja() + "kW/h a to u novcu iznosi " + lg.mesecnaPotrosnjaNovca() + "din.");
		
		System.out.println();
		
		SmartAirConditioning daikin = new SmartAirConditioning();
		daikin.izabranaTemperatura = 27;
		daikin.marka = "Daikin";
		daikin.mod = false;
		daikin.potrosnjaDokGreje = 1.5;
		daikin.potrosnjaDokHladi = 0.8;
		if (daikin.izabranaTemperatura < 16) {
			daikin.izabranaTemperatura = 16;
		} else if (daikin.izabranaTemperatura > 35) {
			daikin.izabranaTemperatura = 35;
		}
		daikin.stampaj();
		System.out.println("Mesecna potrosnja " + daikin.marka + " klime dok greje je " + daikin.mesecnaPotrosnja() + "kW/h a to u novcu iznosi " + daikin.mesecnaPotrosnjaNovca() + "din.");
		

	}

}

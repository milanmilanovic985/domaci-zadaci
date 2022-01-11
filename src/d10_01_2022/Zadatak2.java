package d10_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//			atribut za mod (hladi/greje)
//			metodu za stampu - stampa u formatu 
//
//
//			U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i 
//			za svaki od njih pozvati metodu za stampu
		SmartAirConditioning a = new SmartAirConditioning();
		a.izabranaTemperatura = 17;
		a.marka = "Samsung";
		a.mod = "hladi";
		a.stampaj();
		System.out.println();
		SmartAirConditioning b = new SmartAirConditioning();
		b.izabranaTemperatura = 24;
		b.marka = "Daikin";
		b.mod = "greje";
		b.stampaj();


	}

}

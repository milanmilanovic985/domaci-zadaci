package d21_01_2022;

public class Menadzer extends Radnik{

	public Menadzer(String ime, String prezime) {
		super(ime, prezime);
		
	}
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
	@Override
	public double plataRadnika() {
		double sumaPlata = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			sumaPlata = sumaPlata + this.sektori.get(i).getPlataSektora();
		}
		return sumaPlata;
	}

}

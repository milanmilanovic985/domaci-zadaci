package d14_01_2022;

public class Vaga {
	private String mernaJedinica;
	private Proizvod proizvod;
	
	public Vaga () {
		
	}
	public void setMernaJedinica (String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	} 
	public String getMernaJedinica () {
		return this.mernaJedinica;
	}
	public void setProizvod (Proizvod proizvod) {
		this.proizvod = proizvod;
		
	}
	public Proizvod getProizvod () {
		return this.proizvod;
	}
	public double sracunajCenu (double tezinaProizvoda) {
		double konacnaCena = 0;
		if (this.mernaJedinica.equals("kg")) {
			konacnaCena = tezinaProizvoda * this.proizvod.getCenaPoKg();
		} else if (this.mernaJedinica.equals("lb")) {
			konacnaCena = tezinaProizvoda * this.proizvod.getCenaPoLb();
		} return konacnaCena;
	}
	public void print (double tezinaProizvoda) {
		this.proizvod.print();
		if (this.mernaJedinica.equals("kg")) {
			System.out.println(String.format("%.0f", this.proizvod.getCenaPoKg()) + " din po " + this.mernaJedinica + " x " + tezinaProizvoda + " kg");
			System.out.println("Ukupno : " + this.sracunajCenu(tezinaProizvoda));
			
		} else if (this.mernaJedinica.equals("lb")) {
			System.out.println(String.format("%.0f", this.proizvod.getCenaPoLb()) + " din po " + this.mernaJedinica + " x " + tezinaProizvoda + " lb");
			System.out.println("Ukupno : " + this.sracunajCenu(tezinaProizvoda));
			
		}
		
	}

}

package d17_01_2022;

public class ZeleniKarton {
	
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
	
	private String imeIPrezimeStudenta;
	private int brojIndexa;
	private String nazivPredmeta;
	private String imeIPrezimeProfesora;
	private int ocena;
	
	public ZeleniKarton () {
		
	}

	public ZeleniKarton(String imeIPrezimeStudenta, int brojIndexa, String nazivPredmeta, String imeIPrezimeProfesora,
			int ocena) {
		super();
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
		this.brojIndexa = brojIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
		this.ocena = ocena;
	}

	public String getImeIPrezimeStudenta() {
		return imeIPrezimeStudenta;
	}

	public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
	}

	public int getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(int brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeIPrezimeProfesora() {
		return imeIPrezimeProfesora;
	}

	public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public boolean daLiJePolozenIspit () {
		return (this.ocena > 5 && this.ocena <= 10); 
	}
	public void print () {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imeIPrezimeStudenta + ", " + this.brojIndexa);
		System.out.println("Profesor: " + this.imeIPrezimeProfesora);
		System.out.println();
	}

}

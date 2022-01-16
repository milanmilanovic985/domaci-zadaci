package d14_01_2022;

public class Autor {
	private String ime;
	private String prezime;
	
	public Autor () {
		
	}
	public Autor (String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	public void setIme (String ime) {
		this.ime = ime;
	}
	public String getIme () {
		return this.ime;
	}
	public void setPrezime (String prezime) {
		this.prezime = prezime;
	}
	public String prezime () {
		return this.prezime;
	}
	public void print () {
		System.out.println(this.ime + " " + this.prezime);
	}

}

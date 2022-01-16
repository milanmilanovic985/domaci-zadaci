package d14_01_2022;

public class Knjiga {
	private String isbn;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;
	
	public Knjiga () {
		
	}
	
	public Knjiga (String isbn, String naziv, int godinaIzdanja, Autor autor) {
		this.autor = autor;
		this.godinaIzdanja = godinaIzdanja;
		this.isbn = isbn;
		this.naziv = naziv;
		
	}
	public void setIsbn (String isbn) {
		this.isbn = isbn;
	}
	public String getIsbn () {
		return this.isbn;
	}
	public void setNaziv (String naziv) {
		this.naziv = naziv;
	}
	public String getNaziv () {
		return this.naziv;
	}
	public void setGodinaIzdanja (int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}
	public int getGodinaIzdanja () {
		return this.godinaIzdanja;
	}
	public void setAutor (Autor autor) {
		this.autor = autor;
	}
	public Autor getAutor () {
		return this.autor;
	}
	public void print () {
		System.out.println(this.isbn);
		System.out.println(this.naziv + " - " + this.godinaIzdanja);
		this.autor.print();
	}

}

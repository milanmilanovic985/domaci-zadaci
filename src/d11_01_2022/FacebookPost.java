package d11_01_2022;

public class FacebookPost {
	String korisnikObjavioPost;
	String korisnikPrimioPost;
	String tekst;
	int brojLajka;
	int brojDeljenja;
	
	public void like () {
		this.brojLajka = this.brojLajka + 1;
	}
	public void dislike () {
		this.brojLajka = this.brojLajka - 1;
		if (this.brojLajka < 0) {
			this.brojLajka = 0;
		}
	}
	public void share () {
		this.brojDeljenja = this.brojDeljenja + 1;
	}
	public void print () {
		System.out.println(this.korisnikObjavioPost + " >>> " + this.korisnikPrimioPost);
		System.out.println(this.tekst);
		System.out.println("Likes (" + this.brojLajka + ") | Shares (" + this.brojDeljenja + ")");
	}
	

}

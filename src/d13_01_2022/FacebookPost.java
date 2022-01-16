package d13_01_2022;

public class FacebookPost {
	private String korisnikObjavioPost;
	private String korisnikPrimioPost;
	private String tekst;
	private int brojLajka;
	private int brojDeljenja;

	public FacebookPost() {

	}

	public FacebookPost(String korisnikObjavioPost, String korisnikPrimioPost, String tekst, int brojLajka,
			int brojDeljenja) {
		this.brojDeljenja = brojDeljenja;
		this.brojLajka = brojLajka;
		this.korisnikObjavioPost = korisnikObjavioPost;
		this.korisnikPrimioPost = korisnikPrimioPost;
		this.tekst = tekst;

	}

	public String getKorisnikObjavioPost() {
		return this.korisnikObjavioPost;
	}

	public void setKorisnikObjavioPost(String korisnikObjavioPost) {
		this.korisnikObjavioPost = korisnikObjavioPost;
	}

	public String getKorisnikPrimioPost() {
		return this.korisnikPrimioPost;
	}

	public void setKorisnikPrimioPost(String korisnikPrimioPost) {
		this.korisnikPrimioPost = korisnikPrimioPost;
	}

	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public int getBrojLajka() {
		return this.brojLajka;
	}

	public int getBrojDeljenja() {
		return this.brojDeljenja;
	}

	public void like() {
		this.brojLajka = this.brojLajka + 1;
	}

	public void dislike() {
		this.brojLajka = this.brojLajka - 1;
		if (this.brojLajka < 0) {
			this.brojLajka = 0;
		}
	}

	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
	}

	public void print() {
		System.out.println(this.korisnikObjavioPost + " >>> " + this.korisnikPrimioPost);
		System.out.println(this.tekst);
		System.out.println("Likes (" + this.brojLajka + ") | Shares (" + this.brojDeljenja + ")");
	}

}

package d11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
//		3..Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post 
//			(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne 
//					moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati 
//			svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1
		FacebookPost slika = new FacebookPost();
		slika.brojDeljenja = 3;
		slika.brojLajka = 15;
		slika.korisnikObjavioPost = "Milan Milanoviic";
		slika.korisnikPrimioPost = "Halle Berry";
		slika.tekst = "Najjaca si catwoman";
		
		slika.like();
		slika.like();
		slika.like();
		slika.dislike();
		slika.print();
		System.out.println();
		FacebookPost klip = new FacebookPost();
		klip.brojDeljenja = 14;
		klip.brojLajka = 256;
		klip.korisnikObjavioPost = "Mita Mitic";
		klip.korisnikPrimioPost = "Katarina Zutic";
		klip.tekst = "Najjaca si u filmu Nebeska udica.";
		
		klip.like();
		klip.like();
		klip.like();
		klip.like();
		klip.like();
		klip.like();
		klip.dislike();
		klip.print();
		
		


	}

}

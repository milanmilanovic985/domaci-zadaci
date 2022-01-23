package d20_01_2022;

import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		1.Zadatak
//		Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
//
//		Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//		Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//		(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati 
//		sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.
		
		Igrac igrac_1 = new Igrac("Milan", "Milanovic", "1610985750096", 1985, 10, "napadac", true);
		Igrac igrac_2 = new Igrac("Aleksandar", "Mitrovic", "1609994740069", 1994, 9, "napadac", false);
		
		Trener trener_1 = new Trener("Dragan", "Stojkovic", "0303965530096", 1965, 20, "glavni");
		Trener trener_2 = new Trener("Radomir", "Antic", "2211948740069", 1948, 50, "glavni");
		
		igrac_1.stampaj();
		igrac_2.stampaj();
		trener_1.stampaj();
		trener_2.stampaj();
		
		Scanner s = new Scanner (System.in);
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		
		System.out.println("Koliko igraca zelite da ubacite u niz: ");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite ime igraca:");
			String ime = s.next();
			System.out.println("Unesite prezime igraca:");
			String prezime = s.next();
			System.out.println("Unesite jmbg igraca:");
			String jmbg = s.next();
			System.out.println("Unesite godinu rodjenja igraca:");
			int godiste = s.nextInt();
			System.out.println("Broj koji nosi na dresu:");
			int broj = s.nextInt();
			System.out.println("Pozicija na koju igra u timu je:");
			String pozicija = s.next();
			System.out.println("Da li je kapiten (true ili false):");
			boolean jeKapiten = s.nextBoolean();
			Igrac igrac = new Igrac(ime, prezime, jmbg, godiste, broj, pozicija, jeKapiten);
			igraci.add(igrac);
		}
		
		System.out.println("Koliko trenera zelite da ubacite u niz: ");
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("Unesite ime trenera: ");
			String ime = s.next();
			System.out.println("Unesite prezime trenera:");
			String prezime = s.next();
			System.out.println("Unesite jmbg trenera: ");
			String jmbg = s.next();
			System.out.println("Unesite godinu rodjenja trenera: ");
			int godiste = s.nextInt();
			System.out.println("Godine iskustva:");
			int godIskustva = s.nextInt();
			System.out.println("Vrsta trenera (glavni, pomocni, kondicioni, personalni): ");
			String vrstaTrenera = s.next();
			Trener trener = new Trener(ime, prezime, jmbg, godiste, godIskustva, vrstaTrenera);
			treneri.add(trener);
			
			
		}
		for (int i = 0; i < igraci.size(); i++) {
			igraci.get(i).stampaj();
		}
		for (int i = 0; i < treneri.size(); i++) {
			treneri.get(i).stampaj();
		}
		


	}

}

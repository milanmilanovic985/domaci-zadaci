package d17_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {

//			U glavnoj klasi:
//		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
		
		ArrayList<ZeleniKarton> student = new ArrayList<ZeleniKarton>();
		
		ZeleniKarton student1 = new ZeleniKarton("Milan Milanovic", 9306, "Matematika", "Stojadin Milosevic", 8);
		student.add(student1);
		ZeleniKarton student2 = new ZeleniKarton("Jovan Jovanovic", 9405, "Informatika", "Milanka Canic", 7);
		student.add(student2);
		ZeleniKarton student3 = new ZeleniKarton("Nikola Nikolic", 7304, "Poslovna Ekonomija", "Dusanka Ilic", 6);
		student.add(student3);
		ZeleniKarton student4 = new ZeleniKarton("Pera Peric", 6502, "Poslovna Ekonomija", "Dusanka Ilic", 9);
		student.add(student4);
		ZeleniKarton student5 = new ZeleniKarton("Nikolija Stankovic", 4569, "Racunovodstvo", "Violeta Trajkovic", 5);
		student.add(student5);
		ZeleniKarton student6 = new ZeleniKarton("Stanko Stankovic", 7802, "Poslovna Ekonomija", "Dusanka Ilic", 5);
		student.add(student6);
		ZeleniKarton student7 = new ZeleniKarton("Maja Jovanovic", 2315, "Matematika", "Stojadin Milosevic", 10);
		student.add(student7);
		ZeleniKarton student8 = new ZeleniKarton("Petar Petrovic", 1122, "Informatika", "Milanka Canic", 5);
		student.add(student8);
		ZeleniKarton student9 = new ZeleniKarton("Tijana Gmitrovic", 1412, "Poslovna Ekonomija", "Dusanka Ilic", 10);
		student.add(student9);
		ZeleniKarton student10 = new ZeleniKarton("Mata Matic", 7845, "Informatika", "Milanka Canic", 10);
		student.add(student10);
		ZeleniKarton student11 = new ZeleniKarton("Stojan Milojkovic", 1233, "Racunovodstvo", "Violeta Trajkovic", 6);
		student.add(student11);
		
		for (int i = 0; i < student.size(); i++) {
			student.get(i).print();
			
		}
		
		double zbirOcena = 0;
		for (int i = 0; i < student.size(); i++) {
			
			zbirOcena = zbirOcena + student.get(i).getOcena();
		}
		
		double prosecnaOcena = zbirOcena / student.size();
		System.out.println("Prosecna ocena studenata je: " + prosecnaOcena);
		
		
		double zbirPolozenihOcena = 0;
		int brojPolozenihPredmeta = 0;
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).daLiJePolozenIspit()) {
				zbirPolozenihOcena = zbirPolozenihOcena + student.get(i).getOcena();
				brojPolozenihPredmeta = brojPolozenihPredmeta + 1;
			}
		}
		double prosecnaOcenaPolozenih = zbirPolozenihOcena / brojPolozenihPredmeta;
		System.out.println("Prosecna ocena studenata samo iz polozenih ispita je: " + prosecnaOcenaPolozenih);


	}

}

import java.util.Scanner;
public class Racun_Test {

	public static void main(String[] args) {
		
Banka racun=new Banka();
Scanner unos=new Scanner(System.in);


Racuni korisnik1 = new Racuni(1, " Nina ", 300);
Racuni korisnik2=new Racuni(2,"Nikolina",100);

System.out.println("Broj korisnika: " + korisnik1.getBrRacuna() + korisnik1.getIme()
		+ korisnik1.getStanje());
System.out.println("Broj korisnika: " + korisnik2.getBrRacuna() + korisnik2.getIme()
+ korisnik2.getStanje());



System.out.println("Izaberite broj:");
System.out.println("Menu");
System.out.println();
System.out.println("1. Kreiranje racuna");
System.out.println("2.Uplata na racun");
System.out.println("3. Isplata");
System.out.println("4. Transfer");
System.out.println("5. Stanje racuna");

System.out.println();
    System.out.print("Unesite opciju koju zelite" );
    System.out.println();

  int  broj = unos.nextInt();
 for(int i=0;i<100;i++) {
		if (broj==1) {
		
	 System.out.println("Unesite broj racuna, ime korisnika i stanje na racunu da biste kreirali racun");
		int brRacuna=unos.nextInt();
		String ime=unos.nextLine();
		double stanje=unos.nextDouble();
		racun.kreirajRacun(brRacuna, ime, stanje);
		System.out.println("Unesite broj ponovo");
		broj=unos.nextInt();
		}	
			
		if(broj==2) {
			System.out.println("Na koji racun uplacujete");
			int racun1=unos.nextInt();
			System.out.println("Unesite koliko uplacujete");
		    double iznos=unos.nextDouble();
		    
		    while (iznos<0) {
		    	System.out.println("Mora biti pozitivan");
		    	iznos=unos.nextDouble();
		    }

		racun.uplati(racun1,iznos);
		System.out.println("Unesite broj ponovo");
		broj=unos.nextInt();
		}	
			
			
		if(broj==3) {
			System.out.println("Sa kojeg koji racuna uplacujete");
			int racun1=unos.nextInt();
		System.out.println("Unesite koliko zelite isplatiti");
		
		double iznos=unos.nextDouble();

		racun.isplati(racun1,iznos);
		System.out.println("Unesite broj ponovo");
		broj=unos.nextInt();
		}	
			
			
		if(broj==4) {
		System.out.println("Unesite racun sa kojeg prebacujete");
		int  racun1=unos.nextInt();
		System.out.println("Unesite racun na koji prebacujete");
		int racun2=unos.nextInt();
		System.out.println("Unesite iznos");
		double iznos=unos.nextDouble();
		
		while (iznos<0) {
			System.out.println("Iznos mora biti veci od 0");
			iznos=unos.nextDouble();
		}

		racun.transfer(racun1, racun2,iznos);
	
		System.out.println("Unesite broj ponovo");
		broj=unos.nextInt();
		}	
			
		if(broj==5) {
		System.out.println("Informacije o korisniku");	
		racun.stanje();
		System.out.println("Unesite broj ponovo");
		broj=unos.nextInt();
		}	
		}}}
		
		
		
		
		
	
	




		


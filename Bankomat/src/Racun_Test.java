import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Racun_Test {


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
Banka racun=new Banka();


Scanner unos=new Scanner(System.in);
Racuni p1 = new Racuni(1,"Nina",345);
Racuni p2 = new Racuni(2,"Ninaa",3455);
/*
//try {
	FileOutputStream f = new FileOutputStream("spisak.txt");
	ObjectOutputStream o = new ObjectOutputStream(f);
	  java.io.PrintWriter output=new java.io.PrintWriter("najbolj.txt");
	
	o.writeObject(p1);
	o.writeObject(p2);

    o.close();
	f.close();

	FileInputStream fi = new FileInputStream("spisak.txt");
	ObjectInputStream oi = new ObjectInputStream(fi);

	
	Racuni pr1 = (Racuni) oi.readObject();
	Racuni pr2 = (Racuni) oi.readObject();

	System.out.println(pr1.toString());
	System.out.println(pr2.toString());
	 output.print(pr1.toString());
	 output.print(pr2.toString());
	oi.close();
	fi.close();


//} 
//catch (Exception e) {
//	System.out.println("Error initializing stream");
//}

*/


String s = "";

java.io.File file1=new java.io.File("Br racuna.txt");
java.io.File file2=new java.io.File("Imena.txt");
java.io.File file3=new java.io.File("Stanje.txt");

java.io.PrintWriter output1 = new java.io.PrintWriter (file1);
java.io.PrintWriter output2 = new java.io.PrintWriter (file2);
java.io.PrintWriter output3 = new java.io.PrintWriter (file3);


BufferedReader brBrRacuna = new BufferedReader(new FileReader(file1));
BufferedReader brIme = new BufferedReader(new FileReader(file2));
BufferedReader brStanje = new BufferedReader(new FileReader(file3));

try {
	 while((s =brIme.readLine()) != null) {
		racun.lista.add(new Racuni(Integer.parseInt(brBrRacuna.readLine()), s, Double.parseDouble(brStanje.readLine())));

	}
}
catch (IOException e) {
    
    e.printStackTrace();
	
}
try {
	brBrRacuna.close();
	brIme.close();
	brStanje.close();
	} 
catch (IOException e2) {
	
	e2.printStackTrace();

}





System.out.println("Izaberite broj:");
System.out.println("Menu");
System.out.println();
System.out.println("1. Kreiranje racuna");
System.out.println("2.Uplata na racun");
System.out.println("3. Isplata");
System.out.println("4. Transfer");
System.out.println("5. Stanje racuna");
System.out.println("6.Racun korisnika");

System.out.println();
    System.out.print("Unesite opciju koju zelite" );
    System.out.println();

  int  broj = unos.nextInt();
  do {
		
		try {
			

		if (broj==1) {
		
	 System.out.println("Unesite broj racuna, ime korisnika i stanje da biste kreirali racun");
		int brRacuna=unos.nextInt();
	System.out.println("Unesite ime ");
		String ime=unos.next();
		System.out.println("Unesite stanje na racunu ");
		double stanje=unos.nextDouble();
		racun.kreirajRacun(brRacuna, ime,stanje);
		
		
			output1.println(brRacuna);
			output2.println(ime);
			output3.println(stanje);
			
		
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
			System.out.println("Sa kojeg koji racuna isplacujete");
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
		System.out.println("Koje je trenutno stanje na racunu");
		double stanje1=unos.nextDouble();
		
		
		while (iznos<0) {
			System.out.println("Iznos mora biti veci od 0");
			iznos=unos.nextDouble();
		}

		racun.transfer(racun1, racun2,iznos,stanje1);
	
		System.out.println("Unesite broj ponovo");
		broj=unos.nextInt();
		}	
			
		if(broj==5) {
		System.out.println("Informacije o korisniku");	
		racun.stanjeRacuna();
		System.out.println("Unesite broj ponovo");
		broj=unos.nextInt();
	

			
		}
		}
  

  catch (Exception e) {
		System.out.println("Pogresan unos pokusajte ponovo!");
	}
		
}
	while (broj<6);
output1.close();
output2.close();
output3.close();


}
		
}
		
		
	
	




		


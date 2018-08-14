import java.util.ArrayList;
public class Banka {

	ArrayList<Racuni> lista = new ArrayList<Racuni>();
	public double stanje;
	

	public void kreirajRacun(int brRacuna,String ime) {
	
		boolean kreiraj=true;
	
	for(Racuni obj:lista)  {
		if( obj.getBrRacuna()==brRacuna) {
			kreiraj=false;
	    System.out.println("Racun vec postoji");  
	 }  
	}
	if(brRacuna<0) {
		kreiraj=false;
		System.out.println("Broj racuna mora biti pozitivan");
		
	}
	if(kreiraj=true) {
		
		lista.add(new Racuni());
		System.out.println("Kreirali ste racun" +brRacuna +ime );
	}
	
	
	}
	
	public void uplati(int brRacuna,double iznos) {
		for (int i=0; i<lista.size();i++) {
	
		 double stanje = +iznos;
		System.out.println(" uplaceno je" + iznos+" Trenutno stanje je" +stanje);
	}
	}
	
	public void isplati(int brRacuna,double iznos) {
		for (int i=0; i<lista.size();i++) {
		if(iznos < 0 && brRacuna <0)
			{
				System.out.println("Ne mozete isplatit negativan iznos novca !!!");
				return;
			}
		double stanje = 0;
		if (iznos <stanje ) {
			System.out.println("Nemate dovoljno na racunu ");
			return;
		}
		this.stanje -= iznos;
		System.out.println(" uplaceno je" + iznos+" Trenutno stanje je" +stanje);
	}
	}
	public void transfer(int racun1, int racun2,double iznos ) {
		if(iznos < 0)
		{
			System.out.println("Ne mozete prebaciti negativan iznos novca");
			return;
		}
		if (iznos < this.stanje) {
			System.out.println("Nemate dovoljno na racunu");
			return;
		}
		else {
		stanje += iznos;
		this.stanje-= iznos;
		System.out.println("Transakcija uspjesno izvrsena.!");
	}
	}

public void stanjeRacuna() {
	
	for(Racuni obj:lista)  {


		System.out.println("Broj racuna: " + obj.getBrRacuna());
		System.out.println("Vlasnik racuna: " + obj.getIme());
	    System.out.println("Iznos na racunu: " + obj.getStanje());
	    System.out.println();
	}
	
}

}

	


    

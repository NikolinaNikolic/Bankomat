import java.util.ArrayList;
public class Banka {
	

	ArrayList<Racuni> lista = new ArrayList<Racuni>();
	private double stanje;

	public void kreirajRacun(int brRacuna,String ime,double stanje) {
	lista.add(new Racuni());
	for(Racuni obj:lista)  {
		if( obj.getBrRacuna()==brRacuna) {
	    System.out.println("Racun vec postoji");  
	 }  
	
	if(brRacuna<0 && stanje<0) {
		System.out.println("Broj racuna mora biti pozitivan");
		
	}
	else {
		lista.add(new Racuni());
	}
	}
	}

	
	public void uplati(int brRacuna,double iznos) {
		
		if(iznos < 0) {
			System.out.println("Iznos mora biti pozitivan !!!");
			return;
		}
		else {
		stanje += iznos;
		System.out.println(" uplaceno je" + iznos+" Trenutno stanje je" +stanje);
	}
	}
	public void isplati(int brRacuna,double iznos) {
		if(iznos < 0)
			{
				System.out.println("Ne mozete isplatit negativan iznos novca !!!");
				return;
			}
		if (iznos < this.stanje) {
			System.out.println("Nemate dovoljno na racunu ");
			return;
		}
		this.stanje -= iznos;
		System.out.println(" uplaceno je" + iznos+" Trenutno stanje je" +stanje);
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
		this.stanje -= iznos;
		System.out.println("Transakcija uspjesno izvrsena !!");
	}
	}

public void stanje() {
	
	for(int i=0; i<lista.size(); i++) {
		Racuni racun=lista.get(i);
		System.out.println(i+1 + ". racun:");
		System.out.println("Broj racuna: " + racun.getBrRacuna());
		System.out.println("Vlasnik racuna: " + racun.getIme());
	    System.out.println("Iznos na racunu: " + racun.getStanje());
	    System.out.println();
	}
	
}

}

	


    

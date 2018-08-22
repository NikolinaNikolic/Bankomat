import java.util.ArrayList;
public class Banka {

	ArrayList<Racuni> lista = new ArrayList<Racuni>();
	private double stanje;

	
	

	public void kreirajRacun(int brRacuna,String ime, double stanje) {
	Racuni racun=new Racuni(brRacuna,ime,stanje);
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
		
		lista.add(racun);
		System.out.println("Kreirali ste racun");
	}
	}
	

	public void uplati(int brRacuna1,double iznos) {
		for(Racuni obj:lista)  {
			if(iznos < 0 && brRacuna1 <0)
				{
					System.out.println("Ne mozete uplatiti negativan iznos novca !!!");
					return;
				}
			
			else {
			stanje=stanje+ iznos;
			
			System.out.println("Uplaceno je" + iznos+" Trenutno stanje je" +stanje);
			}
			}
	}
		
	public void isplati(int brRacuna,double iznos) {
		

		for(Racuni obj:lista)  {
		if(iznos < 0 && brRacuna <0)
			{
				System.out.println("Ne mozete isplatit negativan iznos novca !!!");
				return;
			}
		
		if (iznos >obj.getStanje()) {
			System.out.println("Nemate dovoljno na racunu ");
			return;
		}
		else 
		stanje =stanje- iznos;
		System.out.println(" Isplaceno je" + iznos+" Trenutno stanje je" +stanje);
	
	}
	}
	
	public void transfer(int racun1, int racun2,double iznos,double stanje ) {
		
		for(Racuni racun:lista)  {
		if(iznos < 0)
		{
			System.out.println("Ne mozete prebaciti negativan iznos novca");
			return;
		}
		if (iznos > stanje) {
			System.out.println("Nemate dovoljno na racunu");
			return;
		}
		else {
	
		
		stanje =racun.getStanje()+ iznos;
		}
		}
		for(Racuni racun:lista)  {
	 stanje=racun.getStanje()-iznos;
		System.out.println("Transakcija uspjesno izvrsena.!.Trenutno je na racunu." +stanje);
	}
	}
	

public void stanjeRacuna() {

	for(Racuni racun:lista)  {
		
			System.out.println("Broj racuna: " +racun.getBrRacuna());
			System.out.println("Vlasnik racuna: " + racun.getIme());
		    System.out.println("Iznos na racunu: " + racun.getStanje());
		    System.out.println();
		    

		
		}}

	
}

    

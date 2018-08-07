
public class Racuni {
	
	private int brRacuna;
	private String ime;
	double stanje;

	public Racuni() {
	}
	
	public Racuni(int brRacuna,String ime,double stanje) {
		

		this.brRacuna = brRacuna;
		this.ime = ime;
		this.stanje=stanje;

}
	public int getBrRacuna() {
		return brRacuna;
	}

	public void setBrRacuna(int brRacuna) {
		this.brRacuna= brRacuna;
	}
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getStanje() {
		return stanje;
	}

	public void setStanje(double stanje) {
		this.stanje = stanje;
	}



	}


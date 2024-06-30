import java.io.Serializable;

public class Kart implements Serializable {

	private char deðer;
	private boolean tahmin = false; // Ýlk baþta false deðerine atadýk çünkü ilk durumda tahminde bulunmadýk, dolayýsýyla tahmin deðeri herhangi bir þeyi göstermiyor.(baþta)
	                               
	
	public Kart(char deðer) { //CONSTRUCTOR
		
		this.deðer = deðer;
	}


	public char getDeðer() {
		return deðer;
	}


	public void setDeðer(char deðer) {
		this.deðer = deðer;
	}


	public boolean isTahmin() {
		return tahmin;
	}


	public void setTahmin(boolean tahmin) {
		this.tahmin = tahmin;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}

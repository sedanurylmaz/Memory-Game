import java.io.Serializable;

public class Kart implements Serializable {

	private char de�er;
	private boolean tahmin = false; // �lk ba�ta false de�erine atad�k ��nk� ilk durumda tahminde bulunmad�k, dolay�s�yla tahmin de�eri herhangi bir �eyi g�stermiyor.(ba�ta)
	                               
	
	public Kart(char de�er) { //CONSTRUCTOR
		
		this.de�er = de�er;
	}


	public char getDe�er() {
		return de�er;
	}


	public void setDe�er(char de�er) {
		this.de�er = de�er;
	}


	public boolean isTahmin() {
		return tahmin;
	}


	public void setTahmin(boolean tahmin) {
		this.tahmin = tahmin;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}

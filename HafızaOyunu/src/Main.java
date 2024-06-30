import java.io.File;
import java.util.Scanner;

public class Main {
	

	private static Kart[][] kartlar = new Kart[4][4];
	
	public static void kay�ttanAl() {
		File file = new File("kayit.bin");
		Scanner scanner = new Scanner(System.in);
		
		if(file.exists()) {
			
			System.out.println("Kaydedilmi� bir oyununuz var. Kay�ttan devam etmek ister misiniz?(yes or no)");
			String cevap = scanner.nextLine();
			
			if(cevap.equals("yes")) {
				kartlar = oyunKay�t.kay�ttanAl();
				return;
			}
			
		}
		
		kartlar[0][0] = new Kart('E');
		kartlar[0][1] = new Kart('A');
		kartlar[0][2] = new Kart('B');
		kartlar[0][3] = new Kart('F');
		kartlar[1][0] = new Kart('G');
		kartlar[1][1] = new Kart('A');
		kartlar[1][2] = new Kart('D');
		kartlar[1][3] = new Kart('H');
		kartlar[2][0] = new Kart('F');
		kartlar[2][1] = new Kart('C');
		kartlar[2][2] = new Kart('D');
		kartlar[2][3] = new Kart('H');
		kartlar[3][0] = new Kart('E');
		kartlar[3][1] = new Kart('G');
		kartlar[3][2] = new Kart('B');
		kartlar[3][3] = new Kart('C');
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Kart[][] kartlar = new Kart[4][4];
		
		kay�ttanAl();
		

	    while(oyunBittiMi() == false) {
	    	
		oyunTahtas�();
		System.out.println("��k�� i�in q'ya bas�n(yes or no)");
		String cikis = scanner.nextLine();
		
		
		if(cikis.equals("yes")) {
			System.out.println("Oyunu kaydetmek istiyor musunuz? (yes or no)");
			String kayit = scanner.nextLine();
			
			if(kayit.equals("yes")) {
				
				oyunKay�t.oyunKaydet(kartlar);
			}
			
			else {
				
				System.out.println("Oyun kaydedilmedi.");
			}
			System.out.println("Programdan ��k�l�yor...");
			break;
			
		}
		tahminEt();
	    }
	}
	
	public static void tahminEt() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci tahmininizin i ve j de�erlerini giriniz: ");
		int i1 = scan.nextInt();
		int j1 = scan.nextInt();
		kartlar[i1][j1].setTahmin(true);
		
		oyunTahtas�();
	   
		System.out.println("�kinci tahmininizin i ve j de�erlerini giriniz: ");
		int i2 = scan.nextInt();
		int j2 = scan.nextInt();
		
		if(kartlar[i1][j1].getDe�er() == kartlar[i2][j2].getDe�er()) {
			System.out.println("Do�ru Tahmin.");
			kartlar[i2][j2].setTahmin(true);
		}
		else {
			System.out.println("Yanl�� Tahmin.");
			kartlar[i1][j1].setTahmin(false);
			
		}
		
	}

	public static void oyunTahtas�() {
		
		for(int i=0; i<4; i++) {
			System.out.println("___________________");
		   for(int j=0; j<4; j++) {
			   if(kartlar[i][j].isTahmin()) {
			   System.out.print(" | "+kartlar[i][j].getDe�er()+" | ");
			   }
			   else {
				   System.out.print(" | | ");
			   }
		   }
		   System.out.println(" ");
	}
		System.out.println("_______________________");
}
	
	public static boolean oyunBittiMi() {
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				
				if(kartlar[i][j].isTahmin()==false) {
					return false;
				}
			}
		}
		
		return true;
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class oyunKayit {

	public static void oyunKaydet(Kart[][] kartlar) {
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit.bin"))) {
				System.out.println("Oyun kaydediliyor...");
				
				out.writeObject(kartlar);
	}
	
	catch(IOException ex) {
		
		System.out.println("Hata al�nd�.");
	}
	
	
	}
	
	
	public static Kart[][] kay�ttanAl() {
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin"))) {
		       
			
			Kart[][] cikti = (Kart[][]) in.readObject();
			
			return cikti;
			
		}
		
		catch(IOException ex) {
			
			System.out.println("Hata al�nd�.");
		}
		
		catch(ClassNotFoundException ex) {
			
			System.out.println("Hata al�nd�.");
		}
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

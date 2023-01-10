package intro;

public class Metotlar {

	public static void main(String[] args) {
		
		mesajVer("Kerem");
		System.out.println(topla(6,3));
		System.out.println(toplananIkiSayininYuzdeOnu(100,10));
		
	}
		

		public static void mesajVer(String isim) {
		System.out.println("Merhaba "+isim);	
		
	}	
		public static int topla(int sayi1, int sayi2) {
			int toplam = sayi1 + sayi2;
			return toplam;
			
		}
	//toplanan iki sayinin %10 unu bul
		
		public static double toplananIkiSayininYuzdeOnu(int sayi1, int sayi2) {
			int toplam = (sayi1+sayi2);
			double sonuc = toplam * 10/100;
			return sonuc;
			
		}
		public static double krediHesapla(double krediMiktari) {
			//hesaplar yapilir
			return 125000;
		}
}

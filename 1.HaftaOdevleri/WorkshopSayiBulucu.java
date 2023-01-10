package intro;

public class WorkshopSayiBulucu {

	public static void main(String[] args) {
		int[] sayilar = new int [] {1,2,3,4,5,6,7,8,9,10};
		int aranacak = 15;
		boolean varMi = sayiBul(sayilar,aranacak);
		mesajVer (varMi,aranacak);
	}	
	public static void mesajVer(boolean varMi, int aranacak) {
		String mesaj ="";
		if (varMi==true) {
			mesaj = "sayi mevcuttur: " + aranacak;
			System.out.println(mesaj);
		}else {
			mesaj = "sayi mevcut değildir: " + aranacak;
			System.out.println(mesaj);
		}
	}
	public static boolean sayiBul (int[]sayilar, int aranacak ) {
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		}return varMi;
	}	
}
//Bir fonksiyon yaz - boolean döndürsün - sayiBul
//İki parametre alsın fonksiyon P1: dizi , P2: sayi
//sonuç : sayi vardir "sayi" veya sayi yoktur "sayi"
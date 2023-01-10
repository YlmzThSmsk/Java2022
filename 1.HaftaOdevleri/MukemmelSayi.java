package javaEski;

public class MukemmelSayi {

	public static void main(String[] args) {
		int number = 8128;
		int araToplam =0;
		
		for(int i =1;i<number;i++) {
			if(number % i == 0) {
				araToplam = araToplam +i;
			}
		}
		if(number == araToplam) {
			System.out.println("Sayı Mukemmel Sayıdır");
		}else {
			System.out.println("Sayı mükemmel sayi değildir");
		}
		
		

	}

}

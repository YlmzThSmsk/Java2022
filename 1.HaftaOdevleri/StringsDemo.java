package javaEski;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj = "bugün hava çok güzel.";
		
		/*
		 * System.out.println(mesaj); System.out.println("Eleman sayisi :"+
		 * mesaj.length()); System.out.println("5.eleman :"+mesaj.charAt(4));
		 * System.out.println(mesaj.concat(" Yaşasın!"));
		 * System.out.println(mesaj.startsWith("B"));
		 * System.out.println(mesaj.indexOf("a"));
		 * System.out.println(mesaj.lastIndexOf("a"));
		 */
		String yeniMesaj = mesaj.replace (" ","-" );
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		
	}

}

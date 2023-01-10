package intro;

public class arrayler {

	public static void main(String[] args) {
		String[] sehirler1 = new String[] {"Anraka,İstanbul,İzmir"}; 
		
		sehirler1 = new String[4];
		sehirler1[3]="Bursa";
		System.out.println(sehirler1[1]);
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 30;
		System.out.println(sayi1);
		
	}

}
//Value types : boolean, int, double ...
// Reference Types: array, class, abstract

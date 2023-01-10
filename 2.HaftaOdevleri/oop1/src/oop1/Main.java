package oop1;

public class Main {

	public static void main(String[] args) {
		// set value
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setImageUrl("image1.jpg");
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setImageUrl("image2.jpg");
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setImageUrl("image3.jpg");
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0523252356236");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demirog");
		
		
		CorparateCustomer corparateCustomer = new CorparateCustomer();
		corparateCustomer.setId(2);
		corparateCustomer.setCompanyName("Kodlama.io");
		corparateCustomer.setPhone("05333333");
		corparateCustomer.setTaxNumber("1111111111");
		corparateCustomer.setCustomerNumber("54342");
		
		
		Customer[] customers = {individualCustomer,corparateCustomer};
		
		
	}

}

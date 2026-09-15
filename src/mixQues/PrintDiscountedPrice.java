package mixQues;

import java.util.Scanner;

public class PrintDiscountedPrice {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Shopping Price: ");
		int ShoppingPrice = Integer.parseInt(sc.nextLine());
		
		double discount;
		
		if(ShoppingPrice >= 10000) {
			discount = 40;
		}else if(ShoppingPrice >= 6000 && ShoppingPrice <= 9999) {
			discount = 30;
		}else if(ShoppingPrice >= 3000 && ShoppingPrice <= 5999) {
			discount = 20;
		}else if(ShoppingPrice >= 1 && ShoppingPrice <= 2999) {
			discount = 8;
		}else {
			discount = 0;
		}
		
		double DiscountAmount = ShoppingPrice*discount/100;
		double DiscountedPrice = ShoppingPrice - DiscountAmount;
		
		System.out.println("Shopping Price is: " +ShoppingPrice);
		System.out.println("Discount is: " +discount+ " %");
		System.out.println("Discount Amount is: " +DiscountAmount);
		System.out.println("Discounted Price is: " +DiscountedPrice);
		
		sc.close();
		

	}

}

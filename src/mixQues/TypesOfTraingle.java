package mixQues;

import java.util.Scanner;

public class TypesOfTraingle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int [3];
		
		System.out.println("Enter the Sides of Traingle: ");
		
		num[0] = Integer.parseInt(sc.nextLine());
		num[1] = Integer.parseInt(sc.nextLine());
		num[2] = Integer.parseInt(sc.nextLine());

		int a = num[0];
		int b = num[1];
		int c = num[2];
		
		if(a + b > c && b + c > a && a + c > b) {
			
			if(a == b && b == c) {
				System.out.println("Equilateral Triangle");
			}else if(a == b || b == c || c == a) {
				System.out.println("Isoceles Traingle");
			}else {
				System.out.println("Scalene Traingle");
			}
		}else {
			System.out.println("Condition For Traingle is Failed !");
		}
		
		sc.close();
	}

}

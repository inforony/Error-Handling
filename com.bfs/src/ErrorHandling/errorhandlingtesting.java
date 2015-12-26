package ErrorHandling;

import java.util.Scanner;

public class errorhandlingtesting {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("Enter your first Number :");
		int num1 = sc.nextInt();
		
		
		System.out.println("Enter your Second Number :");
		int num2 =sc.nextInt();
		
		System.out.println("Result of num1/num2 is : " +num1/num2);
	} catch (Exception e) {
		System.out.println("Error :" +e.getMessage());
	}
	
	
		
	}

}

package Day_2;

import java.util.Scanner;

public class Taking_Input_From_User {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value - ");
		int x = sc.nextInt();
		System.out.println("Integer value is "+x);
		
		System.out.println("Enter the value - ");
		float f = sc.nextFloat();
		System.out.println("Float value is "+f);
		
		System.out.println("Enter the value is - ");
		double d = sc.nextDouble();
		System.out.println("Double value is "+d);
		
		System.out.println("Enter a string - ");
		String s = sc.next();
		System.out.println("Entered String is "+s);

	}

}

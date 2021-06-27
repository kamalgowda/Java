import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Integer Number");
		int a =sc.nextInt();
		System.out.println("Entered number is "+a);
		System.out.println("Enter a Float Number");
		float b =sc.nextFloat();
		System.out.println("Entered number is "+b);
		System.out.println("Enter a Long Integer Number");
		long c =sc.nextLong();
		System.out.println("Entered number is "+c);
		sc.nextLine();
		System.out.println("Enter a String");
		String d =sc.nextLine();
		System.out.println("Entered String is "+d);
	}

}

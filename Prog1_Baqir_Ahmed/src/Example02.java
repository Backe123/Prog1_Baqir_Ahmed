import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("skriv namn :");
		
		String namn=input.nextLine();
		
		System.out.println("skriv ålder : ");
		int ålder = input.nextInt();
		
		System.out.println("Skriv din längd : ");
		double längd = input.nextDouble();
		
		System.out.println(namn+" är "+ålder+"år gammal och har en "+längd+"m lång.");
		System.out.println("Gött");
	}

}

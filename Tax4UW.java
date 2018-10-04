import java.util.Scanner;

public class Tax4UW {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employment emp = null;
		String name = "";
		String input = "";
		double amt = 0.00;
		System.out.println("Hello there! What is your name?");
		name = scan.nextLine();
		System.out.println("I see, so " + name + ", were you employed in the year? (Yes/No)");
		input = scan.nextLine();
		if (input.equalsIgnoreCase("Yes")){
			emp = new Employment();
			System.out.println("How much is your salary? Don't worry, I won't judge.");
			amt = Double.parseDouble(scan.nextLine());
			emp.AddSal(amt);
			System.out.println("Are there any commission income? (Yes/No)");
			input = scan.nextLine();
			if (input.equalsIgnoreCase("Yes")){
				System.out.println("How much was it in total?");
				amt = Double.parseDouble(scan.nextLine());
				emp.AddCom(amt);
			} else {
				System.out.println("Okay. Let's move on.");
			}
			System.out.println("Did you receive any bonus in this year? (Yes/No)");
			
			input = scan.nextLine();
			if (input.equalsIgnoreCase("Yes")){
				System.out.println("Yay! How much?");
				amt = Double.parseDouble(scan.nextLine());
				emp.AddBonus(amt);
			} else {
				System.out.println("That's alright. Don't feel sad.");
			}
		} else {
			System.out.println("Ok. Goodbye " + name + "!");
		}
	}
}
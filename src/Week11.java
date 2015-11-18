import java.util.Scanner;

public class Week11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int roll, bounce, dices,numberDice;

		System.out.println("How many dice would you like to throw?");
		dices = input.nextInt();
		
		System.out.println("How many bounces did your dice make?");
		bounce = input.nextInt();
		
		Dices Roll = new Dices(bounce,dices);
		numberDice = Roll.getDices();
		
		System.out.println(numberDice);
		
	}
}
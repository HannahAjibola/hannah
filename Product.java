import java.util.Scanner;
public class Product{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("enter first integer:");
	int number1 = input.nextInt();

	System.out.print("enter second integer:");
	int number2 = input.nextInt();

	System.out.print("enter third integer:");
	int number3 = input.nextInt();

	int product = number1 * number2 * number3;
	System.out.printf("product is %d%n", product);
	}
}
import java.util.Scanner;
public class Multiple{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer:");
	int num1 = input.nextInt();

	System.out.println("Enter secind integer:");
	int num2 = input.nextInt();
	
	int firstNumber = num1 * 3;
	int secondNumber = num2 * 2;

	if (firstNumber % secondNumber == 0){
	System.out.print("Triple of the first number is a multiple of double of the second number");
	} else {
	System.out.print("Triple of the first number is not a multiple of double of the second number");
	}

	}
}
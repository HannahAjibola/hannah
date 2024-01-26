import java.util.Scanner;
public class Divisible{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enrter an integer:");
	int num1 = input.nextInt();

	if (num1 % 3 == 0){
	System.out.println(num1 + " is divisible by 3" );
	} else {
	System.out.println(num1 + " is not divisible by 3");
	}
	
	}

}
import java.util.Scanner;
public class SmallAndLarge{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer:");
	int num1 = input.nextInt();

	System.out.print("Enter second integer:");
	int num2 = input.nextInt();

	System.out.print("Enter third integer:");
	int num3 = input.nextInt();

	int sum = num1 + num2 + num3;

	System.out.println("sum is:" + sum);
	
	int product = num1 * num2 * num3;
	System.out.println("product is:" + product);

	int average = sum / 3;
	System.out.println("average is :" + average);

	int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

	System.out.print("smallest is:" + smallest);

	 int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

	System.out.println("Largest is:" + largest);


	}
}

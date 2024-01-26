import java.util.Scanner;
public class LargestSmallestIntegers{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer:");
int num1 = input.nextInt();

System.out.print("Enter second integer:");
int num2 = input.nextInt();

System.out.print("Enter third integer:");
int num3 = input.nextInt();

System.out.print("Enter fourth integer:");
int num4 = input.nextInt();

System.out.print("Enter fifth integer:");
int num5 = input.nextInt();

int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
	if (num4 < smallest){
		smallest = num4;
	}
	if (num5 < smallest){
		smallest = num5;
	}

	int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else if (num3 >= num1 && num3 >= num4) {
            largest = num3;
        } else if (num4 >= num2 && num4 >= num1){
		largest = num4;
	} else {
		largest = num5;
	}

	System.out.println("smallest is:" + smallest);
	System.out.println("largest is:" + largest);
	

	}

}
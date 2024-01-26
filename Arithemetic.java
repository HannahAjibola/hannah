import java.util.Scanner;
public class Arithemetic{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.print("Enter an integer:");
int number1 = input.nextInt();

System.out.print("Enter an integer:");
int number2 = input.nextInt();

int Square1 = number1 * number1;
int Square2 = number2 * number2;

int sumOfSquares = Square1 + Square2;
int differenceOfSquares = Square1 - Square2;

System.out.println("Square of" + number1 +":" + Square1);
System.out.println("Square of" + number2 + ":" + Square2);
System.out.println("Difference of squares" + ":" + differenceOfSquares);
}
}
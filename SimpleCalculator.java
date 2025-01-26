import java.util.*;
class calculator{
	public double sum(double num1, double num2) {
		return num1+num2;
	}
	public double sub(double num1, double num2) {
		return num1-num2;
	}
	public double mul(double num1, double num2) {
		return num1*num2;
	}
	public double div(double num1, double num2) {
		if(num2==0) {
			throw new ArithmeticException("Cannot divide by zero.");
		}
		return num1/num2;
	}
	public double rem(double num1, double num2) {
		if(num2==0) {
			throw new ArithmeticException("Cannot divide by zero.");
		}
		return num1%num2;
	}
	public double lar(double num1, double num2) {
		return Math.max(num1, num2);
	}
	public double small(double num1, double num2) {
		return Math.min(num1, num2);
	}
	public double avg(double num1, double num2) {
		return (num1+num2)/2;
	}
}
public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calculator calc = new calculator();
		System.out.println("ENTER THE FIRST NUMBER: ");
		double num1 = sc.nextDouble();
		System.out.println("ENTER THE SECOND NUMBER: ");
		double num2 = sc.nextDouble();
		System.out.println("\n---------------Results---------------");
		System.out.println("sum: "+ calc.sum(num1, num2));
		System.out.println("Difference: "+ calc.sub(num1, num2));
		System.out.println("Multiplication: "+ calc.mul(num1, num2));
		try {
		System.out.println("Division: "+calc.div(num1, num2));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		try {
		System.out.println("Remainder: "+calc.rem(num1, num2));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Largest Number: "+calc.lar(num1, num2));
		System.out.println("Smallest Number: "+calc.small(num1, num2));
		System.out.println("Average: "+calc.avg(num1, num2));
		sc.close();
	}

}

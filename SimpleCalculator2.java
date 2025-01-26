import java.util.*;
public class SimpleCalculator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER: ");
		double num1 = sc.nextDouble();
		System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter the number of the operation (1/2/3/4): ");
        int operation =sc.nextInt();
        System.out.println("ENTER THE SCOND NUMBER: ");
        double num2 = sc.nextDouble();
        double result = 0;
        switch(operation) {
        case 1:
        	result=num1+num2;
        	break;
        case 2:
        	result=num1-num2;
        	break;
        case 3:
        	result=num1*num2;
        	break;
        case 4:
        	if(num2!=0) {
        		result=num1/num2;
        	}
        	else {
        		System.out.println("DIVISION BY ZERO IS NOT ALLOWED");
        	}
        	break;
        default:
        	System.out.println("INVALID CHOICE");
        }
	System.out.println("RESULT: "+result);
    sc.close();
        
	}

}

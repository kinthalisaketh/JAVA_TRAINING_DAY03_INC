import java.util.*;
class Find1{
	public String Search(int matrix[][], int num) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==num) {
					return "The number is found at "+(i+1)+"th row "+(j+1)+"th coloum";
				}
			}
		}
		return "Not Found!!";
	}
	public int CheckNum(int n) {
		Scanner sc= new Scanner(System.in);
		
		while (true) {
            try {
                System.out.print("Enter a number between 0 and 9: ");
                n = sc.nextInt();

                if (n < 0 || n > 9) {
                    System.out.println("Error, the number must be in the range of 0 - 9.");
                } else {
                    break;  // Exit loop if input is valid
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, please enter a valid integer.");
                sc.nextLine();
            }
        }
		sc.close();
		return n;
	}
}

public class FirstOccurenceWithErrorhandeling {
	private static int matrix[][]= {
			{1,7,3,9,5,3},
			{6,2,3},
			{7,5,1,4,0},
			{1,0,2,9,6,3,7,8,4}
	};
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter the number to find: ");
		Find1 s = new Find1();
		int num=sc.nextInt();
		num=s.CheckNum(num);
		System.out.print(s.Search(matrix, num));
		sc.close();
	}
}
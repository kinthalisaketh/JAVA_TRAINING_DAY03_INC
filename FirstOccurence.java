import java.util.*;
public class FirstOccurence {
    private static int matrix[][] = {
            {1, 7, 3, 9, 5, 3},
            {6, 2, 3},
            {7, 5, 1, 4, 0},
            {1, 0, 2, 9, 6, 3, 7, 8, 4}
    };
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find the position: ");
        int num = s.nextInt();
        boolean found = false;  
        // Iterate through the matrix to find the number
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == num) {
                    System.out.println("The number is found at Row " + (i + 1) + ", Column " + (j + 1));
                    found = true;
                    break; 
                }
            }
            if (found) break; 
        }
        if (!found) {
            System.out.println("The number was not found in the matrix.");
        }
    }
}

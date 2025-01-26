import java.util.*;
class StrangeCalc {
    private List<Double> numbers;
    public StrangeCalc(Double... nums) {
        numbers = new ArrayList<>(Arrays.asList(nums));
    }
    public double sum() {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }
    public double subtract() {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Need at least two numbers for subtraction.");
        }
        return numbers.get(0) - numbers.get(1);
    }
    public double multiply() {
        double result = 1;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }
    public double divide() {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Need at least two numbers for division.");
        }

        double result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            result /= numbers.get(i);
        }
        return result;
    }
    public double remainder() {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Need at least two numbers for remainder.");
        }
        return numbers.get(0) % numbers.get(1);
    }
    public double max() {
        return Collections.max(numbers);
    }
    public double min() {
        return Collections.min(numbers);
    }
    public double average() {
        return sum() / numbers.size();
    }
}

public class StrangeCalculator2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> inputNumbers = new ArrayList<>();

        System.out.println("Enter numbers one by one (type 'done' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                double number = Double.parseDouble(input);
                inputNumbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'done' to finish.");
            }
        }

        if (inputNumbers.size() < 2) {
            System.out.println("You need at least two numbers for most operations.");
        }

        StrangeCalc calc = new StrangeCalc(inputNumbers.toArray(new Double[0]));

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Sum");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Remainder");
            System.out.println("6. Maximum");
            System.out.println("7. Minimum");
            System.out.println("8. Average");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Sum: " + calc.sum());
                    break;
                case 2:
                    System.out.println("Subtraction: " + calc.subtract());
                    break;
                case 3:
                    System.out.println("Multiplication: " + calc.multiply());
                    break;
                case 4:
                    try {
                        System.out.println("Division: " + calc.divide());
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Remainder: " + calc.remainder());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Maximum: " + calc.max());
                    break;
                case 7:
                    System.out.println("Minimum: " + calc.min());
                    break;
                case 8:
                    System.out.println("Average: " + calc.average());
                    break;
                case 9:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class StudentReportCard {
    // ReportCard class to represent each student's report card
    static class ReportCard {
        private String name;
        private String surname;
        private String studentClass;
        private String[] subjects;
        private int[] marks;  
        private String[] feedback;  
        private String[] grades;
        // Constructor to initialize the student's information
        public ReportCard(String name, String surname, String studentClass, int numSubjects) {
            this.name = name;
            this.surname = surname;
            this.studentClass = studentClass;
            subjects = new String[numSubjects];
            marks = new int[numSubjects];  
            feedback = new String[numSubjects];  
            grades = new String[numSubjects];
        }
        // Method to read the report data from the user
        public void readReportData(Scanner s) {
            for (int i = 0; i < subjects.length; i++) {
                System.out.print("Enter subject name " + (i + 1) + ": ");
                subjects[i] = s.nextLine();
                System.out.print("Enter the marks for " + subjects[i] + ": ");
                marks[i] = s.nextInt();  
                s.nextLine(); 
                // Automatically assign grade and feedback based on marks
                grades[i] = assignGrade(marks[i]);  
                feedback[i] = assignFeedback(grades[i]);  
            }
        }
        // Method to assign grade based on marks
        private String assignGrade(int mark) {
            if (mark >= 90) {
                return "A";
            } else if (mark >= 80) {
                return "B";
            } else if (mark >= 70) {
                return "C";
            } else if (mark >= 60) {
                return "D";
            } else {
                return "F";
            }
        }
        // Method to assign feedback based on grade
        private String assignFeedback(String grade) {
            switch (grade) {
                case "A":
                    return "Excellent work!";
                case "B":
                    return "Good job, keep it up!";
                case "C":
                    return "Satisfactory performance, but needs improvement.";
                case "D":
                    return "Below average, needs significant improvement.";
                case "F":
                    return "Failing, please work harder.";
                default:
                    return "No feedback available.";
            }
        }
        // Method to display the report card in a readable format
        public void displayReportCard() {
            System.out.println("\n----------- Report Card ---------------");
            System.out.println("Name: " + name + " " + surname);
            System.out.println("Class: " + studentClass);
            System.out.println("Subject | Marks | Grade | Feedback");
            System.out.println("----------------------------------------");

            for (int i = 0; i < subjects.length; i++) {
                System.out.printf("%-8s | %-4d | %-5s | %-10s\n", subjects[i], marks[i], grades[i], feedback[i]);
            }

            // Adding a separator for better readability between report cards
            System.out.println("----------------------------------------");
        }
    }
    // Main method to run the application
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = s.nextInt();
        s.nextLine(); 
        // List to hold all report cards
        List<ReportCard> reportCards = new ArrayList<>();
        // Input student data for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            System.out.print("Enter student's first name: ");
            String name = s.nextLine();
            System.out.print("Enter student's last name: ");
            String surname = s.nextLine();
            System.out.print("Enter student's class: ");
            String studentClass = s.nextLine();
            System.out.print("Enter number of subjects: ");
            int numSubjects = s.nextInt();
            s.nextLine(); 
            // Create ReportCard object and read its data
            ReportCard reportCard = new ReportCard(name, surname, studentClass, numSubjects);
            reportCard.readReportData(s);
            // Add the report card to the list
            reportCards.add(reportCard);
        }
        // Display all report cards
        System.out.println();
        System.out.println("Students Report Card :\n");
        for (ReportCard reportCard : reportCards) {
            reportCard.displayReportCard();
        }
        s.close();
    }
}

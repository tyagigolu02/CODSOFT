import java.util.*;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects : ");
        int subjects = sc.nextInt();
        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100) : ");
            int marks = sc.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.print("Invalid marks. Please enter a value between 0 and 100 : ");
                marks = sc.nextInt();
            }
            totalMarks += marks;
        }

        double average = totalMarks / (double) subjects;

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n--- Results ---");
        System.out.println("Total Marks : " + totalMarks);
        System.out.printf("Average Percentage : %.2f%%\n", average);
        System.out.println("Grade : " + grade);

        double totalGradePoints = 0;
        int totalCredits = 0;

        System.out.print("\nEnter grade points and credits for each subject to calculate SGPA.\n");
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter grade point for subject " + i + " : ");
            double gradePoint = sc.nextDouble();

            System.out.print("Enter credits for subject " + i + " : ");
            int credits = sc.nextInt();

            totalGradePoints += gradePoint * credits;
            totalCredits += credits;
        }

        double sgpa = totalGradePoints / totalCredits;
        System.out.printf("SGPA : %.2f%n", sgpa);

        System.out.print("\nEnter total grade points from previous semesters : ");
        double previousGradePoints = sc.nextDouble();

        System.out.print("Enter total credits from previous semesters : ");
        int previousCredits = sc.nextInt();

        double cumulativeGradePoints = totalGradePoints + previousGradePoints;
        int cumulativeCredits = totalCredits + previousCredits;

        double cgpa = cumulativeGradePoints / cumulativeCredits;
        System.out.printf("CGPA : %.2f%n", cgpa);

        sc.close();
    }
}

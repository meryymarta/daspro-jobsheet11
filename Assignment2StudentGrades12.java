import java.util.Scanner;
public class Assignment2StudentGrades12 {

    static int[][] grades = new int[5][7]; 
    static String[] students = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

    public static void inputGrades() {
        Scanner input12 = new Scanner(System.in);
        System.out.println("Input student grades for 7 weeks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter grades for " + students[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = input12.nextInt();
            }
        }
    }

    public static void displayGrades() {
        System.out.println("Student Grades:");
        System.out.print("Student");
        for (int j = 0; j < 7; j++) {
            System.out.print("|Week" + (j + 1) + "| ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(students[i] + "\t  ");
            for (int j = 0; j < 7; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void findHighestGradeWeek() {
        int highestGrade = 0;
        int highestGradeWeek = 0;
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 5; i++) {
                if (grades[i][j] > highestGrade) {
                    highestGrade = grades[i][j];
                    highestGradeWeek = j + 1;
                }
            }
        }
        System.out.println("Week " + highestGradeWeek + " has the highest grade: " + highestGrade);
    }
    public static void findStudentWithHighestGrade() {
        int highestGrade = 0;
        String topStudent = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (grades[i][j] > highestGrade) {
                    highestGrade = grades[i][j];
                    topStudent = students[i];
                }
            }
        }
        System.out.println("The student with the highest grade is " + topStudent + " with a grade of " + highestGrade);
    }
    public static void main(String[] args) {
        inputGrades(); 
        displayGrades(); 
        findHighestGradeWeek(); 
        findStudentWithHighestGrade();
    }

}
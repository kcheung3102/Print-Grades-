import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        String toContinue = "y";


        while (!toContinue.equalsIgnoreCase("n")  ) {
            System.out.println("Enter Exam Score");
            int examScore = grade.nextInt();

            if (examScore >= 90 && examScore <= 100) {
                System.out.println("A");
            } else if (examScore >= 80 && examScore < 90) {
                System.out.println("B");
            } else if (examScore >= 70 && examScore < 80) {
                System.out.println("C");
            } else if (examScore >= 60 && examScore < 70) {
                System.out.println("D");
            } else {
                System.out.println("You got below a D");
            }
            System.out.println("Do you want to enter another score?(y/n)");
            grade.nextLine();
            toContinue = grade.nextLine();

        }
    }
}








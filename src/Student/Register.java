package Student;
import java.util.Scanner;

public class Register{

    
    Scanner input = new Scanner(System.in);
    
    public StudentDetails getStudentDetails(){
        
        StudentDetails newStudent = new StudentDetails();

        System.out.print("Enter your name: ");
        String studentName = input.nextLine();

        System.out.print("Enter your age: ");
        int studentAge = input.nextInt();
        input.nextLine();

        System.out.println("Enter your DOB(DD-MM-YYYY): ");
        String studentDOB = input.nextLine();

        System.out.print("Enter your address: ");
        String studentAddress = input.nextLine();

        System.out.print("Enter your roll number: ");
        String studentRollNo = input.nextLine();

        System.out.print("Enter your class: ");
        String studentStd = input.nextLine();

        System.out.print("Enter your Division: ");
        char studentDivision = input.next().charAt(0);
        input.nextLine();

        System.out.println("Enter 8 Digit Password: ");
        String password = input.nextLine();

        newStudent.setStudentDetails(studentName, studentAge, studentDOB, studentAddress, studentRollNo, studentStd, studentDivision, password);

        return newStudent;
        
    }

}

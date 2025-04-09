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

        System.out.print("Enter your address: ");
        String studentAddress = input.nextLine();

        System.out.print("Enter your roll number: ");
        String studentRollNo = input.nextLine();

        System.out.print("Enter your class: ");
        String studentStd = input.nextLine();

        System.out.print("Enter your Division: ");
        char studentDivision = input.next().charAt(0);

        newStudent.setStudentDetails(studentName, studentAge, studentAddress, studentRollNo, studentStd, studentDivision);

        return newStudent;
        
    }

}

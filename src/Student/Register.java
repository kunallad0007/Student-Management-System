package Student;
import java.util.Scanner;

public class Register{

    StudentDetails newStudent = new StudentDetails();
    Scanner input = new Scanner(System.in);
    String studentName = newStudent.studentName;
    int studentAge = newStudent.studentAge;
    String studentAddress = newStudent.studentAddress;
    String studentRollNo = newStudent.studentRollNo;
    String studentStd = newStudent.studentStd;
    char studentDivision = newStudent.studentDivision;
    
    public StudentDetails getStudentDetails(){

        System.out.print("Enter your name: ");
        studentName = input.nextLine();

        System.out.print("Enter your age: ");
        studentAge = input.nextInt();
        input.nextLine();

        System.out.print("Enter your address: ");
        studentAddress = input.nextLine();

        System.out.print("Enter your roll number: ");
        studentRollNo = input.nextLine();

        System.out.print("Enter your class: ");
        studentStd = input.nextLine();

        System.out.print("Enter your Division: ");
        studentDivision = input.next().charAt(0);

        newStudent.setStudentDetails(studentName, studentAge, studentAddress, studentRollNo, studentStd, studentDivision);
        return newStudent;
        

    }

    public void displayStudentDetails(){
        newStudent.displayStudentDetails();
    }

}

package services;
import Student.StudentDetails;
import utility.InputUility;

public class Register{

    
    InputUility newinput = new InputUility();
    
    public StudentDetails getStudentDetails(){
        
        StudentDetails newStudent = new StudentDetails();

        System.out.print("Enter your name: ");
        String studentName = newinput.input.nextLine();

        System.out.print("Enter your age: ");
        int studentAge = newinput.input.nextInt();
        newinput.input.nextLine();

        System.out.println("Enter your DOB(DD-MM-YYYY): ");
        String studentDOB = newinput.input.nextLine();

        System.out.print("Enter your address: ");
        String studentAddress = newinput.input.nextLine();

        System.out.print("Enter your roll number: ");
        String studentRollNo = newinput.input.nextLine();

        System.out.print("Enter your class: ");
        String studentStd = newinput.input.nextLine();

        System.out.print("Enter your Division: ");
        char studentDivision = newinput.input.next().charAt(0);
        newinput.input.nextLine();

        System.out.println("Enter 8 Digit Password: ");
        String password = newinput.input.nextLine();

        newStudent.setStudentDetails(studentName, studentAge, studentDOB, studentAddress, studentRollNo, studentStd, studentDivision, password);

        return newStudent;
        
    }

}

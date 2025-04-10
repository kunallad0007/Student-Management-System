package services;
import Student.StudentDetails;
import utility.InputUility;

public class Register{

    final String RED = "\u001B[31m";
    final String RESET = "\u001B[0m";


    InputUility newinput = new InputUility();
    
    public StudentDetails getStudentDetails(){
        
        StudentDetails newStudent = new StudentDetails();

        System.out.print("Enter your name: ");
        String studentName = newinput.input.nextLine();

        System.out.print("Enter your age: ");
        int studentAge = newinput.input.nextInt();
        newinput.input.nextLine();

        System.out.print("Enter your DOB(DD-MM-YYYY): ");
        String studentDOB = newinput.input.nextLine();

        System.out.print("Enter your address: ");
        String studentAddress = newinput.input.nextLine();

        System.out.print("Enter 4 digit roll number: ");
        String studentRollNo;
        while(true){
            System.out.print("Enter 4 digit roll number: ");
            studentRollNo = newinput.input.nextLine();
            if (studentRollNo.length() == 4) {
                break;
            } else {
                System.err.println(RED+"*** Roll Number must be exactly 4 digits ***"+RESET);
            }
        }

        System.out.print("Enter your class: ");
        String studentStd = newinput.input.nextLine();

        System.out.print("Enter your Division: ");
        char studentDivision = newinput.input.next().charAt(0);
        newinput.input.nextLine();

        System.out.println("Enter 8 Digit Password: ");
        String password;
        while(true){
            password = newinput.input.nextLine();
            if(password.length() == 8){
                break;
            }else{
                System.err.print(RED+"*** Password must be exactly 8 digits ***"+RESET);
            }
        }

        newStudent.setStudentDetails(studentName, studentAge, studentDOB, studentAddress, studentRollNo, studentStd, studentDivision, password);

        return newStudent;
        
    }

}

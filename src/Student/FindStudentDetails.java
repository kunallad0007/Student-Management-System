package Student;

import java.util.ArrayList;
import utility.InputUility;

public class FindStudentDetails {
    private static final String RED = "\u001B[31m";
    private static final String RESET = "\u001B[0m";
    public void searchWithRollNumber(ArrayList<StudentDetails> studentList){
        
        InputUility newInput = new InputUility();

        if (studentList == null || studentList.isEmpty()) {
            System.err.println(RED + "No students found in the system!" + RESET);
            return;
        }

        System.out.print("Enter Student Roll Number: ");
        String searchRollNumber = newInput.input.nextLine();
        
        boolean found = false;
        for(StudentDetails student : studentList){
            if(student.getRollNo().equals(searchRollNumber)){
                System.out.println("Student Found");
                student.displayStudentDetails();
                found = true;
                break;
            }
            
        }
        
        if(!found){
            System.err.println(RED+"Student with Roll Number " + searchRollNumber + " not found!"+RESET);
        }

    }

}

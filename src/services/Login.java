package services;
import java.util.ArrayList;
import utility.InputUility;
import Student.StudentDetails;

public class Login {
    final String RED = "\u001B[31m";
    final String RESET = "\u001B[0m";

    InputUility newInput = new InputUility();

    public void studentLogin(ArrayList<StudentDetails> studentList){

        int Attempt = 3;

        while(Attempt != 0) {
            System.out.print("Enter your roll number: ");
            String rollNumber = newInput.input.nextLine();
            System.out.print("Enter your password: ");
            String password = newInput.input.nextLine();

            boolean authentication = false;

            for(StudentDetails student : studentList){
                if(student.matchRollNumber(rollNumber) && student.matchPassword(password)){
                    System.out.println("Login Successfull !");
                    authentication = true;
                    break;
                }
            }
            if(authentication){
                break;
            }else{
                Attempt--;
                System.err.println(RED+"Incorrect Roll Number and Password"+RESET);
                System.err.println(RED+"Try Again.... Attempt left: "+ Attempt +RESET);
            }
        }
    }
}   


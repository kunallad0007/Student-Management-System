package services;
import java.util.ArrayList;

import Admin.AdminDetails;
import utility.InputUility;
import Student.StudentDetails;

public class Login {
    final String RED = "\u001B[31m";
    final String RESET = "\u001B[0m";

    InputUility newInput = new InputUility();

    public void login(ArrayList<?> userList, String userType){

        final int MAX_ATTEMPTS = 3;
        int Attempt = MAX_ATTEMPTS;
        boolean authentication = false;

        if(userList == null || userList.isEmpty()){
            System.err.println(RED+"No "+userType+"s found"+RESET);
        }

        while(authentication == false && Attempt > 0) {
            System.out.print("Enter your "+ (userType.equals("Student") ? "Roll Number" : "ID") + ": ");
            String id = newInput.input.nextLine();
            System.out.print("Enter your password: ");
            String password = newInput.input.nextLine();

            if(id.isEmpty() || password.isEmpty()){
                System.err.println(RED+"Please enter valid "+ (userType.equals("Student") ? "Roll Number" : "ID"+ " and password cannot be empty" +RESET));
            }

            for(Object user : userList){
                if((userType.equals("Student") && ((StudentDetails) user).matchRollNumber(id) && ((StudentDetails) user).matchPassword(password)) || (userType.equals("Admin") && ((AdminDetails) user).matchID(id) && ((AdminDetails) user).matchPassword(password))){
                    System.out.println("Login Successfull !");
                    authentication = true;
                    break;
                }
            }
            if(!authentication){
                Attempt--;
                System.err.println(RED+"Incorrect Roll Number and Password"+RESET);
                System.err.println(RED+"Try Again.... Attempt left: "+ Attempt +RESET);
            }
        }
    }

    public void studentLogin(ArrayList<StudentDetails> StudentList){
        login(StudentList, "Student");
    }

    public void adminLogin(ArrayList<AdminDetails> adminList){
        login(adminList, "Admin");
    }

}   


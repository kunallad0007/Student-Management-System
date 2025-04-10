package user;

import java.util.ArrayList;

// import Admin.AdminDetails;
// import Admin.FindAdminDetails;
// import Student.FindStudentDetails;
import Student.StudentDetails;
import services.Login;
import services.NewRegisteration;
import utility.InputUility;

public class Student {

    final String RED = "\u001B[31m";
    final String RESET = "\u001B[0m";
    private ArrayList<StudentDetails> studentList = new ArrayList<>();
    public void studentLogin(){
        InputUility newInput = new InputUility();
        
        int choice = 0;
        do{
            System.out.println("=========== Welcome to Student Portal ===========");
            System.out.println("======= I hope you are doing good today! =======");
            System.out.println();
            System.out.println("* Press 1 to Login                *");
            System.out.println("* Press 2 to Register             *");
            System.out.println("* Press 3 to Exit                 *");
            try{
                choice = newInput.input.nextInt();
            }catch(Exception e){
                System.err.println(RED+"Invalid input! Please enter a number."+RESET);
                newInput.input.nextLine(); // Clear the invalid input
                continue; // Skip to the next iteration of the loop
            }

            switch (choice) {
                case 1:
                    Login login = new Login();
                    login.studentLogin(studentList);
                    int choice2 = 0;
                    do{
                        System.out.println("* Press 1 to display your details              *");
                        System.out.println("* Press 2 to EXIT                              *");
                        try{
                            choice2 = newInput.input.nextInt();
                        }catch(Exception e){
                            System.err.print(RED+"Invalid input! Please enter a number."+RESET);
                            newInput.input.nextLine(); 
                            continue; 
                        }
                        System.out.println("=================================================");
                        System.out.println();

                        switch (choice2) {
                            case 1:
                                for(StudentDetails student : studentList){
                                    student.displayStudentDetails();
                                }
                                break;

                            case 2:
                                System.out.println("========== Thank You !===========");
                                System.out.println("===== Student Portal Closed =====");
                        
                            default:
                                System.err.println(RED+"Invalid Key Pressed...!"+RESET);
                                break;

                        }
                    }while(choice2 != 2);
                    break;

                case 2:
                    NewRegisteration newStudentRegisteration = new NewRegisteration();
                    StudentDetails newStudent = newStudentRegisteration.getStudentDetails();
                    studentList.add(newStudent);
                    System.out.println();
                    System.out.println("Student Registered Successfully!");
                    System.out.println();
                    break;

                default:
                    System.err.println(RED+"Inavlid Key Pressed"+RESET);
                    break;

            }
            
        }while(choice != 3);
    }

}

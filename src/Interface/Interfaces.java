package Interface;
// import Student.StudentDetails;
// import services.NewRegisteration;
// import java.util.ArrayList;
// import Admin.AdminDetails;
// import Admin.FindAdminDetails;

import user.Admin;
import user.Student;
import utility.InputUility;

public class Interfaces {

    final String RED = "\u001B[31m";
    final String RESET = "\u001B[0m";

    public void runApp(){

        InputUility newInput = new InputUility();
        int choice = 0;

        do{
            System.out.println("=========Welcome to School Portal=========");
            System.out.println("======I hope you are doing good today!======");
            System.out.println();

            System.out.println("* Press 1 for Admin              *");
            System.out.println("* Press 2 for Student            *");
            System.out.println("* Press 3 to Exit                *");
            System.out.print("Enter your choice: ");
            try {
                choice = newInput.input.nextInt();
            } catch (Exception e) {
                System.err.println(RED + "Invalid input! Please enter a number." + RESET);
                newInput.input.nextLine(); // Clear invalid input
                continue; // Skip to the next iteration
            }

            switch (choice) {
                case 1:
                    Admin adminPortal = new Admin();
                    adminPortal.admin();
                    break;

                case 2:
                    Student studentPortal = new Student();
                    studentPortal.studentLogin();
                    break;
                
                case 3:
                    System.out.println("========= Thank You !==========");
                    System.out.println("===== School Portal Closed ====="); 
                    break;

                default:
                    System.err.println(RED+"Invalid Key Pressed"+RESET);
                    break;
            }

        }while(choice != 3);
    }

}

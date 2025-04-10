package user;
import java.util.ArrayList;

import Admin.AdminDetails;
import Admin.FindAdminDetails;
import Student.FindStudentDetails;
import Student.StudentDetails;
import services.Login;
import services.NewRegisteration;
import utility.InputUility;
public class Admin {

    final String RED = "\u001B[31m";
    final String RESET = "\u001B[0m";
    private ArrayList<AdminDetails> adminList = new ArrayList<>();
    private ArrayList<StudentDetails> studentList = new ArrayList<>();
    
    public void admin(){
        InputUility newInput = new InputUility();
        int choice = 0;
        do{
            System.out.println("=========== Welcome to Admain Portal ===========");
            System.out.println("======= I hope you are doing good today! =======");
            System.out.println();
            System.out.println("* Press 1 to Login                *");
            System.out.println("* Press 2 to Register             *");
            System.out.println("* Press 3 to Exit                 *");
            System.out.println("=================================================");
            System.out.print("Enter your choice: ");
            try {
                choice = newInput.input.nextInt();
            } catch (Exception e) {
                System.err.println(RED + "Invalid input! Please enter a number." + RESET);
                newInput.input.nextLine(); // Clear invalid input
                continue; // Skip to the next iteration
            }
            System.out.println();

            switch (choice) {
                case 1:
                    Login login = new Login();
                    login.adminLogin(adminList);
                    int choice2 = 0;
                    do{
                        displayMenu();
                        try {
                            choice2 = newInput.input.nextInt();
                        } catch (Exception e) {
                            System.err.println(RED + "Invalid input! Please enter a number." + RESET);
                            newInput.input.nextLine(); // Clear invalid input
                            continue; // Skip to the next iteration
                        }
                        System.out.println("=================================================");
                        System.out.println();
                        switch (choice2) {
                            case 1:
                                FindStudentDetails findStudent = new FindStudentDetails();
                                findStudent.searchWithRollNumber(studentList);
                                break;

                            case 2:
                                AdminDetails adminDetails = new AdminDetails();
                                adminDetails.displayAdminDetails();
                                break;

                            case 3:
                                FindAdminDetails findAdmin = new FindAdminDetails();
                                findAdmin.searchWithID(adminList);
                                break;
                            
                            case 4:
                                System.out.println("========== Thank You !===========");
                                System.out.println("===== Admin Portal Closed =====");
                                break;
                        
                            default:
                                System.err.println(RED+"Invalid Key Pressed...!"+RESET);
                                break;
                        }
                    }while(choice2 != 4);
                    break;

                case 2:
                    NewRegisteration adminRegisteration = new NewRegisteration();
                    AdminDetails newAdmin = adminRegisteration.getAdminDetails();
                    adminList.add(newAdmin);
                    System.out.println();
                    System.out.println("Admin Registered Successfully!");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("========== Thank You for using the Admin Portal! ==========");
                    break;

                default:
                    System.err.println(RED+"Inavlid Key Pressed"+RESET);
                    break;
            }
            
        }while(choice != 3);

    }

    private void displayMenu() {
        System.out.println("* Press 1 to find student                      *");
        System.out.println("* Press 2 to Display your details              *");
        System.out.println("* Press 3 to Specific find admin details       *");
        System.out.println("* Press 4 to EXIT                              *");
    }

}

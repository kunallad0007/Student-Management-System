import Student.StudentDetails;
import Student.Register;

import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);
        
        ArrayList<StudentDetails> studentList = new ArrayList<>();

        int n;

        do{
            System.out.println("=========Welcome to Student Portal=========");
            System.out.println("======I hope you are doing good today!======");

            System.out.println("* Press 1 to Login                *");
            System.out.println("* Press 2 to Register             *");
            System.out.println("* Press 3 to Show Student Details *");
            System.out.println("* Press 4 to Exit                 *");
            System.out.print("Enter your choice: ");
            n = newInput.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Login");
                    break;

                case 2:
                    Register newRegisteration = new Register();
                    StudentDetails newStudent = newRegisteration.getStudentDetails();
                    studentList.add(newStudent);
                    System.out.println("Student Regostered Successfully!");
                    break;

                case 3:
                    System.out.println("👥 Student Record!");
                    for(StudentDetails student : studentList){
                        student.;
                        System.out.println("-----------------------------");
                    }
                    break;
                
                case 4:
                    System.out.println("Portal closed!");
                    break;
            
                default:
                    System.out.println("Invalid Key Pressed.... Try Again !");
                    break;
            }
        }while(n != 4);

        newInput.close();

    }
}

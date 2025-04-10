import Student.StudentDetails;
import services.Register;
import java.util.ArrayList;
import utility.InputUility;;
public class App {
    public static void main(String[] args) {
        InputUility newInput = new InputUility();
        
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
            n = newInput.input.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Login");
                    break;

                case 2:
                    Register newRegisteration = new Register();
                    StudentDetails newStudent = newRegisteration.getStudentDetails();
                    studentList.add(newStudent);
                    //System.out.println("Student Regostered Successfully!");
                    break;

                case 3:
                    System.out.println("👥 * Student Record *");
                    System.out.println("Press 1 for Specific Student");
                    System.out.println("Press 2 for All Records");
                    System.out.print("Enter your choice: ");
                    int choice = newInput.input.nextInt();
                    if(choice == 1){
                        System.out.print("Enter Roll Number of the Student: ");
                        newInput.input.nextLine();
                        String searchRoll = newInput.input.nextLine();
                        boolean found = true;
                        for(StudentDetails student : studentList){
                            if(student.getRollNo().equals(searchRoll)){
                                System.out.println("Student Found!");
                                student.displayStudentDetails();
                                break;
                            }
                            found = true;
                            
                        }if(!found){
                            System.out.println("Student with Roll Number " + searchRoll + " not found!");
                        }
                    }else if(choice == 2){
                        for(StudentDetails student : studentList){
                            student.displayStudentDetails();
                            System.out.println("-----------------------------");
                        }
                    }else{
                        System.out.println("Enter Invalid Key!");
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

        newInput.input.close();

    }
}

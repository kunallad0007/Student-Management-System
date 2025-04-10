package services;
import Admin.AdminDetails;
import Student.StudentDetails;
import utility.InputUility;

public class NewRegisteration{

    final String RED = "\u001B[31m";
    final String RESET = "\u001B[0m";


    InputUility newinput = new InputUility();

    private String getInput(String prompt) {
        System.out.print(prompt);
        return newinput.input.nextLine();
    }
    
    public StudentDetails getStudentDetails(){
        
        StudentDetails newStudent = new StudentDetails();

        String studentName = getInput("Enter your name: ");
        int studentAge = getValidatedAge();
        String studentDOB = getInput("Enter your DOB(DD-MM-YYYY): ");
        String studentAddress = getInput("Enter your address: ");
        String studentRollNo = getValidatedRollNumber("Create 4 digit roll number: ");
        String studentStd = getInput("Enter your class: ");
        char studentDivision = getValidatedDivision();
        String password = getValidatedPassword();

        newStudent.setStudentDetails(studentName, studentAge, studentDOB, studentAddress, studentRollNo, studentStd, studentDivision, password);

        return newStudent;
        
    }

    public AdminDetails getAdminDetails(){
        
        AdminDetails newAdmin = new AdminDetails();

        
        String adminName = getInput("Enter your name: ");
        int adminAge = getValidatedAge();
        String adminDOB = getInput("Enter your DOB(DD-MM-YYYY): ");
        String adminAddress = getInput("Enter your address: ");
        String adminID = getValidatedRollNumber("Create 4 digit ID: ");
        String adminPassword = getValidatedPassword();

        newAdmin.setStudentDetails(adminName, adminAge, adminDOB, adminAddress, adminID, adminPassword);

        return newAdmin;
        
    }

    private int getValidatedAge() {
        int age;
        while (true) {
            try {
                System.out.print("Enter your age: ");
                age = newinput.input.nextInt();
                newinput.input.nextLine(); // Clear buffer
                if (age > 0) {
                    break;
                } else {
                    System.err.println(RED + "*** Age must be a positive number ***" + RESET);
                }
            } catch (Exception e) {
                System.err.println(RED + "*** Invalid input! Please enter a valid number ***" + RESET);
                newinput.input.nextLine(); // Clear invalid input
            }
        }
        return age;
    }

    // Duplicate method removed

    private String getValidatedRollNumber(String prompt) {
        String rollNo;
        while (true) {
            System.out.print(prompt);
            rollNo = newinput.input.nextLine();
            if (rollNo.length() == 4) {
                break;
            } else {
                System.err.println(RED + "*** Roll Number must be exactly 4 digits ***" + RESET);
            }
        }
        return rollNo;
    }

    private char getValidatedDivision() {
        char division;
        while (true) {
            System.out.print("Enter your Division: ");
            String input = newinput.input.nextLine();
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                division = input.charAt(0);
                break;
            } else {
                System.err.println(RED + "*** Division must be a single letter ***" + RESET);
            }
        }
        return division;
    }

    private String getValidatedPassword() {
        String password;
        while (true) {
            System.out.print("Create 8 Digit Password: ");
            password = newinput.input.nextLine();
            if (password.length() == 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[@#$%^&+=].*")) {
                break;
            } else {
                System.err.println(RED + "*** Password must be 8 characters long, include at least one uppercase letter, one digit, and one special character ***" + RESET);
            }
        }
        return password;
    }


}

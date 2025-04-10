package Student;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;

public class StudentDetails {
    
    private String studentName;
    private int studentAge;
    private String DOB;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }
    private String studentAddress;
    private String studentRollNo;

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    private String studentStd;
    private char studentDivision;
    private String password;

    public void setPassword(String password) {
        this.password = hashPassword(password);
    }
    
    public void setStudentDetails(String studentName, int studentAge, String DOB, String studentAddress, String studentRollNo, String studentStd, char studentDivision, String password){
        setStudentName(studentName);
        setStudentAge(studentAge);
        this.DOB = DOB;
        this.studentAddress = studentAddress;
        this.studentRollNo = studentRollNo;
        this.studentStd = studentStd;
        this.studentDivision = studentDivision;
        setPassword(password);
    }

    public void displayStudentDetails() {
        System.out.println("===== Student Details =====");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("DOB: " + DOB);
        System.out.println("Address: " + studentAddress);
        System.out.println("Roll No.: " + studentRollNo);
        System.out.println("Class: " + studentStd);
        System.out.println("Division: " + studentDivision);
        System.out.println("===========================");
    }

    public String getRollNo() {
        return studentRollNo;
    }

    public boolean matchPassword(String inputPassword) {
        return this.password.equals(hashPassword(inputPassword));
    }

    public boolean matchRollNumber(String rollNumber) {
        return this.studentRollNo.equals(rollNumber);
    }

}

package Student;

public class StudentDetails {
    
    String studentName;
    int studentAge;
    String DOB;
    String studentAddress;
    String studentRollNo;
    String studentStd;
    char studentDivision;
    private String password;
    
    public void setStudentDetails(String studentName, int studentAge, String DOB, String studentAddress, String studentRollNo, String studentStd, char studentDivision, String password){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.DOB = DOB;
        this.studentAddress = studentAddress;
        this.studentRollNo = studentRollNo;
        this.studentStd = studentStd;
        this.studentDivision = studentDivision;
        this.password = password;
    }

    public void displayStudentDetails(){
        System.out.println("Student Name: "+ studentName);
        System.out.println("Student Age: "+ studentAge);
        System.out.println("Student DOB: "+ DOB);
        System.out.println("Student Address: "+ studentAddress);
        System.out.println("Student Roll No.: "+ studentRollNo);
        System.out.println("Student Class: "+ studentStd);
        System.out.println("Student Division "+ studentDivision);
    }

    public String getRollNo(){
        return studentRollNo;
    }

    public boolean matchPassword(String inputPassword){
        return password.equals(inputPassword);
    }

}

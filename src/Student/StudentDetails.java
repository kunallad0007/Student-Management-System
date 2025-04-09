package Student;

public class StudentDetails {
    
    String studentName;
    int studentAge;
    String studentAddress;
    String studentRollNo;
    String studentStd;
    char studentDivision;
    
    public void setStudentDetails(String studentName, int studentAge, String studentAddress, String studentRollNo, String studentStd, char studentDivision){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentAddress = studentAddress;
        this.studentRollNo = studentRollNo;
        this.studentStd = studentStd;
        this.studentDivision = studentDivision;
    }

    public void displayStudentDetails(){
        System.out.println("Student Name: "+ studentName);
        System.out.println("Student Age: "+ studentAge);
        System.out.println("Student Address: "+ studentAddress);
        System.out.println("Student Roll No.: "+ studentRollNo);
        System.out.println("Student Class: "+ studentStd);
        System.out.println("Student Division "+ studentDivision);
    }

    

}

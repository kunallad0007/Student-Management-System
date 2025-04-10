package Admin;

public class AdminDetails {
    String adminName;
    int adminAge;
    String DOB;
    String adminAddress;
    private String adminID;
    private String adminPassword;
    
    public void setStudentDetails(String adminName, int adminAge, String DOB, String adminAddress, String adminID, String adminPassword){
        this.adminName = adminName;
        this.adminAge = adminAge;
        this.DOB = DOB;
        this.adminAddress = adminAddress;
        this.adminID = adminID;
        this.adminPassword = adminPassword;
    }

    public void displayAdminDetails(){
        System.out.println("Admin Name: "+ adminName);
        System.out.println("Admin Age: "+ adminAge);
        System.out.println("Admin DOB: "+ DOB);
        System.out.println("Admin Address: "+ adminAddress);
    }

    public String getRollNo(){
        return adminID;
    }

    public boolean matchPassword(String inputPassword){
        return this.adminPassword.equals(inputPassword);
    }

    public boolean matchID(String adminID){
        return this.adminID.equals(adminID);
    }
}

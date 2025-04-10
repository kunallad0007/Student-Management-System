package Admin;

import java.util.ArrayList;
import utility.InputUility;

public class FindAdminDetails {
    public void searchWithID(ArrayList<AdminDetails> adminList){
        final String RED = "\u001B[31m";
        final String RESET = "\u001B[0m";
        InputUility newInput = new InputUility();
        boolean found = true;
        System.out.print("Enter Admin ID: ");
        String searchID = newInput.input.nextLine();
        for(AdminDetails admin : adminList){
            if(admin.getRollNo().equals(searchID)){
                System.out.println("Student Found");
                admin.displayAdminDetails();
                break;
            }
            found = true;
        }if(!found){
            System.err.println(RED+"Student with Roll Number " + searchID + " not found!"+RESET);
        }
    }
}

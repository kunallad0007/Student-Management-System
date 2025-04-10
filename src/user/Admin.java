package user;
import java.util.ArrayList;

import Admin.AdminDetails;
import services.Login;
import utility.InputUility;
public class Admin {
    
    public void adminLoging(){
        InputUility newInput = new InputUility();
        ArrayList<AdminDetails> adminList = new ArrayList<>();
        int choice;
        do{
            System.out.println("* Press 1 to Login                *");
            System.out.println("* Press 2 to Register             *");
            choice = newInput.input.nextInt();

            switch (choice) {
                case 1:
                    Login login = new Login();
                    login.studentLogin(adminList);
                    break;
            
                default:
                    break;
            }
            
        }while(choice == 4);

    }

}

package emailApplication;

import java.util.Scanner;

public class EmailMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first Name: ");
        String firstName = input.next();
        System.out.println("Enter your last Name: ");
        String lastName = input.next();
        EmailApp mail = new EmailApp(firstName, lastName);
        input.close();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alternate Email: ");
        String altMail = scan.nextLine();
        mail.setAlternateEmail(altMail);
        System.out.println("Your alternate Email is: " + mail.getAlternateEmail());

      
        
       
    }

}
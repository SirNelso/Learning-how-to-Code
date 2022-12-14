package emailApplication;

import java.util.Scanner;

public class EmailApp {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private String company = "feuercon.com";
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;

    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created for: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Your Department: " + this.department);

        String email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "."
                + company;
        System.out.println("Your email is: " + email);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);

    }

    private String setDepartment() {
        System.out.println(
                "Department Codes:\n1 for Sales\n2 for Marketing\n3 for Development\n4 for Accounting\n0 for none\nEnter your Department");
        Scanner input = new Scanner(System.in);
        int depChoice = input.nextInt();

        switch (depChoice) {
            case 1:
                return "sales";
            case 2:
                return "mark";
            case 3:
                return "dev";
            case 4:
                return "acc";
            default:
                return "";
        }

    }

    private String randomPassword(int length) {
        String passwordSet = "AQWERTZUIOPASDFGHJKLYXCVBNM1234567890#!%&";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    // private String newPassword() {
    //     String newPassword;
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Enter you current password: ");
    //     String currentPassword = input.next();
    //     if (currentPassword == this.password) {
    //         System.out.println("Enter your new password: ");
    //         newPassword = input.next();
    //         return new String(newPassword);
    //     } else {
    //         System.out.println("Wrong password");
    //     }

    // }

    public void setAlternateEmail(String altMail) {
        this.alternateEmail = altMail;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

}

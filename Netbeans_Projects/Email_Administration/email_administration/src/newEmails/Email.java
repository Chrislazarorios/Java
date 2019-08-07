/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newEmails;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Email {
    Scanner teclado = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "company.com";
    private int mailboxCapacity = 500;
    private String alternateEmail;
    int departmentType;
    int passwordSize = 8;
    
    // Constructor
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    
        System.out.println("Email successfully created for : " + this.firstName + " " + this.lastName);
        
        // Call a method asking for department - return department
        this.department = setDepartment();
        System.out.println("Your department is : " + this.department);
        
        // Call a method that returns a random password
        this.password = randomPassword(passwordSize);
        System.out.println("Your password is : " + this.password);
        
        // Combine elements to generate email
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "." + companySuffix;
        System.out.println("Your email is : " + this.email);
    }
    
    // Ask department
    private String setDepartment(){
        System.out.print("New employee: " + firstName + " " + lastName + ".Select your department code:\n-1 Sales\n-2 Development\n-3 Accounting\n-0 Other\nEnter department code: ");
        departmentType = teclado.nextInt();
        
        switch(departmentType){
            case 1:
                return "sales";
            case 2:
                return "development";
            case 3:
                return "accounting";
            default:
                return " ";
        }
    }
    
    // Generate random password
    private String randomPassword(int length){
        // Allowed password symbols
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++)
        {
            int random =(int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        
        // Password is a set of characters, so we need to cast it to String
        return new String (password);
    }
    // Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    // Set alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    // Change password
    public void changePassword(String password){
        this.password = password;
    }
    
    // Getters
    public int getMailboxCapacity(){
        return this.mailboxCapacity;
    }
    public String getAlternateEmail(){
        return this.alternateEmail;
    }
    public String getPassword(){
        return this.password;
    }
    public String getName(){
        return this.firstName;
    }
    
    // This getter shows all info at once
    public String showInfo(){
        return "Name : " + firstName + " " + lastName +
                "\nCompany email :  " + email +
                "\nMailbox capacity : " + mailboxCapacity + "mb";
    }
}

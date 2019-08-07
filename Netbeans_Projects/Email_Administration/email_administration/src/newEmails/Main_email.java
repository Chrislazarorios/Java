/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newEmails;

/**
 *
 * @author Usuario
 */
public class Main_email {
    public static void main(String[] args) {
       Email email1 = new Email("John", "Locks");
    
//       email1.setMailboxCapacity(1000);
       
//       email1.setAlternateEmail("jl@gmail.com");
//       System.out.println("Your alternate email is : " + email1.getAlternateEmail());
       
//       email1.changePassword("nuevaPassword");

        System.out.println(email1.showInfo());
    }
    
}

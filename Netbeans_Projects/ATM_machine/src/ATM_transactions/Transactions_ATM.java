/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM_transactions;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Transactions_ATM {
    
    Scanner teclado = new Scanner(System.in);
    private  int balance = 0; // saldo actual que posee la cuenta
    private  int transactionChoice;
    
    public void transaction(){
        int option;
        
        System.out.println("1.Retirar\n2.Depositar\n3.Consultar saldo\n4.Salir");
        option = teclado.nextInt();
        
        switch(option){
            case 1:
                float amount;
                System.out.println("Por favor ingrese el monto a retirar: ");
                amount = teclado.nextFloat();
                
                if(amount > balance || balance == 0){
                    System.out.println("Saldo insuficiente.\n");
                    anotherTransaction();
                } else {
                    // si no hay problemas con el saldo realizamos la extraccion y actualizamos el saldo
                    balance -= amount;
                    System.out.println("Se retiraron " + amount + " y su saldo actual es de " + balance);
                    anotherTransaction();
                }
                
                break;
            case 2:
                float deposit;
                System.out.println("Por favor ingrese el monto a depositar: ");
                deposit = teclado.nextFloat();
                // actualizamos saldo actual
                balance += deposit;
                System.out.println("Se depositó "+ deposit + " y su saldo actual es de "+ balance +"\n");
                anotherTransaction();
                
                break;
            case 3:
                System.out.println("Su saldo actual es de: "+ balance +"\n");
                anotherTransaction();
                
                break;
            case 4:
                break;
            default:
                System.out.println("Opción inválida\n");
                anotherTransaction();
                break;
        }
    }
    
    private void anotherTransaction(){
        System.out.println("Desea realizar otra transacción?\n1-Realizar otra transacción\n2-Salir");
        transactionChoice = teclado.nextInt();
        
        switch (transactionChoice) {
            case 1:
                transaction(); // llamamos al metodo transaction
                break;
            case 2:
                System.out.println("Gracias por elegirnos. Adios!");
                break;
            default:
                System.out.println("Opción inválida");
                anotherTransaction();
                break;
        }
    }
}

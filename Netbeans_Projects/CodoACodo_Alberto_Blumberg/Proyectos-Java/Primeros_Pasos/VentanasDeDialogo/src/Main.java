/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author alumno
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio");
        
        
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre y apellido");
        String nota1 = JOptionPane.showInputDialog("Ingrese nota 1");
        String nota2 = JOptionPane.showInputDialog("Ingrese nota 2");
        String nota3 = JOptionPane.showInputDialog("Ingrese nota 3");
    
        float nota11=Float.parseFloat(nota1);
        float nota22=Float.parseFloat(nota2);
        float nota33=Float.parseFloat(nota3);
    
        float promedio = (nota11+nota22+nota33)/3;
        
        JOptionPane.showMessageDialog(null,"El promedio es : "+promedio);
    
        System.exit(0);
    }
}

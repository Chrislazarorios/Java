/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parciales.Default;

/**
 *
 * @author Usuario
 */
import java.util.*;

public class MainParciales {
    public static void main(String[] args) {
        Empleado employ = new Empleado("cris", "lopez"," 12345"," Masc", "12/06/94", 20, 20, "18/11/201");
        
        System.out.println("CUIL : "+employ.getDame_Cuil());
    }
}

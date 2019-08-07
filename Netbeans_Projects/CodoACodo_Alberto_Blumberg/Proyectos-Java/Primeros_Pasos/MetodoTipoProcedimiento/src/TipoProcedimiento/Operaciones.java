/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoProcedimiento;

/**
 *
 * @author alumno
 */
public class Operaciones {
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Metodo tipo procedimiento para sumar enteros
    public void sumar(int numero1, int numero2)
    {
        suma = numero1+numero2;
    }
    
    // Metodo tipo procedimiento para restar enteros
    public void restar(int numero1, int numero2)
    {
        resta = numero1-numero2;
    }
    
    // Metodo tipo procedimiento para multiplicar enteros
    public void multiplicar(int numero1, int numero2)
    {
        multiplicacion = numero1*numero2;
    }

    // Metodo tipo procedimiento para dividir enteros
    public void dividir(int numero1, int numero2)
    {
        division = numero1/numero2;
    }
    
    //Metodo para mostrar los resultados
    public void mostrarResultados()
    {
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicacion es: "+ multiplicacion);
        System.out.println("La division es: "+ division);
    }
    
    
    
    
    
}

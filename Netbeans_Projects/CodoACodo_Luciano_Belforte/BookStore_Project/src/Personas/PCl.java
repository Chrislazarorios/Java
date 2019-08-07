package Personas;

import ManejoFechas.Fecha;
import java.util.ArrayList;
import java.util.Scanner;
import Personas.Persona;
import Personas.DNI;

public class PCl {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Fecha fN;
        DNI d;
        Persona p;
        String nom, apel, DNITxt;
        String fNTxt, gen;
        String continuar = "N";
        boolean DNINuevo;
        ArrayList<Persona> personas = new ArrayList();
        //p = new Persona("l", "b", 12345678);
        //personas.add(p);
        do {
            System.out.println("Ingresar una persona");
            System.out.print("Nombre: ");
            nom = teclado.next();
            System.out.print("Apellido: ");
            apel = teclado.next();

            do {
                System.out.print("DNI: ");
                DNITxt = teclado.next();
                d = new DNI(DNITxt);
                if (d.isOk()) {
                    continuar = "N";
                } else {
                    System.out.println("El DNI " + DNITxt
                            + " es incorrecto, queres reingresarlo?(S/N)");
                    continuar = teclado.next();
                }
            } while (continuar.equalsIgnoreCase("S"));
            if (d.isOk()) {
                DNINuevo = true;
                for (int i = 0; i < personas.size(); i++) {
                    if (personas.get(i).getDni() == d.getDNInum()) {
                        DNINuevo = false;
                        System.out.println("El DNI "
                                + d.getDNITxt()
                                + " ya fue ingresado");
                        break;
                    } else {
                    }
                }
                if (DNINuevo) {
                    p = new Persona(nom, apel, d);
                    do {
                        System.out.print("Fecha Nacimiento (dd/mm/aaaa): ");
                        fNTxt = teclado.next();
                        fN = new Fecha(fNTxt);
                        p.setFechNac(fN);
                        if (fN.isOk()) {
                            continuar = "N";
                        } else {
                            System.out.println("La fecha "
                                    + fNTxt
                                    + " es invalida, reingresarla?(S/N)");
                            continuar = teclado.next();
                        }
                    } while (continuar.equalsIgnoreCase("S"));
                    System.out.print("Genero(F/M): ");
                    gen = teclado.next();
                    p.setGenero(gen);
                    personas.add(p);

                }
            }
            System.out.println("Queres seguir ingresando?(S/N)");
            continuar = teclado.next();
        } while (continuar.equalsIgnoreCase("S"));
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i)
                    .getNombre());
            if (personas.get(i).isOkNac()) {
                System.out.println("Fecha de nacimiento: "
                        + personas.get(i).getFechNac());

                System.out.println("Edad: " + 
                        personas.get(i).getEdad()
                        + " años");
            }
            System.out.println("Genero: " + 
                    personas.get(i).getGenero());
        }
    }

}


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Principal {
    public static void main(String[] args) {
        // ArrayList de enteros
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        // Como agregar elementos a la lista
        numeros.add(25);
        numeros.add(1);
        numeros.add(38);
        numeros.add(-4);
//        numeros.add(3.14);
        numeros.add(314);
    
        // mostrar tamaño de la lista
        System.out.println("Cantidad de elementos : " + numeros.size());
        
        // Obtener un elemento de la lista
        System.out.println("Elemento en indice 3 " + numeros.get(3));
        
        // ArrayList de String
//        ArrayList<String> estudiantes = new ArrayList<String>();
        // otra forma de crear ArrayList
        List<String> estudiantes = new ArrayList();
    
        estudiantes.add("Alberto");
        estudiantes.add("Deborah");
        estudiantes.add("Cristian");
        estudiantes.add("Vanesa");
        estudiantes.add("Alejandro");
   
        System.out.println("");
        System.out.println("La cantidad de estudiantes es " + estudiantes.size());
        
        // mostramos la lista obteniendo los elementos con el metodo get
        for(int i = 0; i < estudiantes.size(); i++){
            System.out.println("Estudiante " + estudiantes.get(i));
        }
        
        // mostramos los elementos de la lista obteniendolos con for Each
        System.out.println("");
        System.out.println("Recorrido de la lista con un for Each");
        for (String lista:estudiantes){
            System.out.println(lista);
        }
        
        System.out.println("");
        System.out.println("Mostrando la lista de forma no ontrolada");
        System.out.println("Todo seguido : " + estudiantes);
        
        // Eliminar y buscar elementos dentro de la lista
        List<String> compras = new ArrayList();
        
        compras.add("shampoo");
        compras.add("desodorante");
        compras.add("dentrifico");
        compras.add("azucar");
        compras.add("harina");
        compras.add("sal");
        compras.add("aceite");
        compras.add("levadura");
        compras.add("salsa de tomate");
        compras.add("especias");
        
        System.out.println("");
        System.out.println("Cantidad de elementos a comprar " + compras.size());
        System.out.println("Recorrido de la Clase compras con For Each ");
        compras.forEach(articulos->{
            System.out.println(articulos);
        });
        
        System.out.println("");
        // Busqueda de elementos de la lista
        System.out.println("Busqueda de un elemento con el metodo contains");
        if(compras.contains("especias")){
            System.out.println("La lista contiene el elemento especias");
        }
        
        
        System.out.println("");
        // eliminacion de elementos de la lista on el metodo remove
        compras.remove("especias");
        // remove utilizando indice
        compras.remove(0);
        
        System.out.println("Recorrido despues de utilizar remove");
        System.out.println("Elementos luego de la eliminacion " + compras.size());
        compras.forEach((articulos)->{
            System.out.println(articulos);
        });
        
        
        System.out.println("");
        // recorrer la lista usando el iterator
        System.out.println("recorrido con iterator");
        Iterator i = compras.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        System.out.println("");
        //eliminar los elementos de la lista
        System.out.println("Vaciar la lista con el metodo clear");
        compras.clear();// vaciado de la lista
        // para saber si la lista contiene elementos utilizar metodo isEmpty
        if(compras.isEmpty()){
            System.out.println("Lista vacia");
            System.out.println("Cantidad de elementos despues de vaciar la lista con clear : " + compras.size());
        }
        
        System.out.println("");
        // reemplazar un elemento de la lista
        System.out.println("Reemplazamos el primer elemento(alberto) de la lista de estudiantes con el metodo set");
        estudiantes.set(0, "Jorge");
        System.out.println(estudiantes);
        
        System.out.println("");
        // mostrar una parte de la lista con el metodo sublist
        System.out.println("mostramos una parte de la lista esstudiantes");
        System.out.println(estudiantes.subList(0, 2));
        
        
        
        
    }
}

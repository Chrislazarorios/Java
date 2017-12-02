package PruebasJO;

import javax.swing.JOptionPane;

public class NewMain {

    public static void main(String[] args) {
       String titulo,men;
       int icono;
       String respuesta;
       int opcion;
       Object selector;
       String opciones[]=new String[3];
       
       //Ventana con mensaje
       titulo="Aviso";
       men="Hola";
       icono=2;
        
       //JOptionPane.showMessageDialog(null, men,titulo,icono);
       
       //Para introducir un texto
       /*
       titulo="Cuadro de texto";
       men="Ingresar algo";
       icono=JOptionPane.ERROR_MESSAGE;
       respuesta=JOptionPane.showInputDialog(null, men, titulo,icono);
      
       if(respuesta==null){
           System.out.println("Es nulo");
       }else if(respuesta.isEmpty()){
           System.out.println("Esta vacia");
       }else{
            System.out.println(respuesta);
       } */   
        //listado de opciones
       /* 
       opciones[0]="Tren";
       opciones[1]="Avión";
       opciones[2]="Auto";
       titulo="Cuadro de opciones";
       men="Transporte";
       
       selector=JOptionPane.showInputDialog(null, men, titulo,
                JOptionPane.DEFAULT_OPTION,null,opciones,opciones[1]);
       
       respuesta=selector.toString();
        System.out.println(respuesta);
     */
        
        //Opciones
        
        opcion=JOptionPane.showOptionDialog(null, "Seleccione", 
                titulo, JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,null,1);
        System.out.println(opcion);
        
    }
}

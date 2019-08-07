/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Lavarropa extends Electrodomestico{
    
    private final int tipo_def = 1;
    private int tipo;
    private final double plusAgregado_def = 0;
    private double plusAgregado;
    private final String tipoLavadora_def = " ";
    private String tipoLavadora;
    
    public Lavarropa(){
        
    }
    
    public Lavarropa(double precioBase, String color){
        super( precioBase,  color);
    }
    
    public Lavarropa(double precioBase, String color, int tipo){
        super(precioBase, color);
        
        this.tipo=tipo;
    }
    
    public void verificaTipo(int tipo){
        
        String tipoLavadora = " ";
        switch(this.tipo=tipo){
            case 1: tipoLavadora = "lavarropa solo";
                    break;
            
            case 2: tipoLavadora = "lavarropa con secadora";
                    break;
                    
            case 3: tipoLavadora = "lavarropa con secarropa";
                    break;
                    
            case 4: tipoLavadora = "lavarropa china";
                    break;
   
        }
    }
    
    public String getTipoLavadora(){
        return tipoLavadora;
    }
    
    
}

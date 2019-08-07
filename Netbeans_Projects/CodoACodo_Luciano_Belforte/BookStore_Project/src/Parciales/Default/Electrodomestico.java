
public class Electrodomestico {
    
    private  String COLOR_DEF= "Blanco";
    
    private  double PRECIO_BASE_DEF= 1000;
    
    private double precioBase;
    
    private String color;
    
    public Electrodomestico(){
        
         precioBase=PRECIO_BASE_DEF;
         
         color=COLOR_DEF;
       
    }
    
    public Electrodomestico(double precioBase, String color){
        
        this.precioBase=precioBase;
        
        this.color=color;
        
    }
    
    public String getCOLOR_DEF(){
        
        return COLOR_DEF;
    }
    
    public double PRECIO_BASE_DEF(){
        
        return PRECIO_BASE_DEF; 
    }
    
    public double getprecioBase(){
        
        return precioBase;
        
    }
    public String getColor(){
        return color;
    }
    
    public double precioFinalContado(){
        double aumento=3;
        if(color.equalsIgnoreCase(COLOR_DEF)){
            precioBase=precioBase;
        }else{
            
            aumento=precioBase*aumento/100;
            
            precioBase=precioBase+aumento;
        }
        
        return precioBase;
        
    }
    
    
    
    public double precioFinal2Cuotas(){
        
        return precioFinalContado()*1.1;
    }
    
    
        
        
    
}





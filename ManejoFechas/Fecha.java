package ManejoFechas;
import java.time.LocalDate;


public class Fecha {
    private LocalDate fecha;
    private boolean ok;
    private int dia,mes,anio;
/*
tres  constructores uno con dia mes y año y otro para ingresar un string
dd/mm/aaaa y otro para la fecha actual
*/
    public Fecha() {
        this.fecha=LocalDate.now();
        this.anio=this.fecha.getYear();
        this.mes=this.fecha.getMonthValue();
        this.dia=this.fecha.getDayOfMonth();
        
        this.ok=true;
    }
 
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.controlaFecha();
    }
    

    public Fecha(String fecha) {
        this.dia= Integer.parseInt(fecha.substring(0,2));
        this.mes= Integer.parseInt(fecha.substring(3,5));
        this.anio= Integer.parseInt(fecha.substring(6));
        this.controlaFecha();
        
    }

/*
controla que la fecha sea válida, si lo es ok=true
si no lo es el atributo ok=false
*/
    private void controlaFecha(){
        LocalDate fecha=LocalDate.of(anio,mes,dia);
        if(anio==0){
            this.ok=false;
        }else{
            try{
                this.fecha=fecha;
                this.ok=true;
            }catch(Exception e){
                this.ok=false;
            }
        }    
    }


    public LocalDate getFecha() {
        return fecha;
    }

    public boolean isOk() {
        return ok;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
}

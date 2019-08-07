package ManejoFechas;

import java.time.LocalDate;
import java.time.Period;



public class DifFechas{
    private Fecha fecha1;
    private Fecha fecha2;
    private Period  periodo;
    private boolean ok1,ok2,ok;
    private int difAnios;
/*
Creo varios constructores: 
1) las dos fechas como clase Fecha;
2) las dos fecha como String (dd/mm/aaaa)
3) las dos fechas en formato dia, mes y año
4) convino los tres formatos 
5) tres constructores donde se ingreso una solo una fecha en cada uno de los formatos
	y la otra fecha es la fecha actual
6) en todos los caso las fecha que no está ingresada como clase Fecha se la convierte en una clase Fecha
7) todos los constructores controlan que las fechas esten bien ingresadas y se calcula la diferencia
    
*/
    public DifFechas(Fecha fech1, Fecha fech2) {
		//dos clase Fecha
        this.controlaFechas(fech1, fech2);
    }
    public DifFechas(String fech1Txt, String fech2Txt) {
		//dos string
		Fecha fech1=new Fecha(fech1Txt);
		Fecha fech2=new Fecha(fech2Txt);
        this.controlaFechas(this.fecha1, this.fecha2);
	}
	public DifFechas(int dia1,int mes1,int anio1,int dia2,int mes2,int anio2) {
		//dos dia, mes y año
		Fecha fech1=new Fecha(dia1,mes1,anio1);
		Fecha fech2=new Fecha(dia2,mes2,anio2);
        this.controlaFechas(this.fecha1, this.fecha2);
	}

    public DifFechas(String fech1Txt, Fecha fech2) {
		//String y clase Fecha
		Fecha fech1=new Fecha(fech1Txt);
        this.controlaFechas(fech1, fech2);
    }
    public DifFechas(Fecha fech1,int dia,int mes,int anio) {
		//clase fecha y dia, mes y año
		Fecha fech2=new Fecha(dia,mes,anio);
        this.controlaFechas(fech1, fech2);
    }
    public DifFechas(String fech1Txt,int dia,int mes,int anio) {
        //String y dia, mes y año
		Fecha fech1=new Fecha(fech1Txt);
        Fecha fech2=new Fecha(dia,mes,anio);
        this.controlaFechas(fech1, fech2);
    }
	public DifFechas(Fecha fech1) {
		//una clase fecha la otra es la fecha actual
        Fecha fech2=new Fecha();
        this.controlaFechas(fech1, fech2);
    }
	
    public DifFechas(String fech1Txt) {
		//una string la otra es la fecha actual
        Fecha fech1=new Fecha(fech1Txt);
        Fecha fech2=new Fecha();
        this.controlaFechas(fech1, fech2);
    }


    public DifFechas(int dia,int mes,int anio) {
		//una dia, mes y año y la otra la fech actual
		Fecha fech1=new Fecha(dia,mes,anio);
        Fecha fech2=new Fecha();
        this.controlaFechas(fech1, fech2);
    }
    private void controlaFechas(Fecha fech1,Fecha fech2){
		//controla que las fechas esten bien ingresadas
		this.ok1 = fech1.isOk();
        this.ok2 = fech2.isOk();
        if(this.ok1 && this.ok2){
            this.ok=true;
            this.fecha1=fech1;
            this.fecha2=fech2;
            this.setPeriodo();
        }else{
            this.ok=false;
        }
    }


    private void setPeriodo() {
		//calcula la diferencia
        this.periodo =Period.between(this.fecha1.getFecha(), this.fecha2.getFecha());
    }

    public Fecha getFech1() {
        return fecha1;
    }

    public Fecha getFech2() {
        return fecha2;
    }

    public Period getPeriodo() {
        return periodo;
    }

    public boolean isOk1() {
        return ok1;
    }

    public boolean isOk2() {
        return ok2;
    }

    public boolean isOk() {
        return ok;
    }
    public int getDifAnios() {
        //retorna la dif en años
		// como no se diferencia cual es menor de las dos fechas, se devuelve el valor absoluto(+)
		// y si una de las fechas es menor a cero y la otra mayor, se le resta 1
		// porque no existe año cero
		if((fecha1.getAnio()<0&&fecha2.getAnio()>0) ||
                (fecha1.getAnio()>0&&fecha2.getAnio()<0)){
            this.difAnios=Math.abs(this.periodo.getYears()-1);
            
        }else{
            this.difAnios=Math.abs(this.periodo.getYears());
        }
        return this.difAnios;
    }
    
    
}

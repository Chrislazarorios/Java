package Personas;

import ManejoFechas.Fecha;
import ManejoFechas.DifFechas;
import Sueldos.*;


public class Empleado extends Persona {

    private String cuil;
    private String codEmpl;
    private Fecha fechaIng;
    private int antiguedad=0;
    private DifFechas antiguedadGral;
    private boolean fingOk;
    private Sueldo sueldoempl;
    
    
    //el constructor solo pide los atributo de la clase persona
    public Empleado(String nombre, String apellido, DNI dni) {
        super(nombre, apellido, dni);
    }

    //para el cuil solo pide el prefijo y el digito verificador
    public void setCuil(int pre,int PV) {
        DNI DNITxt=this.getDni();
        String preTxt=Integer.toString(pre);
        String PVTxt=Integer.toString(PV);
        this.cuil = preTxt+"-"+DNITxt+"-"+PVTxt;
    }
	// crea tres set para fecha de ingreso, clase Fecha, String o dia, mes y a�o
    public void setFechaIng(int dia,int mes,int anio) {
        Fecha fIng=new Fecha(dia, mes, anio);
        if(fIng.isOk()){
            this.fechaIng = fIng;
            setAntiguedadGral();
        }
        fingOk=fIng.isOk();
    }
    public void setFechaIng(String fechIngTxt) {
        Fecha fIng=new Fecha(fechIngTxt);
        if(fIng.isOk()){
            this.fechaIng = fIng;
            setAntiguedadGral();
        }
        fingOk=fIng.isOk();
    }

    public void setFechaIng(Fecha fechaIng) {
        if(fechaIng.isOk()){
            this.fechaIng = fechaIng;
            setAntiguedadGral();
        }
        fingOk=fechaIng.isOk();
    }

    public boolean isFingOk() {
        return fingOk;
    }

    private void setAntiguedadGral() {
        DifFechas aGral=new DifFechas(fechaIng);
        this.antiguedadGral = aGral;
    }

    public int getAntiguedad() {
        this.antiguedad=this.antiguedadGral.getDifAnios();
        return antiguedad;
    }

    public DifFechas getAntiguedadGral() {
        return antiguedadGral;
    }
	// crea el codigo de empleado usando el a�o el mes y letras ingresadas
    public void setCodEmpl(String codLetras) {
        String anioTxt=Integer.toString(this.fechaIng.getAnio());
        String mesTxt=Integer.toString(this.fechaIng.getMes());
        DNI finDNITxt=this.getDni();//.substring(5);
        
        this.codEmpl = anioTxt+"-"+mesTxt+"-"+finDNITxt+"-"+codLetras;
    }

    public String getCuil() {
        return cuil;
    }

    public String getCodEmpl() {
        return codEmpl;
    }

    public Fecha getFechaIng() {
        return fechaIng;
    }


    public Sueldo getSueldoempl() {
        return sueldoempl;
    }

    public void setSueldoempl(Sueldo sueldoempl) {
        this.sueldoempl = sueldoempl;
    }



    
    
    
    
}

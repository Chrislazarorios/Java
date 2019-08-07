package Personas;

import java.text.DecimalFormat;

public class DNI {
    private String DNITxt;
    private int DNInum;
    private int largo;
    private int min;
    private int max;
    private boolean ok;
    private DecimalFormat moneda = new DecimalFormat("###,###,### ");
    public DNI(String DNITxt, int largo, int min, int max) {
        this.DNITxt = DNITxt;
        this.largo = largo;
        this.min = min;
        this.max = max;
        this.controlaDNI();
    }

    public String getDNITxt() {
        return DNITxt;
    }

    public int getDNInum() {
        return DNInum;
    }

    public int getLargo() {
        return largo;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public boolean isOk() {
        return ok;
    }

    public void setDNITxt(String DNITxt) {
        this.DNITxt = DNITxt;
    }

    public void setDNInum(int DNInum) {
        this.DNInum = DNInum;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }
    public DNI(String DNITxt) {
        this.DNITxt = DNITxt;
        this.largo = 8;
        this.min = 1000000;
        this.max = 99999999;
        this.controlaDNI();
    }
    private void controlaDNI(){
        int DNI=0;
        this.ok=true;
        if(this.DNITxt.length()>this.largo){
            this.ok=false;
        }else{
            try{
                DNI=Integer.parseInt(DNITxt);
            }catch(Exception e){
                this.ok=false;
                
            }
        }
    if(this.ok){
        if(DNI<this.min || DNI>this.max){
            this.ok=false;
        }else{
           this.DNInum=DNI; 
           this.DNITxt=moneda.format(this.DNInum);
        }
    }
    }
}

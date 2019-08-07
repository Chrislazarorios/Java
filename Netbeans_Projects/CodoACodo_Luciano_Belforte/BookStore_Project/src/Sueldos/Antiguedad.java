package Sueldos;
public class Antiguedad  {
	private int anios;
	private double porcAnual;
	private String codAdic="ant";
	private String descripcion="Antiguedad";
	private double valor;
	private boolean fijo=false;
	//un adiccional expecial, donde cargamos los a�os de antiguedad y y el % por a�o 
	// para cargar en la clase AdiccionDesc
    public Antiguedad(int anios, double porcAnual) {
        this.anios = anios;
        this.porcAnual = porcAnual;
        this.valor=this.anios*this.porcAnual;
    }

    public int getAnios() {
        return anios;
    }
	public double getPorcAnual() {
        return porcAnual;
    }
	public double getValor() {
        return valor;
    }
    public String getCodAdic() {
        return codAdic;
    }
	public String getDescripcion() {
        return descripcion;
    }
	public boolean getFijo() {
        return fijo;
    }

}	

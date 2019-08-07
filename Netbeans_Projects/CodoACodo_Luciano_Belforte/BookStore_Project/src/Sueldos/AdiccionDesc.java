package Sueldos;
public class AdiccionDesc {
    private String codAdic;
    private String descripcion;
    private double valor;
	private boolean fijo;
 
	//clase para cargar adiccionales y descuentos
	//con una descripci�n, un c�digo un valor porcentual y un  boleano: 
	// fijo si es true es un monto fijo sino es una proporcion
    public AdiccionDesc(String codAdic, String descripcion,  double valor,boolean fijo) {
        this.codAdic = codAdic;
        this.descripcion = descripcion;
        this.valor = valor;
        this.fijo = fijo;
       
    }

    public void setCodAdic(String codAdic) {
        this.codAdic = codAdic;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setFijo(boolean fijo) {
        this.fijo = fijo;
    }

    public AdiccionDesc() {
    }

 
    public String getCodAdic() {
        return codAdic;
    }

    public String getDescripcion() {
        return descripcion;
    }

 
    public double getValor() {
        return valor;
    }
    public boolean isFijo() {
        return fijo;
    }


 
    
}

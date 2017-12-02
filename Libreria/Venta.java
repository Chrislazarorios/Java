package Libreria;
public class Venta  {
	private String codCliente,codEmpl;
	private int codLibros[];
	private double precios[];
	private double desc;
	private double ventaTotal;
	private double ventaConDesc;
	private int cantLibros;
	
	public Venta(String codCliente,String codEmpl,int[] codLibros,double[] precios,double desc) {
		this.codCliente=codCliente;
		this.codEmpl=codEmpl;
		this.codLibros=codLibros;
		this.precios=precios;
		this.desc=desc;
		this.cantLibros=codLibros.length;
		
	}
	private void setVentaTotal(){
		double venta=0;
		for(int i=0;i<this.precios.length;i++){
			venta=venta+this.precios[i];
		}
		this.ventaTotal=venta;
		this.ventaConDesc=venta-(venta*this.desc);
	}
	public String getCodCliente() {
        return codCliente;
    }
	public String getCodEmpl() {
        return codEmpl;
    }
	public int[] getCodLibros() {
        return codLibros;
    }
	public double[] getPrecios() {
        return precios;
    }
	public double getDesc(){
        return desc;
	}
	public double getVentaTotal(){
        return ventaTotal;
	}
	public int getCantLibros(){
        return cantLibros;
	}

    public double getVentaConDesc() {
        return ventaConDesc;
    }

	
	
}	


package Sueldos;

public class PrimaLibro  {
	private double precioLibros;
	private double porcPrima;
	private int cantLibros;
	private String codAdic="pr";
	private String descripcion="Prima Ventas";
	private double valor;
	private boolean fijo=true;
	// adiccional expecial carga un array con los precios de los libros vendidos
	//luego calcula de acuerdo al % ingresado la prima total
	//y se carga en una clase AdiccionDesc

    public PrimaLibro(double precioLibros, double porcPrima,int cantLibros) {
        this.precioLibros = precioLibros;
        this.porcPrima = porcPrima;
		this.cantLibros	= cantLibros;
		this.valor=precioLibros*porcPrima;
    }

	public void agregaLibro(double precio){
		double add;
		this.cantLibros=this.cantLibros+1;
		add=this.porcPrima*precio;
		this.valor=this.valor+add;
	}
	
    public double getPorcPrima() {
         return porcPrima;
    }

    public int getCantLibros() {
         return cantLibros;
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

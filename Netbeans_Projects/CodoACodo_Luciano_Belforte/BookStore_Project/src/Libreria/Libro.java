package Libreria;
public class Libro  {
	private String titulo,autor,editorial;
	private double precio;
	private int codLibro;
	
	public Libro(String titulo,String autor,String editorial,double precio,int codLibro) {
		this.titulo=titulo;
		this.autor=autor;
		this.editorial=editorial;
		this.precio=precio;
		this.codLibro=codLibro;
		
	}
	public String getTitulo() {
        return titulo;
    }
	public String getAutor() {
        return autor;
    }
	public String getEditorial() {
        return editorial;
    }
	public double getPrecio() {
        return precio;
    }
	public int getCodLibro() {
        return codLibro;
    }

}	

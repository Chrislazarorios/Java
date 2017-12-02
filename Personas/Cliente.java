package Personas;


public class Cliente extends Persona {

    private String codCliente;
 	private double desc=0;

    public Cliente(String codCliente, String nombre, String apellido, DNI dni) {
        super(nombre, apellido, dni);
        this.codCliente = codCliente;
    }
    
    

    public void setDesc(double desc) {
		this.desc=desc;
	}


    public String getCodCliente() {
        return codCliente;
    }

    public double getDesc() {
        return desc;
    }
}

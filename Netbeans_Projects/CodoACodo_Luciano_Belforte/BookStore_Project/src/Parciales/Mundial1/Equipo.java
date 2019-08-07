package Mundial1;
public class Equipo {


    private String nombre;
    private int par_jugados;
    private int par_ganados;
    private int par_empatados;
    private int par_perdidos;
    private int gol_favor;
    private int gol_contra;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.par_jugados = 0;
        this.par_ganados = 0;
        this.par_empatados = 0;
        this.par_perdidos = 0;
        this.gol_favor = 0;
        this.gol_contra = 0;
    }

    public void agregarPar_jugado() {
        this.par_jugados = this.par_jugados + 1;
    }

    public void agregarPar_ganado() {
        this.par_ganados = this.par_ganados + 1;
    }

    public void agregarPar_empatados() {
        this.par_empatados = this.par_empatados + 1;
    }

    public void agregarPar_perdidos() {
        this.par_perdidos = this.par_perdidos + 1;
    }

    public void agregarGol_favor(int gol_favor) {
        this.gol_favor = this.gol_favor + gol_favor;
    }

    public void agregarGol_contra(int gol_contra) {
        this.gol_contra = this.gol_contra + gol_contra;
    }
    public String getNombre() {
        return nombre;
    }

    public int getPar_jugados() {
        return par_jugados;
    }

    public int getPar_ganados() {
        return par_ganados;
    }

    public int getPar_empatados() {
        return par_empatados;
    }

    public int getPar_perdidos() {
        return par_perdidos;
    }

    public int getPuntos() {
        return (this.par_ganados * 3) + this.par_empatados;
    }

    public int getGol_favor() {
        return gol_favor;
    }

    public int getGol_contra() {
        return gol_contra;
    }

    public int getGol_diferencia() {
        return this.gol_favor - this.gol_contra;
    }
    public String toString(){
        String resp=this.nombre+"  "+this.par_jugados+"  "+this.par_ganados+"  "+
                this.par_empatados+"  "+this.par_perdidos+"  "+
                this.getPuntos()+"  "+this.gol_favor+"  "+this.gol_contra+"  "+
                this.getGol_diferencia();
        return resp;
    }
	

}

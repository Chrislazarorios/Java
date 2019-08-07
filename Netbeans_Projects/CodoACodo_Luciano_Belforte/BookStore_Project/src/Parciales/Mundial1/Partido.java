package Mundial1;
public class Partido {

    private Equipo eq1;
    private Equipo eq2;
    private int gol_eq1;
    private int gol_eq2;

    public Partido(Equipo eq1, Equipo eq2) {
        this.eq1 = eq1;
        this.eq2 = eq2;
    }
    public void setGol_eq1(int gol_eq1) {
        this.gol_eq1 = gol_eq1;
    }

    public void setGol_eq2(int gol_eq2) {
        this.gol_eq2 = gol_eq2;
    }

    public void resultado() {

        this.eq1.agregarGol_favor(gol_eq1);
        this.eq2.agregarGol_favor(gol_eq2);
        this.eq1.agregarGol_contra(gol_eq2);
        this.eq2.agregarGol_contra(gol_eq1);
        this.eq1.agregarPar_jugado();
        this.eq2.agregarPar_jugado();
		
        if (gol_eq1 == gol_eq2) {
            this.eq1.agregarPar_empatados();
            this.eq2.agregarPar_empatados();
			
        } else if (gol_eq1 > gol_eq2) {
            this.eq1.agregarPar_ganado();
            this.eq2.agregarPar_perdidos();
        } else {
            this.eq2.agregarPar_ganado();
            this.eq1.agregarPar_perdidos();
        }
    }

	
    public Equipo getEq1() {
        return eq1;
    }

    public Equipo getEq2() {
        return eq2;
    }

    public int getGol_eq1() {
        return gol_eq1;
    }

    public int getGol_eq2() {
        return gol_eq2;
    }


    public String toString() {
        return eq1.getNombre() + " vs " + eq2.getNombre();
    }

}

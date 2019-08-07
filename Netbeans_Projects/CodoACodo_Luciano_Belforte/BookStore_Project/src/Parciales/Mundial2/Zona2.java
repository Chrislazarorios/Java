package Mundial2;

import java.util.Arrays;
import java.util.Scanner;

public class Zona2 {

    public static void main(String[] args) {
        int g1, g2;
        Equipo equipo1 = new Equipo("equipo1");
        Equipo equipo2 = new Equipo("equipo2");
        Equipo equipo3 = new Equipo("equipo3");
        Equipo equipo4 = new Equipo("equipo4");
        Equipo[] equipos = new Equipo[4];

        equipos[0] = equipo1;
        equipos[1] = equipo2;
        equipos[2] = equipo3;
        equipos[3] = equipo4;

        Scanner teclado = new Scanner(System.in);

        Partido partido1 = new Partido(equipo1, equipo2);
        Partido partido2 = new Partido(equipo3, equipo4);
        Partido partido3 = new Partido(equipo1, equipo3);
        Partido partido4 = new Partido(equipo4, equipo2);
        Partido partido5 = new Partido(equipo1, equipo4);
        Partido partido6 = new Partido(equipo3, equipo2);
        Partido[] partidos = new Partido[6];

        partidos[0] = partido1;
        partidos[1] = partido2;
        partidos[2] = partido3;
        partidos[3] = partido4;
        partidos[4] = partido5;
        partidos[5] = partido6;

        for (Partido p : partidos) {
            System.out.println(p.toString());
            System.out.print("Goles de " + p.getEq1().getNombre() + " ");
            g1 = teclado.nextInt();
            System.out.print("Goles de " + p.getEq2().getNombre() + " ");
            g2 = teclado.nextInt();
            p.resultado(g1, g2);
        }
        int orden = 1;
        for (Partido p : partidos) {
            System.out.println("Partido No "+orden+" "+p.getEq1().getNombre() + " "+p.getGol_eq1()+" - "+
                    p.getEq2().getNombre() + " "+p.getGol_eq2());
            orden=orden+1;
        }

        Arrays.sort(equipos);

        orden = 1;
        System.out.println("Posición Equipo "+" PJ "+"PG "+"PE "+"PP "+"PT "+"GF "+"GC "+"DG");

        for (Equipo e : equipos) {
            if (orden <= 2) {
                System.out.println(orden + "        " + e.toString() + " Clasificado");
            } else {
                System.out.println(orden + "        " + e.toString());
            }
            orden++;
        }

    }

}

class Equipo implements Comparable {

    private String nombre;
    private int par_jugados;
    private int par_ganados;
    private int par_empatados;
    private int par_perdidos;
    private int gol_favor;
    private int gol_contra;
    private int puntos;
    private int[][] partido = new int[3][3];
    private int noPar;
    private int id;
    private static int idS = 1;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.par_jugados = 0;
        this.par_ganados = 0;
        this.par_empatados = 0;
        this.par_perdidos = 0;
        this.gol_favor = 0;
        this.gol_contra = 0;
        this.noPar = 0;
        this.puntos = 0;
        this.id = this.idS;
        this.idS++;
    }

    public void agregarPartido(int idEq, int gol_f, int gol_c) {
        if (partidoJugado(idEq)) {
            this.gol_favor = this.gol_favor + gol_f;
            this.gol_contra = this.gol_contra + gol_c;
            this.par_jugados = this.par_jugados + 1;
            this.partido[noPar][0] = idEq;
            this.partido[noPar][1] = gol_f;
            this.partido[noPar][2] = gol_c;
            this.noPar = this.noPar + 1;
            if (gol_f == gol_c) {
                this.par_empatados = this.par_empatados + 1;
                this.puntos = this.puntos + 1;
            } else if (gol_f > gol_c) {
                this.par_ganados = this.par_ganados + 1;
                this.puntos = this.puntos + 3;
            } else {
                this.par_perdidos = this.par_perdidos + 1;
            }
        }
    }

    public boolean partidoJugado(int idEq) {
        boolean ok = true;
        for (int i = 0; i < 3; i++) {
            if (partido[i][0] == idEq) {
                ok = false;
                break;
            }
        }
        return ok;
    }

    public int[] dameResultado(int idEq) {
        int[] num = new int[2];
        for (int i = 0; i < 3; i++) {
            if (partido[i][0] == idEq) {
                num[0] = partido[i][1];
                num[1] = partido[i][2];
                break;
            }
        }
        return num;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
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
        return puntos;
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

    public String toString() {
        String resp = this.nombre + "  " + this.par_jugados + "  " + this.par_ganados + "  "
                + this.par_empatados + "  " + this.par_perdidos + "  "
                + this.getPuntos() + "  " + this.gol_favor + "  " + this.gol_contra + "  "
                + this.getGol_diferencia();
        return resp;
    }

    public int compareTo(Object miObj) {
        int orden = 0;
        Equipo otroEq = (Equipo) miObj;
        if (this.getPuntos() > otroEq.getPuntos()) {
            orden = -1;
        } else if (this.getPuntos() < otroEq.getPuntos()) {
            orden = 1;
        } else {
            if (this.getGol_diferencia() > otroEq.getGol_diferencia()) {
                orden = -1;
            } else if (this.getGol_diferencia() < otroEq.getGol_diferencia()) {
                orden = 1;
            } else {
                if (this.gol_favor > otroEq.getGol_favor()) {
                    orden = -1;
                } else if (this.gol_favor < otroEq.getGol_favor()) {
                    orden = 1;
                } else {
                    orden = resultado(otroEq.getId());
                    if (orden == 0) {
                        if (this.id < otroEq.getId()) {
                            orden = -1;
                        } else {
                            orden = 1;
                        }
                    }
                }
            }
        }
        return orden;
    }

    private int resultado(int idRival) {
        int[] resultado = new int[2];
        int res = 0;
        resultado = dameResultado(idRival);
        if (resultado[0] > resultado[1]) {
            res = -1;
        } else if (resultado[0] < resultado[1]) {
            res = 1;
        }
        return res;
    }

}

class Partido {

    private Equipo eq1;
    private Equipo eq2;
    private int gol_eq1;
    private int gol_eq2;

    public Partido(Equipo eq1, Equipo eq2) {
        this.eq1 = eq1;
        this.eq2 = eq2;
    }

    public void resultado(int gol_eq1, int gol_eq2) {
        this.gol_eq1 = gol_eq1;
        this.gol_eq2 = gol_eq2;
        this.eq1.agregarPartido(this.eq2.getId(), gol_eq1, gol_eq2);
        this.eq2.agregarPartido(this.eq1.getId(), gol_eq2, gol_eq1);
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


package Mundial1;

import java.util.Scanner;

public class Zona {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre de equipo 1");
        Equipo equipo1 = new Equipo(teclado.next());
        System.out.println("Nombre de equipo 2");
        Equipo equipo2 = new Equipo(teclado.next());
        System.out.println("Nombre de equipo 3");
        Equipo equipo3 = new Equipo(teclado.next());
        System.out.println("Nombre de equipo 4");
        Equipo equipo4 = new Equipo(teclado.next());
        Equipo[] equipos=new Equipo[4];
        
        equipos[0]=equipo1;
        equipos[1]=equipo2;
        equipos[2]=equipo3;
        equipos[3]=equipo4;

        

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
        /*for (int i = 0; i < 6; i++) {
            System.out.println(partidos[i].toString());
            System.out.print("Goles de " + partidos[i].getEq1().getNombre()+" ");
            partidos[i].setGol_eq1(teclado.nextInt());
            System.out.print("Goles de " + partidos[i].getEq2().getNombre()+" ");
            partidos[i].setGol_eq2(teclado.nextInt());
            partidos[i].resultado();
        }*/
        int num;
        for(Partido p:partidos){
            System.out.println(p.toString());
            System.out.print("Goles de " + p.getEq1().getNombre()+" ");
            num=(int)Math.floor(Math.random()*(6-0+1)+(0));
            p.setGol_eq1(num);
            System.out.print("Goles de " + p.getEq2().getNombre()+" ");
            num=(int)Math.floor(Math.random()*(6-0+1)+(0));
            p.setGol_eq2(num);
            p.resultado();
	}
		
        System.out.println("Equipo "+" PJ "+"PG "+"PE "+"PP "+"PT "+"GF "+"GC "+"DG");
        /*for(int i=0;i<4;i++){
            System.out.println(equipos[i].toString());
        }*/
		
        
	for(Equipo e:equipos){
            System.out.println(e.toString());
	}
        

    }

}


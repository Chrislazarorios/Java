package Sueldos;
public class Sueldo {
    private double basico,totAdiccionales,totDescuentos,bruto,neto;
    private AdiccionDesc adiccionales[];
    private AdiccionDesc descuentos[];
    private double viaticoDiario,viaticoTotal;
    private int diasLaborables;

	/*
	el constructor tiene varios parametros
	1) el sueldo basico
	2) dos arrays de la clase AdiccionDesc uno par los adiccionales y otro con los descuentos
	3) los viaticos diarios
	4) los d�as laborables
	5) una vez ingresados esos atributos se calculan los viaticos, los adiccionales y los descuentos
	*/
    public Sueldo(double basico, AdiccionDesc[] adiccionales, AdiccionDesc[] descuentos, double viaticoDiario, int diasLaborables) {
        this.basico = basico;
        this.adiccionales = adiccionales;
        this.descuentos = descuentos;
        this.viaticoDiario = viaticoDiario;
        this.diasLaborables = diasLaborables;
        this.setViaticoTotal();
        this.setTotAdiccionales();
        this.setTotDescuentos();
    }

    private void setViaticoTotal() {
        this.viaticoTotal = this.viaticoDiario*this.diasLaborables;
    }
	/*
	adiccionales y descuentos se calculan parecido, el primero sobre el b�sico y el segundo sobre el bruto
	se diferencia de si es una suma fijo o si es un %
	*/
    private void setTotAdiccionales() {
        double todAd=0;
        double add;
        for(int i=0;i<this.adiccionales.length;i++){
            if(this.adiccionales[i].isFijo()){
				todAd=todAd+this.adiccionales[i].getValor();
            }else{	
				add=this.basico*this.adiccionales[i].getValor();
				todAd=todAd+add;
            }	
        }
        this.totAdiccionales = todAd;
        this.bruto=this.basico+this.totAdiccionales;
                
    }
    
    private void setTotDescuentos() {
        double toddes=0;
        double des;
        for(int i=0;i<this.descuentos.length;i++){
            if(this.descuentos[i].isFijo()){
				toddes=toddes+this.descuentos[i].getValor();
            }else{	
				des=this.bruto*this.descuentos[i].getValor();
				toddes=toddes+des;
            }	
        }
        this.totDescuentos = toddes;
        this.neto=this.bruto-this.totDescuentos;
                
    }

    public double getBasico() {
        return basico;
    }


    public double getNeto() {
        return neto;
    }

    public double getViaticoTotal() {
        return viaticoTotal;
    }
    public double getTotalPago() {
        return this.viaticoTotal+this.neto;
    }

    public double getTotAdiccionales() {
        return totAdiccionales;
    }

    public double getTotDescuentos() {
        return totDescuentos;
    }

    public double getBruto() {
        return bruto;
    }

    public AdiccionDesc[] getAdiccionales() {
        return adiccionales;
    }

    public AdiccionDesc[] getDescuentos() {
        return descuentos;
    }

    public double getViaticoDiario() {
        return viaticoDiario;
    }

    public int getDiasLaborables() {
        return diasLaborables;
    }
    
}

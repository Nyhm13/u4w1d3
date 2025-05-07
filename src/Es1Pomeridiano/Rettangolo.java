package Es1Pomeridiano;

public class Rettangolo {

    private double base;
    private double altezza;

    //Costruttore parametrizzato

    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

   // METODO PER CALCOLARE AREA
    public  double calcolaArea(){
        return  base*altezza;
    }
    // METODO PER CALCOLARE PERIMETRO
    public  double calcolaPerimetro(){
        return 2*(base+altezza);
    }

    //METODO PER STAMPARE AREA E PERIMETRO

    public void stampaRettangolo(){
        System.out.println("AREA DEL RETTANGOLO= "+calcolaArea()+" PERIMETRO DEL RETTANGOLO="+calcolaPerimetro());

    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        System.out.println("Primo rettangolo area +perimetro=" );
        r1.stampaRettangolo();
        System.out.println("Secondo rettangolo area+perimetro=");
        r2.stampaRettangolo();

        double sommaAree=r1.calcolaArea()+r2.calcolaArea();
        double sommaPerimetri=r1.calcolaPerimetro()+r2.calcolaPerimetro();

        System.out.println("Somma delle aree="+sommaAree);
        System.out.println("Somma dei perimetri="+sommaPerimetri);


    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
}

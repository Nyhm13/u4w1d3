package EsProffPomeridiano1.nr1;

public class Rettangolo {

    private double altezza;
    private double base;

     // costruttore

    public Rettangolo(double base, double altezza) {
        this.altezza = altezza;
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
 // metodi perimetro e area

    public  double perimetro(){
        return 2*altezza +2*base;
    }

    public double area (){
        return base*altezza;
    }
}

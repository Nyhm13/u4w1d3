package Es1Pomeridiano;

public class MainRettangolo {
    public static void main(String[] args) {

        //creo i due oggetti di tipo rettangolo

        Rettangolo r1= new Rettangolo(5,10);
        Rettangolo r2= new Rettangolo(3,7);

//        System.out.println("altezza di r1= "+r1.getAltezza());

        //uso il metodo stampa rettangolo
        r1.stampaRettangolo();
        r2.stampaRettangolo();

        // uso il metodo per calcolare la somma delle aree e dei perimetri

        Rettangolo.stampaDueRettangoli(r1 ,r2);
    }
}

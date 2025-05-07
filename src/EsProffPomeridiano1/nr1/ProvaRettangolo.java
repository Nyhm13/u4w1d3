package EsProffPomeridiano1.nr1;

public class ProvaRettangolo {
    public static void main(String[] args) {

        Rettangolo r1= new Rettangolo(3,4);
        Rettangolo r2= new Rettangolo(8,5);

        stampaRettangolo(r1);
        stampaRettangolo(r2);
        stampaRettangoli(r1,r2);

    }
    // metodi
     public  static void stampaRettangolo(Rettangolo rettangolo){
         System.out.println("il perimetro del rettangolo e : " +rettangolo.perimetro());
         System.out.println("l`area del rettangolo e : " +rettangolo.area());

     }
     public static void stampaRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2 ){
        stampaRettangolo(rettangolo1);
        stampaRettangolo(rettangolo2);

         System.out.println("La somma dei perimetri: "+ (rettangolo1.area()+rettangolo2.area()));
         System.out.println("La somma delle aree : "+ (rettangolo1.perimetro()+rettangolo2.perimetro()));

     }
}

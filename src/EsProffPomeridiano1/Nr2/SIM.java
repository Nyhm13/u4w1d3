package EsProffPomeridiano1.Nr2;

public class SIM {

    private String numero ;

    private  double credito;

    private Chiamata[] chiamate;

     // costruttore passiamo solo il numero in stringa in quanto il credito e le chiamate
    // non erano richieste nella traccia o almeno il credito deve essere a 0
    // se non diamo un valore al credito il credito sarà di default 0  quindi lo commento

    public SIM(String numero) {
        this.numero = numero;
        // credito=0;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    // metodo per stampare le caratteristiche della sim

    public  void stampaSim(){
        System.out.println("il numero è: "+numero);
        System.out.println("il credito disponibile : "+credito);
        for (int i = 0; i < chiamate.length ; i++) {
            //chiamate è un array di oggetti di tipo chiamata il quale ogni
            //oggetto ha un metodo chiamato stampa arra riga 31 di Chiamata
            chiamate[i].stampa();
        }
    }
}

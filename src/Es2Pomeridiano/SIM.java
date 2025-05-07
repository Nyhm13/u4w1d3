package Es2Pomeridiano;

import java.util.LinkedList;
import java.util.List;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private List<Chiamata> chiamate;


     // Creo costruttore
    public SIM (String numeroTelefono){
        this.numeroTelefono= numeroTelefono;
        this.credito=0.0;
        this.chiamate= new LinkedList<>();
    }
    //creo metodo per aggiungere chiamate

    public void  aggiungiChiamata(Chiamata c){
        if (chiamate.size()>=5){
            chiamate.removeFirst(); // rimuovo la chiamata più vecchia
        }
            chiamate.add(c); // aggiungo la nuova chiamata




    }
    // metodo stampa dati sim
    public void stampaDatiSim(){
        System.out.println("Numero: " + numeroTelefono);
        System.out.println("Credito: " + credito + "€");
        System.out.println("Ultime chiamate:");
        for (Chiamata c : chiamate) {
            System.out.println(" - " + c);
        }

    }

}

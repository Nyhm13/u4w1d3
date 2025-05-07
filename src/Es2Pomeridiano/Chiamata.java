package Es2Pomeridiano;

public class Chiamata {
    //Definisco gli attributi

    private String numeroChiamato;
    private  int durata;

    //Creo costruttore
    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }
    public String toString(){
        return "Numero chiamato: " + numeroChiamato + ", minuti: " + durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setNumeroChiamato(String numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}

package EsProffPomeridiano1.Nr2;

public class Chiamata {
    // definisco i miei attributi

    private int durata;
    private String numeroChiamato;

    public Chiamata(int durata, String numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setNumeroChiamato(String numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }
     // metodo

    public void stampa (){
        System.out.println("Durata della chiamata : "+ durata + " , numero chiamato:"+ numeroChiamato );
    }
}

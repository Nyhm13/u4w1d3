package EsProffPomeridiano1.Nr2;

public class ProvaSim {
    public static void main(String[] args) {
        // sto passando il numero in stringa perche cosi l`ho definito
        // nella classe SIM dandogli alla variabile il tipo String

        SIM sim = new SIM("21654654");
        // sto settando il credito in quanto era a 0 di default
        sim.setCredito(10);
        // ora devo mettere le chiamate che devono essere un array
        //l`array deve essere un array di 5 chiamate
        Chiamata[] chiamate= new Chiamata[5];
        chiamate[0]=new Chiamata(52,"123123");
        chiamate[1]=new Chiamata(5213,"123123");
        chiamate[2]=new Chiamata(4,"123123");
        chiamate[3]=new Chiamata(42,"123123");
        chiamate[4]=new Chiamata(522,"123123");


        // qui sto passando l`array di chiamate  dichiarato sopra alla riga 13
        // grazie al setChiamate preso dalla classe SIM riga  41
        sim.setChiamate(chiamate);
        // qui sto richiamando il metodo stampaSim dalla classe SIM
        sim.stampaSim();



    }
}

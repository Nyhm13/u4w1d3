package Es2Pomeridiano;

public class MainChiamate {
    public static void main(String[] args) {
        // Creo un oggetto SIM
        SIM sim = new SIM("1234567890");

        // Aggiungo alcune chiamate
        sim.aggiungiChiamata(new Chiamata("0987654321", 5));
        sim.aggiungiChiamata(new Chiamata("1122334455", 10));
        sim.aggiungiChiamata(new Chiamata("2233445566", 15));
        sim.aggiungiChiamata(new Chiamata("3344556677", 20));
        sim.aggiungiChiamata(new Chiamata("4455667788", 25));
        sim.aggiungiChiamata(new Chiamata("55626778899", 90));
        sim.aggiungiChiamata(new Chiamata("5566778899", 30)); // Questa chiamata rimuoverà la più vecchia
        sim.aggiungiChiamata(new Chiamata("4455667788", 25));
        // Stampo i dati della SIM
        sim.stampaDatiSim();
    }
}

package canibales;

/**
 *
 * @author riost_fq9d95t
 */
public class Canibales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cocinero cocinero1;
        Canibal canibal1;
//        Canibal canibal2;

        Olla olla1;

        olla1 = new Olla();
        cocinero1 = new Cocinero(olla1);
        canibal1 = new Canibal(olla1);
//        canibal2 = new Canibal(olla1);
    }

}

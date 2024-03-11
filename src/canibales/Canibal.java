package canibales;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riost_fq9d95t
 */
public class Canibal extends Thread {

    private Olla olla;

    public Canibal(Olla olla) {
        this.olla = olla;
        start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                olla.comer();
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Canibal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

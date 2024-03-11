package canibales;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author riost_fq9d95t
 */
public class Cocinero extends Thread {

    private Olla olla;
    
    public Cocinero(Olla olla) {
        this.olla = olla;
        start();
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            try {
                olla.servir();
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cocinero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

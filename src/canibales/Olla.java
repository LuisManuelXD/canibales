package canibales;

import java.util.Random;

/**
 *
 * @author riost_fq9d95t
 */
public class Olla {
    private int raciones;
    private boolean ollaVacia;
    private Random random = new Random();
    
    public Olla() {
        this.raciones = random.nextInt(50) + 1;
        this.ollaVacia = false;
    }
    
    public synchronized void servir() {
        while (ollaVacia) {
            try {
                System.out.println("El cocinero está rellenando la olla...");
                this.raciones = random.nextInt(50) + 1;
                System.out.println("Ya puedes comer canibal...\n");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.ollaVacia = false;
        notifyAll();
    }
    
      public synchronized void comer() {
        while (this.raciones < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Un caníbal está tomando una ración...");
        this.raciones--;
        System.out.println("Raciones: " + this.raciones);
        
        if (this.raciones < 1) {
            this.ollaVacia = true;
            System.out.println("La olla esta vacio, el canibal notifica al cocinero");
            notifyAll();
        }
    }
}
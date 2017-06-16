/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import static lab9.Llamada.Tiempo;

/**
 *
 * @author denni
 */
public class Hilo_Llam extends Thread {

    int Tiempo;
    boolean Colgado = true;
    String Emisor;
    String Receptor;

    @Override
    public void run() {
        Tiempo = 0;
        while (Colgado) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
            Tiempo++;

        }
    }

}

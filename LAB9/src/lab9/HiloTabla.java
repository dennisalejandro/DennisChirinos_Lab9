/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author denni
 */
public class HiloTabla extends Thread {

    JTable Tabla;
    ArrayList<Hilo_Llam> listThread;

    public HiloTabla(JTable model, ArrayList<Hilo_Llam> listThread) {
        this.Tabla = model;
        this.listThread = listThread;
    }

    @Override
    public void run() {
        while (true) {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Tiempo");
            model.addColumn("Emisor");
            model.addColumn("Receptor");
            if (listThread.size() >= 0) {
                Object[] o = new Object[model.getColumnCount()];
                for (int i = 0; i < listThread.size(); i++) {
                    o[0] = listThread.get(i).Tiempo;
                    o[1] = listThread.get(i).Emisor;
                    o[2] = listThread.get(i).Receptor;
                    model.addRow(o);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloTabla.class.getName()).log(Level.SEVERE, null, ex);
            }
            Tabla.setModel(model);
        }
    }

}

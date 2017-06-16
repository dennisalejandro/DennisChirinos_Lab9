/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author denni
 */
public class SaveData implements Serializable {

    public void SaveBinario(ArrayList<Contacto> list) {
        File f = new File("./SaveDataContactos.meow");
        try {
            FileOutputStream FOS = new FileOutputStream(f);
            ObjectOutputStream OOS = new ObjectOutputStream(FOS);
            OOS.writeObject(list);
        } catch (Exception e) {
        }

    }

    public void SaveMensaje(ArrayList<Mensaje> list) {
        File f = new File("./SaveDataMensaje.meow");
        try {
            FileOutputStream FOS = new FileOutputStream(f);
            ObjectOutputStream OOS = new ObjectOutputStream(FOS);
            OOS.writeObject(list);
        } catch (Exception e) {
        }

    }

    public ArrayList<Contacto> LoadBinario() {
        ArrayList<Contacto> list = new ArrayList();
        File f = new File("./SaveDataContactos.meow");

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream OIS = new ObjectInputStream(fis);
            list = (ArrayList<Contacto>) OIS.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public ArrayList<Mensaje> LoadMensaje() {
        ArrayList<Mensaje> list = new ArrayList();
        File f = new File("./SaveDataMensaje.meow");
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream OIS = new ObjectInputStream(fis);
            list = (ArrayList<Mensaje>) OIS.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

}

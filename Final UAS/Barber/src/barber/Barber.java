/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barber;
import java.util.HashMap;

/**
 *
 * @author ACER
 */
public class Barber {

    public static void main(String[] args) {
        HashMap<String, String> harga = new HashMap<String, String>();
        harga.put("Regular", "Rp 10.000");
        harga.put("+ Minyak rambut", "Rp 12.000");
        harga.put("+ pijat", "Rp 15.000");
        harga.put("Complete Edition", "Rp 20.000");
    }
    
}

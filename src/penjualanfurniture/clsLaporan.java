/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanfurniture;

/**
 *
 * @author supercellmoonton
 */
import javax.swing.JOptionPane;
public class clsLaporan extends clskoneksi{
    String jual1;
    String jual2;
    
    public void cetak(String fjual1, String fjual2){
        try{
        jual1 = fjual1;
        jual2 = fjual2;
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
        System.out.println(e.getMessage());
    }
    }
    public void additem(String pilih_id){
        throw new UnsupportedOperationException("Not Supported yet");
        
    }
}

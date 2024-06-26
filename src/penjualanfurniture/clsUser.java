/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanfurniture;

import javax.swing.JOptionPane;

/**
 *
 * @author supercellmoonton
 */
public class clsUser extends clskoneksi{
    String IDFurniture;
    String NamaFurniture;
    public void TampilData()
    {
        sql="select * from furniture";
    }
    public void Baru(String fid_furniture,String fnama_furniture)
    {
        try
        {
            fid_furniture="";
            fnama_furniture="";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan ");
            System.out.println(e.getMessage());
//             
        }
    }
    
}

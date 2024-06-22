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

public class clsAdmin extends clskoneksi{
    String Username;
    String Nama;
    String Password;
    String Alamat;
    String no_hp;
    
    public void tampildata(){
        sql="select * from admin";
    }
    
    public void edit(){
        try{
            sql="update admin set nama='"+Nama+"',alamat='"+Alamat+"',no_hp='"+no_hp+"',password='"+Password+"' where username='"+Username+"'";
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    public void hapus(){
        try{
            sql="delete from admin where username ='"+Username+"'";
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
            
        }
    }
            
           
    
}

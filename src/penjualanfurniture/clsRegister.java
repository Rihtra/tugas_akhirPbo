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
public class clsRegister extends clskoneksi{
    int id_admin;
    String Nama;
    String Username;
    String Password;
    String Alamat;
    String No_HP;
    
    public void daftar(){
        try{
            sql = "insert into admin values ('"+id_admin+"','"+Nama+"','"+Username+"','"+Password+"','"+Alamat+"','"+No_HP+"')";
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
                 
        }
    }
    public void cancel(){
        try{
            JOptionPane.showMessageDialog(null, "Tidak jadi Daftar Akun");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Login(){
        try{
            JOptionPane.showMessageDialog(null, "Silahkan Login");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
        
    }


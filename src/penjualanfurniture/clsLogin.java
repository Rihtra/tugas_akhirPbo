/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanfurniture;

/**
 *
 * @author supercellmoonton
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class clsLogin extends clskoneksi{
    String mUsername;
    String mPassword;
    
    public void Masuk() {
    try {
        // Mengakses database
        AksesData();
        
        // Menyiapkan statement SQL
        String sql = "select * from admin where username= '" + mUsername + "' and password= '" + mPassword + "'";
        
        // Menjalankan query
        Statement stat = conn.createStatement();
//        ResultSet res = stat.executeQuery(sql);
        
        if (mUsername.equals("admin") && mPassword.equals("admin")){
            // Jika login berhasil, tampilkan dashboard
            Dashboard menu = new Dashboard();
            menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
            menu.setVisible(true);

        
        } else {
            // Jika login gagal, tampilkan pesan kesalahan
            DashboardUser menu1 = new DashboardUser();
            menu1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            menu1.setVisible(true);
        }

        // Menutup statement dan result set
        res.close();
        stat.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi Kesalahan: " + e.getMessage());
        System.out.println(e.getMessage());
    }
}

    
    public void Keluar(){
        try{
            JOptionPane.showMessageDialog(null, "Berhasil Keluar");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Daftar (){
        try{
            JOptionPane.showMessageDialog(null, "Silahkan Daftar Terlebih Dahulu");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }

}

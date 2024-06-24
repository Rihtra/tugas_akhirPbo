/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanfurniture;

/**
 *
 * @author supercellmoonton
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class clskoneksi {
    public Connection conn;
    public Statement res;
    public String sql;
    
    public void AksesData(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/penjualan_furniture", "root","");
        res = conn.createStatement();
    } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal Terhubung");
            System.out.println(e.getMessage());
            }
    }
    public Connection getConnection() {
        return conn;
    }
    
}


package penjualanfurniture;

import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author M-SI
 */
public class clsTransaksi extends clskoneksi{
    String no_transaksi;
    String tanggal;
    String nama_furniture;
    int jumlah;
    int total;
    int harga;
    
    public void tampildata (){
        sql = "select * from transaksi";
    }
    
    public void simpan(){
        try{
            sql = "INSERT INTO transaksi (tanggal, nama_furniture, jumlah, harga, total_harga) VALUES ('" + tanggal + "', '" + nama_furniture + "', '" + jumlah + "', '" + harga + "', '" + total + "')";
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan / Koneksi eror");
            System.out.println(e.getMessage());
        }
    }
    
    public void edit(){
        try{
            sql="update transaksi set tanggal = '"+tanggal+"',nama_furniture='"+nama_furniture+"',jumlah='"+jumlah+"',harga='"+harga+"',total_harga='"+total+"' where id_transaksi = '"+no_transaksi+"'";
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"terjadi Kesalahan / Koneksi eror");
            System.out.println(e.getMessage());
        }
    }
    
    public void hapus(){
        try{
            sql ="delete from transaksi where id_transaksi= '"+no_transaksi+"'";
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
}


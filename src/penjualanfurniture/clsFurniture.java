/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanfurniture;
import javax.swing.JOptionPane;
import java.sql.*;
public class clsFurniture extends clskoneksi{
   
    String IDFurniture;
    String NamaFurniture;
    String HargaFurniture;
    public void TampilData()
    {
        sql="select * from furniture";
    }
    public void Baru(String fid_furniture,String fnama_furniture,String fharga_furniture)
    {
        try
        {
            fid_furniture="";
            fnama_furniture="";
            fharga_furniture="";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan ");
            System.out.println(e.getMessage());
//             
        }
    }
   public void simpan() {
    try {
        String query = "INSERT INTO furniture (id_furniture, nama_furniture, harga) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, IDFurniture);
        ps.setString(2, NamaFurniture);
        ps.setString(3, HargaFurniture);
        
        int hasil = ps.executeUpdate();
        if (hasil > 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } else {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan");
        }
        
        ps.close(); // Tutup PreparedStatement setelah selesai digunakan
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Terjadi Kesalahan: " + e.getMessage());
        e.printStackTrace(); // Cetak stack trace untuk debugging
    }


    }
    public void Edit() {
    try {
        sql = "UPDATE furniture SET nama_furniture = '" + NamaFurniture + "', harga = '"+ HargaFurniture+"' WHERE id_furniture = '" + IDFurniture + "'";
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
        System.out.println(e.getMessage());
    }
}

    
    public void Hapus(){
        try{
            sql="delete from furniture where id_furniture='"+IDFurniture+"'";
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
}


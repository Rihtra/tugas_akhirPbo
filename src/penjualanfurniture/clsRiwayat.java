package penjualanfurniture;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class clsRiwayat extends clskoneksi {
    
    public void tampilkanRiwayat() {
       sql = "select * from transaksi"; //isi dari riwayat diambil dari inputan user yang mau memesan
    }
    public void cariRiwayatByTanggal(JTable tblRiwayat, Date tanggalMulai, Date tanggalSelesai) {
        try {
            bukaKoneksi(); // Memanggil metode untuk membuka koneksi ke database
            
            // Query SQL untuk mencari transaksi berdasarkan tanggal
            String query = "SELECT * FROM transaksi WHERE tanggal BETWEEN ? AND ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setDate(1, new java.sql.Date(tanggalMulai.getTime())); // Mengubah java.util.Date menjadi java.sql.Date
            stmt.setDate(2, new java.sql.Date(tanggalSelesai.getTime())); // Mengubah java.util.Date menjadi java.sql.Date
            
            ResultSet rs = stmt.executeQuery();
            
            // Mengosongkan tabel sebelum menampilkan hasil baru
            DefaultTableModel model = (DefaultTableModel) tblRiwayat.getModel();
            model.setRowCount(0);

            // Memasukkan hasil pencarian ke dalam tabel
            while (rs.next()) {
                Object[] row = {
                    rs.getString("id_transaksi"),
                    rs.getDate("tanggal"),
                    rs.getString("nama_furniture"),
                    rs.getInt("jumlah"),
                    rs.getInt("harga"),
                    rs.getInt("total_harga")
                };
                model.addRow(row);
            }
            
            rs.close();
            stmt.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan / Koneksi error: " + e.getMessage());
            e.printStackTrace(); // Print stack trace untuk debugging
        }
    }
    
    // Metode untuk membuka koneksi ke database
    private void bukaKoneksi() {
        try {
            conn = getConnection(); // Memanggil metode getConnection() dari kelas induk
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal: " + e.getMessage());
        }
    }
    
    // Metode lain yang mungkin Anda perlukan untuk operasi CRUD lainnya
    
}

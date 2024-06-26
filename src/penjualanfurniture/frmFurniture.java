/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package penjualanfurniture;

/**
 *
 * @author supercellmoonton
 */
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
public class frmFurniture extends javax.swing.JFrame {
    clsFurniture furniture = new clsFurniture();
    private TableColumn column;
    
    

    /**
     * Creates new form frmFurniture
     */
    public frmFurniture() {
        initComponents();
        furniture.AksesData();
        isiTable();
    }
    public void isiTable(){
        DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("IDFurniture");
        tabelmapel.addColumn("NamaFurniture");
        tabelmapel.addColumn("HargaFurniture");
        try{
            furniture.AksesData();
            furniture.TampilData();
            Statement stat1 = furniture.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(furniture.sql);
            while(res1.next()){
                tabelmapel.addRow(new Object[]{res1.getString("id_furniture"),res1.getString("nama_furniture"),res1.getString("harga")});
            }
            tblFurniture.setModel(tabelmapel);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    public void Bersih(){
        txtId.setText("");
        txtNama.setText("");
        txtHarga.setText("");
        txtId.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFurniture = new javax.swing.JTable();
        txtHarga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("FURNITURE");

        jLabel2.setText("Kode Barang:");

        jLabel3.setText("Nama Barang:");

        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdMousePressed(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarMouseClicked(evt);
            }
        });
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblFurniture.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga Barang"
            }
        ));
        tblFurniture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFurnitureMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFurniture);

        jLabel4.setText("Harga Barang:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(26, 26, 26)
                .addComponent(btnHapus)
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(txtHarga))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKeluar)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnKeluar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnEdit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        try{
            Bersih();
            isiTable();
            txtId.requestFocus();
                   
            
        }catch(Exception e){
          
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try{
            furniture.AksesData();
            furniture.IDFurniture =txtId.getText();
            furniture.NamaFurniture = txtNama.getText();
            furniture.HargaFurniture = txtHarga.getText();
            furniture.Hapus();
            furniture.res.executeUpdate(furniture.sql);
            furniture.conn.close();
            isiTable();
            Bersih();
            
            
            JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus ");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Menghapus Data/ Koneksi Gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        SimpanData();
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(txtId.getText().equals("") || txtNama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Data Barang");
            
        }else{
            try{
                furniture.AksesData();
                furniture.IDFurniture = txtId.getText();
                furniture.NamaFurniture = txtNama.getText();
                furniture.HargaFurniture = txtHarga.getText();

                furniture.Edit();
                furniture.res.executeUpdate(furniture.sql);
                furniture.conn.close();
                Bersih();
                isiTable();
                JOptionPane.showMessageDialog(null, "Data Berhasil di Ubah");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Mengubah Data/ Koneksi Error");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnKeluarMouseClicked

    private void tblFurnitureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFurnitureMouseClicked
        // TODO add your handling code here:
        int baris = tblFurniture.getSelectedRow();
        txtId.setText(tblFurniture.getModel().getValueAt(baris, 0).toString());
        txtNama.setText(tblFurniture.getModel().getValueAt(baris, 1).toString());
        txtHarga.setText(tblFurniture.getModel().getValueAt(baris, 2).toString());
    }//GEN-LAST:event_tblFurnitureMouseClicked

    private void txtIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtIdMousePressed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if((txtId.getText().length()>4) || (txtId.getText().isEmpty()) ){
                JOptionPane.showMessageDialog(this, "Panjang Kode harus 4 digit", "informasi", JOptionPane.INFORMATION_MESSAGE);
                txtId.requestFocus();
            } else{
                txtId.requestFocus();
            }
            
        }
    }//GEN-LAST:event_txtIdKeyPressed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        if(txtId.getText().length()>4){
            }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(txtNama.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong", "informasi", JOptionPane.INFORMATION_MESSAGE);
                txtNama.requestFocus();
            }else{
                txtNama.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNamaKeyPressed

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth()/2);
        int y = (posisi.height - this.getHeight()/2);
    }//GEN-LAST:event_formWindowActivated

    public void SimpanData() {
    if (txtId.getText().isEmpty() || txtNama.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Harap isi semua data");
    } else {
        try {
            furniture.AksesData();
            furniture.IDFurniture = txtId.getText();
            furniture.NamaFurniture = txtNama.getText();
            furniture.HargaFurniture = txtHarga.getText();
            
            // Gunakan PreparedStatement untuk INSERT
            String query = "INSERT INTO furniture (id_furniture, nama_furniture, harga) VALUES (?, ?, ?)";
            PreparedStatement ps = furniture.conn.prepareStatement(query);
            ps.setString(1, furniture.IDFurniture);
            ps.setString(2, furniture.NamaFurniture);
            ps.setString(3, furniture.HargaFurniture);

            
            // Eksekusi perintah INSERT
            int hasil = ps.executeUpdate();
            
            if (hasil > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                ps.close(); // Tutup PreparedStatement
                furniture.conn.close(); // Tutup koneksi setelah selesai
                Bersih(); // Membersihkan inputan
                isiTable(); // Memperbarui tampilan tabel
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal disimpan");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan: " + e.getMessage());
            e.printStackTrace(); // Cetak stack trace untuk debugging
        }
    }
}


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmFurniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFurniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFurniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFurniture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFurniture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblFurniture;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package penjualanfurniture;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JFrame;
import java.sql.Statement;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmTransaksi extends javax.swing.JFrame {
    clsTransaksi transaksi = new clsTransaksi();
    
    private TableColumn column;
    public frmTransaksi() {
        initComponents();
        transaksi.AksesData();
        IsiTable();
        addListeners();
    }

   public void IsiTable(){
        DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("No Transaksi");
        tabelmapel.addColumn("Tanggal");
        tabelmapel.addColumn("Nama Furniture");
        tabelmapel.addColumn("Jumlah Beli");
        tabelmapel.addColumn("Harga Furniture");
        tabelmapel.addColumn("Total Bayar");
        
        
        
        try{
            transaksi.AksesData();
            transaksi.tampildata();
            Statement stat1 = transaksi.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(transaksi.sql);
            while(res1.next()){
                tabelmapel.addRow(new Object[]{res1.getString(1), res1.getString(2),res1.getString(3),res1.getString(4),res1.getString(5),res1.getString(6)});
                
                
            }tblTransaksi.setModel(tabelmapel);
        }catch(Exception e){
            
        }
    }
    public void Bersih(){
        txtNotransaksi.setText("");
        Tgl.setDate(null);
        txtnamafurni.setText("");
        txthargafurni.setText("");
        txtJumlah.setText("");
        txttotalbayar.setText("");
        txtNotransaksi.requestFocus();
    }
    private void addListeners() {
        txtJumlah.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                calculateTotal();
            }
        });
        txthargafurni.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                calculateTotal();
            }
        });
    }

    private void calculateTotal() {
        try {
            int jumlah = Integer.parseInt(txtJumlah.getText());
            int harga = Integer.parseInt(txthargafurni.getText());
            int total = jumlah * harga;
            txttotalbayar.setText(String.valueOf(total));
        } catch (NumberFormatException e) {
            // Handle exception if input is not a valid number
            txttotalbayar.setText("");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fromtarnsksi = new javax.swing.JLabel();
        notr = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        namafurni = new javax.swing.JLabel();
        hrgfurni = new javax.swing.JLabel();
        tbfurni = new javax.swing.JLabel();
        txtNotransaksi = new javax.swing.JTextField();
        txtnamafurni = new javax.swing.JTextField();
        txthargafurni = new javax.swing.JTextField();
        txttotalbayar = new javax.swing.JTextField();
        Tgl = new com.toedter.calendar.JDateChooser();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();
        jumlah = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        fromtarnsksi.setText("FROM TRANSAKSI");

        notr.setText("No Transaksi     :");

        tgl.setText("Tanggal             :");

        namafurni.setText("Nama Furniture :");

        hrgfurni.setText("Harga Furniture :");

        tbfurni.setText(" Total Bayar     :");

        txthargafurni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargafurniActionPerformed(evt);
            }
        });

        txttotalbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalbayarActionPerformed(evt);
            }
        });

        edit.setText("Edit ");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        keluar.setText("Exit");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No Transaksi", "Tanggal", "Nama Furnitur", "Jumlah beli", "Harga Furniture", "Total Bayar"
            }
        ));
        tblTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTransaksi);

        jumlah.setText("Jumlah Beli :");

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(tbfurni, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(edit)
                        .addGap(66, 66, 66)
                        .addComponent(delete)
                        .addGap(69, 69, 69)
                        .addComponent(reset)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(simpan)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttotalbayar)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fromtarnsksi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(keluar)
                .addGap(30, 30, 30))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(namafurni, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addComponent(tgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(notr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hrgfurni, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnamafurni, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNotransaksi)
                    .addComponent(txthargafurni)
                    .addComponent(Tgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtJumlah))
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fromtarnsksi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(keluar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notr)
                    .addComponent(txtNotransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tgl)
                    .addComponent(Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namafurni)
                    .addComponent(txtnamafurni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrgfurni)
                    .addComponent(txthargafurni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttotalbayar, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(tbfurni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit)
                    .addComponent(simpan)
                    .addComponent(delete)
                    .addComponent(reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txthargafurniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargafurniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargafurniActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        if(txtNotransaksi.getText().equals ("")){
            JOptionPane.showMessageDialog(null,"Pilih No Transaksi Yang mau di Edit");
        }else{
            try{
                transaksi.AksesData();
                transaksi.no_transaksi = txtNotransaksi.getText();
                SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
                transaksi.tanggal = date_format.format(Tgl.getDate());
                transaksi.nama_furniture = txtnamafurni.getText();
                 String njumlah = txtJumlah.getText();
                transaksi.jumlah = Integer.parseInt(njumlah);
                
                String nharga_furniture = txthargafurni.getText();
                transaksi.harga = Integer.parseInt(nharga_furniture);
                String mharga = txttotalbayar.getText();
                transaksi.total = Integer.parseInt(mharga);
                transaksi.edit();
                transaksi.res.execute(transaksi.sql);
                transaksi.conn.close();
                Bersih();
                IsiTable();
                JOptionPane.showMessageDialog(null,"Data Berhasil di Edit ");
              
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Terjadi Kesalahan");
                System.out.println(e.getMessage());
            }
            
        }
    }//GEN-LAST:event_editActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
         Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width-this.getWidth())/2;
        int y = (posisi.height-this.getHeight())/2;
        this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
            transaksi.AksesData();
            transaksi.no_transaksi = txtNotransaksi.getText();
            transaksi.hapus();
            transaksi.res.executeUpdate(transaksi.sql);
            transaksi.conn.close();
            IsiTable();
            Bersih();
            JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        try{
            Bersih();
            IsiTable();
            txtNotransaksi.requestFocus();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_resetActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        if(txtNotransaksi.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Pilih No Transaksi Yang mau di Edit");
        }else{
            try{
                transaksi.AksesData();
                transaksi.no_transaksi = txtNotransaksi.getText();
                SimpleDateFormat date_format = new SimpleDateFormat("yy-MM-dd");
                transaksi.tanggal = date_format.format(Tgl.getDate());
                transaksi.nama_furniture = txtnamafurni.getText();
                
                String njumlah = txtJumlah.getText();
                transaksi.jumlah = Integer.parseInt(njumlah);
                
                String nharga_furniture = txthargafurni.getText();
                transaksi.harga = Integer.parseInt(nharga_furniture);
                 String mharga = txttotalbayar.getText();
               
                transaksi.total = Integer.parseInt(mharga);
                transaksi.simpan();
                transaksi.res.execute(transaksi.sql);
                transaksi.conn.close();
                Bersih();
                IsiTable();
                JOptionPane.showMessageDialog(null,"Data Berhasil di Simpan  ");
              
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Terjadi Kesalahan");
                System.out.println(e.getMessage());
            }
            
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void tblTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTransaksiMouseClicked
        // TODO add your handling code here:
        int baris = tblTransaksi.getSelectedRow();
        String kolom1 = tblTransaksi.getValueAt(baris, 0).toString();
        String kolom2 = tblTransaksi.getValueAt(baris, 1).toString();
        String kolom3 = tblTransaksi.getValueAt(baris, 2).toString();
        String kolom4 = tblTransaksi.getValueAt(baris, 3).toString();
        String kolom5 = tblTransaksi.getValueAt(baris, 4).toString();
        String kolom6 = tblTransaksi.getValueAt(baris, 5).toString();
        
        
        txtNotransaksi.setText(kolom1);
        Date a = null;
        try {
            a = new SimpleDateFormat("yyy-MM-dd").parse(kolom2);
        } catch (ParseException ex) {
            Logger.getLogger(frmTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        Tgl.setDate(a);
        txtnamafurni.setText(kolom3);
        txtJumlah.setText(kolom4);
        txthargafurni.setText(kolom5);
        txttotalbayar.setText(kolom6);
        
    }//GEN-LAST:event_tblTransaksiMouseClicked

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void txttotalbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalbayarActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txttotalbayarActionPerformed

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
            java.util.logging.Logger.getLogger(frmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Tgl;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel fromtarnsksi;
    private javax.swing.JLabel hrgfurni;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jumlah;
    private javax.swing.JButton keluar;
    private javax.swing.JLabel namafurni;
    private javax.swing.JLabel notr;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JLabel tbfurni;
    private javax.swing.JTable tblTransaksi;
    private javax.swing.JLabel tgl;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNotransaksi;
    private javax.swing.JTextField txthargafurni;
    private javax.swing.JTextField txtnamafurni;
    private javax.swing.JTextField txttotalbayar;
    // End of variables declaration//GEN-END:variables
}

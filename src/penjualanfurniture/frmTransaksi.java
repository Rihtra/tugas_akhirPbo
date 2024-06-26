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
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fromtarnsksi = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        fromtarnsksi.setText("FROM TRANSAKSI");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(473, Short.MAX_VALUE)
                .addComponent(fromtarnsksi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(696, 696, 696))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(keluar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fromtarnsksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(keluar)
                .addGap(182, 182, 182)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(reset))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
           
            transaksi.hapus();
            transaksi.res.executeUpdate(transaksi.sql);
            transaksi.conn.close();
            IsiTable();
         
            JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        try{
       
            IsiTable();
         
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_resetActionPerformed

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
        
        
   
        Date a = null;
        try {
            a = new SimpleDateFormat("yyy-MM-dd").parse(kolom2);
        } catch (ParseException ex) {
            Logger.getLogger(frmTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }//GEN-LAST:event_tblTransaksiMouseClicked

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
    private javax.swing.JButton delete;
    private javax.swing.JLabel fromtarnsksi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton reset;
    private javax.swing.JTable tblTransaksi;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package penjualanfurniture;

/**
 *
 * @author supercellmoonton
 */
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
public class frmTransaksiUser extends javax.swing.JFrame {
    clsTransaksi transaksi = new clsTransaksi();

    /**
     * Creates new form frmTransaksiUser
     */
    public frmTransaksiUser() {
        initComponents();
        transaksi.AksesData();
        addListeners();
        
    }
    public void Bersih(){
//        txtNotransaksi.setText("");
        Tgl.setDate(null);
        txtnamafurni.setText("");
        txthargafurni.setText("");
        txtJumlah.setText("");
        txttotalbayar.setText("");
//        txtNotransaksi.requestFocus();
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
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        namafurni = new javax.swing.JLabel();
        jumlah = new javax.swing.JLabel();
        hrgfurni = new javax.swing.JLabel();
        tbfurni = new javax.swing.JLabel();
        Tgl = new com.toedter.calendar.JDateChooser();
        txtnamafurni = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txthargafurni = new javax.swing.JTextField();
        txttotalbayar = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(224, 163, 101));

        keluar.setBackground(new java.awt.Color(255, 51, 51));
        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("Exit");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TRANSAKSI");

        tgl.setForeground(new java.awt.Color(0, 0, 0));
        tgl.setText("Tanggal             :");

        namafurni.setForeground(new java.awt.Color(0, 0, 0));
        namafurni.setText("Nama Furniture :");

        jumlah.setForeground(new java.awt.Color(0, 0, 0));
        jumlah.setText("Jumlah Beli :");

        hrgfurni.setForeground(new java.awt.Color(0, 0, 0));
        hrgfurni.setText("Harga Furniture :");

        tbfurni.setForeground(new java.awt.Color(0, 0, 0));
        tbfurni.setText(" Total Bayar     :");

        txtnamafurni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamafurniActionPerformed(evt);
            }
        });

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });

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

        simpan.setBackground(new java.awt.Color(51, 204, 255));
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(hrgfurni, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txthargafurni))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtJumlah))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(namafurni, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtnamafurni, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tbfurni, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttotalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(keluar)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(simpan)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keluar)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tgl)
                    .addComponent(Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namafurni)
                    .addComponent(txtnamafurni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrgfurni)
                    .addComponent(txthargafurni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbfurni, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(simpan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
//        if(txtNotransaksi.getText().equals("")){
//            JOptionPane.showMessageDialog(null,"Pilih No Transaksi Yang mau di Edit");
//        }else{
            try{
                transaksi.AksesData();
//                transaksi.no_transaksi = txtNotransaksi.getText();
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
               
                JOptionPane.showMessageDialog(null,"Data Berhasil di Simpan  ");

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Terjadi Kesalahan");
                System.out.println(e.getMessage());
            }

//        }
    }//GEN-LAST:event_simpanActionPerformed

    private void txttotalbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalbayarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txttotalbayarActionPerformed

    private void txthargafurniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargafurniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargafurniActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width-this.getWidth())/2;
        int y = (posisi.height-this.getHeight())/2;
        this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    private void txtnamafurniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamafurniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamafurniActionPerformed

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
            java.util.logging.Logger.getLogger(frmTransaksiUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTransaksiUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTransaksiUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTransaksiUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTransaksiUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Tgl;
    private javax.swing.JLabel hrgfurni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jumlah;
    private javax.swing.JButton keluar;
    private javax.swing.JLabel namafurni;
    private javax.swing.JButton simpan;
    private javax.swing.JLabel tbfurni;
    private javax.swing.JLabel tgl;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txthargafurni;
    private javax.swing.JTextField txtnamafurni;
    private javax.swing.JTextField txttotalbayar;
    // End of variables declaration//GEN-END:variables
}

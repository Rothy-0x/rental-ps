/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.*;
import models.Playstation;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends javax.swing.JFrame {

    Playstation Ps;
    private int idAdmin;

    /**
     * Creates new form Menu
     */
    public Main(int idAdmin) throws ClassNotFoundException, SQLException {
        Ps = new Playstation();
        initComponents();
        this.showData();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.idAdmin = idAdmin;
    }
    
    public Main() throws ClassNotFoundException, SQLException {
        Ps = new Playstation();
        initComponents();
        this.showData();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        delData = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        addData = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA PEMINJAM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        tbData.setBackground(new java.awt.Color(204, 204, 204));
        tbData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Peminjam", "Durasi Peminjam", "Alamat", "PS"
            }
        ));
        jScrollPane1.setViewportView(tbData);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 67, 720, 330));

        back.setBackground(new java.awt.Color(102, 102, 102));
        back.setFont(new java.awt.Font("Inter Light", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 0, 0));
        back.setText("Keluar");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 90, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        delData.setBackground(new java.awt.Color(43, 164, 124));
        delData.setFont(new java.awt.Font("Inter Light", 1, 12)); // NOI18N
        delData.setForeground(new java.awt.Color(255, 255, 255));
        delData.setText("Hapus");
        delData.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        delData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delDataMouseClicked(evt);
            }
        });
        delData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delDataActionPerformed(evt);
            }
        });
        jPanel1.add(delData, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 100, 30));

        ubah.setBackground(new java.awt.Color(43, 164, 124));
        ubah.setFont(new java.awt.Font("Inter Light", 1, 12)); // NOI18N
        ubah.setForeground(new java.awt.Color(255, 255, 255));
        ubah.setText("Ubah");
        ubah.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubahMouseClicked(evt);
            }
        });
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        jPanel1.add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 100, 30));

        addData.setBackground(new java.awt.Color(43, 164, 124));
        addData.setFont(new java.awt.Font("Inter Light", 1, 12)); // NOI18N
        addData.setForeground(new java.awt.Color(255, 255, 255));
        addData.setText("Tambah");
        addData.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        addData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDataMouseClicked(evt);
            }
        });
        addData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataActionPerformed(evt);
            }
        });
        jPanel1.add(addData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 100, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/playstation-buttons-logo-hd-wallpaper-uhdpaper.com-1200e (1).jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDataActionPerformed

    private void addDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDataMouseClicked
        try {
            new Addpeminjam(idAdmin).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_addDataMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void ubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubahMouseClicked
        if (tbData.getSelectedRow() >= 0) {
            String id = tbData.getModel().getValueAt(tbData.getSelectedRow(), 0).toString();
            String nama = tbData.getModel().getValueAt(tbData.getSelectedRow(), 1).toString();
            String durasi = tbData.getModel().getValueAt(tbData.getSelectedRow(), 2).toString();
            String alamat = tbData.getModel().getValueAt(tbData.getSelectedRow(), 3).toString();
            String ps = tbData.getModel().getValueAt(tbData.getSelectedRow(), 4).toString();

            try {
                Updatepeminjam u1 = new Updatepeminjam(this, id, nama, durasi, alamat, ps);
                u1.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pilih Data Terlebih Dahulu");
        }

//        try {
//            new Updatepeminjam().setVisible(true);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_ubahMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        int jawab = JOptionPane.showOptionDialog(this,
                "Ingin Keluar?",
                "Keluar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (jawab == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Program Akan Keluar");
            System.exit(0);
        }
    }//GEN-LAST:event_backMouseClicked

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubahActionPerformed

    private void delDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delDataActionPerformed

    private void delDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delDataMouseClicked
        if (tbData.getSelectedRow() >= 0) {
            String hps = tbData.getModel().getValueAt(tbData.getSelectedRow(), 0).toString();
            try {
                int jawab = JOptionPane.showOptionDialog(this,
                        "Apakah Anda Yakin Ingin Menghapus Data?",
                        "Hapus",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);

                if (jawab == JOptionPane.YES_OPTION) {
                    boolean success = Ps.delete(Integer.valueOf(hps));
                    if (success) {
                        try {
                            JOptionPane.showMessageDialog(null, "Data Telah Berhasil Dihapus!");
                            showData();
                        } catch (SQLException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Gagal Menghapus Data " + hps);
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pilih Data Terlebih Dahulu");
        }
    }//GEN-LAST:event_delDataMouseClicked

    public void showData() throws SQLException {
        tbData.setModel(new javax.swing.table.DefaultTableModel(
                Ps.show(),
                new String[]{
                    "ID", "Nama Peminjam", "Durasi Peminjam", "Alamat", "PS", "ID Admin"}
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addData;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbData;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}

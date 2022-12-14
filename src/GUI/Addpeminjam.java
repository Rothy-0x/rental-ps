/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import models.Playstation;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Addpeminjam extends javax.swing.JFrame {

    Playstation Ps;
    private int idAdmin;

    public Addpeminjam(int idAdmin) throws ClassNotFoundException, SQLException {
        Ps = new Playstation();
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        formAP.setBackground(new java.awt.Color(0, 0, 0, 1));
        formNp.setBackground(new java.awt.Color(0, 0, 0, 1));
        formDP.setBackground(new java.awt.Color(0, 0, 0, 1));
        this.idAdmin = idAdmin;
    }
    
    public Addpeminjam() throws ClassNotFoundException, SQLException {
        Ps = new Playstation();
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        formAP.setBackground(new java.awt.Color(0, 0, 0, 1));
        formNp.setBackground(new java.awt.Color(0, 0, 0, 1));
        formDP.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formNp = new javax.swing.JTextField();
        formDP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        formAP = new javax.swing.JTextField();
        addDatas = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ps = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formNp.setBackground(new java.awt.Color(242, 242, 242));
        formNp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        formNp.setForeground(new java.awt.Color(255, 255, 255));
        formNp.setBorder(null);
        formNp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formNpActionPerformed(evt);
            }
        });
        getContentPane().add(formNp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 250, 20));

        formDP.setBackground(new java.awt.Color(242, 242, 242));
        formDP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        formDP.setForeground(new java.awt.Color(255, 255, 255));
        formDP.setBorder(null);
        formDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formDPActionPerformed(evt);
            }
        });
        getContentPane().add(formDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 250, 20));

        jLabel1.setFont(new java.awt.Font("Inter Extra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tambah Data Peminjam");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 30));

        formAP.setBackground(new java.awt.Color(242, 242, 242));
        formAP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        formAP.setForeground(new java.awt.Color(255, 255, 255));
        formAP.setBorder(null);
        formAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAPActionPerformed(evt);
            }
        });
        getContentPane().add(formAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 250, 20));

        addDatas.setBackground(new java.awt.Color(242, 242, 242));
        addDatas.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        addDatas.setText("Tambah");
        addDatas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDatasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addDatasMouseEntered(evt);
            }
        });
        addDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDatasActionPerformed(evt);
            }
        });
        getContentPane().add(addDatas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 333, 92, 30));

        cancel.setBackground(new java.awt.Color(242, 242, 242));
        cancel.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 333, 92, 30));

        jLabel2.setFont(new java.awt.Font("Doppio One", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Masukkan Nama Peminjam");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Doppio One", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Masukkan Durasi Peminjaman");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Doppio One", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Masukkan Alamat Peminjam");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 173, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pilih Jenis Playstation");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 173, -1));

        ps.setBackground(new java.awt.Color(242, 242, 242));
        ps.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Playstation 3", "Playstation 4", "Playstation 5" }));
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        getContentPane().add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 254, 250, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 250, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 163, 240, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 250, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 250, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/playstation-logo-background-hd-wallpaper-uhdpaper.com-118@0@e.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formNpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formNpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formNpActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void formDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formDPActionPerformed

    private void formAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formAPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formAPActionPerformed

    private void addDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDatasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDatasActionPerformed

    private void addDatasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDatasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addDatasMouseEntered

    private void addDatasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDatasMouseClicked
        try {
            String hb = formNp.getText();
            String jb = formDP.getText();
            String kb = formAP.getText();
            String lb = ps.getSelectedItem().toString();
            if (!hb.isEmpty() && !jb.isEmpty() && !kb.isEmpty()) {
                try {
                    if (Integer.parseInt(jb) > 0) {
                        Ps.insert(idAdmin, hb, jb, kb, lb);
                        JOptionPane.showMessageDialog(null, "TAMBAH DATA BERHASIL");
                        new Main().setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Mohon masukkan durasi yang benar");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tolong Isi Data Yang Diperlukan !");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tolong Masukan Data Yang Valid !");
            try {
                new Addpeminjam(idAdmin).setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Addpeminjam.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Addpeminjam.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
    }//GEN-LAST:event_addDatasMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        try {
            new Main().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Addpeminjam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Addpeminjam.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDatas;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField formAP;
    private javax.swing.JTextField formDP;
    private javax.swing.JTextField formNp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> ps;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFRAME;

/**
 *
 * @author Amalia Yuna
 */
public class latihan_jframe extends javax.swing.JFrame {

    /**
     * Creates new form latihan_jframe
     */
    public latihan_jframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jeniskelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idnama = new javax.swing.JTextField();
        idtinggi = new javax.swing.JTextField();
        idberat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdlaki = new javax.swing.JRadioButton();
        rdperempuan = new javax.swing.JRadioButton();
        idhitung = new javax.swing.JButton();
        idcoba = new javax.swing.JButton();
        idkeluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        idideal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idhasil = new javax.swing.JTextField();
        idsaran = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Aplikasi cek ideal");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 20, 200, 30);

        jLabel2.setText("Nama");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 90, 60, 20);

        jLabel3.setText("Tinggi");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 130, 70, 20);

        jLabel4.setText("Berat");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 170, 60, 20);
        jPanel1.add(idnama);
        idnama.setBounds(170, 80, 260, 30);
        jPanel1.add(idtinggi);
        idtinggi.setBounds(170, 120, 80, 30);
        jPanel1.add(idberat);
        idberat.setBounds(170, 160, 80, 30);

        jLabel5.setText("Jenis Kelamin");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 210, 80, 14);

        jeniskelamin.add(rdlaki);
        rdlaki.setText("laki-laki");
        rdlaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlakiActionPerformed(evt);
            }
        });
        jPanel1.add(rdlaki);
        rdlaki.setBounds(180, 210, 100, 20);

        jeniskelamin.add(rdperempuan);
        rdperempuan.setText("perempuan");
        rdperempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdperempuanActionPerformed(evt);
            }
        });
        jPanel1.add(rdperempuan);
        rdperempuan.setBounds(330, 210, 130, 20);

        idhitung.setText("Hitung");
        idhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idhitungActionPerformed(evt);
            }
        });
        jPanel1.add(idhitung);
        idhitung.setBounds(70, 250, 100, 30);

        idcoba.setText("Coba Ulang");
        idcoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcobaActionPerformed(evt);
            }
        });
        jPanel1.add(idcoba);
        idcoba.setBounds(230, 250, 110, 30);

        idkeluar.setText("Keluar");
        idkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idkeluarActionPerformed(evt);
            }
        });
        jPanel1.add(idkeluar);
        idkeluar.setBounds(400, 250, 110, 30);

        jLabel6.setText("Berat Badan Ideal Anda adalah");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 310, 170, 30);
        jPanel1.add(idideal);
        idideal.setBounds(260, 310, 80, 30);

        jLabel7.setText("Hasil Analisa Kesehatan");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 360, 180, 20);

        idhasil.setText("?");
        jPanel1.add(idhasil);
        idhasil.setBounds(50, 390, 290, 30);

        idsaran.setText("?");
        jPanel1.add(idsaran);
        idsaran.setBounds(50, 430, 290, 30);

        jLabel8.setText("kg");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(370, 320, 50, 20);

        jLabel9.setText("cm");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(270, 120, 30, 14);

        jLabel10.setText("kg");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 160, 40, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdlakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdlakiActionPerformed

    private void idhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idhitungActionPerformed
        // TODO add your handling code here:
         double h = 0;
        double t = Double.valueOf(idtinggi.getText());
        double b = Double.valueOf(idberat.getText());
        String nama = idnama.getText();
        
        if(rdlaki.isSelected()){
          h = (t-100);
        }else if (rdperempuan.isSelected()){
          h = (t-104);
        }
       
        String temp = Double.toString(h);
        
        if(h<b){
            idideal.setText(temp);
            idhasil.setText("MAAF SEPERTIYA ANDA OVERWEIGHT");
            idsaran.setText("HARUS RAJIN OLAHRAGA!");
        }
        else if (h>b){
            idideal.setText(temp);
            idhasil.setText("MAAF SEPERTIYA ANDA UNDERWEIGHT");
            idsaran.setText("MAKAN YANG BANYAK YA!");
        }
        else{
            idideal.setText(temp);
            idhasil.setText("ALHAMDULILLAH ANDA MEMPUNYAI TUBUH IDEAL");
            idsaran.setText("BERSYUKURLAH!");
        }
    }//GEN-LAST:event_idhitungActionPerformed

    private void idkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_idkeluarActionPerformed

    private void idcobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcobaActionPerformed
        // TODO add your handling code here:
        idnama.setText("");
        idberat.setText("");
        idtinggi.setText("");
        idideal.setText("");
        idhasil.setText("");
        idsaran.setText("");
        jeniskelamin.clearSelection();
    }//GEN-LAST:event_idcobaActionPerformed

    private void rdperempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdperempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdperempuanActionPerformed

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
            java.util.logging.Logger.getLogger(latihan_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan_jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idberat;
    private javax.swing.JButton idcoba;
    private javax.swing.JTextField idhasil;
    private javax.swing.JButton idhitung;
    private javax.swing.JTextField idideal;
    private javax.swing.JButton idkeluar;
    private javax.swing.JTextField idnama;
    private javax.swing.JTextField idsaran;
    private javax.swing.JTextField idtinggi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup jeniskelamin;
    private javax.swing.JRadioButton rdlaki;
    private javax.swing.JRadioButton rdperempuan;
    // End of variables declaration//GEN-END:variables
}

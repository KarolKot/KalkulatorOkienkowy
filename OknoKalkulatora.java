package pl.alx.szkolenie.kalkulator;

// Karol Kot

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class OknoKalkulatora extends javax.swing.JFrame {

    public OknoKalkulatora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox_Operacja = new javax.swing.JComboBox<>();
        jButton = new javax.swing.JButton();
        jTextlewo = new javax.swing.JTextField();
        jTextprawo = new javax.swing.JTextField();
        jTextwynik = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox_Operacja.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox_Operacja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
        jComboBox_Operacja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox_Operacja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_OperacjaActionPerformed(evt);
            }
        });

        jButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton.setText("=");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        jTextlewo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextlewo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextlewo.setPreferredSize(new java.awt.Dimension(60, 20));
        jTextlewo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextlewoActionPerformed(evt);
            }
        });

        jTextprawo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextprawo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextprawo.setPreferredSize(new java.awt.Dimension(60, 20));
        jTextprawo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextprawoActionPerformed(evt);
            }
        });

        jTextwynik.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jTextwynik.setForeground(new java.awt.Color(0, 51, 204));
        jTextwynik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextwynik.setText("0");
        jTextwynik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextwynikActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kalkulator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextlewo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(75, 75, 75)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jComboBox_Operacja, 0, 127, Short.MAX_VALUE)
                                .addGap(11, 11, 11)
                                .addComponent(jTextprawo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jTextwynik)
                                .addGap(102, 102, 102)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextlewo, jTextprawo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextlewo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextprawo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_Operacja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextwynik, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton))
                .addGap(15, 15, 15))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton, jComboBox_Operacja, jTextlewo, jTextprawo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextlewoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextlewoActionPerformed
        // 1 okno
    }//GEN-LAST:event_jTextlewoActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        przelicz();
                
    }//GEN-LAST:event_jButtonActionPerformed

    private void przelicz() throws HeadlessException {
        // =
        double arg1 = 0;
        double arg2 = 0;
        try {
            arg1 = Double.parseDouble(jTextlewo.getText().replace(",", "."));
            arg2 = Double.parseDouble(jTextprawo.getText().replace(",", "."));
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this,
                    "Coś poszło nie tak!   "
                            + numberFormatException.getClass().getName() + " INFO: "
                            + numberFormatException.getMessage(),
                    "Error", JOptionPane.WARNING_MESSAGE);
            jTextwynik.setText("Błąd!");
            return;
        }
        String operacja = (String)jComboBox_Operacja.getSelectedItem();
        //jComboBox_Operacja.getSelectedItem().toString();
        //String operacja = "" + jComboBox_Operacja.getSelectedItem();
        double wynik = LogikaKalkulatora.oblicz(operacja, arg1, arg2);
        //jTextwynik.setText(Double.toString(suma));
        jTextwynik.setText(" " + wynik);
        //jTextwynik.setText(String.valueOf(suma);
        //jTextwynik.setText(String.format("%f", wynik));
    }

    private void jComboBox_OperacjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_OperacjaActionPerformed
        // combo box
        przelicz();
    }//GEN-LAST:event_jComboBox_OperacjaActionPerformed

    private void jTextprawoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextprawoActionPerformed
        // 2 okno
    }//GEN-LAST:event_jTextprawoActionPerformed

    private void jTextwynikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextwynikActionPerformed
        // 3 okno
        
    }//GEN-LAST:event_jTextwynikActionPerformed

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
            java.util.logging.Logger.getLogger(OknoKalkulatora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OknoKalkulatora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OknoKalkulatora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OknoKalkulatora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OknoKalkulatora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JComboBox<String> jComboBox_Operacja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextlewo;
    private javax.swing.JTextField jTextprawo;
    private javax.swing.JTextField jTextwynik;
    // End of variables declaration//GEN-END:variables
}


import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class operasihitung extends javax.swing.JFrame {

    /**
     * Creates new form operasihitung
     */
    public operasihitung() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Bil1TextField = new javax.swing.JTextField();
        Bil2TextField = new javax.swing.JTextField();
        HasilTextField = new javax.swing.JTextField();
        ActionPerformed = new javax.swing.JButton();
        KurangButtonActionPerformed = new javax.swing.JButton();
        KaliButtonActionPerformed = new javax.swing.JButton();
        BagiButtonActionPerformed = new javax.swing.JButton();
        exitActionPerformed = new javax.swing.JButton();
        ClearButtonActionPerformed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Operasi Dua Angka");

        jLabel2.setText("Bilangan 1");

        jLabel3.setText("Bilangan 2");

        jLabel4.setText("Hasil");

        Bil1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bil1TextFieldActionPerformed(evt);
            }
        });
        Bil1TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Bil1TextFieldKeyTyped(evt);
            }
        });

        Bil2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bil2TextFieldActionPerformed(evt);
            }
        });
        Bil2TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Bil2TextFieldKeyTyped(evt);
            }
        });

        HasilTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilTextFieldActionPerformed(evt);
            }
        });
        HasilTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HasilTextFieldKeyTyped(evt);
            }
        });

        ActionPerformed.setText("Tambah");
        ActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformedActionPerformed(evt);
            }
        });

        KurangButtonActionPerformed.setText("Kurang");
        KurangButtonActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangButtonActionPerformedActionPerformed(evt);
            }
        });

        KaliButtonActionPerformed.setText("Kali");
        KaliButtonActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaliButtonActionPerformedActionPerformed(evt);
            }
        });

        BagiButtonActionPerformed.setText("Bagi");
        BagiButtonActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagiButtonActionPerformedActionPerformed(evt);
            }
        });

        exitActionPerformed.setText("Exit");
        exitActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformedActionPerformed(evt);
            }
        });

        ClearButtonActionPerformed.setText("Clear");
        ClearButtonActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Bil1TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addGap(23, 23, 23)
                                .addComponent(Bil2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HasilTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 47, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 32, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ActionPerformed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KurangButtonActionPerformed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KaliButtonActionPerformed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BagiButtonActionPerformed)))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitActionPerformed)
                .addGap(33, 33, 33)
                .addComponent(ClearButtonActionPerformed)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bil1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bil2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HasilTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ActionPerformed)
                    .addComponent(KurangButtonActionPerformed)
                    .addComponent(KaliButtonActionPerformed)
                    .addComponent(BagiButtonActionPerformed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearButtonActionPerformed)
                    .addComponent(exitActionPerformed))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformedActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformedActionPerformed

    private void ActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionPerformedActionPerformed
        // TODO add your handling code here:
        Double bil1 = Double.parseDouble(Bil1TextField.getText ());
        Double bil2 = Double.parseDouble(Bil2TextField.getText ());
        
        Double hasil = bil1+bil2;
        
        HasilTextField.setText(Double.toString(hasil));
    }//GEN-LAST:event_ActionPerformedActionPerformed

    private void ClearButtonActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformedActionPerformed
        // TODO add your handling code here:
        Bil1TextField.setText("");
        Bil2TextField.setText("");
        HasilTextField.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformedActionPerformed

    private void KurangButtonActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangButtonActionPerformedActionPerformed
        // TODO add your handling code here:
        Double bil1 = Double.parseDouble(Bil1TextField.getText ());
        Double bil2 = Double.parseDouble(Bil2TextField.getText ());
        
        Double hasil = bil1-bil2;
        
        HasilTextField.setText(Double.toString(hasil));
    }//GEN-LAST:event_KurangButtonActionPerformedActionPerformed

    private void KaliButtonActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaliButtonActionPerformedActionPerformed
        // TODO add your handling code here:
        Double bil1 = Double.parseDouble(Bil1TextField.getText ());
        Double bil2 = Double.parseDouble(Bil2TextField.getText ());
        
        Double hasil = bil1*bil2;
        
        HasilTextField.setText(Double.toString(hasil));
    }//GEN-LAST:event_KaliButtonActionPerformedActionPerformed

    private void BagiButtonActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagiButtonActionPerformedActionPerformed
        // TODO add your handling code here:
        Double bil1 = Double.parseDouble(Bil1TextField.getText ());
        Double bil2 = Double.parseDouble(Bil2TextField.getText ());
        
        Double hasil = bil1/bil2;
        
        HasilTextField.setText(Double.toString(hasil));
    }//GEN-LAST:event_BagiButtonActionPerformedActionPerformed

    private void HasilTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HasilTextFieldActionPerformed

    private void HasilTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HasilTextFieldKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_HasilTextFieldKeyTyped

    private void Bil1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bil1TextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Bil1TextFieldActionPerformed

    private void Bil2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bil2TextFieldActionPerformed
        // TODO add your handling code here:
        
      
        
    }//GEN-LAST:event_Bil2TextFieldActionPerformed

    private void Bil1TextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bil1TextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "masukkan hanya angka 0 s/d 9");
            evt.consume();
        }
    }//GEN-LAST:event_Bil1TextFieldKeyTyped

    private void Bil2TextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bil2TextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "masukkan hanya angka 0 s/d 9");
            evt.consume();
        }
    }//GEN-LAST:event_Bil2TextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(operasihitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(operasihitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(operasihitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(operasihitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new operasihitung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActionPerformed;
    private javax.swing.JButton BagiButtonActionPerformed;
    private javax.swing.JTextField Bil1TextField;
    private javax.swing.JTextField Bil2TextField;
    private javax.swing.JButton ClearButtonActionPerformed;
    private javax.swing.JTextField HasilTextField;
    private javax.swing.JButton KaliButtonActionPerformed;
    private javax.swing.JButton KurangButtonActionPerformed;
    private javax.swing.JButton exitActionPerformed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

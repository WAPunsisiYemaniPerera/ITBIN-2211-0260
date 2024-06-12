/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author 3C Tech
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        petsMenu = new javax.swing.JMenu();
        petsISM = new javax.swing.JMenuItem();
        productsMenu = new javax.swing.JMenu();
        billingSM = new javax.swing.JMenuItem();
        appointmentsMenu = new javax.swing.JMenu();
        appointmentISM = new javax.swing.JMenuItem();
        systemMenu = new javax.swing.JMenu();
        userRSM = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();
        exitSM = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel2.setText("\"The love for all living creatures is");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 427, 67));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel1.setText(" the most");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel3.setText("noble attribute of man.\"");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel4.setText("— Charles Darwin");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vet9.gif"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        petsMenu.setBackground(new java.awt.Color(255, 102, 102));
        petsMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        petsMenu.setText("Pets  ");
        petsMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        petsISM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        petsISM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        petsISM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pets-16 (1).png"))); // NOI18N
        petsISM.setText("Pets' information");
        petsISM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petsISMActionPerformed(evt);
            }
        });
        petsMenu.add(petsISM);

        jMenuBar1.add(petsMenu);

        productsMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productsMenu.setText("Products  ");
        productsMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        billingSM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        billingSM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        billingSM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-billing-16.png"))); // NOI18N
        billingSM.setText("Billing");
        billingSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingSMActionPerformed(evt);
            }
        });
        productsMenu.add(billingSM);

        jMenuBar1.add(productsMenu);

        appointmentsMenu.setText("Appointments   ");
        appointmentsMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        appointmentISM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        appointmentISM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        appointmentISM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-apple-calendar-18.png"))); // NOI18N
        appointmentISM.setText("Appointment Information");
        appointmentISM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentISMActionPerformed(evt);
            }
        });
        appointmentsMenu.add(appointmentISM);

        jMenuBar1.add(appointmentsMenu);

        systemMenu.setText("System  ");
        systemMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        userRSM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        userRSM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userRSM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-registration-20.png"))); // NOI18N
        userRSM.setText("User Registration");
        userRSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRSMActionPerformed(evt);
            }
        });
        systemMenu.add(userRSM);

        jMenuBar1.add(systemMenu);

        exitMenu.setText("Exit  ");
        exitMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        exitSM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exitSM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitSM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-logout-30.png"))); // NOI18N
        exitSM.setText("Exit the System");
        exitSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitSMActionPerformed(evt);
            }
        });
        exitMenu.add(exitSM);

        jMenuBar1.add(exitMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void appointmentISMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentISMActionPerformed
        // Open Appointment Information JFrame
        this.dispose();
        AppointmentInformation appointmentInformation = new AppointmentInformation();
        appointmentInformation.setVisible(true);
        
    }//GEN-LAST:event_appointmentISMActionPerformed

    private void petsISMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petsISMActionPerformed
        this.dispose();
        PetsInformation petsInformation = new PetsInformation();
        petsInformation.setVisible(true);
        
    }//GEN-LAST:event_petsISMActionPerformed

    private void billingSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingSMActionPerformed
        // Open Billing JFrame
        this.dispose();
        Billing billing = new Billing();
        billing.setVisible(true);
        
    }//GEN-LAST:event_billingSMActionPerformed

    private void userRSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRSMActionPerformed
        this.dispose();
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.setVisible(true);
    }//GEN-LAST:event_userRSMActionPerformed
    private JFrame frame;
    private void exitSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitSMActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog (frame, "Confirm if you want to exit","MySQL Connector",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitSMActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem appointmentISM;
    private javax.swing.JMenu appointmentsMenu;
    private javax.swing.JMenuItem billingSM;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JMenuItem exitSM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem petsISM;
    private javax.swing.JMenu petsMenu;
    private javax.swing.JMenu productsMenu;
    private javax.swing.JMenu systemMenu;
    private javax.swing.JMenuItem userRSM;
    // End of variables declaration//GEN-END:variables
}

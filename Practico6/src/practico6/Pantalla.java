/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author balbi
 */
public class Pantalla extends javax.swing.JFrame {
int seg1, seg2;
Thread Cuenta1;
Thread Cuenta2;

    public int getSeg1() {
        return seg1;
    }

    public void setSeg1(int seg1) {
        this.seg1 = seg1;
    }

    public int getSeg2() {
        return seg2;
    }

    public void setSeg2(int seg2) {
        this.seg2 = seg2;
    }


    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
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

        txtTexto1 = new javax.swing.JTextField();
        txtTexto2 = new javax.swing.JTextField();
        btnComenzar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTexto1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtTexto2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnComenzar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        jLabel1.setText("Proceso n° 1:");

        jLabel2.setText("Proceso n° 2:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTexto2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addComponent(txtTexto1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addComponent(btnComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
       
//       int uno, dos, resultado;
//       uno =  Integer.parseInt(  this.txtTexto1.getText()  );
//       dos =  Integer.parseInt(  this.txtTexto2.getText()  ); 
//       resultado = uno * dos ;
//       this.txtResultado.setText(   Integer.toString(  resultado  )  );
    Cuenta1 = new Thread(){
        public void run(){
            for (int i = 0; i < 10; i++) {
                try {
                    txtTexto1.setText(  Integer.toString(i)  ); 
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("Error" + ex);
                }
            } } }; 
////////////////////////////////////////////////////////////////
    Cuenta2 = new Thread(){
        public void run(){
            for (int i = 0; i < 10; i++) {
                try {
                    txtTexto2.setText(  Integer.toString(i)  ); 
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("Error" + ex);
                }
            } } }; 
    ////////////////////////////////////////////////////////////////
Cuenta1.start();
Cuenta2.start();
    }//GEN-LAST:event_btnComenzarActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComenzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtTexto1;
    private javax.swing.JTextField txtTexto2;
    // End of variables declaration//GEN-END:variables
}
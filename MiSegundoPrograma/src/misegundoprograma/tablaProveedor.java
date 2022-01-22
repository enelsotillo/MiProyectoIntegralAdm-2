
package misegundoprograma;
import com.mysql.jdbc.Statement;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tablaProveedor extends javax.swing.JFrame {
    MiSegundoPrograma cc=new MiSegundoPrograma();
   Connection cn=cc.conexion();
    Proveedor nuevoProv = new Proveedor();
    
    public tablaProveedor() {
        initComponents();
        MostrarTablaProveedores("");
    }
    public void MostrarTablaProveedores(String valor){ 
    String datos[]=new String[12];
    DefaultTableModel modelo =new DefaultTableModel();
    modelo.addColumn("Codigo");
    modelo.addColumn("Nombre");
    modelo.addColumn("Cuit");
    modelo.addColumn("Cuil");
    modelo.addColumn("Dir");
    modelo.addColumn("Nro");
    modelo.addColumn("Zona");
    modelo.addColumn("Provincia");
    modelo.addColumn("Pais");
    modelo.addColumn("Tlf1");
    modelo.addColumn("Tlf2");
    modelo.addColumn("Correo");
    TablaProveedores.setModel(modelo);
    
    String sql="";
    if(valor.equals("")){
            sql="select * from proveedor";
    }else{
    sql="select * from proveedor where id_proveedor="+valor+"";
    }
    Statement prepare;
    ResultSet resultado;
       
        try {
             prepare=(Statement) cn.createStatement();
            resultado=prepare.executeQuery(sql);
            while(resultado.next()){
            datos[0]=resultado.getString(1);
            datos[1]=resultado.getString(2);
            datos[2]=resultado.getString(3);
            datos[3]=resultado.getString(4);
            datos[4]=resultado.getString(5);
            datos[5]=resultado.getString(6);
            datos[6]=resultado.getString(7);
            datos[7]=resultado.getString(8);
            datos[8]=resultado.getString(9);
            datos[9]=resultado.getString(10);
            datos[10]=resultado.getString(11);
            datos[11]=resultado.getString(12);
            modelo.addRow(datos);
            }
            TablaProveedores.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(tablaProveedor.class.getName()).log(Level.SEVERE, null, ex);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProveedores = new javax.swing.JTable();
        txtBuscarProveedor = new javax.swing.JTextField();
        btnBuscarProveedor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        SalirTablaProveedor = new javax.swing.JButton();

        jMenuItem1.setText("ModificarProveedor");
        jMenuItem1.setComponentPopupMenu(jPopupMenu1);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Tabla de Proveedores");

        TablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaProveedores);

        btnBuscarProveedor.setText("Buscar Proveedor");
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });

        jButton1.setText("Mostrar Proveedores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SalirTablaProveedor.setText("Salir de la Tabla de Proveedores");
        SalirTablaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirTablaProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(jLabel1)
                .addContainerGap(504, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarProveedor)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(SalirTablaProveedor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProveedor)
                    .addComponent(jButton1)
                    .addComponent(SalirTablaProveedor))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
        
        MostrarTablaProveedores(txtBuscarProveedor.getText());
        
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        MostrarTablaProveedores("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SalirTablaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirTablaProveedorActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_SalirTablaProveedorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
//         int fila=MostrarTablaProveedores.
//        if(fila>=0){
//            nuevoProv.
//            Proveedor.txtCodigo.setText(tbPrecio.getValueAt(fila, 0).toString());
//            txtProducto.setText(tbPrecio.getValueAt(fila, 1).toString());
//            txtPrecio.setText(tbPrecio.getValueAt(fila, 2).toString());
//        }else{
//            JOptionPane.showMessageDialog(null, "no selecciono la fila");
//        }
//       
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(tablaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalirTablaProveedor;
    private javax.swing.JTable TablaProveedores;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscarProveedor;
    // End of variables declaration//GEN-END:variables
}
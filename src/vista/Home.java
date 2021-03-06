
package vista;

import modelo.Usuarios;

public class Home extends javax.swing.JFrame {

    Usuarios modelo;
    
    
    
    public Home() {
        initComponents();
    }

    
    public Home(Usuarios mod){
        initComponents();
        setLocationRelativeTo(null);
        this.modelo = mod;
        lblNombre.setText(modelo.getNombre());
        lblRol.setText(modelo.getNombre_tipo());
        
        if(modelo.getId_tipo() == 1){
            
        }else if(modelo.getId_tipo() == 2){
            menuProveedores.setVisible(false);
            subAddProducto.setVisible(false);
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

        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProductos = new javax.swing.JMenu();
        subAddProducto = new javax.swing.JMenuItem();
        subModProducto = new javax.swing.JMenuItem();
        subCatProducto = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenu();
        subAddProveedor = new javax.swing.JMenuItem();
        subCatProveedor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuProductos.setText("Productos");

        subAddProducto.setText("Agregar Producto");
        menuProductos.add(subAddProducto);

        subModProducto.setText("Modificar Producto");
        menuProductos.add(subModProducto);

        subCatProducto.setText("Catalogo Productos");
        menuProductos.add(subCatProducto);

        jMenuBar1.add(menuProductos);

        menuProveedores.setText("Proveedores");

        subAddProveedor.setText("Agregar Proveedor");
        subAddProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subAddProveedorActionPerformed(evt);
            }
        });
        menuProveedores.add(subAddProveedor);

        subCatProveedor.setText("Catalogo Proveedores");
        menuProveedores.add(subCatProveedor);

        jMenuBar1.add(menuProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblRol)))
                .addContainerGap(461, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subAddProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subAddProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subAddProveedorActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JMenuItem subAddProducto;
    private javax.swing.JMenuItem subAddProveedor;
    private javax.swing.JMenuItem subCatProducto;
    private javax.swing.JMenuItem subCatProveedor;
    private javax.swing.JMenuItem subModProducto;
    // End of variables declaration//GEN-END:variables
}

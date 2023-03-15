/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import DAO.ClienteDAO;
import DAO.ProveedorDAO;
import Modelo.Cliente;
import Modelo.Proveedor;
import Modelo.Usuario;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class formProveedorEdit extends javax.swing.JFrame {
    
    String idProveedor;
    Usuario sysUser;
    /**
     * Creates new form formUsuarioAdd
     */
    public formProveedorEdit() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public formProveedorEdit(String id, Usuario user) {
        initComponents();
        this.sysUser = user;
        this.idProveedor = id;
        this.setLocationRelativeTo(null);
        getDatosCliente();
    }
    
    public void getDatosCliente(){
        
        Proveedor pro = new Proveedor();
        ProveedorDAO proDAO = new ProveedorDAO();
        pro = proDAO.leer(Integer.valueOf(idProveedor));
        
        txtRUC.setText(pro.getRuc());
        txtRazonSocial.setText(pro.getRazonSocial());
        txtPrimerNombre.setText(pro.getPrimerNombre());
        txtSegundoNombre.setText(pro.getSegundoNombre());
        txtPrimerApellido.setText(pro.getPrimerApellido());
        txtSegundoApellido.setText(pro.getSegundoApellido());
        txtTelefono.setText(pro.getTelefono());
        txtCelular.setText(pro.getCelular());
        txtCorreo.setText(pro.getCorreo());
        txtDireccion.setText(pro.getDireccion());
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        labTitle = new javax.swing.JLabel();
        labRUC = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        labRazonSocial = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        labPrimerNombre = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        labSegundoNombre = new javax.swing.JLabel();
        txtSegundoNombre = new javax.swing.JTextField();
        labPrimerApellido = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        labSegundoApellido = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        labCelular = new javax.swing.JLabel();
        labTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        labCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        labDireccion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panMain.setBackground(new java.awt.Color(255, 255, 255));
        panMain.setForeground(new java.awt.Color(255, 255, 255));
        panMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labTitle.setForeground(new java.awt.Color(11, 58, 82));
        labTitle.setText("Modificar Cliente");
        panMain.add(labTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        labRUC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labRUC.setText("RUC");
        panMain.add(labRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtRUC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRUC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRUCActionPerformed(evt);
            }
        });
        panMain.add(txtRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 30));

        labRazonSocial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labRazonSocial.setText("Razón social");
        panMain.add(labRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtRazonSocial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRazonSocial.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonSocialActionPerformed(evt);
            }
        });
        panMain.add(txtRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 457, 30));

        labPrimerNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labPrimerNombre.setText("Primer Nombre");
        panMain.add(labPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtPrimerNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrimerNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerNombreActionPerformed(evt);
            }
        });
        panMain.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 30));

        labSegundoNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labSegundoNombre.setText("Segundo Nombre");
        panMain.add(labSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        txtSegundoNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSegundoNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtSegundoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoNombreActionPerformed(evt);
            }
        });
        panMain.add(txtSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 200, 30));

        labPrimerApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labPrimerApellido.setText("Primer Apellido");
        panMain.add(labPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtPrimerApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrimerApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerApellidoActionPerformed(evt);
            }
        });
        panMain.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 30));

        labSegundoApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labSegundoApellido.setText("Segundo Apellido");
        panMain.add(labSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        txtSegundoApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSegundoApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoApellidoActionPerformed(evt);
            }
        });
        panMain.add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 200, 30));

        labCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labCelular.setText("Celular");
        panMain.add(labCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        labTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labTelefono.setText("Telefono");
        panMain.add(labTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        panMain.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 200, 30));

        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCelular.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        panMain.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 200, 30));

        labCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labCorreo.setText("Correo");
        panMain.add(labCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        panMain.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 457, 30));

        labDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labDireccion.setText("Dirección");
        panMain.add(labDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDireccion.setRows(5);
        txtDireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtDireccion);

        panMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 457, -1));

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setText("Cancelar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panMain.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 90, 30));

        btnGuardar1.setBackground(new java.awt.Color(11, 58, 82));
        btnGuardar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setText("Guardar");
        btnGuardar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        panMain.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoApellidoActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerApellidoActionPerformed

    private void txtRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazonSocialActionPerformed

    private void txtSegundoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoNombreActionPerformed

    private void txtPrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerNombreActionPerformed

    private void txtRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRUCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRUCActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        
        Proveedor pro = new Proveedor();
        ProveedorDAO proDAO = new ProveedorDAO();
        
        if(!txtRUC.getText().equals("") && !txtRazonSocial.getText().equals("") && 
                !txtPrimerNombre.getText().equals("") && !txtSegundoNombre.getText().equals("") &&
                !txtPrimerApellido.getText().equals("") && !txtSegundoApellido.getText().equals("") &&
                !txtTelefono.getText().equals("") && !txtCelular.getText().equals("") &&
                !txtCorreo.getText().equals("") && !txtDireccion.getText().equals("")){
            pro.setIdProveedor(Integer.valueOf(idProveedor));
            pro.setRuc((String)txtRUC.getText());
            pro.setRazonSocial((String)txtRazonSocial.getText());
            pro.setPrimerNombre((String)txtPrimerNombre.getText());
            pro.setSegundoNombre((String)txtSegundoNombre.getText());
            pro.setPrimerApellido((String)txtPrimerApellido.getText());
            pro.setSegundoApellido((String)txtSegundoApellido.getText());
            pro.setTelefono((String)txtTelefono.getText());
            pro.setCelular((String)txtCelular.getText());
            pro.setCorreo((String)txtCorreo.getText());
            pro.setDireccion((String)txtDireccion.getText());
            
            if(pro.getRuc().length() > 9 && pro.getRuc().length() < 14){
                
                if(pro.getTelefono().length() == 9){
                    if(pro.getCelular().length() == 10){

                        pro.setEstado(1);
                        pro.setFechaModifica(LocalDateTime.now());
                        pro.setUsuarioModifica(sysUser.getUsername());

                        if(proDAO.modificar(pro)){                           
                            this.dispose();
                            formProveedores.getProveedores();

                        }else{
                            JOptionPane.showMessageDialog(null, "No se guradaron los datos.");
                        }

                    }else{
                        JOptionPane.showMessageDialog(null, "El celular debe tener 10 dígitos.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El teléfono debe tener 9 dígitos.");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "El RUC debe tener 10 a 13 dígitos.");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos del formulario.");
        }
        
        
    }//GEN-LAST:event_btnGuardar1ActionPerformed

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
            java.util.logging.Logger.getLogger(formProveedorEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formProveedorEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formProveedorEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formProveedorEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formProveedorEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labCelular;
    private javax.swing.JLabel labCorreo;
    private javax.swing.JLabel labDireccion;
    private javax.swing.JLabel labPrimerApellido;
    private javax.swing.JLabel labPrimerNombre;
    private javax.swing.JLabel labRUC;
    private javax.swing.JLabel labRazonSocial;
    private javax.swing.JLabel labSegundoApellido;
    private javax.swing.JLabel labSegundoNombre;
    private javax.swing.JLabel labTelefono;
    private javax.swing.JLabel labTitle;
    private javax.swing.JPanel panMain;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

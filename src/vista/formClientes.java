/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import DAO.ClienteDAO;
import Modelo.Cliente;
import Modelo.Usuario;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin Barzola
 */
public class formClientes extends javax.swing.JPanel {
    
    Usuario sysUser;
    
    /**
     * Creates new form Clientes
     */
    public formClientes() {
        initComponents();
        
    }
    
    public formClientes(Usuario user) {
        initComponents();
        this.sysUser = user;
        this.getClientes();
        
    }
    
    public static void getClientes(){
        ClienteDAO cliDAO = new ClienteDAO();
        List<Cliente> clientes = cliDAO.listar();

        DefaultTableModel model = (DefaultTableModel) tabListaClientes.getModel();
        tabListaClientes.removeAll();
        model.setRowCount(0);
        
        for(Cliente cli :clientes){
            
            model.addRow(new String[]{String.valueOf(cli.getIdCliente()), cli.getRuc(), cli.getRazonSocial(), cli.getPrimerNombre(), cli.getSegundoNombre(), 
                cli.getPrimerApellido(), cli.getSegundoApellido(), cli.getTelefono(), cli.getCelular(), cli.getCorreo(),
                cli.getDireccion()
            });
            
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabListaClientes = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(224, 224, 224));
        setPreferredSize(new java.awt.Dimension(900, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(11, 58, 82));
        jLabel2.setText("CLIENTES");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        tabListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "RUC", "Razón Social", "Primer Nombre", "Segundo Nombre", "Primer Apellido", "Segundo Apellido", "Teléfono", "Celular", "Correo", "Dirección"
            }
        ));
        tabListaClientes.setMinimumSize(new java.awt.Dimension(0, 0));
        tabListaClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabListaClientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 860, 280));

        btnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 100, 30));

        btnNuevo.setBackground(new java.awt.Color(30, 150, 210));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 30));

        btnModificar.setBackground(new java.awt.Color(255, 153, 51));
        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int fila = tabListaClientes.getSelectedRow();
        Cliente client = new Cliente();
        ClienteDAO cliDAO = new ClienteDAO();

        if(fila >= 0){
            
            String id = (String) tabListaClientes.getValueAt(fila, 0);
            
            int res = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro?");
            
            if(res == 0){
                client.setIdCliente(Integer.valueOf(id));
                client.setEstado(0);
                client.setFechaElimina(LocalDateTime.now());
                client.setUsuarioElimina(sysUser.getUsername());
                cliDAO.eliminar(client);
                getClientes();
            }
            //System.out.println(res);
            
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, debe seleccionar un registro.");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        formClienteAdd regClient = new formClienteAdd(sysUser);
        regClient.setVisible(true);
        
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        int fila = tabListaClientes.getSelectedRow();
        if(fila >= 0){
            String id = (String) tabListaClientes.getValueAt(fila, 0);
            formClienteEdit editClient = new formClienteEdit(id, sysUser);
            editClient.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, debe seleccionar un registro.");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabListaClientes;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.potromon.ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.potromon.entidades.Entrenador;
import java.sql.PreparedStatement;

/**
 * Clase que representa una ventana de listado de entrenadores.
 * Permite realizar operaciones CRUD (Agregar, Editar, Eliminar) sobre los registros de entrenadores.
 * 
 * Funcionalidades principales:
 * - Visualizar la lista de entrenadores en una tabla.
 * - Agregar un nuevo entrenador.
 * - Editar un entrenador existente.
 * - Eliminar un entrenador.
 * 
 * Utiliza una conexión con la clase "Entrenador" para acceder a los datos.
 * 
 * @author bruns
 */
public class EntrenadorListado extends javax.swing.JFrame {

    /**
     * Constructor principal que inicializa la interfaz gráfica y carga los datos iniciales en la tabla.
     */
    public EntrenadorListado() {
        initComponents();
        cargarTable();
    }

    /**
     * Evento que se ejecuta al abrir la ventana. Carga los datos en la tabla
     * y oculta la columna de ID para una mejor presentación visual.
     * 
     * @param evt Evento de apertura de ventana.
     */
    
    /**
     * Carga los datos de los entrenadores en la tabla.
     * Obtiene los datos mediante el método estático `getAll()` de la clase Entrenador.
     */
    private void cargarTable(){
    List<Entrenador> entrenador = Entrenador.getAll();
    DefaultTableModel modeloTable = (DefaultTableModel) tblEntrenadores.getModel();
    modeloTable.setRowCount(0);
    for(Entrenador e : entrenador) {
        modeloTable.addRow(new Object[] {
        e.getIdEntrenador(),
        e.getNombreEntrenador(),
        e.getAliasEntrenador(),
        e.getPuebloOrigen(),
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

        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEntrenadores = new javax.swing.JTable();
        btnPotromon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        jLabel1.setText("ENTRENADORES");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblEntrenadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Alias", "Origen"
            }
        ));
        jScrollPane1.setViewportView(tblEntrenadores);

        btnPotromon.setText("Potromones Form");
        btnPotromon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotromonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnEditar)
                                .addComponent(btnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(1, 1, 1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnPotromon)))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnAgregar)
                .addGap(53, 53, 53)
                .addComponent(btnEditar)
                .addGap(50, 50, 50)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPotromon)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Maneja el evento de acción del botón "Agregar".
     * Este método crea una nueva instancia de EntrenadorForm en modo modal
     * (bloqueante) y la muestra al usuario. Después de que el formulario se cierra,
     * se llama al método cargarTable() para actualizar la tabla de entrenadores.
     *
     * @param evt El evento de acción que se genera al presionar el botón.
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        EntrenadorForm form = new EntrenadorForm(this, true, 0);
        form.setVisible(true);
        cargarTable();
    }//GEN-LAST:event_btnAgregarActionPerformed
    /**
     * Maneja el evento de acción del botón "Editar".
     * Este método obtiene la fila seleccionada en la tabla de entrenadores,
     * extrae el ID del entrenador y crea una nueva instancia de EntrenadorForm
     * en modo modal con el ID del entrenador seleccionado. Luego, muestra el formulario
     * y actualiza la tabla de entrenadores después de que se cierra el formulario.
     *
     * @param evt El evento de acción que se genera al presionar el botón.
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int renglon = tblEntrenadores.getSelectedRow();
        int idEntrenador = Integer.parseInt(tblEntrenadores.getModel().getValueAt(renglon, 0).toString());

        EntrenadorForm form = new EntrenadorForm(this, true, idEntrenador);
        form.setVisible(true);

        cargarTable();

    }//GEN-LAST:event_btnEditarActionPerformed
    /**
    * Maneja el evento de acción del botón "Eliminar".
    * Este método obtiene la fila seleccionada en la tabla de entrenadores,
    * extrae el ID del entrenador y muestra un cuadro de confirmación para
    * eliminar el registro. Si el usuario confirma, intenta eliminar el registro
    * y muestra un mensaje de éxito o error según corresponda. Finalmente,
    * actualiza la tabla de entrenadores.
    *
    * @param evt El evento de acción que se genera al presionar el botón.
    */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int renglon =tblEntrenadores.getSelectedRow();
        int idEntrenador = Integer.parseInt(tblEntrenadores.getModel().getValueAt(renglon, 0).toString());

        if  (JOptionPane.showConfirmDialog(this,
            "Esta seguro que desea eliminar el registro?",
            "Eliminar registro",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        if (Entrenador.delete(idEntrenador)){
            JOptionPane.showMessageDialog(this,
                "El registro se elimino con exito",
                "Registro eliminado con exito",
                JOptionPane.INFORMATION_MESSAGE);
            cargarTable();
        } else {
            JOptionPane.showMessageDialog(this,
                "Ocurrio un errro al eliminar el registro",
                "ERROR",
                JOptionPane.ERROR_MESSAGE);

        }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    /**
     * Maneja el evento de acción del botón "Potromon".
     * Este método crea una nueva instancia de PotrodexListado y la muestra al usuario.
     * Luego, cierra la ventana actual.
     *
     * @param evt El evento de acción que se genera al presionar el botón.
     */
    private void btnPotromonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotromonActionPerformed
       PotrodexListado listado = new PotrodexListado();
       listado.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnPotromonActionPerformed

    /**
     * Método principal para ejecutar la aplicación.
     * Muestra la ventana principal de EntrenadorListado
     * @param args Argumentos de línea de comandos.
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
            java.util.logging.Logger.getLogger(EntrenadorListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntrenadorListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntrenadorListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntrenadorListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntrenadorListado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPotromon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEntrenadores;
    // End of variables declaration//GEN-END:variables
}

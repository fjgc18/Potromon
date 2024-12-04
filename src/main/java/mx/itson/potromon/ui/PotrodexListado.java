/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.potromon.ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.potromon.entidades.Potrodex;

/**
 * Clase que representa la interfaz gráfica para listar los Potromones en el Potrodex.
 * Permite agregar, editar, eliminar y mostrar detalles de los Potromones.
 * 
 * @author emili
 */
public class PotrodexListado extends javax.swing.JFrame {

    /**
     * Crea una nueva instancia de PotrodexListado.
     * Inicializa los componentes de la interfaz y carga la tabla con los Potromones.
     */
    public PotrodexListado() {
        initComponents();
        cargarTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPotromones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnshow = new javax.swing.JButton();
        btnEntrenadores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPotromones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Poderes", "Puntaje"
            }
        ));
        jScrollPane1.setViewportView(tblPotromones);

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        jLabel1.setText("POTRODEX");

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

        btnshow.setText("Show Potrocard");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        btnEntrenadores.setText("Entrenadores Form");
        btnEntrenadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAgregar)
                                .addComponent(btnEditar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnshow))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnEntrenadores, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEntrenadores)
                        .addGap(18, 18, 18)
                        .addComponent(btnshow, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Maneja el evento de acción del botón "Agregar".
     * Este método abre un nuevo formulario para agregar un Potromon.
     * 
     * @param evt El evento de acción que se genera al presionar el botón.
     */

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        PotrodexForm form = new PotrodexForm(this, true, 0);
        form.setVisible(true);

        cargarTable();
    }//GEN-LAST:event_btnAgregarActionPerformed
    /**
     * Maneja el evento de acción del botón "Eliminar".
     * Este método elimina el Potromon seleccionado de la tabla.
     * 
     * @param evt El evento de acción que se genera al presionar el botón.
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int renglon =tblPotromones.getSelectedRow();
        int idPotrodex = Integer.parseInt(tblPotromones.getModel().getValueAt(renglon, 0).toString());
        
        
       if  (JOptionPane.showConfirmDialog(this,
                "Esta seguro que desea eliminar el registro?",
                "Eliminar registro",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                 if (Potrodex.delete(idPotrodex)){
                    JOptionPane.showMessageDialog(this,
                      "El registro se elimino con exito",
                      "Registro eliminado con exito",
                           JOptionPane.INFORMATION_MESSAGE);
                   cargarTable();   // Recarga la tabla después de eliminar
               } else {
                     JOptionPane.showMessageDialog(this,
                           "Ocurrio un errro al eliminar el registro",
                            "ERROR",
                            JOptionPane.ERROR_MESSAGE);
                                                       
        }
                                      
      }
    }//GEN-LAST:event_btnEliminarActionPerformed
    /**
     * Maneja el evento de acción del botón "Editar".
     * Este método abre un formulario para editar el Potromon seleccionado.
     * 
     * @param evt El evento de acción que se genera al presionar el botón.
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       int renglon = tblPotromones.getSelectedRow();
       int idPotrodex = Integer.parseInt(tblPotromones.getModel().getValueAt(renglon, 0).toString());
        
       PotrodexForm form = new PotrodexForm(this, true, idPotrodex);
       form.setVisible(true);
        
       cargarTable(); // Recarga la tabla después de editar
        
                         
    }//GEN-LAST:event_btnEditarActionPerformed
    /**
     * Maneja el evento de acción del botón "Show Potrocard".
     * Este método muestra la carta del Potromon seleccionado.
     * 
     * @param evt El evento de acción que se genera al presionar el botón.
     */
    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
        int selectedRow = tblPotromones.getSelectedRow();
        if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un valor de la tabla");
        return;
}
        int id = (int) tblPotromones.getValueAt(selectedRow, 0);
        
        try {
            PotrocartaForm potrocardFrame = new PotrocartaForm(id);
            potrocardFrame.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al intentar mostrar el Potrocard: " + ex.getMessage());
        }

    }//GEN-LAST:event_btnshowActionPerformed
    /**
     * Maneja el evento de acción del botón "Entrenadores Form".
     * Este método abre el formulario de listado de entrenadores y cierra la ventana actual.
     * 
     * @param evt El evento de acción que se genera al presionar el botón.
     */
    private void btnEntrenadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenadoresActionPerformed
        EntrenadorListado form = new EntrenadorListado();
        form.setVisible(true);
        dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_btnEntrenadoresActionPerformed
    /**
     * Este método se llama cuando se abre la ventana.
     * Carga la tabla con los Potromones y oculta la columna de ID.
     * 
     * @param evt El evento de ventana que se genera al abrir.
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        cargarTable();
        tblPotromones.removeColumn(tblPotromones.getColumnModel().getColumn(0)); // Oculta la columna de ID
    }   
    
     /**
     * Carga los Potromones en la tabla desde la base de datos.
     * Este método obtiene todos los Potromones y los agrega al modelo de la tabla.
     */
    private void cargarTable(){
    List<Potrodex> potrodex = Potrodex.getAll();    // Obtiene todos los Potromones
    DefaultTableModel modeloTable = (DefaultTableModel) tblPotromones.getModel();
    modeloTable.setRowCount(0); // Limpia la tabla
    for(Potrodex p : potrodex) {
        modeloTable.addRow(new Object[] {
        p.getIdPotromon(),
        p.getNombrePotromon(),
        p.getDescripcion(),
        p.getPoderes(),
        p.getPuntaje()
        });
          
    }
}
    
    /**
     * Método principal que inicia la aplicación y muestra la ventana de PotrodexListado.
     * 
     * @param args Los argumentos de línea de comandos.
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
            java.util.logging.Logger.getLogger(PotrodexListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PotrodexListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PotrodexListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PotrodexListado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crea y muestra el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PotrodexListado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEntrenadores;
    private javax.swing.JButton btnshow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPotromones;
    // End of variables declaration//GEN-END:variables
}

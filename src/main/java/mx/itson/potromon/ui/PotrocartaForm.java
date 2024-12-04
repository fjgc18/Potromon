/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.potromon.ui;

import java.awt.Image;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.potromon.entidades.Entrenador;
import mx.itson.potromon.entidades.Habilidades;
import mx.itson.potromon.entidades.Potrodex;

/**
 *
 * @author emili
 * Clase que representa la interfaz gráfica para mostrar la carta de un Potromon.
 * Permite visualizar información del Potromon, sus habilidades y actualizar su puntaje.
 */
public class PotrocartaForm extends javax.swing.JFrame {
  private int puntaje;
    private int idPotromon;
    /**
     * Crea una nueva instancia de PotrocartaForm.
     * Inicializa los componentes de la interfaz y carga la información del Potromon.
     *Como su puntuaje, nombre, imagen, habilidades, etc.
     * @param idPotromon El ID del Potromon a mostrar.
     */
    public PotrocartaForm( int idPotromon) {
        initComponents();
        cargarTable();
        tblHabilidades.removeColumn(tblHabilidades.getColumnModel().getColumn(0));

    Potrodex potromon = Potrodex.getById(idPotromon);
    if (potromon != null) {
        cargarImagen(potromon.getRutaImagen());
        
        lblidPotromon.setText(String.valueOf(potromon.getIdPotromon()));
        
        this.puntaje = potromon.getPuntaje();
        lblPuntaje.setText(String.valueOf(puntaje));
        
        lblNombrePotromon.setText(potromon.getNombrePotromon());

        String descripcion = potromon.getDescripcion();
        if (descripcion != null && !descripcion.isEmpty()) {
        lblDescripcion.setText("Descripción: " + descripcion);
        } else {
        lblDescripcion.setText("Descripción no disponible");
}

        Entrenador entrenador = potromon.getEntrenador();
        if (entrenador != null) {
            lblNombreEntrenador.setText("Entrenador: " + entrenador.getNombreEntrenador());
        } else {
            lblNombreEntrenador.setText("Entrenador no disponible");
        }
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró el Potromon");
    }
}
    /**
     * Carga la imagen del Potromon en el JLabel correspondiente.
     *
     * @param rutaImagen La ruta de la imagen a cargar.
     */
    private void cargarImagen(String rutaImagen) {
        try {
            if (rutaImagen != null && !rutaImagen.isEmpty()) {
                
                URL url = new URL(rutaImagen);
                ImageIcon icon = new ImageIcon(url);
                Image img = icon.getImage().getScaledInstance(290, 180, Image.SCALE_SMOOTH);
                PotroImagen.setIcon(new ImageIcon(img));  // Cambia la imagen en el JLabel
            } else {
                PotroImagen.setText("Imagen no disponible");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar la imagen");
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

        lblNombrePotromon = new javax.swing.JLabel();
        lblPuntaje = new javax.swing.JLabel();
        PS = new javax.swing.JLabel();
        lblHabilidades = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblidPotromon = new javax.swing.JLabel();
        PotroImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHabilidades = new javax.swing.JTable();
        lblNombreEntrenador = new javax.swing.JLabel();
        btnRestar = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombrePotromon.setBackground(new java.awt.Color(0, 0, 0));
        lblNombrePotromon.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblNombrePotromon.setForeground(new java.awt.Color(0, 0, 0));
        lblNombrePotromon.setText("Nombre");
        getContentPane().add(lblNombrePotromon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 150, 30));

        lblPuntaje.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblPuntaje.setForeground(new java.awt.Color(0, 0, 0));
        lblPuntaje.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPuntaje.setText("70");
        lblPuntaje.setAutoscrolls(true);
        getContentPane().add(lblPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 50, 30));

        PS.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        PS.setForeground(new java.awt.Color(0, 0, 0));
        PS.setText("PS");
        getContentPane().add(PS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        lblHabilidades.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblHabilidades.setForeground(new java.awt.Color(0, 0, 0));
        lblHabilidades.setText("Habilidades");
        getContentPane().add(lblHabilidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText("Descripción");
        lblDescripcion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 270, 80));

        lblidPotromon.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblidPotromon.setForeground(new java.awt.Color(0, 0, 0));
        lblidPotromon.setText("ID");
        getContentPane().add(lblidPotromon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 30));
        getContentPane().add(PotroImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 290, 180));

        tblHabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "H1", "H2", "H3", "H4"
            }
        ));
        jScrollPane1.setViewportView(tblHabilidades);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 360, 50));

        lblNombreEntrenador.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblNombreEntrenador.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreEntrenador.setText("Entrenador");
        lblNombreEntrenador.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblNombreEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 260, 30));

        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 40, 30));

        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 40, 30));

        Fondo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Fondo.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://e1.pngegg.com/pngimages/754/520/png-clipart-lunareclipse-blanks-pokemon-trading-card-frame-thumbnail.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        Fondo.setText("jLabel2");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 490));

        setSize(new java.awt.Dimension(362, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Maneja el evento de acción del botón "Restar".
     * Este método reduce el puntaje del Potromon en 10, actualiza la etiqueta
     * y guarda el nuevo puntaje en la base de datos.
     *
     * @param evt El evento de acción que se genera al presionar el botón.
     */
    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        if (puntaje >= 10) { 
        puntaje -= 10; 
        lblPuntaje.setText(String.valueOf(puntaje)); // 
        boolean resultado = Potrodex.actualizarPuntaje(idPotromon, puntaje);
        if (resultado) {
            JOptionPane.showMessageDialog(this, "El puntaje se actualizó correctamente", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error al actualizar el puntaje", "Error", JOptionPane.ERROR_MESSAGE);
        }
        } else {
            JOptionPane.showMessageDialog(this, "El puntaje no puede ser menor a 0", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnRestarActionPerformed
    /**
     * Maneja el evento de acción del botón "Sumar".
     * Este método incrementa el puntaje del Potromon en 10, actualiza la etiqueta
     * y guarda el nuevo puntaje en la base de datos.
     *
     * @param evt El evento de acción que se genera al presionar el botón.
     */
    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        puntaje += 10;
        lblPuntaje.setText(String.valueOf(puntaje));
        boolean resultado = Potrodex.actualizarPuntaje(idPotromon, puntaje);
        if (resultado) {
            JOptionPane.showMessageDialog(this, "El puntaje se actualizó correctamente", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error al actualizar el puntaje", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnSumarActionPerformed
    /**
     * Carga la tabla de habilidades con los datos obtenidos de la base de datos.
     * Este método obtiene una lista de todas las habilidades y las agrega a la tabla.
     */
    private void cargarTable(){
    List<Habilidades> habilidades = Habilidades.getAll();
    DefaultTableModel modeloTable = (DefaultTableModel) tblHabilidades.getModel();
    modeloTable.setRowCount(0);
    for(Habilidades h : habilidades) {
        modeloTable.addRow(new Object[] {
        h.getIdHabilidades(),
        h.getHabilidadesUno(),
        h.getHabilidadesDos(),
        h.getHabilidadesTres(),
        h.getHabilidadesCuatro()
        
    });
    }
    }
        
        
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
            java.util.logging.Logger.getLogger(PotrocartaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PotrocartaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PotrocartaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PotrocartaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PotrocartaForm(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel PS;
    private javax.swing.JLabel PotroImagen;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblHabilidades;
    private javax.swing.JLabel lblNombreEntrenador;
    private javax.swing.JLabel lblNombrePotromon;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblidPotromon;
    private javax.swing.JTable tblHabilidades;
    // End of variables declaration//GEN-END:variables
}

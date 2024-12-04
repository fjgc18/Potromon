/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.potromon.ui;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mx.itson.potromon.entidades.Potrodex;

/**
 *
 * @author emili
 */
public class PotrocartaForm extends javax.swing.JFrame {

    /**
     * Creates new form PotrocartaForm
     */
    public PotrocartaForm( int idPotromon) {
        initComponents();

    Potrodex potromon = Potrodex.getById(idPotromon);
    if (potromon != null) {
        cargarImagen(potromon.getRutaImagen());
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró el Potromon");
    }
}
    
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

        Nombre = new javax.swing.JLabel();
        Puntuaje = new javax.swing.JLabel();
        PS = new javax.swing.JLabel();
        Habilidades = new javax.swing.JLabel();
        hb = new javax.swing.JLabel();
        Descripcion = new javax.swing.JLabel();
        Ds = new javax.swing.JLabel();
        Entrenador = new javax.swing.JLabel();
        NombreEntrenador = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        PotroImagen = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setBackground(new java.awt.Color(0, 0, 0));
        Nombre.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setText("Nombre");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 16, 110, 30));

        Puntuaje.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Puntuaje.setForeground(new java.awt.Color(0, 0, 0));
        Puntuaje.setText("70");
        getContentPane().add(Puntuaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 40, 30));

        PS.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        PS.setForeground(new java.awt.Color(0, 0, 0));
        PS.setText("PS");
        getContentPane().add(PS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        Habilidades.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Habilidades.setForeground(new java.awt.Color(0, 0, 0));
        Habilidades.setText("Habilidades");
        getContentPane().add(Habilidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        hb.setForeground(new java.awt.Color(0, 0, 0));
        hb.setText(";");
        getContentPane().add(hb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 260, 70));

        Descripcion.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Descripcion.setForeground(new java.awt.Color(0, 0, 0));
        Descripcion.setText("Descripción");
        getContentPane().add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 80, -1));

        Ds.setForeground(new java.awt.Color(0, 0, 0));
        Ds.setText(":");
        getContentPane().add(Ds, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 270, 60));

        Entrenador.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Entrenador.setForeground(new java.awt.Color(0, 0, 0));
        Entrenador.setText("Entrenador");
        getContentPane().add(Entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        NombreEntrenador.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        NombreEntrenador.setForeground(new java.awt.Color(0, 0, 0));
        NombreEntrenador.setText("Nombre entrenador");
        getContentPane().add(NombreEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 200, -1));

        Id.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Id.setForeground(new java.awt.Color(0, 0, 0));
        Id.setText("ID");
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        PotroImagen.setText("jLabel1");
        getContentPane().add(PotroImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 290, 180));

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
    private javax.swing.JLabel Descripcion;
    private javax.swing.JLabel Ds;
    private javax.swing.JLabel Entrenador;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Habilidades;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NombreEntrenador;
    private javax.swing.JLabel PS;
    private javax.swing.JLabel PotroImagen;
    private javax.swing.JLabel Puntuaje;
    private javax.swing.JLabel hb;
    // End of variables declaration//GEN-END:variables
}

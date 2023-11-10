/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Image;


/**
 *
 * @author Proyector
 */
public class FrameRegistroPrueba extends javax.swing.JFrame {
private FrameRegistrar padre; 
private String imagePath;

    /**
     * Creates new form FrameRegistroPrueba
     */
     public FrameRegistroPrueba() {
        initComponents();
    }
     
public FrameRegistroPrueba(FrameRegistrar padre){
      initComponents();
      this.padre = padre;
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen3 = new javax.swing.JLabel();
        btnCargarImagen = new javax.swing.JButton();
        btnCargarImagen2 = new javax.swing.JButton();
        btnCargarImagen3 = new javax.swing.JButton();
        lblGuardar = new javax.swing.JLabel();
        lblCancelar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 160, 150));
        jPanel1.add(lblImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 206, 170, 160));
        jPanel1.add(lblImagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 206, 170, 160));

        btnCargarImagen.setText("jButton1");
        btnCargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarImagenActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        btnCargarImagen2.setText("jButton2");
        btnCargarImagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarImagen2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        btnCargarImagen3.setText("jButton3");
        btnCargarImagen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarImagen3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarImagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Acepta.png"))); // NOI18N
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
        });
        jPanel1.add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cancelarr.png"))); // NOI18N
        lblCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarMouseClicked(evt);
            }
        });
        jPanel1.add(lblCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RegistrePrueba.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_lblCancelarMouseClicked

    private void btnCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarImagenActionPerformed
    
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
    fileChooser.setFileFilter(filter);

    int returnVal = fileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File  file = fileChooser.getSelectedFile();
        imagePath = file.getAbsolutePath();
        // Actualizar la etiqueta con la imagen seleccionada
        mostrarImagen(imagePath);
    }
    }//GEN-LAST:event_btnCargarImagenActionPerformed

    private void btnCargarImagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarImagen2ActionPerformed
        // TODO add your handling code here:
             JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
    fileChooser.setFileFilter(filter);

    int returnVal = fileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File  file = fileChooser.getSelectedFile();
        imagePath = file.getAbsolutePath();
        // Actualizar la etiqueta con la imagen seleccionada
        mostrarImagen2(imagePath);
    }
    }//GEN-LAST:event_btnCargarImagen2ActionPerformed

    private void btnCargarImagen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarImagen3ActionPerformed
        // TODO add your handling code here:
                 JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
    fileChooser.setFileFilter(filter);

    int returnVal = fileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File  file = fileChooser.getSelectedFile();
        imagePath = file.getAbsolutePath();
        // Actualizar la etiqueta con la imagen seleccionada
        mostrarImagen3(imagePath);
    }
    }//GEN-LAST:event_btnCargarImagen3ActionPerformed

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        // TODO add your handling code here:
         ImageIcon icon1 = (ImageIcon) lblImagen.getIcon();
    ImageIcon icon2 = (ImageIcon) lblImagen2.getIcon();
    ImageIcon icon3 = (ImageIcon) lblImagen3.getIcon();

    // Verifica si las imágenes son nulas
    if (icon1 != null || icon2 != null || icon3 != null) {
        // Directorio de destino para guardar las imágenes
        String directorioDestino = "ruta/del/directorio/destino/";

        // Guarda las imágenes en el directorio de destino
        if (icon1 != null) {
            guardarImagen(icon1, directorioDestino, "imagen1.png");
        }
        if (icon2 != null) {
            guardarImagen(icon2, directorioDestino, "imagen2.png");
        }
        if (icon3 != null) {
            guardarImagen(icon3, directorioDestino, "imagen3.png");
        }
        // Informa al usuario que las imágenes se han guardado con éxito
        javax.swing.JOptionPane.showMessageDialog(this, "Imágenes guardadas exitosamente.");
    } else {
        // Informa al usuario que deben cargarse las tres imágenes primero
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, cargue las tres imágenes antes de guardar.");
    }
    }//GEN-LAST:event_lblGuardarMouseClicked


    private void mostrarImagen(String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
    lblImagen.setIcon(icon);
    
}
    private void mostrarImagen2(String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
    
    lblImagen2.setIcon(icon);
}
    
        private void mostrarImagen3(String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
    
    lblImagen3.setIcon(icon);
}
    
    
    
    
    private void salir(){
      padre.setVisible(true);
      this.dispose();
    }
    
  


  
private void guardarImagen(ImageIcon icon, String directorioDestino, String nombreArchivo) {
    int ancho = icon.getIconWidth();
    int alto = icon.getIconHeight();

    BufferedImage bufferedImage = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
    Graphics2D g2d = bufferedImage.createGraphics();

    icon.paintIcon(null, g2d, 0, 0);  // Pinta el icono en el BufferedImage

    g2d.dispose();

    File archivoDestino = new File(directorioDestino, nombreArchivo);

    try {
        ImageIO.write(bufferedImage, "png", archivoDestino);
    } catch (IOException e) {
        e.printStackTrace();
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
            java.util.logging.Logger.getLogger(FrameRegistroPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRegistroPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRegistroPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRegistroPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRegistroPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarImagen;
    private javax.swing.JButton btnCargarImagen2;
    private javax.swing.JButton btnCargarImagen3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    // End of variables declaration//GEN-END:variables
}

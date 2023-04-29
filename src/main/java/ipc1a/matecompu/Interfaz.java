
package ipc1a.matecompu;

import Algoritmo.Grafo;
import Algoritmo.Vertice;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author danyw
 */
public class Interfaz extends javax.swing.JFrame {
private ImageIcon imagen;
private Icon icono;
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Interfaz");

    }
    private void pintarImagen(JLabel lbl, String ruta){
        this.imagen  = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(),lbl.getHeight(),Image.SCALE_SMOOTH));
        lbl.setIcon(this.icono);
        this.repaint();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        VerticeOrigen = new javax.swing.JTextField();
        VerticeDestino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboSeleccion = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 132, -1, -1));

        VerticeOrigen.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(VerticeOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 135, 105, -1));

        VerticeDestino.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(VerticeDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 237, 105, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel1.setText("Vértice origen");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 106, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel2.setText("Vertice destino");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 211, -1, -1));

        ComboSeleccion.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        ComboSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Por defecto)", "Ascendente", "Descendente", " " }));
        getContentPane().add(ComboSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 331, -1, -1));

        jButton4.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jButton4.setText("Ejecutar arbol");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 610, -1, -1));

        jButton5.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jButton5.setText("Crear nuevo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel3.setText("Seleccione el orden del árbol");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 299, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 237, -1, 24));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 480, 340));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 480, 310));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel7.setText("Grafo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 26)); // NOI18N
        jLabel8.setText("Algoritmo de profundidad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel9.setText("Árbol");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Verticeorigen = VerticeOrigen.getText();
        String Verticedestino = VerticeDestino.getText();
        
        
        if(Verticeorigen.equals(Verticeorigen)){
                    final int MinNumero = 1;
                    int digitCounter=0;
            for (int i=0; i < Verticeorigen.length(); i++ ) {
                    char c = Verticeorigen.charAt(i);
                    if(Character.isDigit(c)) 
                          digitCounter++;                         
             }
            for (int i=0; i < Verticedestino.length(); i++ ) {
                    char c = Verticedestino.charAt(i);
                    if(Character.isDigit(c)) 
                          digitCounter++;                         
             }
            if (digitCounter >= MinNumero) {
                    JOptionPane.showMessageDialog(null, "No se admiten números", "Registro", JOptionPane.WARNING_MESSAGE);
             }else if(Verticeorigen.length() != 1 |Verticedestino.length() != 1){
                 if(Verticeorigen.equals("")|Verticedestino.equals("")){
                     JOptionPane.showMessageDialog(null, "No se permiten campos vacíos", "Registro", JOptionPane.WARNING_MESSAGE);
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "No se admiten palabras, solo letras", "Registro", JOptionPane.WARNING_MESSAGE);
                 }
             }else if(Verticeorigen.equals(Verticedestino)){
                    JOptionPane.showMessageDialog(null, "No deben repetir aristas", "Registro", JOptionPane.WARNING_MESSAGE);
             }
            else {
                    if(digitCounter < MinNumero)
                    if (Vertice.repetido(Verticeorigen, Verticedestino)) {
                        JOptionPane.showMessageDialog(null, "Esta arista ya se encuentra registrada", "Registro", JOptionPane.WARNING_MESSAGE);
                    }else {
                        Vertice.addVertice(Verticeorigen, Verticedestino);
                        JOptionPane.showMessageDialog(null, "Se agregó el vértice", "Alerta", JOptionPane.WARNING_MESSAGE);
                        new Grafo();
                        this.pintarImagen(jLabel6, "src/main/java/ipc1a/matecompu/grafo.png");

                        

                    }
            }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                String Seleccion = (String) ComboSeleccion.getSelectedItem();               
        if(Seleccion.equals("(Por defecto)")|Seleccion.equals("Ascendente")){
        new Grafo(1,0);
        this.pintarImagen(this.jLabel4,"src/main/java/ipc1a/matecompu/arbol.png");
        if (Vertice.conexo()){
        }else {
        JOptionPane.showMessageDialog(null, "El grafo es disconexo, por lo que el grafo no muestra todos los vertices", "Registro", JOptionPane.WARNING_MESSAGE);
        }
        }
        if(Seleccion.equals("Descendente")){
        new Grafo(1,1);
        this.pintarImagen(this.jLabel4,"src/main/java/ipc1a/matecompu/arbol.png"); 
        if (Vertice.conexo()){
        }else {
        JOptionPane.showMessageDialog(null, "El grafo es disconexo, por lo que el grafo no muestra todos los vertices", "Registro", JOptionPane.WARNING_MESSAGE);
        }
        } 

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.pintarImagen(this.jLabel4, "src");
        this.pintarImagen(this.jLabel6, "src");
        Vertice.clear();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboSeleccion;
    private javax.swing.JTextField VerticeDestino;
    private javax.swing.JTextField VerticeOrigen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}

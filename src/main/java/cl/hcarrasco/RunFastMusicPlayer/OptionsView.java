package cl.hcarrasco.RunFastMusicPlayer;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class OptionsView extends JDialog {

	private static final long serialVersionUID = 1L;
	static MainAppView pt = new MainAppView();
    Configs cfg = new Configs();
    public OptionsView(java.awt.Frame parent, boolean modal, MainAppView aThis) {
        super(parent, modal);
        initComponents();
        pt = aThis;
        try {
            initIdioma();
        } catch (FileNotFoundException ex) {
            System.out.println("Error en carga de Idioma!");
        }
        this.setLocation(400, 54);   
    }

    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        eOpciones = new javax.swing.JLabel();
        eSalir = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        eFondo = new javax.swing.JLabel();

        jPopupMenu1.setInvoker(jLayeredPane1);
        jPopupMenu1.setPreferredSize(new java.awt.Dimension(30, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opciones");
        setResizable(false);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Idioma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(204, 204, 204))); 
        jRadioButton6.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton6.setFont(new java.awt.Font("Calibri", 0, 12)); 
        jRadioButton6.setForeground(new java.awt.Color(204, 204, 255));
        jRadioButton6.setText("Español");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jRadioButton6.setBounds(10, 20, 160, 25);
        jLayeredPane3.add(jRadioButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton7.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton7.setFont(new java.awt.Font("Calibri", 0, 12)); 
        jRadioButton7.setForeground(new java.awt.Color(204, 204, 255));
        jRadioButton7.setText("Inglés");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jRadioButton7.setBounds(10, 40, 180, 25);
        jLayeredPane3.add(jRadioButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jRadioButton8.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton8.setFont(new java.awt.Font("Calibri", 0, 12)); 
        jRadioButton8.setForeground(new java.awt.Color(204, 204, 255));
        jRadioButton8.setText("Ruso");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jRadioButton8.setBounds(10, 60, 170, 25);
        jLayeredPane3.add(jRadioButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setBounds(20, 160, 210, 90);
        jLayeredPane1.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nombre.setFont(new java.awt.Font("Calibri", 0, 20)); 
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("RunFast !!");
        nombre.setBounds(280, 160, 120, 20);
        jLayeredPane1.add(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bandejaIcon.png"))); 
        jLabel1.setBounds(250, 50, 160, 150);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Temas Visuales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(204, 204, 204))); 

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setFont(new java.awt.Font("Calibri", 0, 12)); 
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 255));
        jRadioButton1.setText("Defecto");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jRadioButton1.setBounds(10, 20, 90, 25);
        jLayeredPane2.add(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setFont(new java.awt.Font("Calibri", 0, 12)); 
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 255));
        jRadioButton2.setText("Saturno");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jRadioButton2.setBounds(10, 40, 80, 25);
        jLayeredPane2.add(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setFont(new java.awt.Font("Calibri", 0, 12)); 
        jRadioButton3.setForeground(new java.awt.Color(204, 204, 255));
        jRadioButton3.setText("Giannella");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jRadioButton3.setBounds(10, 60, 120, 25);
        jLayeredPane2.add(jRadioButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton4.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setFont(new java.awt.Font("Calibri", 0, 12)); 
        jRadioButton4.setForeground(new java.awt.Color(204, 204, 255));
        jRadioButton4.setText("Flush");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jRadioButton4.setBounds(100, 20, 100, 25);
        jLayeredPane2.add(jRadioButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jRadioButton5.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton5.setFont(new java.awt.Font("Calibri", 0, 12));
        jRadioButton5.setForeground(new java.awt.Color(204, 204, 255));
        jRadioButton5.setText("Auroras");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jRadioButton5.setBounds(100, 40, 100, 25);
        jLayeredPane2.add(jRadioButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBounds(20, 60, 210, 90);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eOpciones.setFont(new java.awt.Font("Calibri", 0, 19));
        eOpciones.setForeground(new java.awt.Color(204, 204, 255));
        eOpciones.setText("Opciones:");
        eOpciones.setBounds(30, 20, 140, 20);
        jLayeredPane1.add(eOpciones, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eSalir.setBackground(new java.awt.Color(51, 51, 51));
        eSalir.setFont(new java.awt.Font("Calibri", 1, 14)); 
        eSalir.setForeground(new java.awt.Color(204, 204, 204));
        eSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eSalir.setText("OK");
        eSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        eSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eSalirMouseExited(evt);
            }
        });
        eSalir.setBounds(320, 260, 80, 20);
        jLayeredPane1.add(eSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 255));
        jSeparator1.setBounds(30, 48, 380, 2);
        jLayeredPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen3.jpg"))); 
        eFondo.setBounds(0, 0, 440, 300);
        jLayeredPane1.add(eFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );

        pack();
    }

    public void initElementos() {
        try {
            pt.initTema();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OptionsView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void initIdioma() throws FileNotFoundException{
        String recibe = cfg.cargarCarpeta("/configIdioma.txt");
        int tema = Integer.parseInt(recibe);

        switch (tema){
            case 1: {cfg.setIdioma1(jRadioButton1,
                                    jRadioButton2,
                                    jRadioButton3,
                                    jRadioButton4,
                                    jRadioButton5,
                                    jRadioButton6,
                                    jRadioButton7,
                                    jRadioButton8,
                                    eOpciones,
                                    eSalir,
                                    jLayeredPane2,
                                    jLayeredPane3); break;}
            case 2: {cfg.setIdioma2(jRadioButton1,
                                    jRadioButton2,
                                    jRadioButton3,
                                    jRadioButton4,
                                    jRadioButton5,
                                    jRadioButton6,
                                    jRadioButton7,
                                    jRadioButton8,
                                    eOpciones,
                                    eSalir,
                                    jLayeredPane2,
                                    jLayeredPane3); break;}
            case 3: {cfg.setIdioma3(jRadioButton1,
                                    jRadioButton2,
                                    jRadioButton3,
                                    jRadioButton4,
                                    jRadioButton5,
                                    jRadioButton6,
                                    jRadioButton7,
                                    jRadioButton8,
                                    eOpciones,
                                    eSalir,
                                    jLayeredPane2,
                                    jLayeredPane3); break;}
            default: {System.out.println("No cargo ningun tema");}
        }
    }
    
    
    private void eSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eSalirMouseEntered
        eSalir.setBackground(new java.awt.Color(204, 204, 255));
    }//GEN-LAST:event_eSalirMouseEntered
    private void eSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eSalirMouseExited
        eSalir.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_eSalirMouseExited
    private void eSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eSalirMouseClicked
        
        if(jRadioButton1.isSelected()== true ){
        cfg.setTemaDefault(pt.getLista(),pt.getTitulo(),pt.getTiempo(),pt.getFondo(),pt.getSlider());
        }
        
        if(jRadioButton2.isSelected()== true ){  
        cfg.setTema2(pt.getLista(),pt.getTitulo(),pt.getTiempo(),pt.getFondo(),pt.getSlider());
        }
        
        if(jRadioButton3.isSelected()== true ){
        cfg.setTema3(pt.getLista(),pt.getTitulo(),pt.getTiempo(),pt.getFondo(),pt.getSlider());
        }
        
        if(jRadioButton4.isSelected()== true ){
        cfg.setTema4(pt.getLista(),pt.getTitulo(),pt.getTiempo(),pt.getFondo(),pt.getSlider());
        }
        
        if(jRadioButton5.isSelected()== true ){
        cfg.setTema5(pt.getLista(),pt.getTitulo(),pt.getTiempo(),pt.getFondo(),pt.getSlider());
        }

        if(jRadioButton6.isSelected()== true ){
            cfg.registrarArchivo("1", "configIdioma.txt");
            JOptionPane.showMessageDialog( null, "¡Hecho!   Ahora reinicie el reproductor\n   para aplicar los cambios","Hecho!!",JOptionPane.INFORMATION_MESSAGE);
           }
        if(jRadioButton7.isSelected()== true ){
            JOptionPane.showMessageDialog( null, "¡Done!   Now restart the music player\n   to apply changes","Done!!",JOptionPane.INFORMATION_MESSAGE);
            cfg.registrarArchivo("2", "configIdioma.txt");
           }
        if(jRadioButton8.isSelected()== true ){
            JOptionPane.showMessageDialog( null, "¡Готово! Теперь перезагрузите плеер\n  чтобы применить изменения","Готово!!",JOptionPane.INFORMATION_MESSAGE);
            cfg.registrarArchivo("3", "configIdioma.txt");
           }

        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        dispose();
    }//GEN-LAST:event_eSalirMouseClicked
    
        private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
        }//GEN-LAST:event_jRadioButton1ActionPerformed
        private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
            jRadioButton3.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
        }//GEN-LAST:event_jRadioButton2ActionPerformed
        private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton5.setSelected(false);
        }//GEN-LAST:event_jRadioButton3ActionPerformed
        private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton5.setSelected(false);
        }//GEN-LAST:event_jRadioButton4ActionPerformed
        private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
            jRadioButton3.setSelected(false);
        }//GEN-LAST:event_jRadioButton5ActionPerformed

        private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
            jRadioButton8.setSelected(false);
            jRadioButton7.setSelected(false);
        }//GEN-LAST:event_jRadioButton6ActionPerformed

        private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
            jRadioButton8.setSelected(false);
            jRadioButton6.setSelected(false);
        }//GEN-LAST:event_jRadioButton7ActionPerformed

        private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
            jRadioButton6.setSelected(false);
            jRadioButton7.setSelected(false);
        }//GEN-LAST:event_jRadioButton8ActionPerformed
        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                OptionsView dialog = new OptionsView(new javax.swing.JFrame(), true, pt);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eFondo;
    private javax.swing.JLabel eOpciones;
    private javax.swing.JLabel eSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables

}

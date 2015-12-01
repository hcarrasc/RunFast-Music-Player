package cl.hcarrasco.RunFastMusicPlayer;

import java.io.IOException;

/**
 *
 * @author HCarrasc
 */
public class AboutView extends javax.swing.JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AboutView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(400, 50);
    }

    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        nombre = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        web = new javax.swing.JLabel();
        web1 = new javax.swing.JLabel();
        web2 = new javax.swing.JLabel();
        web3 = new javax.swing.JLabel();
        web4 = new javax.swing.JLabel();
        web5 = new javax.swing.JLabel();
        autor2 = new javax.swing.JLabel();
        imagen_yo = new javax.swing.JLabel();
        runfast_icon = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Autor...");
        setIconImage(null);
        setResizable(false);

        panel.setBackground(new java.awt.Color(0, 0, 0));

        nombre.setFont(new java.awt.Font("Calibri", 0, 29)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("RunFast !!");
        nombre.setBounds(330, 180, 150, 30);
        panel.add(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        autor.setFont(new java.awt.Font("Calibri", 3, 12));
        autor.setForeground(new java.awt.Color(255, 255, 255));
        autor.setText("Héctor Carrasco Burgos");
        autor.setBounds(160, 20, 160, 16);
        panel.add(autor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        web.setFont(new java.awt.Font("Calibri", 3, 12));
        web.setForeground(new java.awt.Color(255, 255, 255));
        web.setText("http://www.hcarrasco.tk");
        web.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        web.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webMouseClicked(evt);
            }
        });
        web.setBounds(160, 40, 170, 16);
        panel.add(web, javax.swing.JLayeredPane.DEFAULT_LAYER);

        web1.setFont(new java.awt.Font("Calibri", 3, 12));
        web1.setForeground(new java.awt.Color(255, 255, 255));
        web1.setText("Java Media Framework");
        web1.setBounds(270, 270, 170, 20);
        panel.add(web1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        web2.setFont(new java.awt.Font("Calibri", 3, 12));
        web2.setForeground(new java.awt.Color(255, 255, 255));
        web2.setText("http://www.facebook.com/hcarrasc");
        web2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        web2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                web2MouseClicked(evt);
            }
        });
        web2.setBounds(160, 60, 190, 16);
        panel.add(web2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        web3.setFont(new java.awt.Font("Calibri", 3, 12));
        web3.setForeground(new java.awt.Color(204, 204, 204));
        web3.setText("Programado y Diseñado por:");
        web3.setBounds(10, 20, 170, 16);
        panel.add(web3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        web4.setFont(new java.awt.Font("Calibri", 3, 12));
        web4.setForeground(new java.awt.Color(255, 255, 255));
        web4.setText("- Programado en tecnología JAVA SE");
        web4.setBounds(260, 240, 190, 16);
        panel.add(web4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        web5.setFont(new java.awt.Font("Calibri", 3, 12));
        web5.setForeground(new java.awt.Color(255, 255, 255));
        web5.setText("- Reproduce MP3 bajo la tecnología ");
        web5.setBounds(260, 260, 190, 16);
        panel.add(web5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        autor2.setFont(new java.awt.Font("Calibri", 3, 12));
        autor2.setForeground(new java.awt.Color(204, 204, 204));
        autor2.setText("Sitio Web:");
        autor2.setBounds(100, 40, 60, 16);
        panel.add(autor2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        imagen_yo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/S63031555555.jpg"))); // NOI18N
        imagen_yo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imagen_yo.setBounds(30, 80, 180, 220);
        panel.add(imagen_yo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        runfast_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RFg.png"))); // NOI18N
        runfast_icon.setBounds(260, 10, 210, 220);
        panel.add(runfast_icon, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoTop5.jpg"))); // NOI18N
        fondo.setBounds(0, 0, 480, 320);
        panel.add(fondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void webMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webMouseClicked
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"http://www.hcarrasco.cl/");
        } catch (IOException ex) {System.out.println("eras code 1234567");}
    }//GEN-LAST:event_webMouseClicked

    private void web2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_web2MouseClicked
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://www.facebook.com/hcarrasc");
        } catch (IOException ex) {System.out.println("eras code 1234567");}
    }//GEN-LAST:event_web2MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AboutView dialog = new AboutView(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel autor;
    private javax.swing.JLabel autor2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel imagen_yo;
    private javax.swing.JLabel nombre;
    private javax.swing.JLayeredPane panel;
    private javax.swing.JLabel runfast_icon;
    private javax.swing.JLabel web;
    private javax.swing.JLabel web1;
    private javax.swing.JLabel web2;
    private javax.swing.JLabel web3;
    private javax.swing.JLabel web4;
    private javax.swing.JLabel web5;
    // End of variables declaration//GEN-END:variables

}

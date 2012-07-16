
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.Time;
import javax.swing.JFrame;


public class Top5 extends javax.swing.JDialog {

    String[] masRep = new String[5];
    configuracion cfg = new configuracion();
    pantalla pt = new pantalla();
    /* Creates new form Top5 */
    
    public Top5(java.awt.Frame parent, boolean modal,pantalla aThis) {
        super(parent, modal);
        initComponents();
        this.pt = aThis;
        try {
            masRep = establecerTop5(cfg.leerHistorial());
            } catch (FileNotFoundException ex) {
            Logger.getLogger(Top5.class.getName()).log(Level.SEVERE, null, ex);
        }
        initLabelsNames();
    }

    private Top5(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


    public void initLabelsNames(){
        
        System.out.println(masRep[0]);
        System.out.println(masRep[1]);
        System.out.println(masRep[2]);
        System.out.println(masRep[3]);
        System.out.println(masRep[4]);
        
        if(masRep[0]!=null){
            File archivo1 = new File(masRep[0]);
            eTop1.setText(archivo1.getName());
        }
        if(masRep[1]!=null){
            File archivo2 = new File(masRep[1]);
            eTop2.setText(archivo2.getName());
        }
        if(masRep[2]!=null){
            File archivo3 = new File(masRep[2]);
            eTop3.setText(archivo3.getName());
        }
        if(masRep[3]!=null){
            File archivo4 = new File(masRep[3]);
            eTop4.setText(archivo4.getName());
        }
        if(masRep[4]!=null){
            File archivo5 = new File(masRep[4]);
            eTop5.setText(archivo5.getName());
        }
      
    }

    public String[] establecerTop5( String[] historial){
        String[] masEscuchados = new String[5];
        int posUNO = 0;
        int posDOS = 0;
        int posTRES= 0;
        int posCUATRO = 0;
        int posCINCO  = 0;
        int ACTUAL = 0;

        for(int i = 0; i<historial.length; i++){
            if (historial[i] == null) break;
            for(int k = 0; k<historial.length ; k++){

                if (historial[i].equals(historial[k])){
                    System.out.println(ACTUAL);
                    ACTUAL+=1;
                }
            }
            
                if(ACTUAL>posUNO){
                    if(ACTUAL>posDOS){
                        if(ACTUAL>posTRES){
                            if(ACTUAL>posCUATRO){
                                if(ACTUAL>posCINCO){
                                    posCINCO = ACTUAL;
                                    masEscuchados[4] = historial[i];
                                }
                            }
                        }
                    }
                }
                if(ACTUAL>posUNO){
                    if(ACTUAL>posDOS){
                        if(ACTUAL>posTRES){
                            if(ACTUAL>posCUATRO){
                                if(ACTUAL<posCINCO){
                                    posCUATRO = ACTUAL;
                                    masEscuchados[3] = historial[i];
                                }
                            }
                        }
                    }
                }
                if(ACTUAL>posUNO){
                    if(ACTUAL>posDOS){
                        if(ACTUAL>posTRES){
                            if(ACTUAL<posCUATRO){
                                    posTRES = ACTUAL;
                                    masEscuchados[2] = historial[i];
                            }
                        }
                    }
                }
                if(ACTUAL>posUNO){
                    if(ACTUAL>posDOS){
                        if(ACTUAL<posTRES){
                                    posDOS = ACTUAL;
                                    masEscuchados[1] = historial[i];
                        }
                    }
                }

                if(ACTUAL>posUNO){
                    if(ACTUAL<posDOS){
                                    posUNO = ACTUAL;
                                    masEscuchados[0] = historial[i];
                    }
                }
                ACTUAL = 0;
        }

        return masEscuchados;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        eTop5 = new javax.swing.JLabel();
        eTop4 = new javax.swing.JLabel();
        eTop3 = new javax.swing.JLabel();
        eTop2 = new javax.swing.JLabel();
        eTop1 = new javax.swing.JLabel();
        eCuadreo = new javax.swing.JLabel();
        eFondoTop5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sugeridos !!");

        eTop5.setBackground(new java.awt.Color(204, 204, 255));
        eTop5.setFont(new java.awt.Font("Segoe UI", 0, 12));
        eTop5.setForeground(new java.awt.Color(153, 153, 153));
        eTop5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        eTop5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eTop5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eTop5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eTop5MouseExited(evt);
            }
        });
        eTop5.setBounds(40, 40, 260, 20);
        jLayeredPane1.add(eTop5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eTop4.setFont(new java.awt.Font("Segoe UI", 0, 12));
        eTop4.setForeground(new java.awt.Color(51, 51, 51));
        eTop4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        eTop4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eTop4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eTop4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eTop4MouseExited(evt);
            }
        });
        eTop4.setBounds(70, 140, 260, 20);
        jLayeredPane1.add(eTop4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eTop3.setFont(new java.awt.Font("Segoe UI", 0, 12));
        eTop3.setForeground(new java.awt.Color(51, 51, 51));
        eTop3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eTop3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eTop3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eTop3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eTop3MouseExited(evt);
            }
        });
        eTop3.setBounds(10, 80, 250, 20);
        jLayeredPane1.add(eTop3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eTop2.setFont(new java.awt.Font("Segoe UI", 0, 12));
        eTop2.setForeground(new java.awt.Color(153, 153, 153));
        eTop2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eTop2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eTop2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eTop2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eTop2MouseExited(evt);
            }
        });
        eTop2.setBounds(70, 170, 260, 20);
        jLayeredPane1.add(eTop2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eTop1.setFont(new java.awt.Font("Segoe UI", 0, 12));
        eTop1.setForeground(new java.awt.Color(204, 204, 204));
        eTop1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eTop1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eTop1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eTop1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eTop1MouseExited(evt);
            }
        });
        eTop1.setBounds(50, 200, 280, 20);
        jLayeredPane1.add(eTop1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eCuadreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        eCuadreo.setBounds(20, 10, 310, 250);
        jLayeredPane1.add(eCuadreo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eFondoTop5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoTop5.jpg"))); // NOI18N
        eFondoTop5.setBounds(0, 0, 360, 270);
        jLayeredPane1.add(eFondoTop5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eTop5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop5MouseClicked

        File archivo5 = new File(masRep[4].toString());
        pt.ruta= archivo5.getPath();
        float correr = 0;
        Time correr2 = new Time(correr);
        pt.run = pt.player.cargar(archivo5.getPath(),pt.run);
        pt.player.correr(correr2);
        pt.player.slider(pt.getSlider(), pt.getTiempo());
        pt.player.tiempoTotal(pt.getTiempoTotal());
        StringClean borrador = new StringClean();
        pt.getTitulo().setText(borrador.sustituir(archivo5.getName(),".mp3","", 1));
        pt.nombreTrack[pt.contador] = archivo5;
        pt.contador++;
        // Se registra en el historial el MP3 a reproducir
        cfg.escribiHistorial(archivo5.getPath());
        pt.initCaratula(archivo5.getPath());
        pt.player.p.getGainControl().setLevel((float) pt.indiceVolumen );
    }//GEN-LAST:event_eTop5MouseClicked

    private void eTop4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop4MouseClicked
        File archivo4 = new File(masRep[3].toString());
        pt.ruta= archivo4.getPath();
        float correr = 0;
        Time correr2 = new Time(correr);
        pt.run = pt.player.cargar(archivo4.getPath(),pt.run);
        pt.player.correr(correr2);
        pt.player.slider(pt.getSlider(), pt.getTiempo());
        pt.player.tiempoTotal(pt.getTiempoTotal());
        StringClean borrador = new StringClean();
        pt.getTitulo().setText(borrador.sustituir(archivo4.getName(),".mp3","", 1));
        pt.nombreTrack[pt.contador] = archivo4;
        pt.contador++;
        // Se registra en el historial el MP3 a reproducir
        cfg.escribiHistorial(archivo4.getPath());
        pt.initCaratula(archivo4.getPath());
        pt.player.p.getGainControl().setLevel((float) pt.indiceVolumen );
    }//GEN-LAST:event_eTop4MouseClicked

    private void eTop3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop3MouseClicked
        File archivo3 = new File(masRep[2].toString());
        pt.ruta= archivo3.getPath();
        float correr = 0;
        Time correr2 = new Time(correr);
        pt.run = pt.player.cargar(archivo3.getPath(),pt.run);
        pt.player.correr(correr2);
        pt.player.slider(pt.getSlider(), pt.getTiempo());
        pt.player.tiempoTotal(pt.getTiempoTotal());
        StringClean borrador = new StringClean();
        pt.getTitulo().setText(borrador.sustituir(archivo3.getName(),".mp3","", 1));
        pt.nombreTrack[pt.contador] = archivo3;
        pt.contador++;
        // Se registra en el historial el MP3 a reproducir
        cfg.escribiHistorial(archivo3.getPath());
        pt.initCaratula(archivo3.getPath());
        pt.player.p.getGainControl().setLevel((float) pt.indiceVolumen );
    }//GEN-LAST:event_eTop3MouseClicked

    private void eTop1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop1MouseClicked
        File archivo1 = new File(masRep[0].toString());
        pt.ruta= archivo1.getPath();
        float correr = 0;
        Time correr2 = new Time(correr);
        pt.run = pt.player.cargar(archivo1.getPath(),pt.run);
        pt.player.correr(correr2);
        pt.player.slider(pt.getSlider(), pt.getTiempo());
        pt.player.tiempoTotal(pt.getTiempoTotal());
        StringClean borrador = new StringClean();
        pt.getTitulo().setText(borrador.sustituir(archivo1.getName(),".mp3","", 1));
        pt.nombreTrack[pt.contador] = archivo1;
        pt.contador++;
        // Se registra en el historial el MP3 a reproducir
        cfg.escribiHistorial(archivo1.getPath());
        pt.initCaratula(archivo1.getPath());
        pt.player.p.getGainControl().setLevel((float) pt.indiceVolumen );
    }//GEN-LAST:event_eTop1MouseClicked

    private void eTop2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop2MouseClicked
        File archivo2 = new File(masRep[1].toString());
        pt.ruta= archivo2.getPath();
        float correr = 0;
        Time correr2 = new Time(correr);
        pt.run = pt.player.cargar(archivo2.getPath(),pt.run);
        pt.player.correr(correr2);
        pt.player.slider(pt.getSlider(), pt.getTiempo());
        pt.player.tiempoTotal(pt.getTiempoTotal());
        StringClean borrador = new StringClean();
        pt.getTitulo().setText(borrador.sustituir(archivo2.getName(),".mp3","", 1));
        pt.nombreTrack[pt.contador] = archivo2;
        pt.contador++;
        // Se registra en el historial el MP3 a reproducir
        cfg.escribiHistorial(archivo2.getPath());
        pt.initCaratula(archivo2.getPath());
        pt.player.p.getGainControl().setLevel((float) pt.indiceVolumen );
    }//GEN-LAST:event_eTop2MouseClicked

    private void eTop5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop5MouseEntered
        eTop5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13));
    }//GEN-LAST:event_eTop5MouseEntered

    private void eTop5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop5MouseExited
        eTop5.setFont(new java.awt.Font("Segoe UI", 0, 12));
    }//GEN-LAST:event_eTop5MouseExited

    private void eTop4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop4MouseEntered
        eTop4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13));
    }//GEN-LAST:event_eTop4MouseEntered

    private void eTop4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop4MouseExited
        eTop4.setFont(new java.awt.Font("Segoe UI", 0, 12));
    }//GEN-LAST:event_eTop4MouseExited

    private void eTop3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop3MouseEntered
        eTop3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13));
    }//GEN-LAST:event_eTop3MouseEntered

    private void eTop3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop3MouseExited
        eTop3.setFont(new java.awt.Font("Segoe UI", 0, 12));
    }//GEN-LAST:event_eTop3MouseExited

    private void eTop2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop2MouseEntered
        eTop2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13));
    }//GEN-LAST:event_eTop2MouseEntered

    private void eTop2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop2MouseExited
        eTop2.setFont(new java.awt.Font("Segoe UI", 0, 12));
    }//GEN-LAST:event_eTop2MouseExited

    private void eTop1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop1MouseEntered
        eTop1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13));
    }//GEN-LAST:event_eTop1MouseEntered

    private void eTop1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop1MouseExited
        eTop1.setFont(new java.awt.Font("Segoe UI", 0, 12));
    }//GEN-LAST:event_eTop1MouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Top5 dialog = new Top5(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel eCuadreo;
    private javax.swing.JLabel eFondoTop5;
    private javax.swing.JLabel eTop1;
    private javax.swing.JLabel eTop2;
    private javax.swing.JLabel eTop3;
    private javax.swing.JLabel eTop4;
    private javax.swing.JLabel eTop5;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables

}

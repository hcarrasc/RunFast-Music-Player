
/**
 * Agrega un icono a la bandeja del sistema
 * @author HCarrasc
 */

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import javax.swing.*;

public class BANDEJA {

    static pantalla p = new pantalla();

    public BANDEJA( pantalla ptlla){

        p = ptlla;
    }

    public static void GUI(){
        // Chequeo de soporte de bandeja de sistema
        if(!SystemTray.isSupported()){
            System.out.println("RunFast ERROR: SystemTray is not supported");
            return;
        }

        // Crea el Popup
        final PopupMenu mainMenu = new PopupMenu();
        final  TrayIcon  iconoBandeja =
                new TrayIcon( createImage("imagenes/bandejaIcon.png","RunFast! Icon"));

        final SystemTray tray = SystemTray.getSystemTray();



        // Crea los componentes del Popup

        MenuItem autor = new MenuItem("Autor");
        Menu menuE = new Menu("Reproducción");
        MenuItem Reproducir = new MenuItem("Reproducir");
        MenuItem siguiente = new MenuItem("Siguiente");
        MenuItem anterior = new MenuItem("Anterior");
        MenuItem detener = new MenuItem("Detener");
        CheckboxMenuItem cb1 = new CheckboxMenuItem("Siempre Visible");
        CheckboxMenuItem cb2 = new CheckboxMenuItem("Repetir Canción");
        MenuItem exit = new MenuItem("Cerrar");

        // Agrega los componentes al Popup

        mainMenu.add(autor);
        mainMenu.addSeparator();
        mainMenu.add(menuE);
        menuE.add(Reproducir);
        menuE.add(siguiente);
        menuE.add(anterior);
        menuE.add(detener);
        mainMenu.addSeparator();
        mainMenu.add(cb1);
        mainMenu.add(cb2);
        mainMenu.addSeparator();
        mainMenu.add(exit);

        // Establece al icono de bandeja el PopupMenu

        iconoBandeja.setPopupMenu(mainMenu);

        // Establece caracteristicas

        iconoBandeja.setToolTip("RunFast!\nby Hector Carrasco  ");
        iconoBandeja.setImageAutoSize(true);
        try {
            tray.add(iconoBandeja);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
            return;
        }

        // Establece Acciones al Menu

        iconoBandeja.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                iconoBandeja.displayMessage("RunFast !!",
            "Version 1.2\nProgramado por Hector Carrasco\n"
                        + "mas info en: http://www.hcarrasco.tk     ", TrayIcon.MessageType.INFO);
            }
        });

        autor.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
                autor yo = new autor (new javax.swing.JFrame(), true);
                yo.setVisible(true);
           }
        });

         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuItem item = (MenuItem)e.getSource();
                //TrayIcon.MessageType type = null;
                System.out.println(item.getLabel());

                if ("Reproducir".equals(item.getLabel())) {
                    p.play();

                } else if ("Siguiente".equals(item.getLabel())) {
                    p.siguiente();

                } else if ("Anterior".equals(item.getLabel())) {
                    p.anterior();


                } else if ("Detener".equals(item.getLabel())) {
                    p.detener();
                    iconoBandeja.displayMessage("RunFast !!",
                            "Se ha detenido la reproducción\nPara continuar Presione 'Reproducir'", TrayIcon.MessageType.INFO);
                }
            }
        };

        Reproducir.addActionListener(listener);
        anterior.addActionListener(listener);
        siguiente.addActionListener(listener);
        detener.addActionListener(listener);

        cb1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int cb1Id = e.getStateChange();
                if (cb1Id == ItemEvent.SELECTED){
                    p.setAlwaysOnTop(true);
                } else {
                    p.setAlwaysOnTop(false);
                }
            }
        });

        cb2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int cb1Id = e.getStateChange();
                if (cb1Id == ItemEvent.SELECTED){
                   p.repetir();
                } else {
                   p.repetir();
                }
            }
        });

        exit.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               tray.remove(iconoBandeja);
               System.exit(0);
           }
        });
    }

        // Obtiene la direccion de la Imagen

       protected static Image createImage(String ruta, String descripcion){
            URL imageURL = BANDEJA.class.getResource(ruta);

            if (imageURL == null) {
                System.err.println("Resource not found: " + ruta);
                return null;
            } else {
                return (new ImageIcon(imageURL, descripcion)).getImage();
            }
        }

       // Actuliza el nombre del Track en el ToolTip

       public static void setTrackName(String track, TrayIcon  iconoBandeja1){

           iconoBandeja1.setToolTip("RunFast!\nby Hector Carrasco\nREPRODUCIENDO:\n\n"+track);
       }
       
}
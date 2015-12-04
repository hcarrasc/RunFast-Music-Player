package cl.hcarrasco.RunFastMusicPlayer;

import java.awt.MediaTracker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.media.Time;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainAppView extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
    public float indiceVolumen = (float) 0.2;
    public int contador        = 0;
    public boolean run         = false;
    public boolean runPause    = true ;
    public boolean repiteTrack = false;

    //SystemTrayActions systemTrayActions    = new SystemTrayActions(this);
    DirectoryManager direct = new DirectoryManager();
    Configs cfg  = new Configs();
    File[] nombreTrack = new File[100];
    Mp3Manager player       = new Mp3Manager(this);

    String idioma = "";
    Time pausa;
    String ruta;
    
    // Constructor de la clase MainAppView
    public MainAppView() {

        initComponents();
        // Se intenta llenar el jList con archivos mp3, cargando una carpeta con mp3
        try { initJlist(); } catch (FileNotFoundException ex)
          /* Si falla dicho proceso, es porque el programa se ejecuta por primera vez
           * y el archivo que contiene la ruta de acceso a la carpeta con mp3 no se ha
           * creado, por lo tanto se le solicita al usuario, mediante un mensaje por medio
           * de la etiqueta "eTitulo" que carge una carpeta desde el sistema
           */
        { System.out.println("No existe carpeta");
          eTitulo.setText("No existe Carpeta con Mp3's, Carge una!, click en cargar");}

        // Se intenta abrir la Configs de Temas visuales
        try { initTema();  } catch (FileNotFoundException ex)

          /* Si falla la carga del archivo que contiene la
           Configs de los temas visuales
           * entonces el programa establecera un tema visual
           por defecto, llamado "defecto", para
           * ello llama al metodo "setTemaDefault()" del objeto cfg,
           correspondiente a la clase Configs
           */
        { System.out.println("No existe archivo");
          cfg.setTemaDefault(jList1,eTitulo, eTiempo, eFondoFrame, jSlider1);}

        // Se intenta abrir la Configs de idioma
        try {initIdioma(); } catch (FileNotFoundException ex)
        {
          /* Si falla la carga del archivo que contiene la Configs de idioma
           * entonces el programa establecera el idioma español como defecto y lo
           * registrara creando un archivo de texto nuevo con dicha Configs
           */
          idioma = "español";
          cfg.registrarArchivo("1", "src/main/resources/configIdioma.txt");
        }
        initCaratula();
        setIconImage();
        this.setLocation(500, 97);
        setPopUpCaratula();

    }

    // Establece el Inicono en la barra de inicio
    public void setIconImage() {
        super.setIconImage(SystemTrayActions.createImage("imagenes/bandejaIcon.png",""));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        verYouTuBe = new javax.swing.JLabel();
        eOpciones = new javax.swing.JLabel();
        eCargar = new javax.swing.JLabel();
        eTop5 = new javax.swing.JLabel();
        ebotonera4 = new javax.swing.JLabel();
        eTiempo2 = new javax.swing.JLabel();
        eTiempo1 = new javax.swing.JLabel();
        eTiempo = new javax.swing.JLabel();
        eTitulo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        eCaratula = new javax.swing.JLabel();
        eVolumen = new javax.swing.JLabel();
        proximo = new javax.swing.JLabel();
        anterior = new javax.swing.JLabel();
        detener = new javax.swing.JLabel();
        repetir = new javax.swing.JLabel();
        eFondoFrame = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RunFast !!                   HCarrasc.");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane1.setOpaque(true);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(16, 16));
        jScrollPane1.setOpaque(false);

        jList1.setBackground(new java.awt.Color(102, 0, 153));
        jList1.setFont(new java.awt.Font("Calibri", 1, 11));
        jList1.setForeground(new java.awt.Color(204, 204, 204));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Selecciona desde aqui tu MP3!" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1PressClick(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jList1PressTecla(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jScrollPane1.setBounds(30, 190, 260, 220);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        verYouTuBe.setFont(new java.awt.Font("Calibri", 0, 14));
        verYouTuBe.setForeground(new java.awt.Color(255, 255, 255));
        verYouTuBe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verYouTuBe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Iconytb.png"))); 
        verYouTuBe.setText("Buscar en");
        verYouTuBe.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        verYouTuBe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verYouTuBeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verYouTuBeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verYouTuBeMouseExited(evt);
            }
        });
        verYouTuBe.setBounds(180, 100, 120, 40);
        jLayeredPane1.add(verYouTuBe, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eOpcionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eOpcionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eOpcionesMouseExited(evt);
            }
        });
        eOpciones.setBounds(110, 430, 90, 20);
        jLayeredPane1.add(eOpciones, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eCargarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eCargarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eCargarMouseExited(evt);
            }
        });
        eCargar.setBounds(20, 430, 90, 20);
        jLayeredPane1.add(eCargar, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        eTop5.setBounds(200, 430, 90, 20);
        jLayeredPane1.add(eTop5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4.png"))); 
        ebotonera4.setBounds(20, 420, 280, 50);
        jLayeredPane1.add(ebotonera4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eTiempo2.setFont(new java.awt.Font("Digital-7", 0, 20));
        eTiempo2.setForeground(new java.awt.Color(255, 255, 255));
        eTiempo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eTiempo2.setText("-");
        eTiempo2.setBounds(150, 30, 10, 30);
        jLayeredPane1.add(eTiempo2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eTiempo1.setFont(new java.awt.Font("Digital-7", 0, 20));
        eTiempo1.setForeground(new java.awt.Color(255, 255, 255));
        eTiempo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eTiempo1.setText("00 : 00");
        eTiempo1.setBounds(170, 30, 60, 30);
        jLayeredPane1.add(eTiempo1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eTiempo.setFont(new java.awt.Font("Digital-7", 0, 36));
        eTiempo.setForeground(new java.awt.Color(255, 255, 255));
        eTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eTiempo.setText("00 : 00");
        eTiempo.setBounds(20, 30, 130, 30);
        jLayeredPane1.add(eTiempo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eTitulo.setBackground(new java.awt.Color(255, 255, 255));
        eTitulo.setFont(new java.awt.Font("Franklin Gothic Book", 0, 13));
        eTitulo.setForeground(new java.awt.Color(255, 255, 255));
        eTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eTitulo.setBounds(10, 10, 300, 20);
        jLayeredPane1.add(eTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox1.setFont(new java.awt.Font("Arial Narrow", 1, 11));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 204));
        jComboBox1.setMaximumRowCount(5);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox1.setSelectedIndex(10);
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.setBounds(250, 70, 40, 20);
        jLayeredPane1.add(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eCaratula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eCaratula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bandejaIcon.png"))); 
        eCaratula.setBounds(30, 70, 110, 110);
        jLayeredPane1.add(eCaratula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eVolumen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eVolumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sound - Copy.png"))); 
        eVolumen.setBounds(220, 65, 30, 30);
        jLayeredPane1.add(eVolumen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        proximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/media-skip-forward.png"))); 
        proximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proximoMouseClicked(evt);
            }
        });
        proximo.setBounds(280, 150, 30, 30);
        jLayeredPane1.add(proximo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/media-skip-backward.png"))); 
        anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anteriorMouseClicked(evt);
            }
        });
        anterior.setBounds(220, 150, 30, 30);
        jLayeredPane1.add(anterior, javax.swing.JLayeredPane.DEFAULT_LAYER);

        detener.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/player_stop.png"))); 
        detener.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detenerMouseClicked(evt);
            }
        });
        detener.setBounds(250, 150, 30, 30);
        jLayeredPane1.add(detener, javax.swing.JLayeredPane.DEFAULT_LAYER);

        repetir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/media-playlist-repeat.png"))); 
        repetir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repetirMouseClicked(evt);
            }
        });
        repetir.setBounds(180, 150, 30, 30);
        jLayeredPane1.add(repetir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        eFondoFrame.setBackground(new java.awt.Color(102, 0, 153));
        eFondoFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); 
        eFondoFrame.setBounds(0, 0, 320, 480);
        jLayeredPane1.add(eFondoFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSlider1.setBackground(new java.awt.Color(0, 0, 0));
        jSlider1.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jSlider1.setForeground(new java.awt.Color(0, 0, 102));
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        jSlider1.setInverted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
            .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
    }

    public javax.swing.JLabel getFondo() {
        return eFondoFrame;
    }

    public javax.swing.JList getLista() {
        return jList1;
    }

    public javax.swing.JSlider getSlider() {
        return jSlider1;
    }

    public javax.swing.JLabel getTitulo() {
        return eTitulo;
    }

    public javax.swing.JLabel getTiempo() {
        return eTiempo;
    }

    public javax.swing.JLabel getTiempoTotal(){
        return eTiempo1;
    }
    // Metodo que inicializa el JList
    private void initJlist() throws FileNotFoundException{

        String[] total = new String[20000];
        String[] grupo = new String[25000];
        int c = 0;
        // Carga la ruta, la lee y la retorna! all in one :D
        File directorio = new File(cfg.cargarCarpeta("/configInicio.txt"));
        total = DirectoryManager.listarDirectorio(directorio,"",grupo,c);
        grupo = direct.filtro(grupo, total, c);
        //System.out.println(grupo[2]);
        jList1.setListData(grupo);

    }
    // Metodo que inicializa el tema visual
    public void initTema() throws FileNotFoundException {
        String recibe = cfg.cargarCarpeta("/ConfigTema.txt");
        int tema = Integer.parseInt(recibe);

        switch (tema){
            case 1: {cfg.setTemaDefault(jList1,eTitulo,eFondoFrame, eFondoFrame, jSlider1); break;}
            case 2: {cfg.setTema2(jList1,eTitulo,eFondoFrame, eFondoFrame, jSlider1); break;}
            case 3: {cfg.setTema3(jList1,eTitulo,eFondoFrame, eFondoFrame, jSlider1); break;}
            case 4: {cfg.setTema4(jList1,eTitulo,eFondoFrame, eFondoFrame, jSlider1); break;}
            case 5: {cfg.setTema5(jList1,eTitulo,eFondoFrame, eFondoFrame, jSlider1); break;}
            default: {System.out.println("No cargo ningun tema");}
        }
    }
    // Metodo que inicializa el idioma a mostrar
    public void initIdioma() throws FileNotFoundException{
        String recibe = cfg.cargarCarpeta("/configIdioma.txt");
        int tema = Integer.parseInt(recibe);

        switch (tema){
            case 1: {
                     idioma = "español";
                     ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4.png")));
                     verYouTuBe.setText("Buscar en ");
                     break;
                    }
            case 2: {
                     idioma = "ingles" ;
                     ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ing 2.png")));
                     verYouTuBe.setText("Search in ");
                     break;
                    }
            case 3: {
                     idioma = "ruso"   ;
                     ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rus4.png")));
                     verYouTuBe.setText("Поиск");
                     break;
                    }
            default: {System.out.println("No cargo ningun idioma");}
        }
    }
    // Establece con una imagen inicial la MainAppView de reproductor
    public void initCaratula(){

        ImageIcon iconoOriginal = new ImageIcon(getClass().getResource("/imagenes/Ilya Soloviev - Universal Universe.jpg"));

        int ancho = 118;
        int alto =  118;
        eCaratula.setIcon(new javax.swing.ImageIcon(iconoOriginal.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
        //String path = System.getProperty("user.dir")+"/Ilya Soloviev - Universal Universe.jpg";
    }

    public void initCaratula(String nCaratula){

        ImageIcon iconoOriginal = new ImageIcon(getClass().getResource("/imagenes/dirCaratulas/"+nCaratula+"jpg"));
        int ancho = 118;
        int alto =  118;
        if (iconoOriginal.getImageLoadStatus() != MediaTracker.COMPLETE) {
            ancho = 130;
            alto =  130;
            iconoOriginal = new ImageIcon(System.getProperty("user.dir")+"/Ilya Soloviev - Universal Universe.jpg");
            if (iconoOriginal!=null){
                eCaratula.setIcon(new javax.swing.ImageIcon(iconoOriginal.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
            }
        }
        else{
        eCaratula.setIcon(new javax.swing.ImageIcon(iconoOriginal.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT)));
        }
    }

    public void repeatTrack(){
        play();
    }

    private void eCargarMouseClicked(java.awt.event.MouseEvent evt) {

        // Declaracion de variables locales
        String path = "";
        String[] total = new String[20000];
        String[] grupo = new String[25000];
        int c = 0;
        // Instanciacion de un selector de DirectoryManager/archivos
        JFileChooser selector = new JFileChooser();
        // Se especifica que solamente se mostraran DirectoryManager
        selector.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = selector.showOpenDialog(selector);
        // Si se ha efectuado la seleccion de un directorio se ejecuta lo sgte:
        if(returnVal == JFileChooser.APPROVE_OPTION) {
                // Almacena la ruta de la carpeta a inspeccionar
                path = selector.getSelectedFile().getPath();
        }

        if(returnVal == JFileChooser.CANCEL_OPTION){
                JOptionPane.showMessageDialog( null, "Necesita Cargar una carpeta que contenga MP3","Mensaje!",
                JOptionPane.INFORMATION_MESSAGE);
                path = "C:\\Users\\3995891\\Music";
        }

        File directorio = new File(path);

        // Se llamado a metodo registrarArchivo(), quien guardara la ruta del directorio seleccionado
        Configs guardar = new Configs();
        guardar.registrarArchivo(path,"ConfigInicio.txt");

        total = DirectoryManager.listarDirectorio(directorio,"",grupo,c);

        // Cargamos el contenido de totalClear a la lista 'jList1'
        jList1.setListData(direct.filtro(grupo,total,c));

    }

    private void eCargarMouseEntered(java.awt.event.MouseEvent evt) {

        // dependiendo del idiome que este configurado, se cargara la etiqueta correspondiente
        if(idioma=="español"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png")));
        }
        if(idioma=="ingles"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ing 1.png")));
        }
        if(idioma=="ruso"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rus1.png")));
        }
    }

    private void eCargarMouseExited(java.awt.event.MouseEvent evt) {
        // dependiendo del idiome que este configurado, se cargara la etiqueta correspondiente
        if(idioma=="español"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4.png")));
        }
        if(idioma=="ingles"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ing 2.png")));
        }
        if(idioma=="ruso"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rus4.png")));
        }
    
    }

    private void eOpcionesMouseEntered(java.awt.event.MouseEvent evt) {
        // dependiendo del idiome que este configurado, se cargara la etiqueta correspondiente
        if(idioma=="español"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png")));
        }
        if(idioma=="ingles"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ing 3.png")));
        }
        if(idioma=="ruso"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rus2.png")));
        }
    }

    private void eOpcionesMouseExited(java.awt.event.MouseEvent evt) {
        // dependiendo del idiome que este configurado, se cargara la etiqueta correspondiente
        if(idioma=="español"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4.png")));
        }
        if(idioma=="ingles"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ing 2.png")));
        }
        if(idioma=="ruso"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rus4.png")));
        }   
    }

    private void eOpcionesMouseClicked(java.awt.event.MouseEvent evt) {

        OptionsView dialog = new OptionsView(new javax.swing.JFrame(), true, this);
        dialog.setVisible(true);

    }

    private void eTop5MouseEntered(java.awt.event.MouseEvent evt) {
        // dependiendo del idiome que este configurado, se cargara la etiqueta correspondiente
        if(idioma=="español"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png")));
        }
        if(idioma=="ingles"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ing 4.png")));
        }
        if(idioma=="ruso"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rus3.png")));
        }
         
    }

    private void eTop5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop5MouseExited
        // dependiendo del idiome que este configurado, se cargara la etiqueta correspondiente
        if(idioma=="español"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4.png")));
        }
        if(idioma=="ingles"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ing 2.png")));
        }
        if(idioma=="ruso"){
            ebotonera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rus4.png")));
        }
        
    }

    private void eTop5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eTop5MouseClicked
        // se crea tipo ventana top 5, el cual hereda desde jDialog y se hace visible
        TopMusicView ventanaTop5 = new TopMusicView(new javax.swing.JFrame(),true, this);
        ventanaTop5.setVisible(true);

    }

    private void jList1PressTecla(java.awt.event.KeyEvent evt) {
        play();
    }

    private void jList1PressClick(java.awt.event.MouseEvent evt) {
        play();
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {

        indiceVolumen = (float) jComboBox1.getSelectedIndex()/10;

        //player.p.getGainControl().setLevel(4);

        if (jComboBox1.getSelectedIndex()==0){
        eVolumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mute.png")));
        }
        else eVolumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sound - Copy.png")));
    }

    private void detenerMouseClicked(java.awt.event.MouseEvent evt) {
        detener();
    }

    private void proximoMouseClicked(java.awt.event.MouseEvent evt) {
        siguiente();
    }

    private void anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anteriorMouseClicked
        anterior();
    }//GEN-LAST:event_anteriorMouseClicked

    private void verYouTuBeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verYouTuBeMouseClicked
        
        File aux = new File(ruta);
        StringClean borrador = new StringClean();
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "
          +"http://www.youtube.com/results?search_query="+borrador.sustituir(aux.getName(),".mp3","", 1)+"&aq=f");
        } catch (IOException ex) {
            System.out.println("no funcionó xD code 1234567");
          }
        
    }//GEN-LAST:event_verYouTuBeMouseClicked

    private void verYouTuBeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verYouTuBeMouseEntered
        verYouTuBe.setFont(new java.awt.Font("Calibri", 0, 16));
    }//GEN-LAST:event_verYouTuBeMouseEntered

    private void verYouTuBeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verYouTuBeMouseExited
        verYouTuBe.setFont(new java.awt.Font("Calibri", 1, 14));
    }//GEN-LAST:event_verYouTuBeMouseExited

    private void repetirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repetirMouseClicked
        
        repetir();


    }//GEN-LAST:event_repetirMouseClicked

    public void siguiente(){
        float correr = 0;
        Time correr2 = new Time(correr);
        StringClean borrador = new StringClean();
        int selected = jList1.getLeadSelectionIndex();
        jList1.setSelectedIndex(selected+1);

        ruta = jList1.getSelectedValue().toString();
        File nuevo = new File(ruta);
        System.out.println(ruta);
        run = player.cargar(ruta,run);
        player.correr(correr2);
        player.slider(jSlider1, eTiempo);
        player.tiempoTotal(eTiempo1);
        eTitulo.setText(borrador.sustituir(nuevo.getName(),".mp3","", 1));
        nombreTrack[contador] = nuevo;
        contador++;
        // Se registra en el historial el MP3 a reproducir
        cfg.escribiHistorial(ruta);
        initCaratula(borrador.sustituir(nuevo.getName(),"mp3","", 1));
        //player.p.getGainControl().setLevel(4);
        //SystemTrayActions.setTrackName(borrador.sustituir(nuevo.getName(),".mp3","", 1), iconoBandeja);
    }

    public void anterior(){
        float correr = 0;
        Time correr2 = new Time(correr);
        StringClean borrador = new StringClean();
        int selected = jList1.getLeadSelectionIndex();
        jList1.setSelectedIndex(selected-1);
        ruta = jList1.getSelectedValue().toString();
        File nuevo = new File(ruta);
        System.out.println(ruta);
        run = player.cargar(ruta,run);
        player.correr(correr2);
        player.slider(jSlider1, eTiempo);
        player.tiempoTotal(eTiempo1);
        eTitulo.setText(borrador.sustituir(nuevo.getName(),".mp3","", 1));
        nombreTrack[contador] = nuevo;
        contador++;
        // Se registra en el historial el MP3 a reproducir
        cfg.escribiHistorial(ruta);
        initCaratula(borrador.sustituir(nuevo.getName(),"mp3","", 1));
        player.p.getGainControl().setLevel(indiceVolumen);
        //SystemTrayActions.setTrackName(borrador.sustituir(nuevo.getName(),".mp3","", 1), iconoBandeja);
    }

    public void repetir(){
        // Si es false actualiza el icono de estado de repeticion y cambia su estado logico
        if(repiteTrack==false){
            repetir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/media-playlist-repeat2.png")));
            repiteTrack = true;
        }
        // sino vuelve a la normalodad el icono de estado y establece su estado a false
        else{
            repetir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/media-playlist-repeat.png")));
            repiteTrack = false;
        }
    }

    public void play(){
        float correr = 0;
        Time correr2 = new Time(correr);
        // se obtiene la ruta del mp3 desde JList
        ruta = jList1.getSelectedValue().toString();
        // se carga la ruta en objeto player que es de tipo miMP3
        run = player.cargar(ruta,run);
        // luego que esta cargada se inicia
        player.correr(correr2);
        // tambien se inicia el contador para el tiempo y el JSlider
        player.slider(jSlider1, eTiempo);
        player.tiempoTotal(eTiempo1);
        // aqui se crea un archivo identico al que se esta reproduciendo
        File nuevo = new File(ruta);
        System.out.println(ruta);
        StringClean borrador = new StringClean();
        // y se le estrae el nombre para establecerlo en la etiqueta eTitulo
        eTitulo.setText(borrador.sustituir(nuevo.getName(),".mp3","", 1));
        nombreTrack[contador] = nuevo;
        contador++;
        // Se registra en el historial el MP3 a reproducir
        cfg.escribiHistorial(ruta);
        // y finalmente el sistema pregunta si existe una caratula en la base de datos para mostrarla
        initCaratula(borrador.sustituir(nuevo.getName(),"mp3","", 1));
        player.p.getGainControl().setLevel(indiceVolumen);
        
    }

    public void detener(){
        player.detener();
        player.temporizador.cancel();
        jSlider1.setValue(0);
        eTiempo.setText("00 : 00");
    }

    private void setPopUpCaratula(){
        JPopupMenu m = new JPopupMenu();
        JMenuItem item1 = new JMenuItem("item 1");
        JMenuItem item2 = new JMenuItem("item 2");
        JMenuItem item3 = new JMenuItem("item 3");

        m.add(item1);
        m.addSeparator();
        m.add(item2);
        m.addSeparator();
        m.add(item3);

        eCaratula.setComponentPopupMenu(m);
    }


    // Funcion main() o punto de acceso
    public static void main(String args[]) {

        try {
           //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        }
    catch (UnsupportedLookAndFeelException ex) {
        } catch (IllegalAccessException ex) {
        } catch (InstantiationException ex) {
        } catch (ClassNotFoundException ex) {
        }

         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
					//SystemTrayActions.GUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAppView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel anterior;
    public javax.swing.JLabel detener;
    public javax.swing.JLabel eCaratula;
    public javax.swing.JLabel eCargar;
    public javax.swing.JLabel eFondoFrame;
    public javax.swing.JLabel eOpciones;
    public javax.swing.JLabel eTiempo;
    public javax.swing.JLabel eTiempo1;
    public javax.swing.JLabel eTiempo2;
    public javax.swing.JLabel eTitulo;
    public javax.swing.JLabel eTop5;
    public javax.swing.JLabel eVolumen;
    public javax.swing.JLabel ebotonera4;
    public javax.swing.JComboBox jComboBox1;
    public javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JList jList1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSlider jSlider1;
    public javax.swing.JLabel proximo;
    public javax.swing.JLabel repetir;
    public javax.swing.JLabel verYouTuBe;
    // End of variables declaration//GEN-END:variables
}

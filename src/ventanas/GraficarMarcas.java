package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class GraficarMarcas extends javax.swing.JFrame {

    String user;
    int[] vector_marcas_cantidad = new int[25];
    String[] vector_marcas_nombre = new String[25];
    int Samsung, Motorola, Xiaomi, Huawei, Apple, Nokia, Alcatel, Sony,
            HTC, ZTE, Lenovo, Acer, Lanix, LG, Blue, Hisense, Zumm,
            Verykool, Dell, Toshiba, HP, Alienware, Brother, Asus, Otros;

    public GraficarMarcas() {
        initComponents();

        user = Login.user;

        //procedimiento para establecer tamaño a nuestra JFrame
        setSize(689, 540);
        setResizable(false);
        setLocationRelativeTo(null);

        //procedimiento para que nuestra ventana principal no se cierre
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.repaint();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select marca, count(marca) as Marcas from equipos group by marca");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int posicion = 0;
                do {
                    vector_marcas_nombre[posicion] = rs.getString(1);
                    vector_marcas_cantidad[posicion] = rs.getInt(2);

                    if (vector_marcas_nombre[posicion].equalsIgnoreCase("Samsung")) {
                        Samsung = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Motorola")) {
                        Motorola = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Xiaomi")) {
                        Xiaomi = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Huawei")) {
                        Huawei = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Apple")) {
                        Apple = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Nokia")) {
                        Nokia = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Alcatel")) {
                        Alcatel = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Sony")) {
                        Sony = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("HTC")) {
                        HTC = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("ZTE")) {
                        ZTE = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Lenovo")) {
                        Lenovo = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Acer")) {
                        Acer = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Lanix")) {
                        Lanix = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("LG")) {
                        LG = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Blue")) {
                        Blue = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Hisense")) {
                        Hisense = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Zumm")) {
                        Zumm = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Verykool")) {
                        Verykool = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Dell")) {
                        Dell = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Thoshiba")) {
                        Toshiba = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("HP")) {
                        HP = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Alienware")) {
                        Alienware = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Brother")) {
                        Brother = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Asus")) {
                        Asus = vector_marcas_cantidad[posicion];

                    } else if (vector_marcas_nombre[posicion].equalsIgnoreCase("Otros")) {
                        Otros = vector_marcas_cantidad[posicion];

                    }
                    posicion++;
                } while (rs.next());

            }

        } catch (SQLException e) {
            System.err.println("Erro en la consulta" + e);
            JOptionPane.showMessageDialog(null, "Error en consultar datos. contacte al administrador. ");
        }
        //invocar el metodo paint para dibujar dentro de nuestro JFRAME
        repaint();
    }

    //Procedimiento para colocar icono en nuestro Jframe
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button_close = new RSMaterialComponent.RSButtonIconOne();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        rSPanelShadow1.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelShadow1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 146, 244), 2));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(23, 146, 244));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gráfica de Marcas");

        Button_close.setBackground(new java.awt.Color(204, 0, 51));
        Button_close.setBackgroundHover(new java.awt.Color(255, 51, 0));
        Button_close.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        Button_close.setPreferredSize(new java.awt.Dimension(30, 30));
        Button_close.setRound(5);
        Button_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(Button_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Button_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Creado por XOFTYSOFT ®");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 464, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(21, 21, 21))
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_Button_closeActionPerformed
    int xx, xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

        xx = evt.getX();
        xy = evt.getY();

    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);

    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficarMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficarMarcas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconOne Button_close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int total_marcas = Samsung + Motorola + Xiaomi + Huawei + Apple + Nokia + Alcatel
                + Sony + HTC + ZTE + Lenovo + Acer + Lanix + LG + Blue + Hisense + Zumm + Verykool
                + Dell + Toshiba + HP + Alienware + Brother + Asus + Otros;

        int grados_samsung = Samsung * 360 / total_marcas;
        int grados_motorola = Motorola * 360 / total_marcas;
        int grados_xiaomi = Xiaomi * 360 / total_marcas;
        int grados_huawei = Huawei * 360 / total_marcas;
        int grados_apple = Apple * 360 / total_marcas;
        int grados_nokia = Nokia * 360 / total_marcas;
        int grados_alcatel = Alcatel * 360 / total_marcas;
        int grados_sony = Sony * 360 / total_marcas;
        int grados_htc = HTC * 360 / total_marcas;
        int grados_zte = ZTE * 360 / total_marcas;
        int grados_lenovo = Lenovo * 360 / total_marcas;
        int grados_acer = Acer * 360 / total_marcas;
        int grados_lanix = Lanix * 360 / total_marcas;
        int grados_lg = LG * 360 / total_marcas;
        int grados_blue = Blue * 360 / total_marcas;
        int grados_Hisense = Zumm * 360 / total_marcas;
        int grados_verykool = Verykool * 360 / total_marcas;
        int grados_dell = Dell * 360 / total_marcas;
        int grados_Toshiba = Toshiba * 360 / total_marcas;
        int grados_HP = HP * 360 / total_marcas;
        int grados_alienware = Alienware * 360 / total_marcas;
        int grados_brother = Brother * 360 / total_marcas;
        int grados_asus = Asus * 360 / total_marcas;
        int grados_otros = Otros * 360 / total_marcas;

        //Marca Samsung
        g.setColor(new Color(175, 175, 197));//Color motado
        g.fillArc(25, 100, 270, 270, 0, grados_samsung);
        g.fillRect(310, 120, 20, 20);
        g.drawString(Samsung + " de Samsung", 340, 135);

        //Marca Motorola
        g.setColor(new Color(0, 255, 0));//Color verde
        g.fillArc(25, 100, 270, 270, grados_samsung, grados_alienware);
        g.fillRect(310, 150, 20, 20);
        g.drawString(Motorola + " de Motorola", 340, 165);

        //Marca Xiaomi
        g.setColor(new Color(0, 255, 255));//Color verde Agua
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware, grados_xiaomi);
        g.fillRect(310, 180, 20, 20);
        g.drawString(Xiaomi + " de Xiaomi", 340, 195);

        //Marca Huawei
        g.setColor(new Color(55, 0, 255));//Color Azul
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi, grados_huawei);
        g.fillRect(310, 210, 20, 20);
        g.drawString(Huawei + " de Huawei", 340, 225);

        //Marca Apple
        g.setColor(new Color(243, 156, 18));//Color naranja Bajo
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei, grados_apple);
        g.fillRect(310, 240, 20, 20);
        g.drawString(Apple + " de Apple", 340, 255);

        //Marca Nokia
        g.setColor(new Color(247, 220, 111));//Color Amarillo
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple, grados_nokia);
        g.fillRect(310, 270, 20, 20);
        g.drawString(Nokia + " de Nokia", 340, 285);

        //Marca Alcatel
        g.setColor(new Color(21, 42, 160));//Color Azul Marino
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia,
                grados_alcatel);
        g.fillRect(310, 300, 20, 20);
        g.drawString(Alcatel + " de Alcatel", 340, 315);

        //Marca Sony
        g.setColor(new Color(215, 96, 0));//Color Naranja
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia,
                grados_sony);
        g.fillRect(310, 330, 20, 20);
        g.drawString(Sony + " de Sony", 340, 345);

        //Marca HTC
        g.setColor(new Color(215, 96, 140));//Color Rosa
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony, grados_htc);
        g.fillRect(430, 120, 20, 20);
        g.drawString(HTC + " de HTC", 460, 135);

        //Marca ZTE
        g.setColor(new Color(215, 196, 25));//Color Amarillo canario
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc, grados_zte);
        g.fillRect(430, 150, 20, 20);
        g.drawString(ZTE + " de ZTE", 460, 165);

        //Marca Lenovo
        g.setColor(new Color(93, 173, 226));//Color Azul Celeste
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte, grados_lenovo);
        g.fillRect(430, 180, 20, 20);
        g.drawString(Lenovo + " de Lenovo", 460, 195);

        //Marca Acer
        g.setColor(new Color(100, 30, 22));//Color Rojo Fuerte
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo, grados_acer);
        g.fillRect(430, 210, 20, 20);
        g.drawString(Acer + " de Acer", 460, 225);

        //Marca Lanix
        g.setColor(new Color(155, 48, 255));//Color purple 1
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo + grados_acer, grados_lanix);
        g.fillRect(430, 240, 20, 20);
        g.drawString(Lanix + " de Lanix", 460, 255);

        //Marca LG
        g.setColor(new Color(30, 144, 255));//Color dodgerblue
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo + grados_acer + grados_lanix, grados_lg);
        g.fillRect(430, 270, 20, 20);
        g.drawString(LG + " de LG", 460, 285);

        //Marca Blue
        g.setColor(new Color(83, 134, 139));//Color turquesa
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo + grados_acer + grados_lanix + grados_lg, grados_blue);
        g.fillRect(430, 300, 20, 20);
        g.drawString(Blue + " de Blue", 460, 315);

        //Marca Hisense
        g.setColor(new Color(0, 255, 127));//Color primavera verde
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo + grados_acer + grados_lanix + grados_lg + grados_blue,
                grados_Hisense);
        g.fillRect(430, 330, 20, 20);
        g.drawString(Hisense + " de Hisense", 460, 345);

        //Marca Verykool
        g.setColor(new Color(0, 104, 139));//Color deepskyblue
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo + grados_acer + grados_lanix + grados_lg + grados_blue
                + grados_Hisense, grados_verykool);
        g.fillRect(550, 120, 20, 20);
        g.drawString(Verykool + " de VeryKool", 580, 135);

        //Marca Dell
        g.setColor(new Color(255, 20, 147));//Color deeppink
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo + grados_acer + grados_lanix + grados_lg + grados_blue
                + grados_Hisense + grados_verykool, grados_dell);
        g.fillRect(550, 150, 20, 20);
        g.drawString(Dell + " de Dell", 580, 165);

        //Marca Toshiba
        g.setColor(new Color(173, 216, 230));//Color LigthBlue
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo + grados_acer + grados_lanix + grados_lg + grados_blue
                + grados_Hisense + grados_verykool + grados_dell, grados_Toshiba);
        g.fillRect(550, 180, 20, 20);
        g.drawString(Toshiba + " de Toshiba", 580, 195);

        //Marca HP
        g.setColor(new Color(32, 178, 170));//Color lightseagreen
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo + grados_acer + grados_lanix + grados_lg + grados_blue
                + grados_Hisense + grados_verykool + grados_dell + grados_Toshiba, grados_HP);
        g.fillRect(550, 210, 20, 20);
        g.drawString(HP + " de HP", 580, 225);

        //Marca Alienware
        g.setColor(new Color(255, 215, 0));//Color Gold
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo + grados_acer + grados_lanix + grados_lg + grados_blue
                + grados_Hisense + grados_verykool + grados_dell + grados_Toshiba + grados_HP, grados_alienware);
        g.fillRect(550, 240, 20, 20);
        g.drawString(Alienware + " de Alienware", 580, 255);

        //Marca Brother
        g.setColor(new Color(119, 136, 153));//Color lightslategrey
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo + grados_acer + grados_lanix + grados_lg + grados_blue
                + grados_Hisense + grados_verykool + grados_dell + grados_Toshiba + grados_HP + grados_alienware, grados_brother);
        g.fillRect(550, 270, 20, 20);
        g.drawString(Brother + " de Brother", 580, 285);

//      
        //Marca Asus
        g.setColor(new Color(221, 160, 221));//Color Plum
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo + grados_acer + grados_lanix + grados_lg + grados_blue
                + grados_Hisense + grados_verykool + grados_dell + grados_Toshiba + grados_HP + grados_alienware + grados_brother,
                grados_asus);
        g.fillRect(550, 300, 20, 20);
        g.drawString(Asus + " de Asus", 580, 315);

        //Marca Otros
        g.setColor(new Color(0, 255, 255));//Color Aqua
        g.fillArc(25, 100, 270, 270, grados_samsung + grados_alienware + grados_xiaomi + grados_huawei + grados_apple + grados_nokia
                + grados_sony + grados_htc + grados_zte + grados_lenovo + grados_acer + grados_lanix + grados_lg + grados_blue
                + grados_Hisense + grados_verykool + grados_dell + grados_Toshiba + grados_HP + grados_alienware + grados_brother
                + grados_asus, grados_otros);
        g.fillRect(550, 330, 20, 20);
        g.drawString(Otros + " de Otros", 580, 345);
    }
}

package ventanas;
import alertas.AlertInformation;
import alertas.AlertSuccess;
import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class RegistarEquipo extends javax.swing.JFrame {
    
     int IDcliente_update = 0;
    String user = "", nom_cliente = "";

    public RegistarEquipo() {
        initComponents();
        user = Login.user;
        IDcliente_update = GestionarClientes.IDcliente_update;
        
                
        setSize(899, 664);
        setResizable(false);
        setLocationRelativeTo(null);
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_cliente from clientes where id_cliente = '" + IDcliente_update + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                nom_cliente = rs.getString("nombre_cliente");
            }

        } catch (SQLException e) {
            System.err.println("Erro al consultar el nombre del cliente.");
        }
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        txt_nombreCliente.setText(nom_cliente);
        
    }
    
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
        Button_cerrar = new RSMaterialComponent.RSButtonIconOne();
        jLabel1 = new javax.swing.JLabel();
        txt_nombreCliente = new rojeru_san.RSMTextFull();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb_tipoequipo = new rojerusan.RSComboMetro();
        jLabel5 = new javax.swing.JLabel();
        cmb_marcas = new rojerusan.RSComboMetro();
        txt_modelo = new rojeru_san.RSMTextFull();
        txt_num_serie = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_observaciones = new javax.swing.JTextPane();
        jButton_Registrar = new rojeru_san.RSButtonRiple();
        jLabel_footer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

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

        Button_cerrar.setBackground(new java.awt.Color(204, 0, 51));
        Button_cerrar.setBackgroundHover(new java.awt.Color(255, 51, 0));
        Button_cerrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        Button_cerrar.setPreferredSize(new java.awt.Dimension(30, 30));
        Button_cerrar.setRound(5);
        Button_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_cerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de equipo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267)
                .addComponent(Button_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Button_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1)
        );

        txt_nombreCliente.setPlaceholder("");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 146, 244));
        jLabel2.setText("Informacion del cliente");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(23, 146, 244));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tipo de equipo");

        cmb_tipoequipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Celulares", "Laptops", "PC", "Pantallas", "Impresoras", "Consolas", "Radios", "TV", "Otros" }));
        cmb_tipoequipo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 146, 244));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Marca");

        cmb_marcas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Samsung", "Motorola", "Xiaomi", "Huawei", "Apple", "Nokia", "Alcatel", "Sony", "HTC", "ZTE", "Lenovo", "Acer", "Lanix", "LG", "Blue", "Hisense", "Zumm", "Verykool", "Dell", "Toshiba", "HP", "Alienware", "Brother", "Asus", "Otros" }));
        cmb_marcas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        txt_modelo.setPlaceholder("Modelo");

        txt_num_serie.setPlaceholder("Numero de serie");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(23, 146, 244));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Daño reportado y Observaciones");

        jTextPane_observaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPane_observaciones.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jTextPane_observaciones);

        jButton_Registrar.setText("Registrar equipo");
        jButton_Registrar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        jButton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarActionPerformed(evt);
            }
        });

        jLabel_footer.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel_footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_footer.setText("Creado por XOFTYSOFT ®");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmb_tipoequipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_marcas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4))
                    .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_num_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_footer)
                        .addGap(338, 338, 338))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21)
                        .addComponent(cmb_tipoequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_marcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(txt_num_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel_footer)
                .addGap(30, 30, 30))
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

    private void jButton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarActionPerformed

            int validacion = 0;
        String tipo_equipo, marca, modelo, num_serie, dia_ingreso, mes_ingreso, annio_ingreso,
                estatus, observaciones;

        tipo_equipo = cmb_tipoequipo.getSelectedItem().toString();
        marca = cmb_marcas.getSelectedItem().toString();
        modelo = txt_modelo.getText().trim();
        num_serie = txt_num_serie.getText().trim();
        observaciones = jTextPane_observaciones.getText();
        estatus = "Nuevo ingreso";

        Calendar calendar = Calendar.getInstance();

        dia_ingreso = Integer.toString(calendar.get(Calendar.DATE));
        mes_ingreso = Integer.toString(calendar.get(Calendar.MONTH));
        annio_ingreso = Integer.toString(calendar.get(Calendar.YEAR));

        if (modelo.equals("")) {
            txt_modelo.setBackground(Color.red);
            validacion++;
        }
        if (num_serie.equals("")) {
            txt_num_serie.setBackground(Color.red);
            validacion++;
        }
        if (observaciones.equals("")) {
            jTextPane_observaciones.setText("Sin Observaciones. ");

        }

        if (validacion == 0) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into equipos values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                pst.setInt(1, 0);
                pst.setInt(2, IDcliente_update);
                pst.setString(3, tipo_equipo);
                pst.setString(4, marca);
                pst.setString(5, modelo);
                pst.setString(6, num_serie);
                pst.setString(7, dia_ingreso);
                pst.setString(8, mes_ingreso);
                pst.setString(9, annio_ingreso);
                pst.setString(10, observaciones);
                pst.setString(11, estatus);
                pst.setString(12, user);
                pst.setString(13, "");
                pst.setString(14, "");

                pst.executeUpdate();
                cn.close();

                txt_nombreCliente.setBackground(Color.green);
                txt_modelo.setBackground(Color.green);
                txt_num_serie.setBackground(Color.green);

                AlertSuccess succes = new AlertSuccess(this, true);
                succes.Succes.setText("REGISTRO EXISTOSO");
                succes.setVisible(true);
                this.dispose();

            } catch (SQLException e) {
                System.err.println("Error en registrar equipo. " + e);
                JOptionPane.showMessageDialog(null, "!!ERROR al registrar equipo!!, contacte al administrador.");
            }

        } else {
            AlertInformation information = new AlertInformation(this, true);
            information.titulo.setText("DEBES DE LLENAR TODOS LOS CAMPOS.");
            information.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton_RegistrarActionPerformed
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

    private void Button_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cerrarActionPerformed
       
        this.dispose();
        
    }//GEN-LAST:event_Button_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistarEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistarEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconOne Button_cerrar;
    private rojerusan.RSComboMetro cmb_marcas;
    private rojerusan.RSComboMetro cmb_tipoequipo;
    private rojeru_san.RSButtonRiple jButton_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane_observaciones;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSMTextFull txt_modelo;
    private rojeru_san.RSMTextFull txt_nombreCliente;
    private rojeru_san.RSMTextFull txt_num_serie;
    // End of variables declaration//GEN-END:variables
}

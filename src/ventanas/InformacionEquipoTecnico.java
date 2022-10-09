package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.util.Calendar;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import alertas.AlertSuccess;
import alertas.AlertInformation;

public class InformacionEquipoTecnico extends javax.swing.JFrame {

    int IDequipo = 0;
    String user = "";

    public InformacionEquipoTecnico() {
        initComponents();

        user = Login.user;
        IDequipo = GestionarEquipos.IDequipo_update;

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from equipos where id_equipo = '" + IDequipo + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                cmb_tipoEquipo.setSelectedItem(rs.getString("tipo_equipo"));
                cmb_Marcas.setSelectedItem(rs.getString("marca"));
                cmb_Estatus.setSelectedItem(rs.getString("estatus"));
                txt_Modelo.setText(rs.getString("modelo"));
                txt_Num_Serie.setText(rs.getString("num_serie"));
                txt_ultima_modificacion.setText(rs.getString("ultima_modificacion"));

                String dia = "", mes = "", annio = "";
                dia = rs.getString("dia_ingreso");
                mes = rs.getString("mes_ingreso");
                annio = rs.getString("annio_ingreso");
                txt_Fecha.setText(dia + " del " + mes + " del " + annio);

                jTextPane_Observaciones.setText(rs.getString("observaciones"));
                jTextPane_ComentariosTecnicos.setText(rs.getString("comentarios_tecnicos"));
                jLabel_revisionTecnicaDe.setText("Comentarios y actualización del tecnico: " + rs.getString("revision_tecnica_de"));
            }

        } catch (Exception e) {
            System.err.println("Error al consultar la informacion del equipo.");
        }

        setSize(986, 760);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

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
        jLabel_Titulo = new javax.swing.JLabel();
        txt_NombreCliente = new rojeru_san.RSMTextFull();
        txt_Modelo = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        cmb_tipoEquipo = new rojerusan.RSComboMetro();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmb_Marcas = new rojerusan.RSComboMetro();
        txt_Num_Serie = new rojeru_san.RSMTextFull();
        txt_ultima_modificacion = new rojeru_san.RSMTextFull();
        jLabel6 = new javax.swing.JLabel();
        txt_Fecha = new rojeru_san.RSMTextFull();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmb_Estatus = new rojerusan.RSComboMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_Observaciones = new javax.swing.JTextPane();
        jLabel_revisionTecnicaDe = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane_ComentariosTecnicos = new javax.swing.JTextPane();
        jButton_Actualizar = new rojeru_san.RSButtonRiple();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        Button_cerrar.setBackground(new java.awt.Color(204, 0, 0));
        Button_cerrar.setBackgroundHover(new java.awt.Color(255, 51, 0));
        Button_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_cerrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        Button_cerrar.setPreferredSize(new java.awt.Dimension(30, 30));
        Button_cerrar.setRound(5);
        Button_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_cerrarActionPerformed(evt);
            }
        });

        jLabel_Titulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Informacion del cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255)
                .addComponent(Button_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Titulo))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txt_NombreCliente.setEnabled(false);
        txt_NombreCliente.setPlaceholder("Nombre del Cliente");

        txt_Modelo.setPlaceholder("Modelo");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_24px.png"))); // NOI18N
        jLabel3.setToolTipText("");

        cmb_tipoEquipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Celulares", "Laptops", "PC", "Pantallas", "Impresoras", "Consolas", "Radios", "TV", "Otros" }));
        cmb_tipoEquipo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(23, 146, 244));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tipo de equipo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 146, 244));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Marca");

        cmb_Marcas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Samsung", "Motorola", "Xiaomi", "Huawei", "Apple", "Nokia", "Alcatel", "Sony Ericsson", "HTC", "ZTE", "Lenovo", "Acer", "Lanix", "LG", "Blue", "Hisense", "Zumm", "Verykool", "Dell", "Toshiba", "HP", "Alienware", "Brother", "Asus", "Otros" }));
        cmb_Marcas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        txt_Num_Serie.setPlaceholder("Numero de serie");

        txt_ultima_modificacion.setEnabled(false);
        txt_ultima_modificacion.setPlaceholder("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(23, 146, 244));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ultima modificacion por:");

        txt_Fecha.setEnabled(false);
        txt_Fecha.setPlaceholder("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(23, 146, 244));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Fecha de ingreso");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(23, 146, 244));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Estatus");

        cmb_Estatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nuevo ingreso", "No reparado", "En revision", "Reparado", "Entregado" }));
        cmb_Estatus.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        jTextPane_Observaciones.setEditable(false);
        jTextPane_Observaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPane_Observaciones.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane_Observaciones);

        jLabel_revisionTecnicaDe.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel_revisionTecnicaDe.setForeground(new java.awt.Color(23, 146, 244));
        jLabel_revisionTecnicaDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_revisionTecnicaDe.setText("Comentarios y actualizacion de tecnico:");

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(23, 146, 244));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Daño reportado y observaciones:");

        jTextPane_ComentariosTecnicos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextPane_ComentariosTecnicos.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(jTextPane_ComentariosTecnicos);

        jButton_Actualizar.setText("Comentar y actualizar");
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Creado por XOFTYSOFT ®");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_tipoEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(cmb_Marcas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Num_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txt_ultima_modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txt_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(txt_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                .addComponent(cmb_Estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_revisionTecnicaDe)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(261, 261, 261)
                                .addComponent(jLabel8)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_Estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cmb_tipoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_Marcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txt_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txt_Num_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ultima_modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel_revisionTecnicaDe)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(26, 26, 26))
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

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed

        String estatus, comentariosTecnicos, tecnico;

        estatus = cmb_Estatus.getSelectedItem().toString();
        comentariosTecnicos = jTextPane_ComentariosTecnicos.getText();
        tecnico = user;

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "update equipos set estatus=?, comentarios_tecnicos=?, revision_tecnica_de=? where id_equipo = '" + IDequipo + "'");

            pst.setString(1, estatus);
            pst.setString(2, comentariosTecnicos);
            pst.setString(3, tecnico);

            pst.executeUpdate();
            cn.close();

            AlertSuccess succes = new AlertSuccess(this, true);
            succes.Succes.setText("ACTUALIZACIÓN EXITOSA");
            succes.setVisible(true);
            this.dispose();

        } catch (SQLException e) {
            System.err.println("Error en actualizr equipo." + e);
            JOptionPane.showMessageDialog(null, "¡¡ERROR al actualizar equipo!!, contacte al administrador.");
        }


    }//GEN-LAST:event_jButton_ActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipoTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionEquipoTecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconOne Button_cerrar;
    private rojerusan.RSComboMetro cmb_Estatus;
    private rojerusan.RSComboMetro cmb_Marcas;
    private rojerusan.RSComboMetro cmb_tipoEquipo;
    private rojeru_san.RSButtonRiple jButton_Actualizar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_revisionTecnicaDe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane_ComentariosTecnicos;
    private javax.swing.JTextPane jTextPane_Observaciones;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSMTextFull txt_Fecha;
    private rojeru_san.RSMTextFull txt_Modelo;
    private rojeru_san.RSMTextFull txt_NombreCliente;
    private rojeru_san.RSMTextFull txt_Num_Serie;
    private rojeru_san.RSMTextFull txt_ultima_modificacion;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txt_NombreCliente.setText("");
        txt_Fecha.setText("");
        txt_Modelo.setText("");
        txt_Num_Serie.setText("");
        jTextPane_Observaciones.setText("");

    }
}

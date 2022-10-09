package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class GraficarEstatus extends javax.swing.JFrame {
    
    String user;
    int NuevoIngreso, NoReparado, EnRevision, Reparado, Entregado;
    
    String[] vector_estatus_nombre = new String[5];
    int[] vector_estatus_cantidad = new int[5];
    
    public GraficarEstatus() {
        initComponents();
        
        user = Login.user;

        //procedimiento para establecer tamaño a nuestra JFrame
        setSize(689, 540);
        setResizable(false);
        setLocationRelativeTo(null);

        //procedimiento para que nuestra ventana principal no se cierre
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        try {
            //procedimiento para obtener la cantidad de equipos que estan asigandos.
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select estatus, count(estatus) as Cantidad from equipos group by estatus");
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                int posicion = 0;
                do {
                    vector_estatus_nombre[posicion] = rs.getString(1);
                    vector_estatus_cantidad[posicion] = rs.getInt(2);
                    
                    if (vector_estatus_nombre[posicion].equalsIgnoreCase("En revision")) {
                        EnRevision = vector_estatus_cantidad[posicion];
                        
                    } else if (vector_estatus_nombre[posicion].equalsIgnoreCase("Entregado")) {
                        Entregado = vector_estatus_cantidad[posicion];
                        
                    } else if (vector_estatus_nombre[posicion].equalsIgnoreCase("No reparado")) {
                        NoReparado = vector_estatus_cantidad[posicion];
                        
                    } else if (vector_estatus_nombre[posicion].equalsIgnoreCase("Nuevo ingreso")) {
                        NuevoIngreso = vector_estatus_cantidad[posicion];
                        
                    } else if (vector_estatus_nombre[posicion].equalsIgnoreCase("Reparado")) {
                        Reparado = vector_estatus_cantidad[posicion];
                    }
                    posicion++;
                } while (rs.next());
                
            }
            
        } catch (Exception e) {
            System.err.println("Error en conectar con la Base de datos.");
            JOptionPane.showMessageDialog(null, "¡¡Error!!, contacte al administrador");
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
        jLabel1.setText("Gráfica de estatus");

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
                .addContainerGap(156, Short.MAX_VALUE)
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficarEstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficarEstatus().setVisible(true);
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

    public int EstatusMasRepetido(int NuevoIngreso, int NoReparado, int EnRevision, int Reparado, int Entregado) {
        if (NuevoIngreso > NoReparado && NuevoIngreso > EnRevision && NuevoIngreso > Reparado && NuevoIngreso > Entregado) {
            return NuevoIngreso;
            
        } else if (NoReparado > EnRevision && NoReparado > Reparado && NoReparado > Entregado) {
            return NoReparado;
            
        } else if (EnRevision > Reparado && EnRevision > Entregado) {
            return EnRevision;
            
        } else if (Reparado > Entregado) {
            return Reparado;
            
        } else {
            return Entregado;
        }
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int Estatus_Mas_Repetido = EstatusMasRepetido(NuevoIngreso, NoReparado, EnRevision, Reparado, Entregado);
        
        int largo_NuevoIngreso = NuevoIngreso * 400 / Estatus_Mas_Repetido;
        int largo_NoReparado = NoReparado * 400 / Estatus_Mas_Repetido;
        int largo_EnRevision = EnRevision * 400 / Estatus_Mas_Repetido;
        int largo_Reparado = Reparado * 400 / Estatus_Mas_Repetido;
        int largo_Entregado = Entregado * 400 / Estatus_Mas_Repetido;
        
        g.setColor(new Color(23, 146, 244));//Azul
        g.fillRect(100, 100, largo_NuevoIngreso, 40);
        g.drawString("Nuevo Ingreso", 10, 118);
        g.drawString("Cantidad:" + NuevoIngreso, 10, 133);
        
        g.setColor(new Color(255, 0, 0));//Rojo
        g.fillRect(100, 150, largo_NoReparado, 40);
        g.drawString("No Reparado", 10, 168);
        g.drawString("Cantidad:" + NoReparado, 10, 183);
        
        g.setColor(new Color(0, 0, 0));//Negro
        g.fillRect(100, 200, largo_EnRevision, 40);
        g.drawString("En Revisión", 10, 218);
        g.drawString("Cantidad:" + EnRevision, 10, 233);
        
        g.setColor(new Color(232, 109, 11));//Naranja
        g.fillRect(100, 250, largo_Reparado, 40);
        g.drawString("Reparado", 10, 268);
        g.drawString("Cantidad:" + Reparado, 10, 283);
        
        g.setColor(new Color(109, 232, 11));//Verde
        g.fillRect(100, 300, largo_Entregado, 40);
        g.drawString("Entregado", 10, 318);
        g.drawString("Cantidad:" + Entregado, 10, 333);
        
    }
}

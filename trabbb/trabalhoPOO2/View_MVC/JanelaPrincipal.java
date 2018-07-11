
package View_MVC;

import javax.swing.JMenuItem;

public class JanelaPrincipal extends javax.swing.JFrame {
  

    public JanelaPrincipal(){
        initComponents(); 
    }

    public JMenuItem getjMenuItem_Atendente() {
        return jMenuItem_Atendente;
    }

    public JMenuItem getjMenuItem_Consulta() {
        return jMenuItem_Consulta;
    }

    public JMenuItem getjMenuItem_HotelBanhoTosa() {
        return jMenuItem_HotelBanhoTosa;
    }

    public JMenuItem getjMenuItem_Vendas() {
        return jMenuItem_Vendas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        desktopPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_Atendente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_Consulta = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_Vendas = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_HotelBanhoTosa = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setSize(new java.awt.Dimension(1000, 500));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        desktopPanel.setPreferredSize(new java.awt.Dimension(1000, 500));

        javax.swing.GroupLayout desktopPanelLayout = new javax.swing.GroupLayout(desktopPanel);
        desktopPanel.setLayout(desktopPanelLayout);
        desktopPanelLayout.setHorizontalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        desktopPanelLayout.setVerticalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));
        jMenuBar1.setBorder(null);

        jMenu1.setText("Funcionalidades");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem_Atendente.setText("Atendente");
        jMenuItem_Atendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AtendenteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Atendente);
        jMenu1.add(jSeparator1);

        jMenuItem_Consulta.setText("Consulta");
        jMenuItem_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Consulta);
        jMenu1.add(jSeparator2);

        jMenuItem_Vendas.setText("Vendas");
        jMenuItem_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_VendasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_Vendas);
        jMenu1.add(jSeparator3);

        jMenuItem_HotelBanhoTosa.setText("Hotel/Banho/Tosa");
        jMenuItem_HotelBanhoTosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_HotelBanhoTosaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_HotelBanhoTosa);
        jMenu1.add(jSeparator4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opções");

        jMenuItem4.setText("Sair");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ConsultaActionPerformed
 
    }//GEN-LAST:event_jMenuItem_ConsultaActionPerformed

    private void jMenuItem_AtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AtendenteActionPerformed
     
    }//GEN-LAST:event_jMenuItem_AtendenteActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_VendasActionPerformed
          
    }//GEN-LAST:event_jMenuItem_VendasActionPerformed

    private void jMenuItem_HotelBanhoTosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_HotelBanhoTosaActionPerformed
     
    }//GEN-LAST:event_jMenuItem_HotelBanhoTosaActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem_Atendente;
    private javax.swing.JMenuItem jMenuItem_Consulta;
    private javax.swing.JMenuItem jMenuItem_HotelBanhoTosa;
    private javax.swing.JMenuItem jMenuItem_Vendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}

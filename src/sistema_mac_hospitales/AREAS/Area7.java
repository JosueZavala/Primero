/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_mac_hospitales.AREAS;

/**
 *
 * @author Alumno
 */
public class Area7 extends javax.swing.JFrame {

    /**
     * Creates new form Area1
     */
    public Area7() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        inventario = new javax.swing.JMenuItem();
        horarios = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        area1 = new javax.swing.JMenuItem();
        area2 = new javax.swing.JMenuItem();
        area3 = new javax.swing.JMenuItem();
        area4 = new javax.swing.JMenuItem();
        area5 = new javax.swing.JMenuItem();
        area6 = new javax.swing.JMenuItem();
        area8 = new javax.swing.JMenuItem();
        area9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AREA 7");
        setResizable(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema_mac_hospitales/mac_ags1.jpg"))); // NOI18N

        b1.setText("SALA 1");

        b2.setText("SALA 2");

        b3.setText("SALA 3");

        b4.setText("SALA 4");

        b5.setText("SALA 5");

        jMenu2.setText("Ver");

        inventario.setText("Inventario");
        jMenu2.add(inventario);

        horarios.setText("Horarios");
        jMenu2.add(horarios);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Áreas");

        area1.setText("Quimioterapia");
        area1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area1ActionPerformed(evt);
            }
        });
        jMenu4.add(area1);

        area2.setText("Tococirugía");
        area2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area2ActionPerformed(evt);
            }
        });
        jMenu4.add(area2);

        area3.setText("Quirófano");
        area3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area3ActionPerformed(evt);
            }
        });
        jMenu4.add(area3);

        area4.setText("Área 4");
        area4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area4ActionPerformed(evt);
            }
        });
        jMenu4.add(area4);

        area5.setText("Área 5");
        area5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area5ActionPerformed(evt);
            }
        });
        jMenu4.add(area5);

        area6.setText("Área 6");
        area6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area6ActionPerformed(evt);
            }
        });
        jMenu4.add(area6);

        area8.setText("Área 8");
        area8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area8ActionPerformed(evt);
            }
        });
        jMenu4.add(area8);

        area9.setText("Área 9");
        area9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area9ActionPerformed(evt);
            }
        });
        jMenu4.add(area9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void area1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area1ActionPerformed
        // TODO add your handling code here:
        Area1 a1 = new Area1();
        a1.setLocationRelativeTo(null);
        a1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_area1ActionPerformed

    private void area2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area2ActionPerformed
        Area2 a2 = new Area2();
        a2.setLocationRelativeTo(null);
        a2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_area2ActionPerformed

    private void area3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area3ActionPerformed
        Area3 a3 = new Area3();
        a3.setLocationRelativeTo(null);
        a3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_area3ActionPerformed

    private void area4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area4ActionPerformed
        Area4 a4 = new Area4();
        a4.setLocationRelativeTo(null);
        a4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_area4ActionPerformed

    private void area5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area5ActionPerformed
        Area5 a5= new Area5();
        a5.setLocationRelativeTo(null);
        a5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_area5ActionPerformed

    private void area6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area6ActionPerformed
        Area6 a6 = new Area6();
        a6.setLocationRelativeTo(null);
        a6.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_area6ActionPerformed

    private void area8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area8ActionPerformed
        Area8 a8 = new Area8();
        a8.setLocationRelativeTo(null);
        a8.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_area8ActionPerformed

    private void area9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area9ActionPerformed
        Area9 a9 = new Area9();
        a9.setLocationRelativeTo(null);
        a9.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_area9ActionPerformed

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
            java.util.logging.Logger.getLogger(Area7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Area7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Area7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Area7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Area7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem area1;
    private javax.swing.JMenuItem area2;
    private javax.swing.JMenuItem area3;
    private javax.swing.JMenuItem area4;
    private javax.swing.JMenuItem area5;
    private javax.swing.JMenuItem area6;
    private javax.swing.JMenuItem area8;
    private javax.swing.JMenuItem area9;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JMenuItem horarios;
    private javax.swing.JMenuItem inventario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

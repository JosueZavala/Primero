package Interfaz;

import javax.swing.JButton;
import sistema_mac_hospitales.AREAS.*;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        quirofano_B = new javax.swing.JButton();
        recuperacion_B = new javax.swing.JButton();
        ceye_B = new javax.swing.JButton();
        uci_B = new javax.swing.JButton();
        tococirugia_B = new javax.swing.JButton();
        ucin_B = new javax.swing.JButton();
        terapiaI_B = new javax.swing.JButton();
        urgencias_B = new javax.swing.JButton();
        hospitalizacion_B = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        guardaEq_B = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        inventario = new javax.swing.JMenuItem();
        horarios = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE MANTENIMIENTO DE EQUIPOS");
        setResizable(false);

        quirofano_B.setText("QUIROFANO");
        quirofano_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quirofano_BActionPerformed(evt);
            }
        });

        recuperacion_B.setText("RECUPERACION");
        recuperacion_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperacion_BActionPerformed(evt);
            }
        });

        ceye_B.setText("CEYE");
        ceye_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceye_BActionPerformed(evt);
            }
        });

        uci_B.setText("UCI");
        uci_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uci_BActionPerformed(evt);
            }
        });

        tococirugia_B.setText("TOCOCIRUGIA");
        tococirugia_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tococirugia_BActionPerformed(evt);
            }
        });

        ucin_B.setText("UCIN");
        ucin_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucin_BActionPerformed(evt);
            }
        });

        terapiaI_B.setText("TERAPIA INTERMEDIA");
        terapiaI_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terapiaI_BActionPerformed(evt);
            }
        });

        urgencias_B.setText("URGENCIAS");
        urgencias_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urgencias_BActionPerformed(evt);
            }
        });

        hospitalizacion_B.setText("HOSPITALIZACION");
        hospitalizacion_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalizacion_BActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/mac_ags1.jpg"))); // NOI18N

        guardaEq_B.setText("GUARDA EQUIPO");
        guardaEq_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardaEq_BActionPerformed(evt);
            }
        });

        jMenu1.setText("Menú");

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ver");

        inventario.setText("Inventario");
        jMenu2.add(inventario);

        horarios.setText("Horarios");
        jMenu2.add(horarios);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(quirofano_B, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recuperacion_B, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ceye_B, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tococirugia_B, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(uci_B, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ucin_B, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(terapiaI_B, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urgencias_B, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardaEq_B, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(hospitalizacion_B, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quirofano_B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recuperacion_B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceye_B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tococirugia_B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uci_B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ucin_B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terapiaI_B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urgencias_B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalizacion_B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(guardaEq_B, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void quirofano_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quirofano_BActionPerformed
        doArea(quirofano_B);
        
        //Dejo esto comentado porque es el codigo sirvio antes de hacer la modificacion con la funcion 
        //Como un backup en caso de que haya algun problema con la funcion doArea
        /*Area quimioterapia=new Area("Tococirugia",17,this);
        quimioterapia.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_quirofano_BActionPerformed

    private void recuperacion_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperacion_BActionPerformed
        doArea(recuperacion_B);
    }//GEN-LAST:event_recuperacion_BActionPerformed

    private void ceye_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceye_BActionPerformed
       doArea(ceye_B);
    }//GEN-LAST:event_ceye_BActionPerformed

    private void tococirugia_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tococirugia_BActionPerformed
        doArea(tococirugia_B);
    }//GEN-LAST:event_tococirugia_BActionPerformed

    private void uci_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uci_BActionPerformed
        doArea(uci_B);
    }//GEN-LAST:event_uci_BActionPerformed

    private void ucin_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucin_BActionPerformed
        doArea(ucin_B);
    }//GEN-LAST:event_ucin_BActionPerformed

    private void terapiaI_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terapiaI_BActionPerformed
        doArea(terapiaI_B);
    }//GEN-LAST:event_terapiaI_BActionPerformed

    private void urgencias_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urgencias_BActionPerformed
        doArea(urgencias_B);
    }//GEN-LAST:event_urgencias_BActionPerformed

    private void hospitalizacion_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalizacion_BActionPerformed
        doArea(hospitalizacion_B);
    }//GEN-LAST:event_hospitalizacion_BActionPerformed

    private void guardaEq_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardaEq_BActionPerformed
        doArea(guardaEq_B);
    }//GEN-LAST:event_guardaEq_BActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }
    
    public void doArea(JButton botonArea){
        String name=botonArea.getText();
        Area area = new Area(name,8,this);
        area.setVisible(true);
        this.setVisible(false);
        /*
            Esta funcion lo que hace es declarar el area con el nombre del boton que la mando llamar y el numero
            de salas que le corresponden, (Este numero se sacara de la base de datos).
        */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ceye_B;
    private javax.swing.JButton guardaEq_B;
    private javax.swing.JMenuItem horarios;
    private javax.swing.JButton hospitalizacion_B;
    private javax.swing.JMenuItem inventario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton quirofano_B;
    private javax.swing.JButton recuperacion_B;
    private javax.swing.JMenuItem salir;
    private javax.swing.JButton terapiaI_B;
    private javax.swing.JButton tococirugia_B;
    private javax.swing.JButton uci_B;
    private javax.swing.JButton ucin_B;
    private javax.swing.JButton urgencias_B;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Alejandro Mir
 */
public class ReservarSede extends javax.swing.JFrame {

    /**
     * Creates new form ReservarSede
     */
    public ReservarSede() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MENU = new javax.swing.JMenuBar();
        MenuPerfil = new javax.swing.JMenu();
        MenuMisTorneos = new javax.swing.JMenu();
        MenuMisTorneos1 = new javax.swing.JMenu();
        MenuMisTorneos2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sede:");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"10:00-11:00", null, null},
                {"11:00-12:00", null, null},
                {"12:00-13:00", null, null},
                {"13:00-14:00", null, null},
                {"17:00-18:00", null, null},
                {"18:00-19:00", null, null},
                {"19:00-20:00", null, null},
                {"20:00-21:00", null, null}
            },
            new String [] {
                "Hora", "Disponibilidad", "Apuntar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        MenuPerfil.setText("PERFIL");
        MenuPerfil.setToolTipText("");
        MenuPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuPerfilMouseClicked(evt);
            }
        });
        MENU.add(MenuPerfil);

        MenuMisTorneos.setText("MIS TORNEOS");
        MenuMisTorneos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMisTorneosMouseClicked(evt);
            }
        });
        MENU.add(MenuMisTorneos);

        MenuMisTorneos1.setText("APUNTARME A UN TORNEO");
        MenuMisTorneos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMisTorneos1MenuApuntarATorneoMouseClicked(evt);
            }
        });
        MENU.add(MenuMisTorneos1);

        MenuMisTorneos2.setText("RESERVAR SEDE");
        MenuMisTorneos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMisTorneos2MenuMisTorneosReservarSedeMouseClicked(evt);
            }
        });
        MENU.add(MenuMisTorneos2);

        setJMenuBar(MENU);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void MenuPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPerfilMouseClicked
        Perfil perfil = new Perfil();
        perfil.setVisible(true);
    }//GEN-LAST:event_MenuPerfilMouseClicked

    private void MenuMisTorneosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMisTorneosMouseClicked
        VentanaInfoTorneo infotorneo = new VentanaInfoTorneo();
        infotorneo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuMisTorneosMouseClicked

    private void MenuMisTorneos1MenuApuntarATorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMisTorneos1MenuApuntarATorneoMouseClicked
        ApuntarTorneo torneo = new ApuntarTorneo();
        torneo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuMisTorneos1MenuApuntarATorneoMouseClicked

    private void MenuMisTorneos2MenuMisTorneosReservarSedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMisTorneos2MenuMisTorneosReservarSedeMouseClicked
        ReservarSede advertenciaregistro = new ReservarSede();
        advertenciaregistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuMisTorneos2MenuMisTorneosReservarSedeMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MENU;
    private javax.swing.JMenu MenuMisTorneos;
    private javax.swing.JMenu MenuMisTorneos1;
    private javax.swing.JMenu MenuMisTorneos2;
    private javax.swing.JMenu MenuPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

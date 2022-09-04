/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author herschelgonzalez
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonAlumnos = new javax.swing.JButton();
        jButtonProductos = new javax.swing.JButton();
        jButtonTrabajadores = new javax.swing.JButton();
        jButtonGrupos = new javax.swing.JButton();
        jButtonCursos = new javax.swing.JButton();
        jButtonEscuelas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setForeground(new java.awt.Color(51, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESCUELA DE MUSICA");

        jButtonAlumnos.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jButtonAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alumno.png"))); // NOI18N
        jButtonAlumnos.setText("Alumnos");
        jButtonAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlumnosActionPerformed(evt);
            }
        });

        jButtonProductos.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jButtonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jButtonProductos.setText("Productos");
        jButtonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductosActionPerformed(evt);
            }
        });

        jButtonTrabajadores.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jButtonTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/docente.png"))); // NOI18N
        jButtonTrabajadores.setText("Trabajadores");
        jButtonTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrabajadoresActionPerformed(evt);
            }
        });
        jButtonTrabajadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonTrabajadoresKeyPressed(evt);
            }
        });

        jButtonGrupos.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jButtonGrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grupo.png"))); // NOI18N
        jButtonGrupos.setText("Grupos");
        jButtonGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGruposActionPerformed(evt);
            }
        });

        jButtonCursos.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jButtonCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/curso.png"))); // NOI18N
        jButtonCursos.setText("Cursos");
        jButtonCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCursosActionPerformed(evt);
            }
        });

        jButtonEscuelas.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jButtonEscuelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escuela.png"))); // NOI18N
        jButtonEscuelas.setText("Escuelas");
        jButtonEscuelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEscuelasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                                .addComponent(jButtonGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEscuelas, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEscuelas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTrabajadoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonTrabajadoresKeyPressed
        // TODO add your handling code here:
        Trabajadores trabajadores = new Trabajadores();
        dispose();
        
    }//GEN-LAST:event_jButtonTrabajadoresKeyPressed

    private void jButtonTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrabajadoresActionPerformed
        // TODO add your handling code here:
        Trabajadores trabajadores = new Trabajadores();
        trabajadores.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonTrabajadoresActionPerformed

    private void jButtonAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlumnosActionPerformed
        // TODO add your handling code here:
        Alumnos alumnos =  new Alumnos();
        alumnos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAlumnosActionPerformed

    private void jButtonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductosActionPerformed
        // TODO add your handling code here:
        Productos productos = new Productos();
        productos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonProductosActionPerformed

    private void jButtonEscuelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEscuelasActionPerformed
        // TODO add your handling code here:
        Escuelas escuelas =  new Escuelas();
        escuelas.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonEscuelasActionPerformed

    private void jButtonGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGruposActionPerformed
        // TODO add your handling code here:
        Grupos grupos =  new Grupos();
        grupos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonGruposActionPerformed

    private void jButtonCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCursosActionPerformed
        // TODO add your handling code here:
        Curso curso = new Curso();
        curso.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCursosActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlumnos;
    private javax.swing.JButton jButtonCursos;
    private javax.swing.JButton jButtonEscuelas;
    private javax.swing.JButton jButtonGrupos;
    private javax.swing.JButton jButtonProductos;
    private javax.swing.JButton jButtonTrabajadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


package liga;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import liga.Lista;

public class ConfigEquipos extends javax.swing.JFrame {

    Lista list = new Lista();
    public int contGlobal = 0;
    private Lista lista_eqp1, lista_partidos;
    private Nodo auxiiar;
    
    public ConfigEquipos() {
        initComponents();
        this.setLocationRelativeTo(null);
        setfondo();
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono3.png")).getImage());

    }
    public void ingresar(){
            int cont = 1; 
        for (int i = 1; i <=contGlobal+1; i++) {
            if (contGlobal != 0) {
            Equipo nuevo_equipo = new Equipo();
                String nombre_eqp = JOptionPane.showInputDialog(null, "Ingrese el nombre del equipo "+cont);
                nuevo_equipo.setNombre(nombre_eqp);
                Nodo nuevo_nodo = new Nodo();
                nuevo_nodo.setEquipo(nuevo_equipo);
                list.InsertarFondo(nuevo_nodo);    
                cont++;
                
        }
        }
        mostrar.setText("FINALIZADO");
        
    }
   
    public void generarPartidos(){
        Nodo aux = lista_eqp1.getTope(), aux2;
        while(aux!=null){
            aux2 = aux.getSig();
            while(aux2!=null){
                Partido nuevo_partido = new Partido();
                nuevo_partido.setEqp1(aux);
                nuevo_partido.setEqp2(aux2);
                Nodo nodo_partido = new Nodo();
                nodo_partido.setPartido(nuevo_partido);
                lista_partidos.InsertarFondo(nodo_partido);
                aux2 = aux2.getSig();
                
                
            }
            aux = aux.getSig();
            
        }
        auxiiar = lista_partidos.getTope();
     JOptionPane.showMessageDialog(null,"Ya se han generado los partidos","Error",JOptionPane.ERROR_MESSAGE); 
        
    }
    
    public void setfondo(){
         ((JPanel)getContentPane()).setOpaque(false); ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo.jpg")); JLabel fondo= new JLabel(); fondo.setIcon(uno); getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        mostrar = new javax.swing.JLabel();
        INGRESAR = new javax.swing.JButton();
        INGRESAR1 = new javax.swing.JButton();
        INGRESAR2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("REGRESAR AL MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        INGRESAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        INGRESAR.setText("Configurar “Cantidad de equipos”");
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });

        INGRESAR1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        INGRESAR1.setText("GENERAR PARTIDOS");
        INGRESAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESAR1ActionPerformed(evt);
            }
        });

        INGRESAR2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        INGRESAR2.setText("Puntos asignados");
        INGRESAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESAR2ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Otros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INGRESAR2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(INGRESAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(INGRESAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INGRESAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INGRESAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ventana abrir = new Ventana();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
        contGlobal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos equipos quiere en la liga"));
        if (contGlobal != 0 ) {
            ingresar();
        } else {
            JOptionPane.showMessageDialog(null,"El Numero 0 no es valido..","Error",JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_INGRESARActionPerformed

    private void INGRESAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESAR1ActionPerformed
        if (list.Vacia()) {
            JOptionPane.showMessageDialog(null,"No se han ingresado aun los equipos","Error",JOptionPane.ERROR_MESSAGE);
        } else {
            generarPartidos();
        }
    }//GEN-LAST:event_INGRESAR1ActionPerformed

    private void INGRESAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESAR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INGRESAR2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConfigEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INGRESAR;
    private javax.swing.JButton INGRESAR1;
    private javax.swing.JButton INGRESAR2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JLabel mostrar;
    // End of variables declaration//GEN-END:variables
}

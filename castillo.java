/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import com.sun.j3d.utils.behaviors.keyboard.KeyNavigatorBehavior;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.GraphicsConfiguration;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Point3d;

public class castillo extends javax.swing.JFrame {


    crearEscenaGrafica creaEscena;
    Thread t;
    Thread t2;
    public castillo() {
        System.setProperty("sun.awt.noerasebackground", "true");
        initComponents();
        GraphicsConfiguration config =SimpleUniverse.getPreferredConfiguration();
        Canvas3D lienzo=new Canvas3D(config);
        lienzo.setBounds(10, 10, 1250, 640);
        this.add(lienzo);
        this.setBounds(10, 10, 1350, 700);
        BranchGroup Scene=new BranchGroup();
        creaEscena= new crearEscenaGrafica();
        Scene=creaEscena.objRaiz;
        SimpleUniverse univers=new SimpleUniverse(lienzo);
        univers.getViewingPlatform().setNominalViewingTransform();

        TransformGroup tgTeclado = new TransformGroup();
        
        BranchGroup nodeRoot = new BranchGroup();
        
        nodeRoot.addChild(tgTeclado);
        tgTeclado.addChild(Scene);        
        KeyNavigatorBehavior tecladoMover = new KeyNavigatorBehavior(univers.getViewingPlatform().getViewPlatformTransform());
        BoundingSphere bound = new BoundingSphere(new Point3d(), 15000.0);
        tecladoMover.setSchedulingBounds(bound);
        tgTeclado.addChild(tecladoMover);
        
        univers.addBranchGraph(nodeRoot);
  
    //inicializar hilo
        t = new Thread() {
            @Override
            public void run() {
                int contador=0;
                while (contador <= 10) {
                    contador ++;
                    try {
                        sleep(32);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(castillo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    creaEscena.abrir();
                }
            }
        };        
         t2 = new Thread() {
            @Override
            public void run() {
                while (true) {                   
                    try {
                        sleep(32);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(castillo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    creaEscena.mover();                   
                }
                
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Abrir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("mover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(0, 248, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("deprecation")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //metodo con hilo
        if (t.isAlive()) {
            t.stop();
            t = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        sleep(32);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(castillo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    creaEscena.abrir();
                }
            }
        };          
        } else {
            t.start();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    @SuppressWarnings("deprecation")
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //metodo con hilo
        if (t2.isAlive()) {
            t2.stop();
            t2 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        sleep(32);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(castillo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    creaEscena.mover();
                }
            }
        };          
        } else {
            t2.start();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(castillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(castillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(castillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(castillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new castillo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
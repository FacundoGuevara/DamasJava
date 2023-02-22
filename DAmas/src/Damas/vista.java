/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Damas;

import Damas.entidades.Damas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author fggue
 */
public class vista extends javax.swing.JFrame {

    ArrayList<ArrayList<Damas>> Tablero = new ArrayList();

    /**
     * Creates new form vista2
     */
    public vista() {

        // llamar los metodos aca
    }

    public void inicializar() {
        initComponents();
        CrearPanel();
        this.setVisible(true);
        this.setSize(900, 900);
        this.setLocationRelativeTo(null);
        // AgregarDama();

    }

    public void CrearPanel() {
        jPanel1.setLayout(new GridLayout(8, 8));
        Color marron = new Color(118, 65, 0);
        Color crema = new Color(223, 190, 103);
        ImageIcon damaNegra = new ImageIcon("damanegra.png");
        ImageIcon damaRoja = new ImageIcon("damaroja.png");
        for (int i = 0; i < 8; i++) {
            ArrayList<Damas> columna = new ArrayList();
            Tablero.add(columna);
            for (int j = 0; j < 8; j++) {
                Damas casilla = new Damas();
                casilla.setSize(100, 100);
                casilla.setOpaque(true);
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                 
                        casilla.setBackground(crema);

                    } else {
                        casilla.setBackground(marron);
                        if (i <= 2) {
                            casilla.setIcon(new ImageIcon(damaNegra.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
                        } else if (i >= 5) {
                            casilla.setIcon(new ImageIcon(damaRoja.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
                        }
                    }
                } else {
                    if (j % 2 != 0) {
                      
                        casilla.setBackground(crema);

                    } else {
                        casilla.setBackground(marron);
                        if (i <= 2) {
                            casilla.setIcon(new ImageIcon(damaNegra.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
                        } else if (i >= 5) {
                            casilla.setIcon(new ImageIcon(damaRoja.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
                        }
                    }
                }
                casilla.setBorder(BorderFactory.createLineBorder(Color.black, 1));
                columna.add(casilla);
                jPanel1.add(casilla);
                casilla.setVisible(true);
              
            }
        }
        jPanel1.setVisible(true);
    }

    public Damas get(int x, int y) {
        return Tablero.get(x).get(y);
    }

    public JPanel getPanel1() {
        return jPanel1;
    }

    public void pintar(Graphics g) {
        super.paint(g);
    }

    /*
    public void AgregarDama() {

        JButton dama1 = new JButton();
        dama1.setSize(40, 40);
        // dama1.setVisible(true);
        dama1.setOpaque(true);
        dama1.setBackground(Color.yellow);
        ImageIcon damaBlanca = new ImageIcon("DamaNegra.png");
        dama1.setIcon(new ImageIcon(damaBlanca.getImage().getScaledInstance(dama1.getWidth(), dama1.getWidth(), Image.SCALE_SMOOTH)));
        Tablero.get(2).get(3).add(dama1);
    }*/
    //metodos creados aca
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

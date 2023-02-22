/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Damas.Servicio;

import Damas.entidades.Damas;
import Damas.vista;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author fggue
 */
public class Servicio {
    
    vista vista = new vista();
    
    public void IniciarJuego() {
        vista.inicializar();
    }
    
    public void LlenarTablero() {
        Damas Dama1 = new Damas();
        Dama1.setSize(100, 100);
        Dama1.setVisible(true);
        ImageIcon DamaBlanca = new ImageIcon("Dama Negra.png");
        Dama1.setIcon(new ImageIcon(DamaBlanca.getImage().getScaledInstance(Dama1.getWidth(), Dama1.getWidth(), Image.SCALE_SMOOTH)));
        vista.get(2, 2).add(Dama1);
    }
    
    public void MostarTablero() {
        
    }
    
    public boolean ValidarMov(int Tipoficha, int equipo) {
        int xi = 0, yi = 0, xf = 0, yf = 0;
        boolean valido = false;
        return valido;
    }
}

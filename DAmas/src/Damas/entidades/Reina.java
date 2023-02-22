/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Damas.entidades;

/**
 *
 * @author fggue
 */
public class Reina extends Damas {

    public Reina() {
    }

    public Reina(int x, int y, int equipo) {
        super(x, y, equipo);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void Mover() {

    }

}

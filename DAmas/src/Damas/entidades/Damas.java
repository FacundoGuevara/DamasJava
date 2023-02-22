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
public class Damas extends Fichas {

    protected int equipo;
    protected int x;
    protected int y;

    public Damas() {
    }

    public Damas(int x, int y, int equipo) {
        this.x = x;
        this.y = y;
        this.equipo = equipo;
    }

    @Override
    public void Mover() {

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

}

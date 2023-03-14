/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura_Armas;

/**
 *
 * @author usuario
 */
public abstract class ArmaAtaque implements ArmaInterfaz {
    protected double porcentaxe_ataque;
    public abstract void ActivarAtaque(Personaxe Personaxe1);//activa ataque correspondiente.
    public void equiparPersnaxe(Personaxe Personaxe1){
        double puntosataque=Personaxe1.puntosAtaque;
        puntosataque+=((Personaxe1.getPuntosAtaque()*porcentaxe_ataque));
        Personaxe1.setPuntosAtaque(puntosataque);
        ActivarAtaque(Personaxe1);
    }
    public void desequiparPersonaxe(Personaxe Personaxe1){
        double puntosataque=Personaxe1.puntosAtaque;
        puntosataque-=((Personaxe1.getPuntosAtaque()*porcentaxe_ataque));
        Personaxe1.setPuntosAtaque(puntosataque);
        ActivarAtaque(Personaxe1);
    }
}

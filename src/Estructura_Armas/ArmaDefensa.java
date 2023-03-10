/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura_Armas;

/**
 *
 * @author usuario
 */
public abstract class ArmaDefensa implements ArmaInterfaz {
    protected double porcentaxe_vida;
    public abstract void activarProteccion(Personaxe Personaxe1);//activa a proteccion correspondente
    public void equiparPersonaxe(Personaxe Personaxe1){
       double puntosvida=Personaxe1.getPuntosVida();
       puntosvida+=((Personaxe1.getPuntosVida()*this.porcentaxe_vida));
       Personaxe1.setPuntosVida(puntosvida);
    }
}

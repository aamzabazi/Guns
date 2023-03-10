/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura_Armas;

/**
 *
 * @author usuario
 */
public class Espada extends ArmaAtaque {
    public  Espada(){
        this.porcentaxe_ataque=0.40;//%
    }
    public void ActivarAtaque(Personaxe Personaxe1) {
        Personaxe1.setPorteccionCorpoACorpo(true);
    }

    public void equiparPersonaxe(Personaxe Personaxe1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

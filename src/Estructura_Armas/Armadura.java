/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura_Armas;

/**
 *
 * @author usuario
 */
public class Armadura extends ArmaDefensa {
    public  Armadura(){
        this.porcentaxe_vida=0.50;//%
    }
    public void activarProteccion(Personaxe Personaxe1) {
       Personaxe1.setPorteccionCorpoACorpo(true);
    }
}

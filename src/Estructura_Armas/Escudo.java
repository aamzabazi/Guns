/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura_Armas;

/**
 *
 * @author usuario
 */
public class Escudo extends  ArmaDefensa {
    public  Escudo(){
        this.porcentaxe_vida=0.10;//%
    }
    public void activarProteccion(Personaxe Personaxe1) {
       Personaxe1.setProteccionArqueiro(true);
    }
    
}

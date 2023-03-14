/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura_Armas;

/**
 *
 * @author usuario
 */
public class Arco extends ArmaAtaque {
        public  Arco(){
        this.porcentaxe_ataque=0.40;//%
    }
    public void ActivarAtaque(Personaxe Personaxe1) {
       Personaxe1.setAtaqueArqueiro(true);
    }
}

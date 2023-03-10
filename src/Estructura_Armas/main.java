/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura_Armas;

import java.util.*;

/**
 *
 * @author usuario
 */
public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int respuesta;
        Personaxe Personaxe1;
        ArrayList<Personaxe> ListaPersonaxes = new ArrayList();
        Escudo Escudo1;
        Espada Espada1;
        do {
            //MENU INICIAL
            respuesta = MENU();
            switch (respuesta) {
                case 1:
                    do {
                        //MENU DE CREACCION DE PERSONAXE.
                        respuesta = MENUCP();
                        switch (respuesta) {
                            case 1:
                                System.out.println("Introduce o id do personaxe");
                                int id = teclado.nextInt();
                                System.out.println("Introduzca o nome do personaxe");
                                String nome = teclado.next();
                                System.out.println("Introduzca os puntos de vida do personaxe");
                                double puntosvida = teclado.nextInt();
                                System.out.println("Introduzca os puntos de ataque do personaxe");
                                double puntosataque = teclado.nextInt();
                                System.out.println("ad");
                                Personaxe1 = new Personaxe(id, nome, puntosvida, puntosataque);
                                ListaPersonaxes.add(Personaxe1);
                                break;
                            case 2:
                                Escudo1 = new Escudo();
                                int posicion = BUSCAR_PERSONAXE(ListaPersonaxes);
                                if (posicion != -1) {
                                    ListaPersonaxes.get(posicion).ENGADIRARMA(Escudo1);
                                } else {
                                    System.out.println("No se encontró el personaje");
                                }
                                break;
                            case 3:
                                Espada1 = new Espada();
                                posicion = BUSCAR_PERSONAXE(ListaPersonaxes);
                                if (posicion != -1) {
                                    ListaPersonaxes.get(posicion).ENGADIRARMA(Espada1);
                                } else {
                                    System.out.println("No se encontró el personaje");
                                }
                                break;
                        }
                    } while (respuesta != 0);
            }
        } while (respuesta != 0);
    }
        

    public static int MENU() {
        Scanner teclado = new Scanner(System.in);
        int respuesta;
        System.out.println("MENU INICIAL");
        System.out.println("Recuerda que debes crear primero como minimo DOS personajes antes de entrar al MODO BATALLA.");
        System.out.println("1 : MENU Creacion dun personaje y sus armas.");
        System.out.println("2 : MENU de MODO GUERRA.");
        System.out.println("Pulse 0 para salir.");
        respuesta = teclado.nextInt();
        return respuesta;
    }

    public static int MENUCP() {
        Scanner teclado = new Scanner(System.in);
        int respuesta;
        System.out.println("MENU de Personaxe");
        System.out.println("1 :  Creacion dun personaje");
        System.out.println("MENU de ARMAS PARA O PERSONAXE");
        System.out.println("2 :  ENGADIR UN ESCUDO");
        System.out.println("3 : ENGADIR UNA ESPADA.");
        System.out.println("Pulse 0 para salir");
        respuesta = teclado.nextInt();
        return respuesta;
    }



    public static int BUSCAR_PERSONAXE(ArrayList<Personaxe> ListaPersonaxes) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el id del personaje a introducir.");
        int id = teclado.nextInt();
        int posicion = -1;
        for (int i = 0; i < ListaPersonaxes.size(); i++) {
            if (id == ListaPersonaxes.get(i).id) {
                posicion = id;
                break;
            }
        }
        return posicion;
    }
    /*
     * ¿¿¿IMPLEMENTACION PARA ENGADIR UN ARMA??? posicion =
     * BUSCAR_PERSONAXE(ListaPersonaxes); if (posicion != -1) { for (int i = 0;
     * i < ListaPersonaxes.get(posicion).ListaArmas.size(); i++) {
     *
     * if (ListaPersonaxes.get(posicion).ListaArmas.get(i) instanceof Escudo) {
     * System.out.println("Ya hay un Escudo en las armas"); }
     * ListaPersonaxes.get(posicion).ENGADIRARMA(Escudo1); } } else {
     * System.out.println("No se encontró el personaje"); } break;
     */
}

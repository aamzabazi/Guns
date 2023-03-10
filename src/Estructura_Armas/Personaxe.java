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
public class Personaxe {

    protected int id;
    protected String nome;
    protected double puntosVida, puntosAtaque;
    protected boolean proteccionArqueiro, porteccionCorpoACorpo, ataqueArqueiro, ataqueCorpoACorpo;
    protected ArrayList<ArmaInterfaz> ListaArmas;

    public Personaxe(int id, String nome, double puntosvida, double puntosataque) {
        this.setId(id);
        this.setNome(nome);
        this.setPuntosVida(puntosvida);
        this.setPuntosAtaque(puntosataque);
        ListaArmas = new ArrayList();
        this.proteccionArqueiro = false;
        this.porteccionCorpoACorpo = false;
        this.ataqueArqueiro = false;
        this.ataqueCorpoACorpo = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(double puntosVida) {
        this.puntosVida = puntosVida;
    }

    public double getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public boolean getProteccionArqueiro() {
        return proteccionArqueiro;
    }

    public void setProteccionArqueiro(boolean proteccionArqueiro) {
        this.proteccionArqueiro = proteccionArqueiro;
    }

    public boolean getPorteccionCorpoACorpo() {
        return porteccionCorpoACorpo;
    }

    public void setPorteccionCorpoACorpo(boolean porteccionCorpoACorpo) {
        this.porteccionCorpoACorpo = porteccionCorpoACorpo;
    }

    public boolean getAtaqueArqueiro() {
        return ataqueArqueiro;
    }

    public void setAtaqueArqueiro(boolean ataqueArqueiro) {
        this.ataqueArqueiro = ataqueArqueiro;
    }

    public boolean getAtaqueCorpoACorpo() {
        return ataqueCorpoACorpo;
    }

    public void setAtaqueCorpoACorpo(boolean ataqueCorpoACorpo) {
        this.ataqueCorpoACorpo = ataqueCorpoACorpo;
    }

    public void ENGADIRARMA(ArmaInterfaz Arma1) {
        ListaArmas.add(Arma1);
    }

    public void ELIMINARARMA(ArmaInterfaz Arma1) {
        ListaArmas.remove(Arma1);
    }
    public void visulizar_datos(){
        System.out.println("Nombre: " + this.getNome());
        System.out.println("Id: "+ this.getId());
        System.out.println("Puntos de Vida: "+ this.getPuntosVida());
        System.out.println("Puntes de Ataque: "+ this.getPuntosAtaque());
        System.out.println("A tua coleccion de Armas:");
        for (int i = 0; i < ListaArmas.size(); i++) {
            if(ListaArmas.get(i) instanceof Escudo){
                System.out.println("->Escudo");
            }
            if(ListaArmas.get(i) instanceof Espada){
                System.out.println("->Espada");
            }
        }
        
        
    }
    public void Equipar(Personaxe Personaxe1) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que arma queres equipar?");
        System.out.println("1: Para Escudo");
        System.out.println("2: Para Espada");
        int tipoarma = teclado.nextInt();
        int posicionarma;
        switch (tipoarma) {
            case 1:
                posicionarma=buscar_Arma(tipoarma,Personaxe1);
                if(posicionarma!=-1 && tipoarma==1){
                    ListaArmas.get(posicionarma).equiparPersonaxe(Personaxe1);
                }
                break;
            case 2:
                posicionarma=buscar_Arma(tipoarma,Personaxe1);
                if(posicionarma!=-1 && tipoarma==1){
                    ListaArmas.get(posicionarma).equiparPersonaxe(Personaxe1);
                }
                break;
        }
    }
    public int buscar_Arma(int tipoarma,Personaxe Personaxe1){
        int posicionarma=-1;
        for (int i = 0; i < ListaArmas.size(); i++) {
            if (tipoarma==1 && Personaxe1.ListaArmas.get(i) instanceof Escudo ) {
                Personaxe1.ListaArmas.get(i).equiparPersonaxe(Personaxe1);
                posicionarma=i;
                break;
            }
            if(tipoarma==2  &&  Personaxe1.ListaArmas.get(i) instanceof Espada){
                Personaxe1.ListaArmas.get(i).equiparPersonaxe(Personaxe1);
                posicionarma=i;
                break;
            }
        }
        if(posicionarma==-1){
            System.out.println("Non podes equipar a arma, xa que non esta engadida a lista de armas.");
        }
        else{
            System.out.println("Arma equipada.");
        }
        return posicionarma;
    }
    
}

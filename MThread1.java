/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point;

/**
 *
 * @author SG
 */
public class MThread1 extends Thread{
     private String nom;

    public MThread1(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
     
     
    public static void main(String[] args) {
        new MThread1("nom").start();
      
    }

    @Override
    public void run() {
        System.out.println("Bienvenue dans " + this.getNom());
    }

    
    
    
}



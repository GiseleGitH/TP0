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
public class Thread2 implements Runnable{
   private String nom;

    public Thread2(String nom) {
        this.nom = nom;
    }

   
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public static void main(String[] args) {
        //new MThread1("Afi").start();
        Thread2 t3 = new Thread2("toto");
        new Thread(t3).start();
        
        while (true) {
           new Thread(new Thread2("jojo")).start();
            
        }
    }

    @Override
    public void run() {
        System.out.println("Bienvenue dans " + this.getNom());
    }
    
}

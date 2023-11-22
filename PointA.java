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
public class PointA extends Point{
public String nom;
public int x, y;
  public PointA(String nom, int x, int y) {
    // TODO Auto-generated constructor stub
    super(x, y);
    this.nom = nom;
  }
  @Override
  public String toString() {
    return "PointA [nom=" + nom + " " + super.toString() + "]";
  }
  
  

}

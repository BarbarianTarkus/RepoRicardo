/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.prop.lab.s1.treesets;

/**
 *
 * @author RicardoVerduguezClar
 */
public class Llibre
{
   private String ISBN;
   private String Nom;
   
   public Llibre(String pISBN, String pNom) 
   {
       setISBN(pISBN);
       setNom(pNom);
   }
   
   public String getISBN() 
   {
       return ISBN;
   }
   
   public void setISBN(String pISBN) 
   {
       this.ISBN = pISBN;
   }
   
   public String getNom() 
   {
       return Nom;
   }
   
   public void setNom(String pNom) 
   {
       this.Nom = pNom;
   }

    @Override
    public String toString() {
        return "Llibre{" + "Nom=" + Nom + " " +"ISBN=" + ISBN + '}';
    }
   
}

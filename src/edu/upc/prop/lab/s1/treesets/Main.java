/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.prop.lab.s1.treesets;

import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author RicardoVerduguezClar
 */
public class Main 
{
   
     public static void main(String[] args)
    {
        System.out.println("TreeSets");
        
        Llibre l1 = new Llibre("9788499890944","1984");
        Llibre l2 = new Llibre("9788445076415","FAHRENHEIT 451");
        
        Llibreria L = new Llibreria();
        
        L.AfegirLlibre(l1);
        L.AfegirLlibre(l2);
        System.out.println(L.toString());
        L.EliminaLlibre(l2);
        System.out.println(L.toString());
    }
}

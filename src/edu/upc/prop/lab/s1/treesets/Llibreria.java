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
public class Llibreria 
{
    private HashSet<Llibre> List;
    private Llibre L;

    public Llibreria() 
    {
        List = new HashSet<Llibre>();
        
    }
    public Llibre getL() {
        return L;
    }

    public void setL(Llibre L) {
        this.L = L;
    }
    
    public void AfegirLlibre(Llibre L) 
    {
        List.add(L);
    }
    public void EliminaLlibre(Llibre L) 
    {
        List.remove(L);
    }
    @Override
    public String toString() {
        return "Llibreria{" + "" + List + '}';
    }

    
    
}

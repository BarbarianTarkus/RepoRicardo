/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author RicardoVerduguezClar
 */
public class Main {
    public static void main(String[] args) 
    {
        String[] frase ={"Hola", "bon",  "dia", "fa", "bon",  "dia" , "avui", "Hola"};
        Map<String, Integer> mapa = new HashMap<>();
        for(String paraula:frase) {
            int recompte = 0;
            if(mapa.containsKey(paraula)) 
            {
                recompte++;
                mapa.put(paraula,recompte);       
            }
        }
        
        Set<String> paraules = mapa.keySet();
        
        ArrayList<String> llistaParaules = new ArrayList<>();
        String [] taulaParaules = (String[]) paraules.toArray();
        Collections.addAll(llistaParaules, taulaParaules);
        
        Collections.sort(llistaParaules);
        for(String paraula:llistaParaules) 
        {
            System.out.println(">" + paraula + ": occurrències ->" + mapa.get(paraula));
        }
    }   
    
    
}

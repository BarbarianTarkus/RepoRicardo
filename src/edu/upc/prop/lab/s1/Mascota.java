package edu.upc.prop.lab.s1;

/**
 *
 * @author bernat
 */
public class Mascota implements Comparable {
    
   
    // ATRIBUTS
    private int id;
    private String nom;
    private int edat;
    private String raca;
    private boolean vacunat;
    
    
    // CONSTRUCTOR ( és diu igual que la classe i no té tipus de retorn )
    public Mascota(int pId, String pNom, int pEdat , String pRaca, boolean pVacunat){
        setId(pId);
        setNom(pNom);
        setEdat(pEdat);
        setRaca(pRaca);
        setVacunat(pVacunat);
        
    }
    
    
    public int getId(){    
        return id;
    }

    // GETTERS AND SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String pNom){
        if(pNom.trim().length()<3) throw new RuntimeException("Nom massa curt");
        nom = pNom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isVacunat() {
        return vacunat;
    }

    public void setVacunat(boolean vacunat) {
        this.vacunat = vacunat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascota other = (Mascota) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Mascota m = (Mascota)o;
        return this.id - m.id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        return hash;
    }
    
    
 
    
    
    
}

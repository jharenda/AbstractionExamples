/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionexamples;

/**
 *
 * @author Jennifer
 */
public abstract class LakeMonster implements Animal, UndocumentedLife {
    private final static String CLASSIFICATION = "Megafauna";
    
    private String habitat = "freshwater";
    private String researcher = "cryptozoologists";
    private String species = "Cryptid";

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
     public abstract void swim();

    public String getResearcher() {
        return researcher;
    }

    public void setResearcher(String researcher) {
        this.researcher = researcher;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    
}

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
public class LochNessMonster extends LakeMonster {

    private final static String NAME = "Nessie";
    private String favoriteCastle = "Urquhart Castle";
    private String website = "http://www.nessie.co.uk/";
    private String[] otherNames = {"Niseag", "Nessiteras rhombopteryx"};
    private String encounterLocation;
    private int encounters;

    public void surface() {
        System.out.println("Not all lake monsters are known to visit the surface.");
    }

    @Override
    public void swim() {
        System.out.println("all lake monsters swim, but swim differently.");
    }

    @Override
    public void communicate() {
        System.out.println("Nessie communites by waving to people at the gift shop.");
    }

    @Override
    public void eat() {
        System.out.println("Nessie eats shortbread biscuts.");
    }

    @Override
    public boolean isDomesticated() {
        return true;
    }

    @Override
    public void isDangerous() {
        System.out.println("Only if you eat all of her biscuts.");
    }

    @Override
    public void setEncounterLocation(String encounterLocation) {
        this.encounterLocation = encounterLocation;

    }

    @Override
    public String getEncounterLocation() {
        return encounterLocation;
    }

    @Override
    public void setEncounters(int encounters) {
        this.encounters = encounters;
    }

    @Override
    public int getEncounters() {
        return encounters;
    }
}

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
public abstract class EuropeanDragon implements MagicalCreature, Dragon {

    private final static String AREA = "Europe";
    private String realm;
    private String color;
    private String era = "Third Age";

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

}

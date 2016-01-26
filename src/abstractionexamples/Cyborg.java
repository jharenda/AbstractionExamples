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
public interface Cyborg {
    public final static String COMPOSITION = "human/mechanical";
    public void setCreationDate(String creationDate);
    public String getCreationDate();
    public void setOriginLocation(String originLocation);
    public String getOriginLocation(); 
    public void setBaseSpecies(String baseSpecies);
    public String getBaseSpecies(); 
}

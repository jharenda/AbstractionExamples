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
public abstract class Dragon implements EuropeanDragon, MagicalCreature {
private final static boolean lovesTreasure = true; 
private boolean isWinged;
 
private String breathType; 
private String color; 
public String era;
public String name; 
private String realm; 
private String species; 
private String magicalQuality; 
public abstract void setName(String name);
public abstract String getName();
public abstract void setBreathType(String breathType);
public  String getBreathType(){
    return breathType; 
}
public abstract void setIsWinged(boolean isWinged);
public  boolean getIsWinged() {
    return isWinged;  
}
@Override 
public String getColor(){
    return color; 
}
@Override 
public String getEra(){
    return era;
}
@Override
public String getRealm(){
    return realm; 
}
@Override
public String getSpecies(){
    return species; 
}
@Override 
public void setMagicalQuality(String magicalQuality){
    magicalQuality = "dangerous Breath";
}
@Override
public String getMagicalQuality(){
    return magicalQuality; 
}
}



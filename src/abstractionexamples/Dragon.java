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
public interface Dragon extends MagicalCreature {
public final static boolean LOVES_TREASURE = true; 

public abstract void setName(String name);
public abstract  String getName();
public abstract void setBreathType(String breathType);
public abstract String getBreathType();
public abstract void setIsWinged(boolean isWinged);
public abstract boolean getIsWinged(); 

}


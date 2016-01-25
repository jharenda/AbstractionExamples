
package abstractionexamples;

/**
 *
 * @author Jennifer
 */
public interface UndocumentedLife {
   public final static boolean IS_REAL = false; 
   public abstract void setEncounters(int encounters);
   public abstract int getEncounters();
   public abstract String getEncounterLocation();
   public abstract void setEncounterLocation(String encounterLocation);
   public abstract void isDangerous(); 
}
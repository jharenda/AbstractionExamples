
package abstractionexamples;

/**
 *
 * @author Jennifer
 */
public interface MagicalCreature  {
    public final static boolean IS_MAGICAL = true; 
    public abstract void performMagic();
    public abstract void setMagicalQuality(String magicalQuality); 
    public abstract String getMagicalQuality();
    public abstract String getSpecies();
    public abstract void setSpecies(String species); 
}

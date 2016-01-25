
package abstractionexamples;

/**
 *
 * @author Jennifer
 */
public interface EuropeanDragon extends MagicalCreature {
    public final static String AREA = "Europe";
   
    public abstract void setRealm(String realm);
    public abstract String getRealm();
    public abstract void setColor(String color);
    public abstract String getColor();
    public abstract void setEra();
    public abstract String getEra(); 
}

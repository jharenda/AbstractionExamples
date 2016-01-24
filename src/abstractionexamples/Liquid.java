
package abstractionexamples;

/**
 *
 * @author Jennifer
 */
// Interface because I want to ensure the implementataion of certain methods in subclasses

public interface Liquid {
    public final static boolean IS_FLUID = true; 
    public abstract void setFreezingTemperature(int temperature);
    public abstract int getFreezingTemperature();
    public abstract void setColor(String color);
    public abstract String getColor(); 
    public abstract double getVolume();
    public abstract void setVolume(double volume); 
}

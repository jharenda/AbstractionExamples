package abstractionexamples;

/**
 *
 * @author Jennifer
 */
// i do not want any instantiations of this class, hence abstract
public abstract class AlcoholBeverage implements Liquid {

    public final static boolean CONTAINS_ETHANOL = true;
    private int temperature;
    private String color;
    private double volume;
    private double alcoholPercent;
    private String servingGlass; 
// all alcoholbeverages have a percent measure of alcohol, but are implemented differently

    public abstract void setAlcoholPercent(double alcoholPercent);

    public abstract double getAlcholPercent();

    public abstract void setServingGlass(String glass);

    public abstract String getServingGlass();
    @Override
    public int getFreezingTemperature() {
        return temperature;
    }

}

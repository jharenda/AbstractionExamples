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
    private int legalDrinkingAge;

    @Override
    public int getFreezingTemperature() {
        return temperature;
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getLegalDrinkingAge() {
        return legalDrinkingAge;
    }

    public void setLegalDrinkingAge(int legalDrinkingAge) {
        this.legalDrinkingAge = legalDrinkingAge;
    }

    @Override
    public void setFreezingTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    public double getAlcholPercent() {
        return alcoholPercent;
    }
    @Override 
    public void pour(){
        System.out.println("All liquids should be poured.");
    }

}

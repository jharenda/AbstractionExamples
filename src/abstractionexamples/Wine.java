package abstractionexamples;

/**
 *
 * @author Jennifer
 */
//concrete- so that wine objects can be instantiated
public class Wine extends AlcoholBeverage {
// all wine is fermented, but not all alcohol is
    private final static boolean IS_FERMENTED = true;
    
    

    @Override
    public void setFreezingTemperature(int temperature) {
       temperature = temperature;
    }

  
   

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    @Override
    public double getAlcholPercent() {
        return alcoholPercent;
    }
    @Override
    public String getServingGlass(){
        return servingGlass; 
    }
   @Override
   public void setServingGlass(String servingGlass){
       this.servingGlass = servingGlass; 
   }
}

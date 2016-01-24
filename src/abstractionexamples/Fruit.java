package abstractionexamples;

/**
 *
 * @author Jennifer
 */
// abstract- I don't want the fruit class to be instantiated 
public abstract class Fruit implements Plant {
//should static final properties in abstract classes be private or public?
    private static final String PLANT_TYPE = "angiosperms";
    private String plantDate;
    private 

    // all fruits (but not all plants?) disperese seeds, but in different ways, so
    // it will be implemented differently by fruit subclasses
    public abstract void disperseSeeds();

    public abstract void setShape(String shape);

    public abstract String getShape();

    public static String getPLANT_TYPE() {
        return PLANT_TYPE;
    }

    @Override
    public String getDOMAIN() {
        return DOMAIN;
    }

}

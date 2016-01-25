package abstractionexamples;

/**
 *
 * @author Jennifer
 */
//concrete- so that wine objects can be instantiated
public class Wine extends AlcoholBeverage {
// all wine is fermented, but not all alcohol is

    private final static boolean IS_FERMENTED = true;
    private String grape_Variety;
    private String region;
    private int vintageYear;

    public String getGrape_Variety() {
        return grape_Variety;
    }

    public void setGrape_Variety(String grape_Variety) {
        this.grape_Variety = grape_Variety;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getVintageYear() {
        return vintageYear;
    }

    public void setVintageYear(int vintageYear) {
        this.vintageYear = vintageYear;
    }

}

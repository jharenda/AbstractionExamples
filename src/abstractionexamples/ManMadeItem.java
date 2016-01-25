package abstractionexamples;

/**
 *
 * @author Jennifer
 */
public interface ManMadeItem {
    public final static String MANUFACTURE_LOCATION = "factory";

    public abstract void setMaterial(String material);

    public abstract String getMaterial();

    public abstract void setUse(String use);

    public abstract String getUse();

    public abstract void setProductionCost(double cost);

    public abstract double getProductionCost();
}

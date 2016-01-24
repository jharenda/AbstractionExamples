package abstractionexamples;

/**
 *
 * @author Jennifer
 */
// I choose interface for plant because all plants have certain characteritics in common,
// but may do/express them rather differently, but I want to ensure that all plants have a color
// and that all plants perform photosynthesis. (or they can't grow!) 
public interface Plant {

    public static final String DOMAIN = "Eukaryota";

    public abstract String getColor();

    public abstract void setColor(String color);

    public abstract void photosynthesize();

    public abstract String getDOMAIN();
}

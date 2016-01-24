package abstractionexamples;

/**
 *
 * @author Jennifer
 */
//concrete class, I want banana objects
public class Banana extends Fruit {

    private final static String GENUS = "MUSA";
    private String shape;
    private String color;
    private int count;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    // method unique to bananas
    public void peel() {
        System.out.println("No other fruit is peeled like a banana.");
    }

    // overridden from Plant Interface
    @Override
    public void photosynthesize() {
        System.out.println("Bananas use less chlorphyl and  photosynthesize differently than other fruits and plants.");
    }

    //overridden from Fruit Superclass
    @Override
    public void disperseSeeds() {
        System.out.println("Banana seeds are larger than seeds in other fruits.");
    }

    @Override
    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String getShape() {
        return shape;
    }

    public static String getGenus() {
        return GENUS;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
